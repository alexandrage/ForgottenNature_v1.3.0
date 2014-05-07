package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockNewTorch extends Block {

   @SideOnly(Side.CLIENT)
   private Icon field_94349_a;


   public BlockNewTorch(int par1, int par2) {
      super(par1, Material.rock);
      this.setTickRandomly(true);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = par1IconRegister.registerIcon("forgottennature:CrystalTorch");
   }

   public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
      return null;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public int getRenderType() {
      return 2;
   }

   private boolean canPlaceTorchOn(World par1World, int par2, int par3, int par4) {
      if(par1World.doesBlockHaveSolidTopSurface(par2, par3, par4)) {
         return true;
      } else {
         int var5 = par1World.getBlockId(par2, par3, par4);
         return Block.blocksList[var5] != null && Block.blocksList[var5].canPlaceTorchOnTop(par1World, par2, par3, par4);
      }
   }

   public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
      return par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST, true) || par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST, true) || par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH, true) || par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH, true) || this.canPlaceTorchOn(par1World, par2, par3 - 1, par4);
   }

   public void updateBlockMetadata(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8) {
      int var9 = par1World.getBlockMetadata(par2, par3, par4);
      if(par5 == 1 && this.canPlaceTorchOn(par1World, par2, par3 - 1, par4)) {
         var9 = 5;
      }

      if(par5 == 2 && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH, true)) {
         var9 = 4;
      }

      if(par5 == 3 && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH, true)) {
         var9 = 3;
      }

      if(par5 == 4 && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST, true)) {
         var9 = 2;
      }

      if(par5 == 5 && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST, true)) {
         var9 = 1;
      }

      par1World.setBlockMetadataWithNotify(par2, par3, par4, var9, 4);
   }

   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      super.updateTick(par1World, par2, par3, par4, par5Random);
      if(par1World.getBlockMetadata(par2, par3, par4) == 0) {
         this.onBlockAdded(par1World, par2, par3, par4);
      }

   }

   public void onBlockAdded(World par1World, int par2, int par3, int par4) {
      if(par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST, true)) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 4);
      } else if(par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST, true)) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 4);
      } else if(par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH, true)) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 4);
      } else if(par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH, true)) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 4);
      } else if(this.canPlaceTorchOn(par1World, par2, par3 - 1, par4)) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 4);
      }

      this.dropTorchIfCantStay(par1World, par2, par3, par4);
   }

   public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
      if(this.dropTorchIfCantStay(par1World, par2, par3, par4)) {
         int var6 = par1World.getBlockMetadata(par2, par3, par4);
         boolean var7 = false;
         if(!par1World.isBlockSolidOnSide(par2 - 1, par3, par4, ForgeDirection.EAST, true) && var6 == 1) {
            var7 = true;
         }

         if(!par1World.isBlockSolidOnSide(par2 + 1, par3, par4, ForgeDirection.WEST, true) && var6 == 2) {
            var7 = true;
         }

         if(!par1World.isBlockSolidOnSide(par2, par3, par4 - 1, ForgeDirection.SOUTH, true) && var6 == 3) {
            var7 = true;
         }

         if(!par1World.isBlockSolidOnSide(par2, par3, par4 + 1, ForgeDirection.NORTH, true) && var6 == 4) {
            var7 = true;
         }

         if(!this.canPlaceTorchOn(par1World, par2, par3 - 1, par4) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
         }
      }

   }

   private boolean dropTorchIfCantStay(World par1World, int par2, int par3, int par4) {
      if(!this.canPlaceBlockAt(par1World, par2, par3, par4)) {
         if(par1World.getBlockId(par2, par3, par4) == super.blockID) {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
         }

         return false;
      } else {
         return true;
      }
   }

   public MovingObjectPosition collisionRayTrace(World par1World, int par2, int par3, int par4, Vec3 par5Vec3, Vec3 par6Vec3) {
      int var7 = par1World.getBlockMetadata(par2, par3, par4) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.setBlockBounds(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.setBlockBounds(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.setBlockBounds(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.setBlockBounds(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.setBlockBounds(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3, par6Vec3);
   }

   public int quantityDropped(Random random) {
      return 0;
   }
}
