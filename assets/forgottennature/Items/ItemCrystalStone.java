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

public class ItemCrystalStone extends ItemBlock {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemCrystalStone(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Crystal Stone");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Dark Crystal Stone");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.crystalStone.getIcon(0, i);
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 2; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Crystal Stone";
      case 1:
         return "Dark Crystal Stone";
      default:
         return "";
      }
   }
}
