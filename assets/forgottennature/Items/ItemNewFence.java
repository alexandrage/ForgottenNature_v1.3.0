package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemNewFence extends Item {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;
   int fenceID;


   public ItemNewFence(int i, int j) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.fenceID = j;
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Brown Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Purple Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Dark Red Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Dark Yellow Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Peach Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Orange Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Brightwood Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Redwood Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Acacia Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Bright Yellow Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Old Wood Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Bamboo Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Dried Bamboo Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 13), "Crystal Fence");
      LanguageRegistry.addName(new ItemStack(this, 1, 14), "Dark Crystal Fence");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[15];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:FenceBrown");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:FencePurple");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:FenceDarkRed");
      this.field_94594_d[3] = par1IconRegister.registerIcon("forgottennature:FenceDarkYellow");
      this.field_94594_d[4] = par1IconRegister.registerIcon("forgottennature:FencePeach");
      this.field_94594_d[5] = par1IconRegister.registerIcon("forgottennature:FenceOrange");
      this.field_94594_d[6] = par1IconRegister.registerIcon("forgottennature:FenceBrightwood");
      this.field_94594_d[7] = par1IconRegister.registerIcon("forgottennature:FenceRedwood");
      this.field_94594_d[8] = par1IconRegister.registerIcon("forgottennature:FenceAcacia");
      this.field_94594_d[9] = par1IconRegister.registerIcon("forgottennature:FenceBrightYellow");
      this.field_94594_d[10] = par1IconRegister.registerIcon("forgottennature:FenceOld");
      this.field_94594_d[11] = par1IconRegister.registerIcon("forgottennature:FenceBamboo");
      this.field_94594_d[12] = par1IconRegister.registerIcon("forgottennature:FenceDriedBamboo");
      this.field_94594_d[13] = par1IconRegister.registerIcon("forgottennature:FenceLightCrystal");
      this.field_94594_d[14] = par1IconRegister.registerIcon("forgottennature:FenceDarkCrystal");
   }

   public int getMetadata(int i) {
      return i & 15;
   }

   public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
      int var11 = par3World.getBlockId(par4, par5, par6);
      if(var11 == Block.snow.blockID) {
         par7 = 1;
      } else if(var11 != Block.vine.blockID && var11 != Block.tallGrass.blockID && var11 != Block.deadBush.blockID && (Block.blocksList[var11] == null || !Block.blocksList[var11].isBlockReplaceable(par3World, par4, par5, par6))) {
         if(par7 == 0) {
            --par5;
         }

         if(par7 == 1) {
            ++par5;
         }

         if(par7 == 2) {
            --par6;
         }

         if(par7 == 3) {
            ++par6;
         }

         if(par7 == 4) {
            --par4;
         }

         if(par7 == 5) {
            ++par4;
         }
      }

      if(par1ItemStack.stackSize == 0) {
         return false;
      } else if(!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
         return false;
      } else if(par5 == 255 && Block.blocksList[this.fenceID].blockMaterial.isSolid()) {
         return false;
      } else if(par3World.canPlaceEntityOnSide(this.fenceID, par4, par5, par6, false, par7, par2EntityPlayer, par1ItemStack)) {
         Block var12 = Block.blocksList[this.fenceID];
         int var13 = this.getMetadata(par1ItemStack.getItemDamage());
         int var14 = Block.blocksList[this.fenceID].onBlockPlaced(par3World, par4, par5, par6, par7, par8, par9, par10, var13);
         if(this.placeBlockAt(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, var14)) {
            par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), var12.stepSound.getPlaceSound(), (var12.stepSound.getVolume() + 1.0F) / 2.0F, var12.stepSound.getPitch() * 0.8F);
            --par1ItemStack.stackSize;
         }

         return true;
      } else {
         return false;
      }
   }

   @SideOnly(Side.CLIENT)
   public boolean canPlaceItemBlockOnSide(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer, ItemStack par7ItemStack) {
      int var8 = par1World.getBlockId(par2, par3, par4);
      if(var8 == Block.snow.blockID) {
         par5 = 1;
      } else if(var8 != Block.vine.blockID && var8 != Block.tallGrass.blockID && var8 != Block.deadBush.blockID && (Block.blocksList[var8] == null || !Block.blocksList[var8].isBlockReplaceable(par1World, par2, par3, par4))) {
         if(par5 == 0) {
            --par3;
         }

         if(par5 == 1) {
            ++par3;
         }

         if(par5 == 2) {
            --par4;
         }

         if(par5 == 3) {
            ++par4;
         }

         if(par5 == 4) {
            --par2;
         }

         if(par5 == 5) {
            ++par2;
         }
      }

      return par1World.canPlaceEntityOnSide(this.fenceID, par2, par3, par4, false, par5, (Entity)null, par7ItemStack);
   }

   public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata) {
      if(!world.setBlock(x, y, z, this.fenceID, metadata, 2)) {
         return false;
      } else {
         if(world.getBlockId(x, y, z) == this.fenceID) {
            Block.blocksList[this.fenceID].onBlockPlacedBy(world, x, y, z, player, stack);
            Block.blocksList[this.fenceID].onPostBlockPlaced(world, x, y, z, metadata);
         }

         return true;
      }
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 15; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Brown fence";
      case 1:
         return "Purple fence";
      case 2:
         return "Dark Red fence";
      case 3:
         return "Dark Yellow fence";
      case 4:
         return "Peach fence fence";
      case 5:
         return "Orange fence fence";
      case 6:
         return "Brightwood fence";
      case 7:
         return "vibrant redwood fence";
      case 8:
         return "acacia fence";
      case 9:
         return "bright yellow fence";
      case 10:
         return "old wood fence";
      case 11:
         return "bamboo fence";
      case 12:
         return "dried bamboo fence";
      case 13:
         return "crystalfence";
      case 14:
         return "dcrystal fence";
      default:
         return "";
      }
   }
}
