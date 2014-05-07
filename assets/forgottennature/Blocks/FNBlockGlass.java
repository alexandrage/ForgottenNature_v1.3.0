package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class FNBlockGlass extends BlockBreakable {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public FNBlockGlass(int par1, Material par3Material, boolean par4) {
      super(par1, "glass", par3Material, par4);
      this.setCreativeTab(CreativeTabs.tabBlock);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[16];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:GlassBlackLattice");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:GlassWide3x3");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:GlassFramedWide3x3");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:Glass3x3");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:GlassFramed3x3");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:GlassDoubleDiamond");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:GlassPinwheel");
      this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:Glass2x2");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:GlassFramed2x2");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:GlassDiamondLattice");
      this.field_94349_a[10] = par1IconRegister.registerIcon("forgottennature:GlassDoubleLattice");
      this.field_94349_a[11] = par1IconRegister.registerIcon("forgottennature:GlassSquareLattice");
      this.field_94349_a[12] = par1IconRegister.registerIcon("forgottennature:GlassPeaking");
      this.field_94349_a[13] = par1IconRegister.registerIcon("forgottennature:GlassCircle");
      this.field_94349_a[14] = par1IconRegister.registerIcon("forgottennature:GlassDoubleDoor");
      this.field_94349_a[15] = par1IconRegister.registerIcon("forgottennature:Glass2x1");
   }

   public int quantityDropped(Random par1Random) {
      return 0;
   }

   @SideOnly(Side.CLIENT)
   public int getRenderBlockPass() {
      return 0;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   protected boolean canSilkHarvest() {
      return true;
   }
}
