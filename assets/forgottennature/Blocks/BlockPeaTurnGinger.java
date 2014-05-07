package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockPeaTurnGinger extends BlockFlower {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;
   private int seedID;
   private int foodID;


   public BlockPeaTurnGinger(int par1) {
      super(par1);
      this.seedID = forgottennature.newCropSeedsID;
      this.foodID = forgottennature.newCropFoodID;
      this.setTickRandomly(true);
      this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.5F, 0.9F);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[12];

      for(int i = 0; i < this.field_94349_a.length; ++i) {
         if(i < 4) {
            this.field_94349_a[i] = par1IconRegister.registerIcon("forgottennature:Peanut_" + i);
         } else if(i > 3 && i < 8) {
            this.field_94349_a[i] = par1IconRegister.registerIcon("forgottennature:Turnip_" + (i - 4));
         } else if(i > 7 && i < 12) {
            this.field_94349_a[i] = par1IconRegister.registerIcon("forgottennature:Ginger_" + (i - 8));
         }
      }

   }

   protected boolean canThisPlantGrowOnThisBlockID(int par1) {
      return par1 == Block.tilledField.blockID;
   }

   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      super.updateTick(par1World, par2, par3, par4, par5Random);
      if(par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9) {
         int var6 = par1World.getBlockMetadata(par2, par3, par4);
         if(var6 < 3 || var6 > 3 && var6 < 7 || var6 > 7 && var6 < 11 || var6 > 11 && var6 < 15) {
            float var7 = this.getGrowthRate(par1World, par2, par3, par4);
            if(par5Random.nextInt((int)(25.0F / var7) + 1) == 0) {
               ++var6;
               par1World.setBlock(par2, par3, par4, super.blockID, var6, 2);
            }
         }
      }

   }

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5) {
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      if(equipped == null) {
         return false;
      } else {
         if(equipped.getItem() == Item.dyePowder && equipped.getItemDamage() == 15) {
            boolean full = false;
            int met = world.getBlockMetadata(i, j, k);
            byte var13;
            if(met < 3) {
               var13 = 3;
            } else if(met > 3 && met < 7) {
               var13 = 7;
            } else if(met > 7 && met < 11) {
               var13 = 11;
            } else {
               if(met <= 11) {
                  return false;
               }

               var13 = 15;
            }

            world.setBlockMetadataWithNotify(i, j, k, var13, 3);
            --equipped.stackSize;
         }

         return false;
      }
   }

   private float getGrowthRate(World par1World, int par2, int par3, int par4) {
      float var5 = 1.0F;
      int var6 = par1World.getBlockId(par2, par3, par4 - 1);
      int var7 = par1World.getBlockId(par2, par3, par4 + 1);
      int var8 = par1World.getBlockId(par2 - 1, par3, par4);
      int var9 = par1World.getBlockId(par2 + 1, par3, par4);
      int var10 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
      int var11 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
      int var12 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
      int var13 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
      boolean var14 = var8 == super.blockID || var9 == super.blockID;
      boolean var15 = var6 == super.blockID || var7 == super.blockID;
      boolean var16 = var10 == super.blockID || var11 == super.blockID || var12 == super.blockID || var13 == super.blockID;

      for(int var17 = par2 - 1; var17 <= par2 + 1; ++var17) {
         for(int var18 = par4 - 1; var18 <= par4 + 1; ++var18) {
            int var19 = par1World.getBlockId(var17, par3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == Block.tilledField.blockID) {
               var20 = 1.0F;
               if(par1World.getBlockMetadata(var17, par3 - 1, var18) > 0) {
                  var20 = 2.0F;
               }
            }

            if(var17 != par2 || var18 != par4) {
               var20 /= 3.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int getRenderType() {
      return 6;
   }

   public void dropBlockAsItemWithChance(World world, int i, int j, int k, int met, float par6, int par7) {
      super.dropBlockAsItemWithChance(world, i, j, k, met, par6, par7);
      met &= 15;
      if(met == 3) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[this.foodID], 1, 4));
      } else if(met == 7) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[this.foodID], 1, 5));
      } else if(met == 11) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[this.foodID], 1, 6));
      }

      for(int n = 0; n < 5; ++n) {
         if(met == 3 && world.rand.nextInt(3) == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[this.foodID], 1, 4));
         } else if(met == 7 && world.rand.nextInt(3) == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[this.foodID], 1, 5));
         } else if(met == 11 && world.rand.nextInt(3) == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[this.foodID], 1, 6));
         }
      }

   }

   public int quantityDropped(Random par1Random) {
      return 0;
   }
}
