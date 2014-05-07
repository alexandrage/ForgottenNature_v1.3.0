package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockNewGroundcover extends Block {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewGroundcover(int par1) {
      super(par1, Material.ground);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[0];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[1];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:CrystalGroundcover");
   }
}
