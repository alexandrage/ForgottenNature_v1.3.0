package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockNewFlowerPot4 extends BlockFlowerPot {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewFlowerPot4(int par1) {
      super(par1);
      this.setBlockBoundsForItemRender();
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[0];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[1];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:FlowerPot");
   }

   public void setBlockBoundsForItemRender() {
      float var1 = 0.375F;
      float var2 = var1 / 2.0F;
      this.setBlockBounds(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var1, 0.5F + var2);
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public int getRenderType() {
      return forgottennature.FNFlowerPotRenderID;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      ItemStack var10 = par5EntityPlayer.inventory.getCurrentItem();
      if(var10 == null) {
         return false;
      } else if(par1World.getBlockMetadata(par2, par3, par4) != 0) {
         return false;
      } else {
         int var11 = getMetaForPlant(var10);
         if(var11 > 0) {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, var11, 2);
            if(!par5EntityPlayer.capabilities.isCreativeMode && --var10.stackSize <= 0) {
               par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @SideOnly(Side.CLIENT)
   public int idPicked(World par1World, int par2, int par3, int par4) {
      ItemStack var5 = getPlantForMeta(par1World.getBlockMetadata(par2, par3, par4));
      return var5 == null?Item.flowerPot.itemID:var5.itemID;
   }

   public int getDamageValue(World par1World, int par2, int par3, int par4) {
      ItemStack var5 = getPlantForMeta(par1World.getBlockMetadata(par2, par3, par4));
      return var5 == null?Item.flowerPot.itemID:var5.getItemDamage();
   }

   @SideOnly(Side.CLIENT)
   public boolean isFlowerPot() {
      return true;
   }

   public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
      return super.canPlaceBlockAt(par1World, par2, par3, par4) && par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
   }

   public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
      if(!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4)) {
         this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
         par1World.setBlockToAir(par2, par3, par4);
      }

   }

   public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
      super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
      if(par5 > 11) {
         ItemStack var8 = getPlantForMeta(par5);
         if(var8 != null) {
            this.dropBlockAsItem_do(par1World, par2, par3, par4, var8);
         }
      }

   }

   public int idDropped(int par1, Random par2Random, int par3) {
      return forgottennature.flowerPotID4;
   }

   public static ItemStack getPlantForMeta(int par0) {
      switch(par0) {
      case 1:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 0);
      case 2:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 1);
      case 3:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 2);
      case 4:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 3);
      case 5:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 4);
      case 6:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 5);
      case 7:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 6);
      case 8:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 7);
      case 9:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 8);
      case 10:
         return new ItemStack(Item.itemsList[forgottennature.newFlowers.blockID], 1, 9);
      default:
         return null;
      }
   }

   public static int getMetaForPlant(ItemStack par0ItemStack) {
      int var1 = par0ItemStack.getItem().itemID;
      if(var1 == forgottennature.newFlowers.blockID) {
         switch(par0ItemStack.getItemDamage()) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 5;
         case 5:
            return 6;
         case 6:
            return 7;
         case 7:
            return 8;
         case 8:
            return 9;
         case 9:
            return 10;
         }
      }

      return 0;
   }
}
