package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemNewHalfPlanks extends ItemBlock {

   private final boolean field_77891_a;
   private final BlockHalfSlab field_77889_b;
   private final BlockHalfSlab field_77890_c;


   public ItemNewHalfPlanks(int i, BlockHalfSlab par2BlockHalfSlab, BlockHalfSlab par3BlockHalfSlab, boolean par4) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.field_77889_b = par2BlockHalfSlab;
      this.field_77890_c = par3BlockHalfSlab;
      this.field_77891_a = par4;
      if(!par4) {
         if(i == forgottennature.halfPlankID - 256) {
            LanguageRegistry.addName(new ItemStack(this, 1, 0), "Brown Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 1), "Purple Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 2), "Dark Red Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 3), "Dark Yellow Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 4), "Peach Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 5), "Orange Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 6), "Brightwood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 7), "Redwood Slab");
         } else if(i == forgottennature.halfPlankID2 - 256) {
            LanguageRegistry.addName(new ItemStack(this, 1, 0), "Acacia Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 1), "Bright Yellow Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 2), "Old Wood Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 3), "Bamboo Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 4), "Dried Bamboo Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 5), "Crystal Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 6), "Dark Crystal Slab");
         } else if(i == forgottennature.halfStoneID - 256) {
            LanguageRegistry.addName(new ItemStack(this, 1, 0), "Granite Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 1), "Gneiss Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 2), "Hornfels Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 3), "Marble Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 4), "Granite Brick Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 5), "Gneiss Brick Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 6), "Hornfels Brick Slab");
            LanguageRegistry.addName(new ItemStack(this, 1, 7), "Marble Brick Slab");
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public Icon getIconFromDamage(int par1) {
      return Block.blocksList[super.itemID].getIcon(2, par1);
   }

   public int getMetadata(int i) {
      return i;
   }

   public int getPlacedBlockMetadata(int damage) {
      return damage;
   }

   public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
      if(this.field_77891_a) {
         return super.onItemUse(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10);
      } else if(par1ItemStack.stackSize == 0) {
         return false;
      } else if(!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
         return false;
      } else {
         int var11 = par3World.getBlockId(par4, par5, par6);
         int var12 = par3World.getBlockMetadata(par4, par5, par6);
         int var13 = var12 & 7;
         boolean var14 = (var12 & 8) != 0;
         if((par7 == 1 && !var14 || par7 == 0 && var14) && var11 == this.field_77889_b.blockID && var13 == par1ItemStack.getItemDamage()) {
            if(par3World.checkNoEntityCollision(this.field_77890_c.getCollisionBoundingBoxFromPool(par3World, par4, par5, par6)) && par3World.setBlock(par4, par5, par6, this.field_77890_c.blockID, var13, 2)) {
               par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), this.field_77890_c.stepSound.getStepSound(), (this.field_77890_c.stepSound.getVolume() + 1.0F) / 2.0F, this.field_77890_c.stepSound.getPitch() * 0.8F);
               --par1ItemStack.stackSize;
            }

            return true;
         } else {
            return this.func_77888_a(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7)?true:super.onItemUse(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10);
         }
      }
   }

   @SideOnly(Side.CLIENT)
   public boolean canPlaceItemBlockOnSide(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer, ItemStack par7ItemStack) {
      int var8 = par2;
      int var9 = par3;
      int var10 = par4;
      int var11 = par1World.getBlockId(par2, par3, par4);
      int var12 = par1World.getBlockMetadata(par2, par3, par4);
      int var13 = var12 & 7;
      boolean var14 = (var12 & 8) != 0;
      if((par5 == 1 && !var14 || par5 == 0 && var14) && var11 == this.field_77889_b.blockID && var13 == par7ItemStack.getItemDamage()) {
         return true;
      } else {
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

         var11 = par1World.getBlockId(par2, par3, par4);
         var12 = par1World.getBlockMetadata(par2, par3, par4);
         var13 = var12 & 7;
         var14 = (var12 & 8) != 0;
         return var11 == this.field_77889_b.blockID && var13 == par7ItemStack.getItemDamage()?true:super.canPlaceItemBlockOnSide(par1World, var8, var9, var10, par5, par6EntityPlayer, par7ItemStack);
      }
   }

   private boolean func_77888_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7) {
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

      int var8 = par3World.getBlockId(par4, par5, par6);
      int var9 = par3World.getBlockMetadata(par4, par5, par6);
      int var10 = var9 & 7;
      if(var8 == this.field_77889_b.blockID && var10 == par1ItemStack.getItemDamage()) {
         if(par3World.checkNoEntityCollision(this.field_77890_c.getCollisionBoundingBoxFromPool(par3World, par4, par5, par6)) && par3World.setBlock(par4, par5, par6, this.field_77890_c.blockID, var10, 2)) {
            par3World.playSoundEffect((double)((float)par4 + 0.5F), (double)((float)par5 + 0.5F), (double)((float)par6 + 0.5F), this.field_77890_c.stepSound.getStepSound(), (this.field_77890_c.stepSound.getVolume() + 1.0F) / 2.0F, this.field_77890_c.stepSound.getPitch() * 0.8F);
            --par1ItemStack.stackSize;
         }

         return true;
      } else {
         return false;
      }
   }

   public String getUnlocalizedName(ItemStack i) {
      if(super.itemID == forgottennature.halfPlankID) {
         switch(i.getItemDamage()) {
         case 0:
            return "Brown slab";
         case 1:
            return "Purple slab";
         case 2:
            return "Dark Red slab";
         case 3:
            return "Dark Yellow slab";
         case 4:
            return "Peach slab";
         case 5:
            return "Orange slab";
         case 6:
            return "Brightwood slab";
         case 7:
            return "Vibrant Redwood slab";
         }
      } else if(super.itemID == forgottennature.halfPlankID2) {
         switch(i.getItemDamage()) {
         case 0:
            return "Acacia slab";
         case 1:
            return "Bright Yellow slab";
         case 2:
            return "Old Wood slab";
         case 3:
            return "Bamboo slab";
         case 4:
            return "Dried Bamboo slab";
         case 5:
            return "Crystalslab";
         case 6:
            return "DarkCrystal slab";
         }
      } else if(super.itemID == forgottennature.halfStoneID) {
         switch(i.getItemDamage()) {
         case 0:
            return "Granite slab";
         case 1:
            return "Gneiss slab";
         case 2:
            return "Hornfels slab";
         case 3:
            return "Marble slab";
         case 4:
            return "granite Brick slab";
         case 5:
            return "gneiss Brick slab";
         case 6:
            return "hornfels Brick slab";
         case 7:
            return "Marble Brick slab";
         }
      }

      return "";
   }
}
