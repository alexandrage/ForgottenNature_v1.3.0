package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemNewCropSeeds extends Item {

   @SideOnly(Side.CLIENT)
   private Icon field_94594_d;
   private int blockType0;
   private int blockType1;
   private int blockType2;
   private int blockType3;
   private int blockType4;
   private int soilBlockID;


   public ItemNewCropSeeds(int par1, int par2, int par3, int par4, int par5, int par6, int par7) {
      super(par1);
      this.blockType0 = par2;
      this.blockType1 = par3;
      this.blockType2 = par4;
      this.blockType3 = par5;
      this.blockType4 = par6;
      this.soilBlockID = par7;
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Celery Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Corn Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Cotton Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Rice Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Tomato Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Cabbage Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Pineapple Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Grape Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Hemp Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Broccoli Seeds");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Parsley Seeds");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = par1IconRegister.registerIcon("forgottennature:Seed");
   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }

   public boolean onItemUse(ItemStack itemstack, EntityPlayer par2EntityPlayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
      if(par7 != 1) {
         return false;
      } else if(par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, itemstack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, itemstack)) {
         int var8 = world.getBlockId(par4, par5, par6);
         if(var8 == this.soilBlockID && world.isAirBlock(par4, par5 + 1, par6)) {
            if(itemstack.getItemDamage() == 0) {
               world.setBlock(par4, par5 + 1, par6, this.blockType0, 0, 2);
            } else if(itemstack.getItemDamage() == 1) {
               world.setBlock(par4, par5 + 1, par6, this.blockType3, 0, 2);
            } else if(itemstack.getItemDamage() == 2) {
               world.setBlock(par4, par5 + 1, par6, this.blockType3, 4, 2);
            } else if(itemstack.getItemDamage() == 3) {
               world.setBlock(par4, par5 + 1, par6, this.blockType2, 12, 2);
            } else if(itemstack.getItemDamage() == 4) {
               world.setBlock(par4, par5 + 1, par6, this.blockType4, 0, 2);
            } else if(itemstack.getItemDamage() == 5) {
               world.setBlock(par4, par5 + 1, par6, this.blockType4, 4, 2);
            } else if(itemstack.getItemDamage() == 6) {
               world.setBlock(par4, par5 + 1, par6, this.blockType4, 8, 2);
            } else if(itemstack.getItemDamage() == 7) {
               world.setBlock(par4, par5 + 1, par6, this.blockType4, 12, 2);
            } else if(itemstack.getItemDamage() == 8) {
               world.setBlock(par4, par5 + 1, par6, this.blockType3, 12, 2);
            } else if(itemstack.getItemDamage() == 9) {
               world.setBlock(par4, par5 + 1, par6, this.blockType2, 4, 2);
            } else {
               world.setBlock(par4, par5 + 1, par6, this.blockType2, 0, 2);
            }

            --itemstack.stackSize;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 11; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Celerys";
      case 1:
         return "Corns";
      case 2:
         return "Cottons";
      case 3:
         return "Rices";
      case 4:
         return "Tomatos";
      case 5:
         return "Cabbages";
      case 6:
         return "Pineapples";
      case 7:
         return "Grapess";
      case 8:
         return "Hemps";
      case 9:
         return "Broccolis";
      case 10:
         return "Parsleys";
      default:
         return "";
      }
   }
}
