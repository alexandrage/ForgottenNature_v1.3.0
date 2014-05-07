package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockRope extends Block {

   @SideOnly(Side.CLIENT)
   private Icon field_94349_a;


   public BlockRope(int par1) {
      super(par1, Material.circuits);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = par1IconRegister.registerIcon("forgottennature:Rope");
   }

   public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
      int var5 = par1World.getBlockMetadata(par2, par3, par4);
      float var6 = 0.125F;
      if(var5 == 1) {
         this.setBlockBounds(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 4) {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 8) {
         this.setBlockBounds(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 2) {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
   }

   @SideOnly(Side.CLIENT)
   public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
      int var5 = par1World.getBlockMetadata(par2, par3, par4);
      float var6 = 0.125F;
      if(var5 == 1) {
         this.setBlockBounds(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 4) {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 8) {
         this.setBlockBounds(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 2) {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public int getRenderType() {
      return 20;
   }

   public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
      return par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST) || par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST) || par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH) || par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH);
   }

   public void onBlockPlaced(World par1World, int par2, int par3, int par4, int par5) {
      int var6 = par1World.getBlockMetadata(par2, par3, par4);
      if((var6 == 0 || par5 == 1) && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH)) {
         var6 = 1;
      }

      if((var6 == 0 || par5 == 4) && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH)) {
         var6 = 4;
      }

      if((var6 == 0 || par5 == 8) && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST)) {
         var6 = 8;
      }

      if((var6 == 0 || par5 == 2) && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST)) {
         var6 = 2;
      }

      par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 4);
   }

   public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
      int var6 = par1World.getBlockMetadata(par2, par3, par4);
      boolean var7 = false;
      if(var6 == 1 && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH)) {
         var7 = true;
      }

      if(var6 == 4 && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH)) {
         var7 = true;
      }

      if(var6 == 8 && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST)) {
         var7 = true;
      }

      if(var6 == 2 && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST)) {
         var7 = true;
      }

      if(!var7 && par1World.getBlockId(par2, par3 + 1, par4) != super.blockID) {
         par1World.setBlockToAir(par2, par3, par4);
      }

      super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
   }

   public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l) {
      super.harvestBlock(world, entityplayer, i, j, k, l);
      if(world.getBlockId(i, j + 1, k) != super.blockID) {
         this.dropBlockAsItem_do(world, i, j + 1, k, new ItemStack(Item.itemsList[super.blockID], 1, 0));
      }

      for(int next = j; next > 0; --next) {
         if(world.getBlockId(i, next, k) == super.blockID) {
            world.setBlockToAir(i, next, k);
         }
      }

   }

   public int quantityDropped(Random par1Random) {
      return 0;
   }

   public boolean isLadder(World world, int x, int y, int z) {
      return true;
   }
}
