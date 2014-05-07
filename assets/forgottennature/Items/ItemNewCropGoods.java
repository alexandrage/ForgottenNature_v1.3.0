package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemNewCropGoods extends Item {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemNewCropGoods(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Cotton Balls");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Hemp Fibers");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Rope Yarn");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Rope Strand");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[4];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:GoodsCottonBalls");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:GoodsHempFibers");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:GoodsRopeYarn");
      this.field_94594_d[3] = par1IconRegister.registerIcon("forgottennature:GoodsRopeStrand");
   }

   public int getMetadata(int par1) {
      return par1 & 3;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 4; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Cotton Balls";
      case 1:
         return "Hemp Fibers";
      case 2:
         return "Rope Yarn";
      case 3:
         return "Rope Strand";
      default:
         return "";
      }
   }
}
