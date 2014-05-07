package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemNewLogs4 extends ItemBlock {

   public ItemNewLogs4(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Cherry Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Desert Willow Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Ironwood Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Cedar Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Eucalyptus Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Ginkgo Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Sequoia Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Beech Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Acacia Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Walnut Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Joshua Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Cocoa Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Swamp Willow Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "CocoaFruit Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Palm Log*");
      LanguageRegistry.addName(new ItemStack(this, 1, 15), "WideTop Eucalyptus Log*");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Cherry log**";
      case 1:
         return "Desert Willow log**";
      case 2:
         return "Ironwood log**";
      case 3:
         return "Cedar log**";
      case 4:
         return "Eucalyptus log**";
      case 5:
         return "Ginkgo log**";
      case 6:
         return "sequoia log**";
      case 7:
         return "Beech log**";
      case 8:
         return "acacia log**";
      case 9:
         return "Walnut log**";
      case 10:
         return "Joshua log**";
      case 11:
         return "Cocoa log**";
      case 12:
         return "SwampWillow log**";
      case 13:
         return "CocoaFruit log**";
      case 14:
         return "palm log**";
      case 15:
         return "WideTop Eucalyptus log**";
      default:
         return "";
      }
   }
}
