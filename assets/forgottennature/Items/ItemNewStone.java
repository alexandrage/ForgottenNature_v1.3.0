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

public class ItemNewStone extends ItemBlock {

   public ItemNewStone(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Chert");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Granite");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Gneiss");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Hornfels");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Marble");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Granite Bricks");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Gneiss Bricks");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Hornfels Bricks");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Marble Bricks");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Titan Stone Block");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.newStones.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i;
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
         return "chert";
      case 1:
         return "granite";
      case 2:
         return "gneiss";
      case 3:
         return "hornfels";
      case 4:
         return "marble";
      case 5:
         return "granite bricks";
      case 6:
         return "gneiss bricks";
      case 7:
         return "hornfels bricks";
      case 8:
         return "marble bricks";
      case 9:
         return "tsblock";
      default:
         return "";
      }
   }
}
