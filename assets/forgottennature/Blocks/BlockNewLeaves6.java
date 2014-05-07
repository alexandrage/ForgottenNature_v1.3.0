package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class BlockNewLeaves6 extends BlockLeavesBase implements IShearable {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;
   int[] adjacentTreeBlocks;
   private boolean leafDecay;
   private int newLeafDecayBuffer;
   private int ItemFruitID;


   public BlockNewLeaves6(int i, boolean k, int l, int m) {
      super(i, Material.leaves, true);
      this.setTickRandomly(true);
      setBurnProperties(super.blockID, 30, 60);
      this.leafDecay = k;
      this.newLeafDecayBuffer = l;
      this.ItemFruitID = m;
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      if(par2 > 7) {
         par2 -= 8;
      }

      boolean fan = true;
      if(!this.isOpaqueCube()) {
         fan = false;
      }

      return !fan?this.field_94349_a[par2]:this.field_94349_a[par2 + 8];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[16];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:DeciduousBushLeaves");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:HuckleberryFruitLeaves");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:DeciduousBushLeavesSolid");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:HuckleberryFruitLeavesSolid");
   }

   public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6) {
      byte b0 = 1;
      int j1 = b0 + 1;
      if(par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1)) {
         for(int k1 = -b0; k1 <= b0; ++k1) {
            for(int l1 = -b0; l1 <= b0; ++l1) {
               for(int i2 = -b0; i2 <= b0; ++i2) {
                  int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);
                  if(Block.blocksList[j2] != null) {
                     Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
                  }
               }
            }
         }
      }

   }

   public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {
      if((world.getBlockMetadata(i, j, k) & 7) == 1 && !world.isRemote) {
         world.setBlock(i, j, k, super.blockID, 0, 2);
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 6));
      }

   }

   public void updateTick(World world, int i, int j, int k, Random random) {
      if(!world.isRemote) {
         int l = world.getBlockMetadata(i, j, k);
         if((l & 7) == 0 && world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(4) == 0 && random.nextInt(35) == 0) {
            world.setBlock(i, j, k, super.blockID, 1, 2);
         }

         if((l & 8) != 0 && this.leafDecay && random.nextInt(this.newLeafDecayBuffer) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if(this.adjacentTreeBlocks == null) {
               this.adjacentTreeBlocks = new int[var9 * var9 * var9];
            }

            int var12;
            if(world.checkChunksExist(i - var8, j - var8, k - var8, i + var8, j + var8, k + var8)) {
               int var13;
               int var14;
               int var15;
               for(var12 = -var7; var12 <= var7; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        var15 = world.getBlockId(i + var12, j + var13, k + var14);
                        Block block = Block.blocksList[var15];
                        if(block != null && block.canSustainLeaves(world, i + var12, j + var13, k + var14)) {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        } else if(block != null && block.isLeaves(world, i + var12, j + var13, k + var14)) {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
                        } else {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
                        }
                     }
                  }
               }

               for(var12 = 1; var12 <= 4; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        for(var15 = -var7; var15 <= var7; ++var15) {
                           if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1) {
                              if(this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] = var12;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.adjacentTreeBlocks[var11 * var10 + var11 * var9 + var11];
            if(var12 >= 0) {
               world.setBlockMetadataWithNotify(i, j, k, l & -9, 4);
            } else {
               this.removeLeaves(world, i, j, k);
            }
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      if(par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && par5Random.nextInt(15) == 1) {
         double d0 = (double)((float)par2 + par5Random.nextFloat());
         double d1 = (double)par3 - 0.05D;
         double d2 = (double)((float)par4 + par5Random.nextFloat());
         par1World.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
      }

   }

   private void removeLeaves(World world, int i, int j, int k) {
      this.dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
      world.setBlockToAir(i, j, k);
   }

   public int quantityDropped(Random random) {
      return random.nextInt(20) != 0?0:0;
   }

   public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6) {
      super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
   }

   public int damageDropped(int i) {
      return i & 7;
   }

   public boolean isOpaqueCube() {
      return !Block.leaves.graphicsLevel;
   }

   public void onEntityWalking(World world, int i, int j, int k, Entity entity) {
      super.onEntityWalking(world, i, j, k, entity);
   }

   public boolean isShearable(ItemStack item, World world, int x, int y, int z) {
      return true;
   }

   public ArrayList onSheared(ItemStack item, World world, int x, int y, int z, int fortune) {
      ArrayList ret = new ArrayList();
      ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 7));
      return ret;
   }

   public void beginLeavesDecay(World world, int x, int y, int z) {
      world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
   }

   public boolean isLeaves(World world, int x, int y, int z) {
      return true;
   }
}
