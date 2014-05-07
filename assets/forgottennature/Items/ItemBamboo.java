package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemBamboo extends ItemBlock {

   public static String[] blockNames = new String[]{"a", "b", "c", "d", "e", "f", "g", "Bamboo", "Bamboo", "Bamboo", "Bamboo", "l", "m", "n", "o"};


   public ItemBamboo(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Bamboo");
   }

   public Icon getIconFromDamage(int i) {
      return forgottennature.hempCotBamCorn.getIcon(0, i);
   }

   public int getMetadata(int i) {
      return i & 15;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int par4, int par5, int par6, int par7) {
      if(par7 != 1) {
         return false;
      } else if(entityplayer.canPlayerEdit(par4, par5, par6, par7, itemstack) && entityplayer.canPlayerEdit(par4, par5 + 1, par6, par7, itemstack)) {
         int var8 = world.getBlockId(par4, par5, par6);
         if((var8 == Block.dirt.blockID || var8 == Block.grass.blockID || var8 == forgottennature.hempCottonBambooCornID) && world.isAirBlock(par4, par5 + 1, par6)) {
            if(itemstack.getItemDamage() == 11) {
               world.setBlock(par4, par5 + 1, par6, forgottennature.hempCottonBambooCornID, 11, 2);
            }

            --itemstack.stackSize;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "a";
      case 1:
         return "b";
      case 2:
         return "c";
      case 3:
         return "d";
      case 4:
         return "e";
      case 5:
         return "f";
      case 6:
         return "g";
      case 7:
         return "Bamboo";
      case 8:
         return "Bamboo";
      case 9:
         return "Bamboo";
      case 10:
         return "Bamboo";
      case 11:
         return "l";
      case 12:
         return "m";
      case 13:
         return "n";
      case 14:
         return "o";
      default:
         return "";
      }
   }

}
