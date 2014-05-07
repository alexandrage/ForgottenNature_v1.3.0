package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemNut extends ItemFood {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemNut(int i) {
      super(i, 2, 0.4F, false);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Ginkgo Nuts");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Walnuts");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Coconut");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[4];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:FoodGinkgoNuts");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:FoodWalnuts");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:FoodCoconut");
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
         return "ginkgo";
      case 1:
         return "walnut";
      case 2:
         return "coconut";
      default:
         return "";
      }
   }
}
