package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNewFence extends BlockFence {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewFence(int par1, String par2Str) {
      super(par1, par2Str, Material.wood);
   }

   public BlockNewFence(int par1, String par2Str, Material par3Material) {
      super(par1, par2Str, par3Material);
   }

   public int quantityDropped(Random random) {
      return 0;
   }

   @SideOnly(Side.CLIENT)
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
      this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:LightCrystalPlank");
      this.field_94349_a[14] = par1IconRegister.registerIcon("forgottennature:DarkCrystalPlank");
   }

   public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity) {
      boolean flag = this.canConnectFenceTo(par1World, par2, par3, par4 - 1);
      boolean flag1 = this.canConnectFenceTo(par1World, par2, par3, par4 + 1);
      boolean flag2 = this.canConnectFenceTo(par1World, par2 - 1, par3, par4);
      boolean flag3 = this.canConnectFenceTo(par1World, par2 + 1, par3, par4);
      float f = 0.375F;
      float f1 = 0.625F;
      float f2 = 0.375F;
      float f3 = 0.625F;
      if(flag) {
         f2 = 0.0F;
      }

      if(flag1) {
         f3 = 1.0F;
      }

      if(flag || flag1) {
         this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
         super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }

      f2 = 0.375F;
      f3 = 0.625F;
      if(flag2) {
         f = 0.0F;
      }

      if(flag3) {
         f1 = 1.0F;
      }

      if(flag2 || flag3 || !flag && !flag1) {
         this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
         super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }

      if(flag) {
         f2 = 0.0F;
      }

      if(flag1) {
         f3 = 1.0F;
      }

      this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
   }

   public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      boolean flag = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 - 1);
      boolean flag1 = this.canConnectFenceTo(par1IBlockAccess, par2, par3, par4 + 1);
      boolean flag2 = this.canConnectFenceTo(par1IBlockAccess, par2 - 1, par3, par4);
      boolean flag3 = this.canConnectFenceTo(par1IBlockAccess, par2 + 1, par3, par4);
      float f = 0.375F;
      float f1 = 0.625F;
      float f2 = 0.375F;
      float f3 = 0.625F;
      if(flag) {
         f2 = 0.0F;
      }

      if(flag1) {
         f3 = 1.0F;
      }

      if(flag2) {
         f = 0.0F;
      }

      if(flag3) {
         f1 = 1.0F;
      }

      this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      return false;
   }

   public int getRenderType() {
      return 11;
   }

   public boolean canConnectFenceTo(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
      int l = par1IBlockAccess.getBlockId(par2, par3, par4);
      if(l != super.blockID && l != Block.fenceGate.blockID) {
         Block block = Block.blocksList[l];
         return block != null && block.blockMaterial.isOpaque() && block.renderAsNormalBlock()?block.blockMaterial != Material.pumpkin:false;
      } else {
         return true;
      }
   }

   public static boolean isIdAFence(int par0) {
      return par0 == Block.fence.blockID || par0 == Block.netherFence.blockID || par0 == forgottennature.newFence.blockID;
   }

   @SideOnly(Side.CLIENT)
   public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return true;
   }

   public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l) {
      super.harvestBlock(world, entityplayer, i, j, k, l);
      l &= 15;
      if(l == 0) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 0));
      }

      if(l == 1) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 1));
      }

      if(l == 2) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 2));
      }

      if(l == 3) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 3));
      }

      if(l == 4) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 4));
      }

      if(l == 5) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 5));
      }

      if(l == 6) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 6));
      }

      if(l == 7) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 7));
      }

      if(l == 8) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 8));
      }

      if(l == 9) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 9));
      }

      if(l == 10) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 10));
      }

      if(l == 11) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 11));
      }

      if(l == 12) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 12));
      }

      if(l == 13) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 13));
      }

      if(l == 14) {
         this.dropBlockAsItem_do(world, i, j, k, new ItemStack(this, 1, 14));
      }

   }

   public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1) {
      super.dropBlockAsItemWithChance(world, i, j, k, l, f, i1);
   }
}
