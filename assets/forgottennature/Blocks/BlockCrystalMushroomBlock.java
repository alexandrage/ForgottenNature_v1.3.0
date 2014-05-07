package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCrystalMushroomBlock extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockCrystalMushroomBlock(int par1) {
      super(par1, Material.rock);
      this.setTickRandomly(true);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return par2 == 0 && (par1 == 0 || par1 == 1)?this.field_94349_a[0]:(par2 == 0 && par1 > 1?this.field_94349_a[1]:this.field_94349_a[2]);
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[3];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:LightCrystalMushroomStemBlockBase");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:LightCrystalMushroomStemBlock");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:LightCrystalMushroomHeadBlock");
   }

   public int quantityDropped(Random random) {
      return 0;
   }

   public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1) {
      super.dropBlockAsItemWithChance(world, i, j, k, l, f, i1);

      for(int n = 0; n < 3; ++n) {
         if(world.rand.nextInt(2) == 0) {
            this.dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.itemsList[forgottennature.crystalItemID], 1, 1));
         }
      }

   }
}
