package assets.forgottennature.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemNewFood2 extends ItemFood {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemNewFood2(int i) {
      super(i, 8, 0.7F, false);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Fruit Salad");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Fruit Nut Salad");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[2];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:FoodFruitSalad");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:FoodFruitNutSalad");
   }

   public int getMetadata(int par1) {
      return par1 & 3;
   }

   public ItemStack onEaten(ItemStack itemstack, World par2World, EntityPlayer player) {
      --itemstack.stackSize;
      player.getFoodStats().addStats(this);
      par2World.playSoundAtEntity(player, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
      if(itemstack.getItemDamage() == 0) {
         player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 2));
      } else {
         player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 1));
      }

      player.inventory.addItemStackToInventory(new ItemStack(Item.bowlEmpty));
      return itemstack;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 2; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "fruitSalad";
      case 1:
         return "fruitNutSalad";
      default:
         return "";
      }
   }
}
