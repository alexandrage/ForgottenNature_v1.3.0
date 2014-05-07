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

public class ItemNewSap extends ItemBlock {

   public ItemNewSap(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Desert Ironwood Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Cherry Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Red Maple Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Angel Oak Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Yellow Maple Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Jacaranda Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Apple Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Eucalyptus Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Sequoia Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Fig Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Cypress Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Acacia Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Joshua Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "Swamp Willow Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Deciduous Bushling");
      LanguageRegistry.addName(new ItemStack(this, 1, 15), "Evergreen Bushling");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.newSap.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 16; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "dIronwoodSap";
      case 1:
         return "CherrySap";
      case 2:
         return "rMapleSap";
      case 3:
         return "aOakSap";
      case 4:
         return "yMapleSap";
      case 5:
         return "jacarandaS";
      case 6:
         return "appleSap";
      case 7:
         return "eucalyptusS";
      case 8:
         return "sequS";
      case 9:
         return "figS";
      case 10:
         return "cypressS";
      case 11:
         return "acaciaS";
      case 12:
         return "joshuaS";
      case 13:
         return "swampWillowS";
      case 14:
         return "dBushling";
      case 15:
         return "eBushling";
      default:
         return "";
      }
   }
}
