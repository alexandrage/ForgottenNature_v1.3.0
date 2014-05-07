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

public class BlockNewPlanks2 extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewPlanks2(int i) {
      super(i, Material.wood);
      setBurnProperties(super.blockID, 5, 20);
   }

   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[7];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:PlankHerringbone");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:PlankXParquet");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:PlankFrederiksborgParquet");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:PlankForDonParquet");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:PlankLatticeParquet");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:PlankSquareDiamondParquet");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:PlankPavimentiParquet");
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
      return i & 7;
   }
}
