package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemNewPlanks extends ItemBlock {

   public ItemNewPlanks(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Brown Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Purple Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Dark Red Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Dark Yellow Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Peach Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Orange Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Brightwood Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Redwood Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Acacia Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Bright Yellow Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Old Wood Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Bamboo Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Dried Bamboo Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "Nether Blaze Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Nether Ash Plank");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 15; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Brown planks";
      case 1:
         return "Purple planks";
      case 2:
         return "Dark Red planks";
      case 3:
         return "Dark Yellow planks";
      case 4:
         return "Peach planks";
      case 5:
         return "Orange planks";
      case 6:
         return "Brightwood planks";
      case 7:
         return "Vibrant Redwood planks";
      case 8:
         return "Acacia planks";
      case 9:
         return "Bright Yellow planks";
      case 10:
         return "Old Wood planks";
      case 11:
         return "bamboo planks";
      case 12:
         return "dbamboo planks";
      case 13:
         return "nbl planks";
      case 14:
         return "nash planks";
      default:
         return "";
      }
   }
}
