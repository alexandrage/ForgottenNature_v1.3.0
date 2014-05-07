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

public class BlockNewLogs4 extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewLogs4(int i) {
      super(i, Material.wood);
      setBurnProperties(super.blockID, 5, 5);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int i, int j) {
      return i != 3 && i != 2?(j == 0?this.field_94349_a[1]:(j == 1?this.field_94349_a[2]:(j == 2?this.field_94349_a[3]:(j == 3?this.field_94349_a[4]:(j == 4?this.field_94349_a[5]:(j == 5?this.field_94349_a[6]:(j == 6?this.field_94349_a[7]:(j == 7?this.field_94349_a[8]:(j == 8?this.field_94349_a[9]:(j == 9?this.field_94349_a[10]:(j == 10?this.field_94349_a[11]:(j == 11?this.field_94349_a[12]:(j == 12?this.field_94349_a[13]:(j == 13?this.field_94349_a[14]:(j == 14?this.field_94349_a[15]:this.field_94349_a[16]))))))))))))))):this.field_94349_a[0];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[17];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:LogCrossSection");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:LogCherry");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:LogDesertWillow");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:LogIronwood");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:LogCedar");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:LogEucalyptus");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:LogGinkgo");
      this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:LogSequoia");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:LogBeech");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:LogAcacia");
      this.field_94349_a[10] = par1IconRegister.registerIcon("forgottennature:LogWalnut");
      this.field_94349_a[11] = par1IconRegister.registerIcon("forgottennature:LogJoshua");
      this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:LogSwampWillow");
      this.field_94349_a[15] = par1IconRegister.registerIcon("forgottennature:LogPalm");
      this.field_94349_a[16] = par1IconRegister.registerIcon("forgottennature:LogWTEucalyptus");
   }

   public int quantityDropped(Random random) {
      return 0;
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
               int met;
               int i3;
               for(met = 0; met < var28.length && var28[met] != null; ++met) {
                  for(i3 = -1; i3 <= 1; ++i3) {
                     for(int i4 = -1; i4 <= 1; ++i4) {
                        for(int j4 = -1; j4 <= 1; ++j4) {
                           if(world.getBlockId(var28[met][0] + i3, var28[met][1] + i4, var28[met][2] + j4) == super.blockID) {
                              Boolean boolean3 = Boolean.valueOf(false);

                              int l4;
                              int l5;
                              int j5;
                              for(l4 = 0; l4 < var28.length; ++l4) {
                                 if(var28[l4][1] > 0 && var28[l4][1] < 150) {
                                    j5 = var28[met][0];
                                    l5 = var28[met][1];
                                    int i6 = var28[met][2];
                                    int j6 = i3 + j5;
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
                                 l4 = var28[met][0];
                                 j5 = var28[met][1];
                                 l5 = var28[met][2];
                                 var28[j2][0] = i3 + l4;
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
                     met = world.getBlockMetadata(var28[i3][0], var28[i3][1], var28[i3][2]);
                     if(var28[i3][1] > 0 && var28[i3][1] < forgottennature.lumberjackPower && world.getBlockId(var28[i3][0], var28[i3][1], var28[i3][2]) == super.blockID) {
                        if(met % 2 == 0) {
                           this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Block.blocksList[forgottennature.logIDindex], 1, met));
                        } else {
                           this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Block.blocksList[forgottennature.logIDindex + 1], 1, met - 1));
                        }

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

   public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1) {
      super.dropBlockAsItemWithChance(world, i, j, k, l, f, i1);
      l &= 15;
      if(l % 2 == 0) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(forgottennature.logIDindex, 1, l));
      }

      if(l % 2 == 1) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(forgottennature.logIDindex + 1, 1, l - 1));
      }

   }

   public boolean canSustainLeaves(World world, int x, int y, int z) {
      return true;
   }

   public boolean isWood(World world, int x, int y, int z) {
      return true;
   }

   public int getRenderType() {
      return forgottennature.FNLogRenderID;
   }
}
