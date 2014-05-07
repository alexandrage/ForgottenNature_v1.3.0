package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockLJ extends BlockLog {

   public static final String[] b = new String[]{"oak", "spruce", "birch", "jungle"};
   @SideOnly(Side.CLIENT)
   private Icon[] c;
   @SideOnly(Side.CLIENT)
   private Icon[] d;


   public BlockLJ(int par1) {
      super(par1);
   }

   public int quantityDropped(Random par1Random) {
      return 1;
   }

   public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par2, int par3, int par4, int par6) {
      super.harvestBlock(par1World, par2EntityPlayer, par2, par3, par4, par6);
      int[] ai = new int[]{par2, par3 + 1, par4};
      Boolean can = Boolean.valueOf(true);
      Boolean isAxe = Boolean.valueOf(false);
      ItemStack equipped = par2EntityPlayer.getCurrentEquippedItem();
      if(equipped != null && (equipped.getItem() == Item.itemsList[forgottennature.newToolIndex + 1] || equipped.getItem() == Item.itemsList[forgottennature.newToolIndex + 5] || equipped.getItem() == Item.axeDiamond || equipped.getItem() == Item.itemsList[forgottennature.crystalToolIndex + 6] || equipped.getItem() == Item.itemsList[forgottennature.crystalToolIndex + 1] || equipped.getItem() == Item.itemsList[forgottennature.sawID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe1ID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe2ID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe3ID] || equipped.getItem() == Item.itemsList[forgottennature.extraAxe4ID])) {
         isAxe = Boolean.valueOf(true);
      }

      if(isAxe.booleanValue() && par1World.getBlockId(ai[0], ai[1], ai[2]) == Block.wood.blockID && forgottennature.lumberjack) {
         int j2;
         for(int ai1 = -1; ai1 <= 1; ++ai1) {
            for(int boolean2 = -1; boolean2 <= 0; ++boolean2) {
               for(j2 = -1; j2 <= 1; ++j2) {
                  if((ai1 + par2 != par2 || boolean2 + par3 != par3 || j2 + par4 != par4) && par1World.getBlockId(ai1 + par2, boolean2 + par3, j2 + par4) == Block.wood.blockID) {
                     can = Boolean.valueOf(false);
                  }
               }
            }
         }

         if(can.booleanValue()) {
            int[][] var28 = new int[forgottennature.lumberjackPower][3];
            Boolean var27 = Boolean.valueOf(false);
            var28[0][0] = par2;
            var28[0][1] = par3 + 1;
            var28[0][2] = par4;
            j2 = 1;

            int i3;
            int met;
            do {
               for(i3 = 0; i3 < var28.length && var28[i3] != null; ++i3) {
                  for(met = -1; met <= 1; ++met) {
                     for(int i4 = -1; i4 <= 1; ++i4) {
                        for(int j4 = -1; j4 <= 1; ++j4) {
                           if(par1World.getBlockId(var28[i3][0] + met, var28[i3][1] + i4, var28[i3][2] + j4) == Block.wood.blockID) {
                              Boolean boolean3 = Boolean.valueOf(false);

                              int l4;
                              int l5;
                              int j5;
                              for(l4 = 0; l4 < var28.length; ++l4) {
                                 if(var28[l4][1] > 0 && var28[l4][1] < 150) {
                                    j5 = var28[i3][0];
                                    l5 = var28[i3][1];
                                    int i6 = var28[i3][2];
                                    int j6 = met + j5;
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
                                 var28[j2][0] = met + l4;
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

               var27 = Boolean.valueOf(false);
            } while(var27.booleanValue());

            for(i3 = 0; i3 < var28.length; ++i3) {
               if(var28[i3][1] > 0 && var28[i3][1] < forgottennature.lumberjackPower && par1World.getBlockId(var28[i3][0], var28[i3][1], var28[i3][2]) == Block.wood.blockID) {
                  met = par1World.getBlockMetadata(var28[i3][0], var28[i3][1], var28[i3][2]);
                  if(met >= 8) {
                     met -= 8;
                  } else if(met >= 4) {
                     met -= 4;
                  }

                  this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Block.wood, 1, met));
                  par1World.setBlockToAir(var28[i3][0], var28[i3][1], var28[i3][2]);
                  if(equipped.getItemDamage() + 1 <= equipped.getMaxDamage() && forgottennature.lumberjackDamage) {
                     equipped.setItemDamage(equipped.getItemDamage() + 1);
                  }
               }
            }
         }
      }

   }

   @SideOnly(Side.CLIENT)
   protected Icon getSideIcon(int par1) {
      return this.c[par1];
   }

   @SideOnly(Side.CLIENT)
   protected Icon getEndIcon(int par1) {
      return this.d[par1];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.c = new Icon[b.length];
      this.d = new Icon[b.length];

      for(int i = 0; i < this.c.length; ++i) {
         this.c[i] = par1IconRegister.registerIcon(this.getTextureName() + "_" + b[i]);
         this.d[i] = par1IconRegister.registerIcon(this.getTextureName() + "_" + b[i] + "_top");
      }

   }

}
