package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemPowder extends Item {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemPowder(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Sulfur");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Nitre");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Netherrot");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Soul Dust");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[4];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:PowderSulfur");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:PowderNitre");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:PowderNetherrot");
      this.field_94594_d[3] = par1IconRegister.registerIcon("forgottennature:PowderSoulDust");
   }

   public int getMetadata(int par1) {
      return par1 & 3;
   }

   public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
      boolean var8 = false;
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      int ID = world.getBlockId(par4, par5, par6);
      if(ID != Block.dirt.blockID && ID != Block.grass.blockID) {
         return false;
      } else {
         if(equipped.getItemDamage() == 2) {
            world.setBlock(par4, par5, par6, Block.netherrack.blockID, 0, 2);
            --equipped.stackSize;
         }

         if(equipped.getItemDamage() == 3) {
            world.setBlock(par4, par5, par6, Block.slowSand.blockID, 0, 2);
            --equipped.stackSize;
         }

         return true;
      }
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 4; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Sulfur";
      case 1:
         return "Nitre";
      case 2:
         return "Netherrot";
      case 3:
         return "Soul Dust";
      default:
         return "";
      }
   }
}
