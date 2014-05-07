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

public class ItemSawItems extends Item {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemSawItems(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Saw Tooth");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Saw Blade");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Saw Handle");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[10];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:SawTooth");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:SawBlade");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:SawHandle");
   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 3; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Saw Tooth";
      case 1:
         return "Saw Blade";
      case 2:
         return "Saw Handle";
      default:
         return "";
      }
   }
}
