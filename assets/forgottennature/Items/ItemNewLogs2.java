package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNewLogs2 extends ItemBlock {

   int logID;


   public ItemNewLogs2(int i) {
      super(i);
      this.logID = forgottennature.newLogs2.blockID;
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Desert Willow Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "*Desert Willow Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Cedar Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "*Cedar Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Ginkgo Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "*Ginkgo Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Beech Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "*Beech Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Walnut Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "*Walnut Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "WideTop Eucalyptus Log");
      LanguageRegistry.addName(new ItemStack(this, 1, 15), "*WideTop Eucalyptus Log");
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
      int var11 = par3World.getBlockId(par4, par5, par6);
      byte var10 = 0;
      if(var11 == Block.snow.blockID) {
         par7 = 1;
      } else if(var11 != Block.vine.blockID && var11 != Block.tallGrass.blockID && var11 != Block.deadBush.blockID && (Block.blocksList[var11] == null || !Block.blocksList[var11].isBlockReplaceable(par3World, par4, par5, par6))) {
         if(par7 == 0) {
            var10 = 0;
            --par5;
         }

         if(par7 == 1) {
            var10 = 0;
            ++par5;
         }

         if(par7 == 2) {
            var10 = 1;
            this.logID = forgottennature.newLogs4.blockID;
            --par6;
         }

         if(par7 == 3) {
            var10 = 1;
            this.logID = forgottennature.newLogs4.blockID;
            ++par6;
         }

         if(par7 == 4) {
            var10 = 1;
            --par4;
         }

         if(par7 == 5) {
            var10 = 1;
            ++par4;
         }
      }

      if(par1ItemStack.stackSize == 0) {
         return false;
      } else if(!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
         return false;
      } else if(par5 == 255 && Block.blocksList[this.logID].blockMaterial.isSolid()) {
         return false;
      } else if(par3World.canPlaceEntityOnSide(this.logID, par4, par5, par6, false, par7, par2EntityPlayer, par1ItemStack)) {
         Block var12 = Block.blocksList[this.logID];
         boolean met = false;
         int var13 = this.getMetadata(par1ItemStack.getItemDamage());
         int var14 = Block.blocksList[this.logID].onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, var13);
         int var17;
         if(this.logID == forgottennature.newLogs4.blockID) {
            var17 = var14 + 1;
         } else if(var14 % 2 == 0) {
            var17 = var14 + var10;
         } else {
            var17 = var14;
         }

         if(this.placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, var17)) {
            par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var12.stepSound.getPlaceSound(), (var12.stepSound.getVolume() + 1.0F) / 2.0F, var12.stepSound.getPitch() * 0.8F);
            --par1ItemStack.stackSize;
         }

         this.logID = forgottennature.newLogs2.blockID;
         return true;
      } else {
         return false;
      }
   }

   @SideOnly(Side.CLIENT)
   public boolean canPlaceItemBlockOnSide(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer, ItemStack par7ItemStack) {
      int var8 = par1World.getBlockId(par2, par3, par4);
      if(var8 == Block.snow.blockID) {
         par5 = 1;
      } else if(var8 != Block.vine.blockID && var8 != Block.tallGrass.blockID && var8 != Block.deadBush.blockID && (Block.blocksList[var8] == null || !Block.blocksList[var8].isBlockReplaceable(par1World, par2, par3, par4))) {
         if(par5 == 0) {
            --par3;
         }

         if(par5 == 1) {
            ++par3;
         }

         if(par5 == 2) {
            --par4;
         }

         if(par5 == 3) {
            ++par4;
         }

         if(par5 == 4) {
            --par2;
         }

         if(par5 == 5) {
            ++par2;
         }
      }

      return par1World.canPlaceEntityOnSide(this.logID, par2, par3, par4, false, par5, (Entity)null, par7ItemStack);
   }

   public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
      if(!world.setBlock(x, y, z, this.logID, metadata, 2)) {
         return false;
      } else {
         if(world.getBlockId(x, y, z) == this.logID) {
            Block.blocksList[this.logID].onBlockPlacedBy(world, x, y, z, player, stack);
            Block.blocksList[this.logID].onPostBlockPlaced(world, x, y, z, metadata);
         }

         return true;
      }
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 16; j += 2) {
         if(j != 10 & j != 12) {
            list.add(new ItemStack(i, 1, j));
         }
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Desert Willow log*";
      case 1:
         return "Desert Willow log";
      case 2:
         return "Cedar log*";
      case 3:
         return "Cedar log";
      case 4:
         return "Ginkgo log*";
      case 5:
         return "Ginkgo log";
      case 6:
         return "Beech log*";
      case 7:
         return "Beech log";
      case 8:
         return "Walnut log*";
      case 9:
         return "Walnut log";
      case 10:
      case 11:
      case 12:
      case 13:
      default:
         return "";
      case 14:
         return "WideTop Eucalyptus log*";
      case 15:
         return "WideTop Eucalyptus log";
      }
   }
}
