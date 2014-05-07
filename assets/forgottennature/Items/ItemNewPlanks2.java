package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemNewPlanks2 extends ItemBlock {

   public ItemNewPlanks2(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Herringbone Parquet Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "X Parquet Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Frederiksborg Parquet Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "For Don Parquet Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Lattice Parquet Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Diamond Parquet Plank");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Pavimenti Parquet Plank");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 7; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Herringbone Parquet planks";
      case 1:
         return "X Parquet planks";
      case 2:
         return "Frederiksborg Parquet planks";
      case 3:
         return "For Don Parquet planks";
      case 4:
         return "Lattice Parquet planks";
      case 5:
         return "Diamond Parquet planks";
      case 6:
         return "Pavimenti Parquet planks";
      default:
         return "";
      }
   }
}
