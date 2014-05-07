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

public class ItemCrystal extends Item {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemCrystal(int i) {
      super(i);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Crystal Shard");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Crystal Chunk");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Crystal Stick");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Dark Crystal Shard");
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Dark Crystal Chunk");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[5];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:DarkCrystalChunk");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:LightCrystalShard");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:LightCrystalChunk");
      this.field_94594_d[3] = par1IconRegister.registerIcon("forgottennature:CrystalStick");
      this.field_94594_d[4] = par1IconRegister.registerIcon("forgottennature:DarkCrystalShard");
   }

   public void addCreativeItems(ArrayList itemList) {
      for(int l1 = 0; l1 < 5; ++l1) {
         itemList.add(new ItemStack(this, 1, l1));
      }

   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 5; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Dark Crystal Chunk";
      case 1:
         return "Crystal Shard";
      case 2:
         return "Crystal Chunk";
      case 3:
         return "Crystal Stick";
      case 4:
         return "Dark Crystal Shard";
      default:
         return "";
      }
   }
}
