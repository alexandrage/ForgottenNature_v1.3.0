package assets.forgottennature.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemGeneral extends ItemBlock {

   Block currentBlock;


   public ItemGeneral(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.currentBlock = Block.blocksList[i + 256];
   }

   public Icon getIconFromDamage(int i) {
      return this.currentBlock.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      list.add(new ItemStack(i, 1, 0));
   }
}
