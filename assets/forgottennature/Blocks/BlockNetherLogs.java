package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockNetherLogs extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNetherLogs(int i) {
      super(i, Material.wood);
      setBurnProperties(super.blockID, 0, 0);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return (par1 == 1 || par1 == 0) && par2 == 0?this.field_94349_a[0]:((par1 == 1 || par1 == 0) && par2 == 1?this.field_94349_a[1]:((par1 == 1 || par1 == 0) && par2 == 2?this.field_94349_a[2]:((par2 & 7) == 0?this.field_94349_a[3]:((par2 & 7) == 1?this.field_94349_a[4]:((par2 & 7) == 2?this.field_94349_a[5]:this.field_94349_a[6])))));
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[7];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:NetherAshLogBase");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:NetherBlazeLogBase");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:NetherSporeStalkBase");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:NetherAshLog");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:NetherBlazeLog");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:NetherSporeStalk");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:NetherSporeStalkBase");
   }

   public int quantityDropped(Random random) {
      return 1;
   }

   public int idDropped(int i, Random random, int j) {
      return super.blockID;
   }

   public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l) {
      super.harvestBlock(world, entityplayer, i, j, k, l);
      int[] ai = new int[]{i, j + 1, k};
      Boolean boolean1 = Boolean.valueOf(true);
      Boolean isAxe = Boolean.valueOf(false);
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      if(equipped != null && (equipped.getItem() == Item.itemsList[forgottennature.newToolIndex + 1] || equipped.getItem() == Item.itemsList[forgottennature.newToolIndex + 5] || equipped.getItem() == Item.axeDiamond || equipped.getItem() == Item.itemsList[forgottennature.crystalToolIndex + 6] || equipped.getItem() == Item.itemsList[forgottennature.crystalToolIndex + 1] || equipped.getItem() == Item.itemsList[forgottennature.sawID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe1ID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe2ID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe3ID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe4ID])) {
         isAxe = Boolean.valueOf(true);
      }

      if(isAxe.booleanValue() && world.getBlockId(ai[0], ai[1], ai[2]) == super.blockID && forgottennature.lumberjack) {
         int j2;
         for(int ai1 = -1; ai1 <= 1; ++ai1) {
            for(int boolean2 = -1; boolean2 <= 0; ++boolean2) {
               for(j2 = -1; j2 <= 1; ++j2) {
                  if((ai1 + i != i || boolean2 + j != j || j2 + k != k) && world.getBlockId(ai1 + i, boolean2 + j, j2 + k) == super.blockID) {
                     boolean1 = Boolean.valueOf(false);
                  }
               }
            }
         }

         if(boolean1.booleanValue()) {
            int[][] var28 = new int[forgottennature.lumberjackPower][3];
            Boolean var27 = Boolean.valueOf(false);
            var28[0][0] = i;
            var28[0][1] = j + 1;
            var28[0][2] = k;
            j2 = 1;

            while(true) {
               int i3;
               for(i3 = 0; i3 < var28.length && var28[i3] != null; ++i3) {
                  for(int k3 = -1; k3 <= 1; ++k3) {
                     for(int i4 = -1; i4 <= 1; ++i4) {
                        for(int j4 = -1; j4 <= 1; ++j4) {
                           if(world.getBlockId(var28[i3][0] + k3, var28[i3][1] + i4, var28[i3][2] + j4) == super.blockID) {
                              Boolean boolean3 = Boolean.valueOf(false);

                              int l4;
                              int l5;
                              int j5;
                              for(l4 = 0; l4 < var28.length; ++l4) {
                                 if(var28[l4][1] > 0 && var28[l4][1] < 150) {
                                    j5 = var28[i3][0];
                                    l5 = var28[i3][1];
                                    int i6 = var28[i3][2];
                                    int j6 = k3 + j5;
                                    int k6 = i4 + l5;
                                    int l6 = j4 + i6;
                                    int[] ai2 = new int[]{j6, k6, l6};
                                    if(ai2[0] == var28[l4][0] && ai2[1] == var28[l4][1] && ai2[2] == var28[l4][2]) {
                                       boolean3 = Boolean.valueOf(true);
                                       break;
                                    }
                                 }
                              }

                              if(!boolean3.booleanValue() && j2 < var28.length) {
                                 l4 = var28[i3][0];
                                 j5 = var28[i3][1];
                                 l5 = var28[i3][2];
                                 var28[j2][0] = k3 + l4;
                                 var28[j2][1] = i4 + j5;
                                 var28[j2][2] = j4 + l5;
                                 var27 = Boolean.valueOf(true);
                                 ++j2;
                              }
                           }
                        }
                     }
                  }
               }

               if(!var27.booleanValue()) {
                  for(i3 = 0; i3 < var28.length; ++i3) {
                     if(var28[i3][1] > 0 && var28[i3][1] < forgottennature.lumberjackPower && world.getBlockId(var28[i3][0], var28[i3][1], var28[i3][2]) == super.blockID) {
                        this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Block.blocksList[super.blockID], 1, world.getBlockMetadata(var28[i3][0], var28[i3][1], var28[i3][2])));
                        world.setBlockToAir(var28[i3][0], var28[i3][1], var28[i3][2]);
                        if(equipped.getItemDamage() + 1 <= equipped.getMaxDamage() && forgottennature.lumberjackDamage) {
                           equipped.setItemDamage(equipped.getItemDamage() + 1);
                        }
                     }
                  }
                  break;
               }

               var27 = Boolean.valueOf(false);
            }
         }
      }

   }

   public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6) {
      byte var7 = 4;
      int var8 = var7 + 1;
      if(par1World.checkChunksExist(par2 - var8, par3 - var8, par4 - var8, par2 + var8, par3 + var8, par4 + var8)) {
         for(int var9 = -var7; var9 <= var7; ++var9) {
            for(int var10 = -var7; var10 <= var7; ++var10) {
               for(int var11 = -var7; var11 <= var7; ++var11) {
                  int var12 = par1World.getBlockId(par2 + var9, par3 + var10, par4 + var11);
                  if(Block.blocksList[var12] != null) {
                     Block.blocksList[var12].beginLeavesDecay(par1World, par2 + var9, par3 + var10, par4 + var11);
                  }
               }
            }
         }
      }

   }

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5) {
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      if(equipped != null && world.getBlockMetadata(i, j, k) >= 2) {
         if(equipped.getItem() == Item.dyePowder && equipped.getItemDamage() == 15) {
            this.dropBlockAsItem_do(world, i, j + 1, k, new ItemStack(forgottennature.newSap3, 2, 5));
            --equipped.stackSize;
         }

         return false;
      } else {
         return false;
      }
   }

   public int damageDropped(int i) {
      return i;
   }

   public boolean canSustainLeaves(World world, int x, int y, int z) {
      return true;
   }

   public boolean isWood(World world, int x, int y, int z) {
      return true;
   }

   public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      int var6 = par1World.getBlockMetadata(par2, par3, par4);
      float dis = 1.0F;
      double var7 = (double)((float)par2 + dis / (float)par1World.rand.nextInt(11));
      double var9 = (double)((float)par3 + dis / (float)par1World.rand.nextInt(11));
      double var11 = (double)((float)par4 + dis / (float)par1World.rand.nextInt(11));
      if(var6 == 1) {
         par1World.spawnParticle("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         par1World.spawnParticle("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 0) {
         par1World.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         par1World.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      }

   }
}
