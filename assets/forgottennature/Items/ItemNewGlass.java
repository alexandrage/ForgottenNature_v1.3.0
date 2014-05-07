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

public class ItemNewGlass extends ItemBlock {

   public ItemNewGlass(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Black Lattice");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Wide 3x3");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Framed Wide 3x3");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "3x3");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Framed 3x3");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Double Diamond");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Pinwheel");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "2x2");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Framed 2x2");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Diamond Lattice");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Double Lattice");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Square Lattice");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Peaking Window");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "Circle");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Double Door");
      LanguageRegistry.addName(new ItemStack(this, 1, 15), "2x1");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.FNGlass.getIcon(0, i);
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
         return "bLattice";
      case 1:
         return "W 9x9";
      case 2:
         return "Framed W9x9";
      case 3:
         return "9x9";
      case 4:
         return "F9x9";
      case 5:
         return "dDiamond";
      case 6:
         return "pwheel";
      case 7:
         return "2x2";
      case 8:
         return "f2x2";
      case 9:
         return "diLattice";
      case 10:
         return "doubleLattice";
      case 11:
         return "SquareLattice";
      case 12:
         return "PeakingW";
      case 13:
         return "circle";
      case 14:
         return "doubledoor";
      case 15:
         return "2x1";
      default:
         return "";
      }
   }
}
