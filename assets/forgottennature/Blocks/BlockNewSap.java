package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import assets.forgottennature.WorldGen.genAcacia;
import assets.forgottennature.WorldGen.genAngel;
import assets.forgottennature.WorldGen.genCherry;
import assets.forgottennature.WorldGen.genCypress;
import assets.forgottennature.WorldGen.genDecBush;
import assets.forgottennature.WorldGen.genDesertTree;
import assets.forgottennature.WorldGen.genEucalyptus;
import assets.forgottennature.WorldGen.genEverBush;
import assets.forgottennature.WorldGen.genFig;
import assets.forgottennature.WorldGen.genFruit;
import assets.forgottennature.WorldGen.genJoshua;
import assets.forgottennature.WorldGen.genSequoia;
import assets.forgottennature.WorldGen.genWillow;
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

public class BlockNewSap extends BlockFlower {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewSap(int i) {
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

      for(int i = 0; i < this.field_94349_a.length; ++i) {
         this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:SaplingDesertIronwood");
         this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:SaplingCherry");
         this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:SaplingRedMaple");
         this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:SaplingAngel");
         this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:SaplingYellowMaple");
         this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:SaplingJacaranda");
         this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:SaplingApple");
         this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:SaplingEucalyptus");
         this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:SaplingSequoia");
         this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:SaplingFig");
         this.field_94349_a[10] = par1IconRegister.registerIcon("forgottennature:SaplingCypress");
         this.field_94349_a[11] = par1IconRegister.registerIcon("forgottennature:SaplingAcacia");
         this.field_94349_a[12] = par1IconRegister.registerIcon("forgottennature:SaplingJoshua");
         this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:SaplingSwampWillow");
         this.field_94349_a[14] = par1IconRegister.registerIcon("forgottennature:SaplingDeciduousBush");
         this.field_94349_a[15] = par1IconRegister.registerIcon("forgottennature:SaplingEvergreenBush");
      }

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
         obj = new genCherry(forgottennature.leafIDindex + 1, 1, forgottennature.logIDindex, 0);
      } else if(l == 2) {
         obj = new genCherry(forgottennature.leafIDindex, 0, 17, 0);
      } else if(l == 3) {
         obj = new genAngel(forgottennature.leafIDindex, 1);
      } else if(l == 4) {
         obj = new genCherry(forgottennature.leafIDindex, 2, 17, 0);
      } else if(l == 5) {
         obj = new genCherry(forgottennature.leafIDindex, 3, 17, 0);
      } else if(l == 6) {
         obj = new genFruit(true, forgottennature.leafIDindex + 1, 3, 17, 0, 1);
      } else if(l == 7) {
         obj = new genEucalyptus(forgottennature.leafIDindex, 7, forgottennature.logIDindex, 4);
      } else if(l == 8) {
         obj = new genSequoia(forgottennature.leafIDindex + 1, 0, forgottennature.logIDindex, 6);
      } else {
         int size;
         if(l == 9) {
            size = 2 + random.nextInt(6);
            obj = new genFig(forgottennature.leafIDindex, 4, 0, size);
         } else if(l == 10) {
            obj = new genCypress(forgottennature.leafIDindex, 5, 17, 1);
         } else if(l == 11) {
            obj = new genAcacia(forgottennature.leafIDindex + 1, 6, forgottennature.logIDindex, 8);
         } else if(l == 12) {
            obj = new genJoshua(forgottennature.leafIDindex + 1, 7, forgottennature.logIDindex, 10);
         } else if(l == 13) {
            size = 2 + random.nextInt(6);
            obj = new genWillow(forgottennature.leafIDindex + 2, 0, forgottennature.logIDindex, 12, size);
         } else if(l == 14) {
            obj = new genDecBush(forgottennature.leafIDindex + 2, 1, 0);
         } else if(l == 15) {
            obj = new genEverBush(forgottennature.leafIDindex + 2, 2, 1);
         } else {
            obj = new genDesertTree(forgottennature.leafIDindex, 6, forgottennature.logIDindex, 2);
         }
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
