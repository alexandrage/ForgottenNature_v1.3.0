package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemNewFlowers extends ItemBlock {

   public ItemNewFlowers(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Allium Drumstick");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Bachelor\'s Button");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Billy Buttons");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Delphinium Belladonna");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Fernflower Yarrow");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Gerbera daisy");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Hydrangea");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Red Rover");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Snapdragon Magenta");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Star of Bethlehem");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.newFlowers.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i & 15;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
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
         return "Allium";
      case 1:
         return "Bachelor\'s";
      case 2:
         return "Billy";
      case 3:
         return "Delphinium";
      case 4:
         return "Fernflower";
      case 5:
         return "Gerbera";
      case 6:
         return "Hydrangea";
      case 7:
         return "Red";
      case 8:
         return "Snapdragon";
      case 9:
         return "Star of Bethlehem";
      default:
         return "";
      }
   }
}
