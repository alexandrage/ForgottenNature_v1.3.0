package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemNetherLogs extends ItemBlock {

   public ItemNetherLogs(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Nether Ash Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Nether Blaze Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Nether Spore Stalk");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Nether Spore Block");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      list.remove(new ItemStack(i, 1, 0));

      for(int j = 0; j < 4; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "nashl";
      case 1:
         return "nblazel";
      case 2:
         return "nsstalk";
      case 3:
         return "nsblock";
      default:
         return "";
      }
   }
}
