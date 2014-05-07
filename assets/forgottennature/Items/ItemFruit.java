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

public class ItemFruit extends ItemFood {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemFruit(int i) {
      super(i, 2, 0.2F, false);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Banana");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Fig");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Orange");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Peach");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Cherries");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Blackberries");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Huckleberries");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Blueberries");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Raspberries");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Lemon");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[10];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:FruitBanana");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:FruitFig");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:FruitOrange");
      this.field_94594_d[3] = par1IconRegister.registerIcon("forgottennature:FruitPeach");
      this.field_94594_d[4] = par1IconRegister.registerIcon("forgottennature:FruitCherry");
      this.field_94594_d[5] = par1IconRegister.registerIcon("forgottennature:FruitBlackBerries");
      this.field_94594_d[6] = par1IconRegister.registerIcon("forgottennature:FruitHuckleberries");
      this.field_94594_d[7] = par1IconRegister.registerIcon("forgottennature:FruitBlueberries");
      this.field_94594_d[8] = par1IconRegister.registerIcon("forgottennature:FruitRaspberries");
      this.field_94594_d[9] = par1IconRegister.registerIcon("forgottennature:FruitLemon");
   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 10; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "banana";
      case 1:
         return "fig";
      case 2:
         return "orange";
      case 3:
         return "peach";
      case 4:
         return "cherries";
      case 5:
         return "blackberries";
      case 6:
         return "huckleberries";
      case 7:
         return "blueberries";
      case 8:
         return "raspberries";
      case 9:
         return "lemon";
      default:
         return "";
      }
   }
}
