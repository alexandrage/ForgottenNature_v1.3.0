package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockNewPlanks extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewPlanks(int i) {
      super(i, Material.wood);
      setBurnProperties(super.blockID, 5, 20);
   }

   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[15];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:PlankBrown");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:PlankPurple");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:PlankDarkRed");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:PlankDarkYellow");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:PlankPeach");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:PlankOrange");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:PlankBrightwood");
      this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:PlankRedwood");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:PlankAcacia");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:PlankBrightYellow");
      this.field_94349_a[10] = par1IconRegister.registerIcon("forgottennature:PlankOld");
      this.field_94349_a[11] = par1IconRegister.registerIcon("forgottennature:PlankBamboo");
      this.field_94349_a[12] = par1IconRegister.registerIcon("forgottennature:PlankDriedBamboo");
      this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:PlankNetherBlaze");
      this.field_94349_a[14] = par1IconRegister.registerIcon("forgottennature:PlankNetherAsh");
   }

   public int quantityDropped(Random random) {
      return 1;
   }

   public int idDropped(int i, Random random, int j) {
      return super.blockID;
   }

   public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l) {
      super.harvestBlock(world, entityplayer, i, j, k, l);
   }

   public int damageDropped(int i) {
      return i & 15;
   }

   public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
      int var6 = par1World.getBlockMetadata(par2, par3, par4);
      float dis = 1.0F;
      double var7 = (double)((float)par2 + dis / (float)par1World.rand.nextInt(11));
      double var9 = (double)((float)par3 + dis / (float)par1World.rand.nextInt(11));
      double var11 = (double)((float)par4 + dis / (float)par1World.rand.nextInt(11));
      if(var6 == 13) {
         par1World.spawnParticle("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         par1World.spawnParticle("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 14) {
         par1World.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         par1World.spawnParticle("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      }

   }
}
