package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCrystalStone extends BlockFlower {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockCrystalStone(int i) {
      super(i);
      float f = 0.4F;
      this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public int quantityDropped(Random random) {
      return 0;
   }

   protected boolean canThisPlantGrowOnThisBlockID(int par1) {
      return par1 == Block.grass.blockID || par1 == forgottennature.groundID || par1 == Block.stone.blockID;
   }

   public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1) {
      super.dropBlockAsItemWithChance(world, i, j, k, l, f, i1);

      for(int n = 0; n < 3; ++n) {
         if((l & 3) == 0 && world.rand.nextInt(2) == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[forgottennature.crystalItemID], 1, 1));
         }

         if((l & 3) == 1 && world.rand.nextInt(2) == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[forgottennature.crystalItemID], 1, 4));
         }
      }

   }

   public boolean canBlockStay(World par1World, int par2, int par3, int par4) {
      return this.canThisPlantGrowOnThisBlockID(par1World.getBlockId(par2, par3 - 1, par4));
   }

   public int damageDropped(int i) {
      return i & 3;
   }

   public int idDropped(int par1, Random par2Random, int par3) {
      return super.blockID;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[2];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:LightCrystalFlower");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:DarkCrystalFlower");
   }

   public int getRenderType() {
      return 1;
   }
}
