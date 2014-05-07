package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemNewLeaves extends ItemBlock {

   public ItemNewLeaves(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
   }

   public int getMetadata(int i) {
      return i & 7;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      byte numb = 8;
      if(super.itemID > forgottennature.leafIDindex + 4) {
         numb = 2;
      }

      for(int j = 0; j < numb; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      if(i.itemID == forgottennature.leafIDindex) {
         switch(i.getItemDamage()) {
         case 0:
            return "rMaple leaves";
         case 1:
            return "aOak leaves";
         case 2:
            return "yMaple leaves";
         case 3:
            return "Jacaranda leaves";
         case 4:
            return "Fig leaves";
         case 5:
            return "cypress leaves";
         case 6:
            return "desertIronwood leaves";
         case 7:
            return "eucalyptus leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 1) {
         switch(i.getItemDamage()) {
         case 0:
            return "sequ leaves";
         case 1:
            return "pCherry leaves";
         case 2:
            return "wCherry leaves";
         case 3:
            return "apple leaves";
         case 4:
            return "appleBud leaves";
         case 5:
            return "appleFruit leaves";
         case 6:
            return "acacia leaves";
         case 7:
            return "joshua leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 2) {
         switch(i.getItemDamage()) {
         case 0:
            return "swampW leaves";
         case 1:
            return "dBush leaves";
         case 2:
            return "eBush leaves";
         case 3:
            return "palm leaves";
         case 4:
            return "dWillow leaves";
         case 5:
            return "cedar leaves";
         case 6:
            return "ginkgo leaves";
         case 7:
            return "poplar leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 3) {
         switch(i.getItemDamage()) {
         case 0:
            return "beech leaves";
         case 1:
            return "walnut leaves";
         case 2:
         default:
            break;
         case 3:
            return "wEucalyptus leaves";
         case 4:
            return "bukkit leaves";
         case 5:
            return "banana leaves";
         case 6:
            return "orange leaves";
         case 7:
            return "peach leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 4) {
         switch(i.getItemDamage()) {
         case 0:
            return "lemon leaves";
         case 1:
            return "blueberry leaves";
         case 2:
            return "blueberryF leaves";
         case 3:
            return "raspberry leaves";
         case 4:
            return "raspberryF leaves";
         case 5:
            return "blackberry leaves";
         case 6:
            return "blackberryF leaves";
         case 7:
            return "cherryF leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 5) {
         switch(i.getItemDamage()) {
         case 0:
            return "huckleberry leaves";
         case 1:
            return "huckleberryF leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 6) {
         switch(i.getItemDamage()) {
         case 0:
            return "Dark Crystal Leaves";
         case 1:
            return "Crystal Leaves";
         }
      } else if(i.itemID == forgottennature.leafIDindex + 7) {
         switch(i.getItemDamage()) {
         case 0:
            return "netherash leaves";
         case 1:
            return "netherblaze leaves";
         }
      }

      return "";
   }
}
