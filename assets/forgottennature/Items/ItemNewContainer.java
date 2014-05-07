package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemNewContainer extends Item {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemNewContainer(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Brown Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Purple Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Dark Red Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Dark Yellow Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Peach Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Orange Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 8), "Redwood Stain");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Bright Yellow Stain");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[10];
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:StainBrown");
      this.field_94594_d[3] = par1IconRegister.registerIcon("forgottennature:StainPurple");
      this.field_94594_d[4] = par1IconRegister.registerIcon("forgottennature:StainDarkRed");
      this.field_94594_d[5] = par1IconRegister.registerIcon("forgottennature:StainDarkYellow");
      this.field_94594_d[6] = par1IconRegister.registerIcon("forgottennature:StainPeach");
      this.field_94594_d[7] = par1IconRegister.registerIcon("forgottennature:StainOrange");
      this.field_94594_d[8] = par1IconRegister.registerIcon("forgottennature:StainRedwood");
      this.field_94594_d[9] = par1IconRegister.registerIcon("forgottennature:StainBrightYellow");
   }

   public void addCreativeItems(ArrayList itemList) {
      for(int l1 = 2; l1 < 10; ++l1) {
         itemList.add(new ItemStack(this, 1, l1));
      }

   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 2; j < 10; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "empty stain";
      case 1:
         return "empty stain";
      case 2:
         return "brown stain";
      case 3:
         return "ppl stain";
      case 4:
         return "dark red stain";
      case 5:
         return "dark yellow stain";
      case 6:
         return "peach stain";
      case 7:
         return "orange stain";
      case 8:
         return "redwood stain";
      case 9:
         return "bright yellow stain";
      default:
         return "";
      }
   }
}
