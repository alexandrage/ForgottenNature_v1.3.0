package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNewStairs extends BlockStairs {

   private static final int[][] a = new int[][]{{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
   private final Block b;
   private final int c;
   private boolean d = false;
   private int e = 0;


   public BlockNewStairs(int par1, Block par2Block, int par3) {
      super(par1, par2Block, par3);
      this.b = par2Block;
      this.c = par3;
      this.setHardness(2.0F);
      this.setResistance(1.6666666F);
      this.setStepSound(par2Block.stepSound);
      this.setLightOpacity(0);
   }

   public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      if(this.d) {
         this.setBlockBounds(0.5F * (float)(this.e % 2), 0.5F * (float)(this.e / 2 % 2), 0.5F * (float)(this.e / 4 % 2), 0.5F + 0.5F * (float)(this.e % 2), 0.5F + 0.5F * (float)(this.e / 2 % 2), 0.5F + 0.5F * (float)(this.e / 4 % 2));
      } else {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public int getRenderType() {
      return 10;
   }

   public void func_82541_d(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
      if((l & 4) != 0) {
         this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

   }

   public static boolean isBlockStairsID(int par0) {
      return par0 > 0 && Block.blocksList[par0] instanceof BlockStairs;
   }

   private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
      return isBlockStairsID(i1) && par1IBlockAccess.getBlockMetadata(par2, par3, par4) == par5;
   }

   public boolean func_82542_g(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
      int i1 = l & 3;
      float f = 0.5F;
      float f1 = 1.0F;
      if((l & 4) != 0) {
         f = 0.0F;
         f1 = 0.5F;
      }

      float f2 = 0.0F;
      float f3 = 1.0F;
      float f4 = 0.0F;
      float f5 = 0.5F;
      boolean flag = true;
      int j1;
      int k1;
      int l1;
      if(i1 == 0) {
         f2 = 0.5F;
         f5 = 1.0F;
         j1 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4);
         k1 = par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            l1 = k1 & 3;
            if(l1 == 3 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 + 1, l)) {
               f5 = 0.5F;
               flag = false;
            } else if(l1 == 2 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 - 1, l)) {
               f4 = 0.5F;
               flag = false;
            }
         }
      } else if(i1 == 1) {
         f3 = 0.5F;
         f5 = 1.0F;
         j1 = par1IBlockAccess.getBlockId(par2 - 1, par3, par4);
         k1 = par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            l1 = k1 & 3;
            if(l1 == 3 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 + 1, l)) {
               f5 = 0.5F;
               flag = false;
            } else if(l1 == 2 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 - 1, l)) {
               f4 = 0.5F;
               flag = false;
            }
         }
      } else if(i1 == 2) {
         f4 = 0.5F;
         f5 = 1.0F;
         j1 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1);
         k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            l1 = k1 & 3;
            if(l1 == 1 && !this.isBlockStairsDirection(par1IBlockAccess, par2 + 1, par3, par4, l)) {
               f3 = 0.5F;
               flag = false;
            } else if(l1 == 0 && !this.isBlockStairsDirection(par1IBlockAccess, par2 - 1, par3, par4, l)) {
               f2 = 0.5F;
               flag = false;
            }
         }
      } else if(i1 == 3) {
         j1 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1);
         k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            l1 = k1 & 3;
            if(l1 == 1 && !this.isBlockStairsDirection(par1IBlockAccess, par2 + 1, par3, par4, l)) {
               f3 = 0.5F;
               flag = false;
            } else if(l1 == 0 && !this.isBlockStairsDirection(par1IBlockAccess, par2 - 1, par3, par4, l)) {
               f2 = 0.5F;
               flag = false;
            }
         }
      }

      this.setBlockBounds(f2, f, f4, f3, f1, f5);
      return flag;
   }

   public boolean func_82544_h(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
      int i1 = l & 3;
      float f = 0.5F;
      float f1 = 1.0F;
      if((l & 4) != 0) {
         f = 0.0F;
         f1 = 0.5F;
      }

      float f2 = 0.0F;
      float f3 = 0.5F;
      float f4 = 0.5F;
      float f5 = 1.0F;
      boolean flag = false;
      int j1;
      int k1;
      int l1;
      if(i1 == 0) {
         j1 = par1IBlockAccess.getBlockId(par2 - 1, par3, par4);
         k1 = par1IBlockAccess.getBlockMetadata(par2 - 1, par3, par4);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            l1 = k1 & 3;
            if(l1 == 3 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 - 1, l)) {
               f4 = 0.0F;
               f5 = 0.5F;
               flag = true;
            } else if(l1 == 2 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 + 1, l)) {
               f4 = 0.5F;
               f5 = 1.0F;
               flag = true;
            }
         }
      } else if(i1 == 1) {
         j1 = par1IBlockAccess.getBlockId(par2 + 1, par3, par4);
         k1 = par1IBlockAccess.getBlockMetadata(par2 + 1, par3, par4);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            f2 = 0.5F;
            f3 = 1.0F;
            l1 = k1 & 3;
            if(l1 == 3 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 - 1, l)) {
               f4 = 0.0F;
               f5 = 0.5F;
               flag = true;
            } else if(l1 == 2 && !this.isBlockStairsDirection(par1IBlockAccess, par2, par3, par4 + 1, l)) {
               f4 = 0.5F;
               f5 = 1.0F;
               flag = true;
            }
         }
      } else if(i1 == 2) {
         j1 = par1IBlockAccess.getBlockId(par2, par3, par4 - 1);
         k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 - 1);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            f4 = 0.0F;
            f5 = 0.5F;
            l1 = k1 & 3;
            if(l1 == 1 && !this.isBlockStairsDirection(par1IBlockAccess, par2 - 1, par3, par4, l)) {
               flag = true;
            } else if(l1 == 0 && !this.isBlockStairsDirection(par1IBlockAccess, par2 + 1, par3, par4, l)) {
               f2 = 0.5F;
               f3 = 1.0F;
               flag = true;
            }
         }
      } else if(i1 == 3) {
         j1 = par1IBlockAccess.getBlockId(par2, par3, par4 + 1);
         k1 = par1IBlockAccess.getBlockMetadata(par2, par3, par4 + 1);
         if(isBlockStairsID(j1) && (l & 4) == (k1 & 4)) {
            l1 = k1 & 3;
            if(l1 == 1 && !this.isBlockStairsDirection(par1IBlockAccess, par2 - 1, par3, par4, l)) {
               flag = true;
            } else if(l1 == 0 && !this.isBlockStairsDirection(par1IBlockAccess, par2 + 1, par3, par4, l)) {
               f2 = 0.5F;
               f3 = 1.0F;
               flag = true;
            }
         }
      }

      if(flag) {
         this.setBlockBounds(f2, f, f4, f3, f1, f5);
      }

      return flag;
   }

   public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
      this.func_82541_d(par1World, par2, par3, par4);
      super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      boolean flag = this.func_82542_g(par1World, par2, par3, par4);
      super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      if(flag && this.func_82544_h(par1World, par2, par3, par4)) {
         super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }

      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
      this.b.onBlockClicked(par1World, par2, par3, par4, par5EntityPlayer);
   }

   @SideOnly(Side.CLIENT)
   public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      this.b.randomDisplayTick(par1World, par2, par3, par4, par5Random);
   }

   public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
      this.b.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
   }

   @SideOnly(Side.CLIENT)
   public int getMixedBrightnessForBlock(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      return this.b.getMixedBrightnessForBlock(par1IBlockAccess, par2, par3, par4);
   }

   @SideOnly(Side.CLIENT)
   public float getBlockBrightness(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      return this.b.getBlockBrightness(par1IBlockAccess, par2, par3, par4);
   }

   public float getExplosionResistance(Entity par1Entity) {
      return this.b.getExplosionResistance(par1Entity);
   }

   public int tickRate(World par1World) {
      return this.b.tickRate(par1World);
   }

   public void velocityToAddToEntity(World par1World, int par2, int par3, int par4, Entity par5Entity, Vec3 par6Vec3) {
      this.b.velocityToAddToEntity(par1World, par2, par3, par4, par5Entity, par6Vec3);
   }

   @SideOnly(Side.CLIENT)
   public int getRenderBlockPass() {
      return this.b.getRenderBlockPass();
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.b.getIcon(par1, this.c);
   }

   @SideOnly(Side.CLIENT)
   public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
      return this.b.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
   }

   public boolean isCollidable() {
      return this.b.isCollidable();
   }

   public boolean canCollideCheck(int par1, boolean par2) {
      return this.b.canCollideCheck(par1, par2);
   }

   public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
      return this.b.canPlaceBlockAt(par1World, par2, par3, par4);
   }

   public void onBlockAdded(World par1World, int par2, int par3, int par4) {
      this.onNeighborBlockChange(par1World, par2, par3, par4, 0);
      this.b.onBlockAdded(par1World, par2, par3, par4);
   }

   public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6) {
      this.b.breakBlock(par1World, par2, par3, par4, par5, par6);
   }

   public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
      this.b.onEntityWalking(par1World, par2, par3, par4, par5Entity);
   }

   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      this.b.updateTick(par1World, par2, par3, par4, par5Random);
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      return this.b.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, 0, 0.0F, 0.0F, 0.0F);
   }

   public void onBlockDestroyedByExplosion(World par1World, int par2, int par3, int par4, Explosion par5Explosion) {
      this.b.onBlockDestroyedByExplosion(par1World, par2, par3, par4, par5Explosion);
   }

   public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack) {
      int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      int i1 = par1World.getBlockMetadata(par2, par3, par4) & 4;
      if(l == 0) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 2 | i1, 2);
      }

      if(l == 1) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 1 | i1, 2);
      }

      if(l == 2) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 3 | i1, 2);
      }

      if(l == 3) {
         par1World.setBlockMetadataWithNotify(par2, par3, par4, 0 | i1, 2);
      }

   }

   public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9) {
      return par5 != 0 && (par5 == 1 || (double)par7 <= 0.5D)?par9:par9 | 4;
   }

   public MovingObjectPosition collisionRayTrace(World par1World, int par2, int par3, int par4, Vec3 par5Vec3, Vec3 par6Vec3) {
      MovingObjectPosition[] amovingobjectposition = new MovingObjectPosition[8];
      int l = par1World.getBlockMetadata(par2, par3, par4);
      int i1 = l & 3;
      boolean flag = (l & 4) == 4;
      int[] aint = a[i1 + (flag?4:0)];
      this.d = true;

      int j1;
      int k1;
      int l1;
      for(int aint2 = 0; aint2 < 8; ++aint2) {
         this.e = aint2;
         int[] j2 = aint;
         j1 = aint.length;

         for(k1 = 0; k1 < j1; ++k1) {
            l1 = j2[k1];
            if(l1 == aint2) {
               ;
            }
         }

         amovingobjectposition[aint2] = super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3, par6Vec3);
      }

      int[] var26 = aint;
      int var25 = aint.length;

      for(j1 = 0; j1 < var25; ++j1) {
         k1 = var26[j1];
         amovingobjectposition[k1] = null;
      }

      MovingObjectPosition movingobjectposition = null;
      double d0 = 0.0D;
      MovingObjectPosition[] amovingobjectposition1 = amovingobjectposition;
      l1 = amovingobjectposition.length;

      for(int k2 = 0; k2 < l1; ++k2) {
         MovingObjectPosition movingobjectposition1 = amovingobjectposition1[k2];
         if(movingobjectposition1 != null) {
            double d1 = movingobjectposition1.hitVec.squareDistanceTo(par6Vec3);
            if(d1 > d0) {
               movingobjectposition = movingobjectposition1;
               d0 = d1;
            }
         }
      }

      return movingobjectposition;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {}

}
