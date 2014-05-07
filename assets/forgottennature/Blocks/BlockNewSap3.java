package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import assets.forgottennature.WorldGen.genCrystal;
import assets.forgottennature.WorldGen.genFruitBush;
import assets.forgottennature.WorldGen.genNetherMushroom;
import assets.forgottennature.WorldGen.genNetherTree;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockNewSap3 extends BlockFlower {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewSap3(int i) {
      super(i, Material.plants);
      float f = 0.4F;
      this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
   }

   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[6];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:SaplingHuckleberry");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:SaplingBlackberry");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:SaplingCrystal");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:SaplingNetherAsh");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:SaplingNetherBlaze");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:SaplingNetherMushroom");
   }

   protected boolean canThisPlantGrowOnThisBlockID(int par1) {
      return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.netherrack.blockID || par1 == Block.tilledField.blockID || par1 == forgottennature.groundID;
   }

   public void updateTick(World world, int i, int j, int k, Random random) {
      if(!world.isRemote) {
         super.updateTick(world, i, j, k, random);
         if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(14) == 0) {
            byte j1 = 1;
            if(world.getBlockId(i, 1, k) != Block.netherrack.blockID || world.getBlockMetadata(i, j1, k) > 2) {
               this.growTree(world, i, j1, k, random);
            }
         }

      }
   }

   public void growTree(World world, int i, int j, int k, Random random) {
      int l = world.getBlockMetadata(i, j, k) & 15;
      world.setBlockToAir(i, j, k);
      Object obj = null;
      byte size = 2;
      if(l == 1) {
         obj = new genFruitBush(forgottennature.leafIDindex + 4, 5, 0);
      } else if(l == 2) {
         if(random.nextInt(25) == 0) {
            size = 4;
            if(random.nextInt(20) == 0) {
               size = 8;
            }
         }

         if(random.nextInt(25) > 0) {
            obj = new genCrystal(forgottennature.leafIDindex + 6, 1, forgottennature.crystalWoodID, 0, size);
         } else {
            obj = new genCrystal(forgottennature.leafIDindex + 6, 0, forgottennature.crystalWoodID, 1, size);
         }
      } else if(l == 0) {
         obj = new genFruitBush(forgottennature.leafIDindex + 5, 0, 0);
      } else if(l == 3) {
         obj = new genNetherTree(0, 0, 1);
      } else if(l == 4) {
         obj = new genNetherTree(1, 1, 1);
      } else {
         obj = new genNetherMushroom(forgottennature.logIDindex + 4);
      }

      if(!((WorldGenerator)((WorldGenerator)obj)).generate(world, random, i, j, k)) {
         world.setBlock(i, j, k, super.blockID, l, 2);
      }

   }

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5) {
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      if(equipped == null) {
         return false;
      } else if(world.getBlockMetadata(i, j, k) < 3 && world.getBlockId(i, j - 1, k) == Block.netherrack.blockID) {
         return false;
      } else {
         if(equipped.getItem() == Item.dyePowder && equipped.getItemDamage() == 15) {
            this.growTree(world, i, j, k, world.rand);
            --equipped.stackSize;
         }

         return false;
      }
   }

   public int damageDropped(int i) {
      return i & 15;
   }
}
