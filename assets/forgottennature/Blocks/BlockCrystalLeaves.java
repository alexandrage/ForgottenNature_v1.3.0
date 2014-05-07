package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCrystalLeaves extends BlockLeavesBase {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;
   int[] adjacentTreeBlocks;


   public BlockCrystalLeaves(int par1) {
      super(par1, Material.leaves, true);
      this.setTickRandomly(true);
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

      return fan?this.field_94349_a[par2]:this.field_94349_a[par2 + 2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[4];
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:LightCrystalLeavesSolid");
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:DarkCrystalLeavesSolid");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:LightCrystalLeaves");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:DarkCrystalLeaves");
   }

   public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6) {
      byte var5 = 1;
      int var6 = var5 + 1;
      if(par1World.checkChunksExist(par2 - var6, par3 - var6, par4 - var6, par2 + var6, par3 + var6, par4 + var6)) {
         for(int var7 = -var5; var7 <= var5; ++var7) {
            for(int var8 = -var5; var8 <= var5; ++var8) {
               for(int var9 = -var5; var9 <= var5; ++var9) {
                  int var10 = par1World.getBlockId(par2 + var7, par3 + var8, par4 + var9);
                  if(Block.blocksList[var10] != null) {
                     Block.blocksList[var10].beginLeavesDecay(par1World, par2 + var7, par3 + var8, par4 + var9);
                  }
               }
            }
         }
      }

   }

   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      if(!par1World.isRemote) {
         int var6 = par1World.getBlockMetadata(par2, par3, par4);
         if((var6 & 8) != 0 && (var6 & 4) == 0 && forgottennature.leafDecay && par5Random.nextInt(forgottennature.newLeafDecayBuffer) == 0) {
            byte var7 = 4;
            int var8 = var7 + 1;
            byte var9 = 32;
            int var10 = var9 * var9;
            int var11 = var9 / 2;
            if(this.adjacentTreeBlocks == null) {
               this.adjacentTreeBlocks = new int[var9 * var9 * var9];
            }

            int var12;
            if(par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8)) {
               int var13;
               int var14;
               int var15;
               for(var12 = -var7; var12 <= var7; ++var12) {
                  for(var13 = -var7; var13 <= var7; ++var13) {
                     for(var14 = -var7; var14 <= var7; ++var14) {
                        var15 = par1World.getBlockId(par2 + var12, par3 + var13, par4 + var14);
                        Block block = Block.blocksList[var15];
                        if(block != null && block.canSustainLeaves(par1World, par2 + var12, par3 + var13, par4 + var14)) {
                           this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
                        } else if(block != null && block.isLeaves(par1World, par2 + var12, par3 + var13, par4 + var14)) {
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
               par1World.setBlockMetadataWithNotify(par2, par3, par4, var6 & -9, 4);
            } else {
               this.removeLeaves(par1World, par2, par3, par4);
            }
         }
      }

   }

   private void removeLeaves(World par1World, int par2, int par3, int par4) {
      this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
      par1World.setBlockToAir(par2, par3, par4);
   }

   public int quantityDropped(Random par1Random) {
      return par1Random.nextInt(20) == 0?0:0;
   }

   public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
      if(!par1World.isRemote) {
         if((par5 & 3) == 0 && par1World.rand.nextInt(3) == 0) {
            this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Item.itemsList[forgottennature.crystalItemID], 1, 4));
         }

         if((par5 & 3) == 1 && par1World.rand.nextInt(3) == 0) {
            this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Item.itemsList[forgottennature.crystalItemID], 1, 1));
         }
      }

   }

   public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6) {
      super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
   }

   public int damageDropped(int par1) {
      return par1 & 3;
   }

   public boolean isOpaqueCube() {
      return !Block.leaves.graphicsLevel;
   }

   public void beginLeavesDecay(World world, int x, int y, int z) {
      world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
   }

   public boolean isLeaves(World world, int x, int y, int z) {
      return true;
   }

   public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
      super.onEntityWalking(par1World, par2, par3, par4, par5Entity);
   }
}
