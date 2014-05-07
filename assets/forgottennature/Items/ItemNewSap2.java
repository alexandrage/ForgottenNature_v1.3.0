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

public class ItemNewSap2 extends ItemBlock {

   public ItemNewSap2(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Palm Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Desert Willow Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Cedar Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Ginkgo Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Poplar Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Beech Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Walnut Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "WideTop Eucalyptus Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Bukkit Tree Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Banana Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Orange Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Peach Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "Lemon Sapling");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Blueberry Bushling");
      LanguageRegistry.addName(new ItemStack(this, 1, 15), "Raspberry Bushling");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.newSap2.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 16; ++j) {
         if(j != 7) {
            list.add(new ItemStack(i, 1, j));
         }
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "palmS";
      case 1:
         return "dWillowS";
      case 2:
         return "cedarS";
      case 3:
         return "ginkgoS";
      case 4:
         return "poplarS";
      case 5:
         return "beechS";
      case 6:
         return "walnutS";
      case 7:
      default:
         return "";
      case 8:
         return "WTESap";
      case 9:
         return "bukkitS";
      case 10:
         return "bananaS";
      case 11:
         return "orangeS";
      case 12:
         return "peachS";
      case 13:
         return "lemonS";
      case 14:
         return "BlueberryBushling";
      case 15:
         return "RaspberryBushling";
      }
   }
}
