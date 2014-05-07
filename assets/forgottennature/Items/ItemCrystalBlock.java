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

public class ItemCrystalBlock extends ItemBlock {

   public ItemCrystalBlock(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Focus Crystal");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Dark Focus Crystal");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Crystal Bricks");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Dark Crystal Bricks");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.crystalBlock.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i;
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
         return "Focus Crystal";
      case 1:
         return "Dark Focus Crystal";
      case 2:
         return "Crystal Bricks";
      case 3:
         return "Dark Crystal Bricks";
      default:
         return "";
      }
   }
}
