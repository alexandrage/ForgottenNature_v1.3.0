package assets.forgottennature;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FNFuelHandler implements IFuelHandler {

   public int getBurnTime(ItemStack fuel) {
      int i = fuel.itemID;
      int j = fuel.getItemDamage();
      return i != forgottennature.newLogs.blockID && i != forgottennature.newSap2.blockID && i != forgottennature.newSap3.blockID?(i == forgottennature.plankID?300:(i != forgottennature.newSap.blockID && i != forgottennature.newSap2.blockID && i != forgottennature.newSap3.blockID?(i == forgottennature.carbonItemsID && j == 0?12800:(i == forgottennature.carbonItemsID && j == 1?102400:(i == forgottennature.carbonItemsID && j == 2?800:0))):100)):500;
   }
}
