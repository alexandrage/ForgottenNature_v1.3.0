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

public class ItemNewSap3 extends ItemBlock {

   public ItemNewSap3(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Crystal Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Blackberry Bushling");
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Huckleberry Bushling");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Nether Ash Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Nether Blaze Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Nether Mushroom");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.newSap3.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 6; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "huckleberryS";
      case 1:
         return "BlackberrySap";
      case 2:
         return "crystalSap";
      case 3:
         return "nashS";
      case 4:
         return "nblazeSap";
      case 5:
         return "nethermushroom";
      default:
         return "";
      }
   }
}
