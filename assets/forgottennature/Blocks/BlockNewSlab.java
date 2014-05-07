package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlockNewSlab extends BlockHalfSlab {

   public static String[] slabTyps;
   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewSlab(int par1, boolean par2, Material material) {
      super(par1, par2, material);
      this.setCreativeTab(CreativeTabs.tabBlock);
      if(par1 == forgottennature.halfPlankID) {
         slabTyps = new String[]{"brown", "purple", "dark red", "dark yellow", "peach", "orange", "brightwood", "vibrant redwood"};
      } else if(par1 == forgottennature.halfPlankID2) {
         slabTyps = new String[]{"acacia", "bright yellow", "old wood", "bamboo", "dried bamboo", "crystal", "dcrystal"};
      } else if(par1 == forgottennature.halfStoneID) {
         slabTyps = new String[]{"granite", "gneiss", "hornfels", "marble", "granite bricks", "gneiss bricks", "hornfels bricks", "marble bricks"};
      }

   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      if(par2 > 7) {
         par2 -= 8;
      }

      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[8];
      if(super.blockID != forgottennature.halfPlankID && super.blockID != forgottennature.doubleHalfPlankID) {
         if(super.blockID != forgottennature.halfPlankID2 && super.blockID != forgottennature.doubleHalfPlankID2) {
            if(super.blockID == forgottennature.halfStoneID || super.blockID == forgottennature.doubleHalfStoneID) {
               this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:StoneGranite");
               this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:StoneGneiss");
               this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:StoneHornfels");
               this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:StoneMarble");
               this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:BricksGranite");
               this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:BricksGneiss");
               this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:BricksHornfels");
               this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:BricksMarble");
            }
         } else {
            this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:PlankAcacia");
            this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:PlankBrightYellow");
            this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:PlankOld");
            this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:PlankBamboo");
            this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:PlankDriedBamboo");
            this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:LightCrystalPlank");
            this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:DarkCrystalPlank");
         }
      } else {
         this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:PlankBrown");
         this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:PlankPurple");
         this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:PlankDarkRed");
         this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:PlankDarkYellow");
         this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:PlankPeach");
         this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:PlankOrange");
         this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:PlankBrightwood");
         this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:PlankRedwood");
      }

   }

   public int idDropped(int par1, Random par2Random, int par3) {
      return super.blockID != forgottennature.halfPlankID && super.blockID != forgottennature.doubleHalfPlankID?(super.blockID != forgottennature.halfPlankID2 && super.blockID != forgottennature.doubleHalfPlankID2?forgottennature.halfStoneID:forgottennature.halfPlankID2):forgottennature.halfPlankID;
   }

   @SideOnly(Side.CLIENT)
   private static boolean isBlockSingleSlab(int par0) {
      return par0 == forgottennature.halfPlankID || par0 == forgottennature.halfPlankID2 || par0 == forgottennature.halfStoneID;
   }

   public String getFullSlabName(int par1) {
      if(par1 < 0 || par1 >= slabTyps.length) {
         par1 = 0;
      }

      return super.getUnlocalizedName() + "." + slabTyps[par1];
   }

   @SideOnly(Side.CLIENT)
   public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
      if(par1 != forgottennature.doubleHalfPlankID && par1 != forgottennature.doubleHalfPlankID2 && par1 != forgottennature.doubleHalfStoneID) {
         byte many = 8;
         if(super.blockID == forgottennature.halfPlankID2) {
            many = 7;
         }

         for(int var4 = 0; var4 < many; ++var4) {
            par3List.add(new ItemStack(par1, 1, var4));
         }
      }

   }
}
