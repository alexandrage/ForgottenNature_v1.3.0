package assets.forgottennature.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemReed;
import net.minecraft.util.Icon;

public class NewItemReed extends ItemReed {

   @SideOnly(Side.CLIENT)
   private Icon field_94594_d;
   private Block block;
   private int a;


   public NewItemReed(int par1, Block par2Block) {
      super(par1, par2Block);
      this.a = par2Block.blockID;
      this.block = par2Block;
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = par1IconRegister.registerIcon("forgottennature:flowerPot");
   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }
}
