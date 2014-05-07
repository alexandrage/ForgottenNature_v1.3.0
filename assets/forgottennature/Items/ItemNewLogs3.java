package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemNewLogs3 extends ItemBlock {

   public ItemNewLogs3(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Bukkit Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Banana Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Orange Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Peach Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Lemon Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "*Bukkit Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "*Banana Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "*Orange Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "*Peach Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "*Lemon Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Bukkit Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Banana Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Orange Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "Peach Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Lemon Log*");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 5; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Bukkitl";
      case 1:
         return "Bananal";
      case 2:
         return "Orangel";
      case 3:
         return "Peachl";
      case 4:
         return "Lemonl";
      case 5:
         return "*Bukkitl";
      case 6:
         return "*Bananal";
      case 7:
         return "*Orangel";
      case 8:
         return "*Peachl";
      case 9:
         return "*Lemonl";
      case 10:
         return "Bukkitl*";
      case 11:
         return "Bananal*";
      case 12:
         return "Orangel*";
      case 13:
         return "Peachl*";
      case 14:
         return "Lemonl*";
      default:
         return "";
      }
   }
}
