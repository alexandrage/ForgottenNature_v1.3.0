package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCrystalBlock extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockCrystalBlock(int par1) {
      super(par1, Material.rock);
      this.setTickRandomly(true);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[4];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:LightCrystalBlock");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:DarkCrystalBlock");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:LightBrickCrystalBlock");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:DarkBrickCrystalBlock");
   }

   public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      int met = par1World.getBlockMetadata(par2, par3, par4);
      if(!par1World.isRemote && met < 2) {
         int id;
         int var6;
         int var7;
         int var8;
         int var9;
         if(met == 0) {
            for(var6 = 0; var6 < 4; ++var6) {
               var7 = par2 + par5Random.nextInt(3) - 1;
               var8 = par3 + par5Random.nextInt(3) - 1;
               var9 = par4 + par5Random.nextInt(3) - 1;
               par1World.getBlockId(var7, var8 + 1, var9);
               id = par1World.getBlockId(var7, var8, var9);
               if((id == Block.grass.blockID || id == forgottennature.newGround.blockID || id == Block.stone.blockID) && par1World.getBlockId(var7, var8 + 1, var9) == 0) {
                  par1World.setBlock(var7, var8 + 1, var9, forgottennature.crystalStone.blockID, 0, 2);
               }
            }

            for(var6 = 0; var6 < 4; ++var6) {
               var7 = par2 + par5Random.nextInt(3) - 1;
               var8 = par3 + par5Random.nextInt(3) - 1;
               var9 = par4 + par5Random.nextInt(3) - 1;
               par1World.getBlockId(var7, var8 + 1, var9);
               id = par1World.getBlockId(var7, var8, var9);
               if(id == Block.grass.blockID || id == Block.dirt.blockID || id == Block.tilledField.blockID) {
                  par1World.setBlock(var7, var8, var9, forgottennature.newGround.blockID, 0, 2);
               }
            }
         } else {
            for(var6 = 0; var6 < 4; ++var6) {
               var7 = par2 + par5Random.nextInt(3) - 1;
               var8 = par3 + par5Random.nextInt(3) - 1;
               var9 = par4 + par5Random.nextInt(3) - 1;
               par1World.getBlockId(var7, var8 + 1, var9);
               id = par1World.getBlockId(var7, var8, var9);
               if((id == Block.grass.blockID || id == forgottennature.newGround.blockID || id == Block.stone.blockID) && par1World.getBlockId(var7, var8 + 1, var9) == 0) {
                  par1World.setBlock(var7, var8 + 1, var9, forgottennature.crystalStone.blockID, 1, 2);
               }
            }

            for(var6 = 0; var6 < 4; ++var6) {
               var7 = par2 + par5Random.nextInt(3) - 1;
               var8 = par3 + par5Random.nextInt(3) - 1;
               var9 = par4 + par5Random.nextInt(3) - 1;
               par1World.getBlockId(var7, var8 + 1, var9);
               id = par1World.getBlockId(var7, var8, var9);
               if(id == Block.grass.blockID || id == Block.dirt.blockID || id == Block.tilledField.blockID) {
                  par1World.setBlock(var7, var8, var9, forgottennature.newGround.blockID, 0, 2);
               }
            }
         }
      }

   }

   public int idDropped(int par1, Random par2Random, int par3) {
      return super.blockID;
   }

   public int damageDropped(int par1) {
      return par1 & 7;
   }
}
