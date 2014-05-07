package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
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

public class BlockNewLeaves4 extends BlockLeavesBase implements IShearable {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;
   private boolean leafDecay;
   private int newLeafDecayBuffer;
   private int fruitID;
   int[] adjacentTreeBlocks;


   public BlockNewLeaves4(int i, boolean k, int l, int m) {
      super(i, Material.leaves, true);
      this.setTickRandomly(true);
      setBurnProperties(super.blockID, 30, 60);
      this.leafDecay = k;
      this.newLeafDecayBuffer = l;
      this.fruitID = m;
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
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:WalnutLeaves");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:wTEucalyptusLeaves");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:BukkitLeaves");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:BananaLeaves");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:OrangeLeaves");
      this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:PeachLeaves");
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:BeechLeaves");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:WalnutLeavesSolid");
      this.field_94349_a[11] = par1IconRegister.registerIcon("forgottennature:wTEucalyptusLeavesSolid");
      this.field_94349_a[12] = par1IconRegister.registerIcon("forgottennature:BukkitLeavesSolid");
      this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:BananaLeavesSolid");
      this.field_94349_a[14] = par1IconRegister.registerIcon("forgottennature:OrangeLeavesSolid");
      this.field_94349_a[15] = par1IconRegister.registerIcon("forgottennature:PeachLeavesSolid");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:BeechLeavesSolid");
   }

   public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6) {
      byte var5 = 1;
      int var6 = var5 + 1;
      if(par1World.checkChunksExist(par2 - var6, par3 - var6, par4 - var6, par2 + var6, par3 + var6, par4 + var6)) {
         int ran;
         for(ran = -var5; ran <= var5; ++ran) {
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  int var10 = par1World.getBlockId(par2 + ran, par3 + var8, par4 + var9);
                  if(Block.blocksList[var10] != null) {
                     Block.blocksList[var10].beginLeavesDecay(par1World, par2 + ran, par3 + var8, par4 + var9);
                  }
               }
            }
         }

         ran = par1World.rand.nextInt(20);
         if(par1World.rand.nextInt(9) < 1) {
            if((par6 & 7) == 0 && ran == 0) {
               this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(forgottennature.newSap2, 1, 5));
            }

            if((par6 & 7) == 3 && par1World.rand.nextInt(9) == 0) {
               this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(forgottennature.newSap2, 1, 8));
            }

            if((par6 & 7) == 4 && par1World.rand.nextInt(10) == 0) {
               this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(forgottennature.newSap2, 1, 9));
            }

            if((par6 & 7) == 5) {
               this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(forgottennature.newSap2, 1, 10));
            }
         }
      }

   }

   public void updateTick(World world, int i, int j, int k, Random random) {
      if(!world.isRemote) {
         int l = world.getBlockMetadata(i, j, k);
         int var8;
         if(((l & 7) == 1 || (l & 7) == 5 || (l & 7) == 6 || (l & 7) == 7) && world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(4) == 0) {
            boolean var7 = false;
            if(world.getBlockId(i, j - 1, k) == 0) {
               for(var8 = -1; var8 <= 1; ++var8) {
                  for(int var9 = -1; var9 <= 1; ++var9) {
                     if((world.getBlockMetadata(i + var8, j, k + var9) & 7) == 1 && world.getBlockId(i + var8, j, k + var9) == forgottennature.logIDindex + 2) {
                        var7 = true;
                     }
                  }
               }

               if((l & 7) == 1 && random.nextInt(100) == 0) {
                  world.setBlock(i, j - 1, k, this.fruitID, 0, 2);
               }

               if((l & 7) == 5 && random.nextInt(35) == 0 && var7) {
                  world.setBlock(i, j - 1, k, this.fruitID, 1, 2);
               }

               var7 = false;
               if((l & 7) == 6 && random.nextInt(70) == 0) {
                  world.setBlock(i, j - 1, k, this.fruitID, 5, 2);
               }

               if((l & 7) == 7 && random.nextInt(70) == 0) {
                  world.setBlock(i, j - 1, k, this.fruitID, 6, 2);
               }
            }
         }

         if((l & 8) != 0 && this.leafDecay && random.nextInt(this.newLeafDecayBuffer) == 0) {
            byte var17 = 4;
            var8 = var17 + 1;
            byte var18 = 32;
            int var10 = var18 * var18;
            int var11 = var18 / 2;
            if(this.adjacentTreeBlocks == null) {
               this.adjacentTreeBlocks = new int[var18 * var18 * var18];
            }

            int var12;
            if(world.checkChunksExist(i - var8, j - var8, k - var8, i + var8, j + var8, k + var8)) {
               int var13;
               int var14;
               int var15;
               for(var12 = -var17; var12 <= var17; ++var12) {
                  for(var13 = -var17; var13 <= var17; ++var13) {
                     for(var14 = -var17; var14 <= var17; ++var14) {
                        var15 = world.getBlockId(i + var12, j + var13, k + var14);
                        Block block = Block.blocksList[var15];
                        if(block != null && block.canSustainLeaves(world, i + var12, j + var13, k + var14)) {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var18 + var14 + var11] = 0;
                        } else if(block != null && block.isLeaves(world, i + var12, j + var13, k + var14)) {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var18 + var14 + var11] = -2;
                        } else {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var18 + var14 + var11] = -1;
                        }
                     }
                  }
               }

               for(var12 = 1; var12 <= 4; ++var12) {
                  for(var13 = -var17; var13 <= var17; ++var13) {
                     for(var14 = -var17; var14 <= var17; ++var14) {
                        for(var15 = -var17; var15 <= var17; ++var15) {
                           if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var18 + var15 + var11] == var12 - 1) {
                              if(this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var18 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var18 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var18 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var18 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var18 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var18 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var18 + var15 + var11] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var18 + var15 + var11] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var18 + (var15 + var11 - 1)] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var18 + (var15 + var11 - 1)] = var12;
                              }

                              if(this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var18 + var15 + var11 + 1] == -2) {
                                 this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var18 + var15 + var11 + 1] = var12;
                              }
                           }
                        }
                     }
                  }
               }
            }

            var12 = this.adjacentTreeBlocks[var11 * var10 + var11 * var18 + var11];
            if(var12 >= 0) {
               world.setBlockMetadataWithNotify(i, j, k, l & -9, 4);
            } else {
               this.removeLeaves(world, i, j, k);
            }
         }
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
