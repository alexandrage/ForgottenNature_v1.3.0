package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockNewFruit extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;
   private int ItemNutID;
   private int ItemFruitID;


   public BlockNewFruit(int i, int j, int k, int l) {
      super(i, Material.plants);
      this.setTickRandomly(true);
      this.ItemNutID = k;
      this.ItemFruitID = l;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[8];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:FoodWalnuts");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:Bananas");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:FruitFig");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:FoodCoconut");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:FoodGinkgoNuts");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:FruitOrange");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:FruitPeach");
      this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:FruitLemon");
   }

   public void updateTick(World world, int i, int j, int k, Random random) {
      super.updateTick(world, i, j, k, random);
      int ll = world.getBlockId(i, j + 1, k);
      int ll2 = world.getBlockMetadata(i, j, k) & 15;
      if(ll == 0) {
         if(ll2 == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemNutID, 1, 1));
         } else if(ll2 == 1) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 0));
         } else if(ll2 == 4) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemNutID, 1, 0));
         } else if(ll2 == 5) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 2));
         } else if(ll2 == 6) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 3));
         } else if(ll2 == 7) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 9));
         } else if(ll2 == 2) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 1));
         } else if(ll2 == 3) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemNutID, 1, 2));
         }

         world.setBlockToAir(i, j, k);
      }

      if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(8) == 0 && ll2 == 1 && random.nextInt(4) == 0 && ll == forgottennature.leafIDindex + 3 && world.getBlockId(i, j - 1, k) == 0) {
         world.setBlock(i, j - 1, k, super.blockID, 1, 2);
      }

   }

   public int quantityDropped(Random random) {
      return random.nextInt(20) != 0?0:0;
   }

   public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1) {
      super.dropBlockAsItemWithChance(world, i, j, k, l, f, i1);

      for(int next = 1; next < 4; ++next) {
         if(world.rand.nextInt(next + next - 1) == 0) {
            if((l & 15) == 0) {
               this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemNutID, 1, 1));
            }

            if((l & 15) == 1) {
               this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 0));
            }

            if((l & 15) == 4) {
               this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemNutID, 1, 0));
            }
         }
      }

      if((l & 15) == 5) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 2));
      }

      if((l & 15) == 6) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 3));
      }

      if((l & 15) == 7) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 9));
      }

      if((l & 15) == 2) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemFruitID, 1, 1));
      }

      if((l & 15) == 3) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this.ItemNutID, 1, 2));
      }

   }

   public int damageDropped(int i) {
      return i & 15;
   }

   public int getRenderType() {
      return 1;
   }
}
