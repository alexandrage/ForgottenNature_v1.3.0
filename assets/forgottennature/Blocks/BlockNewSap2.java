package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import assets.forgottennature.WorldGen.genBeech;
import assets.forgottennature.WorldGen.genBukkit;
import assets.forgottennature.WorldGen.genCedar;
import assets.forgottennature.WorldGen.genDWillow;
import assets.forgottennature.WorldGen.genFruit;
import assets.forgottennature.WorldGen.genFruitBush;
import assets.forgottennature.WorldGen.genGinkgo;
import assets.forgottennature.WorldGen.genPalm;
import assets.forgottennature.WorldGen.genPoplar;
import assets.forgottennature.WorldGen.genWTEucalyptus;
import assets.forgottennature.WorldGen.genWalnut;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockNewSap2 extends BlockFlower {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewSap2(int i) {
      super(i, Material.plants);
      float f = 0.4F;
      this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
   }

   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[16];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:SaplingPalm");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:SaplingDesertWillow");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:SaplingCedar");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:SaplingGinkgo");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:SaplingPoplar");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:SaplingBeech");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:SaplingWalnut");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:SaplingWTEucalyptus");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:SaplingBukkit");
      this.field_94349_a[10] = par1IconRegister.registerIcon("forgottennature:SaplingBanana");
      this.field_94349_a[11] = par1IconRegister.registerIcon("forgottennature:SaplingOrange");
      this.field_94349_a[12] = par1IconRegister.registerIcon("forgottennature:SaplingPeach");
      this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:SaplingLemon");
      this.field_94349_a[14] = par1IconRegister.registerIcon("forgottennature:SaplingBlueberry");
      this.field_94349_a[15] = par1IconRegister.registerIcon("forgottennature:SaplingRaspberry");
   }

   public void updateTick(World world, int i, int j, int k, Random random) {
      if(!world.isRemote) {
         super.updateTick(world, i, j, k, random);
         if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(14) == 0) {
            this.growTree(world, i, j, k, random);
         }

      }
   }

   public void growTree(World world, int i, int j, int k, Random random) {
      int l = world.getBlockMetadata(i, j, k) & 15;
      world.setBlockToAir(i, j, k);
      Object obj = null;
      if(l == 1) {
         obj = new genDWillow(forgottennature.leafIDindex + 2, 4, forgottennature.logIDindex + 1, 0);
      } else if(l == 2) {
         obj = new genCedar(forgottennature.leafIDindex + 2, 5, forgottennature.logIDindex + 1, 2);
      } else if(l == 3) {
         obj = new genGinkgo(forgottennature.leafIDindex + 2, 6, forgottennature.logIDindex + 1, 4);
      } else if(l == 4) {
         obj = new genPoplar(forgottennature.leafIDindex + 2, 7, 17, 1);
      } else if(l == 5) {
         obj = new genBeech(forgottennature.leafIDindex + 3, 0, forgottennature.logIDindex + 1, 6);
      } else if(l == 6) {
         obj = new genWalnut(forgottennature.leafIDindex + 3, 1, forgottennature.logIDindex + 1, 8);
      } else if(l == 8) {
         obj = new genWTEucalyptus(forgottennature.leafIDindex + 3, 3, forgottennature.logIDindex + 1, 14);
      } else if(l == 9) {
         obj = new genBukkit(forgottennature.leafIDindex + 3, 4, forgottennature.logIDindex + 2, 0);
      } else if(l == 10) {
         obj = new genPalm(forgottennature.leafIDindex + 3, 5, forgottennature.logIDindex + 2, 1);
      } else if(l == 11) {
         obj = new genFruit(false, forgottennature.leafIDindex + 3, 6, forgottennature.logIDindex + 2, 2, 1);
      } else if(l == 12) {
         obj = new genFruit(false, forgottennature.leafIDindex + 3, 7, forgottennature.logIDindex + 2, 3, 1);
      } else if(l == 13) {
         obj = new genFruit(false, forgottennature.leafIDindex + 4, 0, forgottennature.logIDindex + 2, 4, 1);
      } else if(l == 14) {
         obj = new genFruitBush(forgottennature.leafIDindex + 4, 1, 0);
      } else if(l == 15) {
         obj = new genFruitBush(forgottennature.leafIDindex + 4, 3, 0);
      } else {
         obj = new genPalm(forgottennature.leafIDindex + 2, 3, forgottennature.logIDindex, 14);
      }

      if(!((WorldGenerator)((WorldGenerator)obj)).generate(world, random, i, j, k)) {
         world.setBlock(i, j, k, super.blockID, l, 2);
      }

   }

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5) {
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      if(equipped == null) {
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
