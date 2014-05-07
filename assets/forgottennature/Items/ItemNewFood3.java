package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
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
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemNewFood3 extends ItemFood {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94594_d;


   public ItemNewFood3(int i) {
      super(i, 6, 0.6F, false);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Coconut Milk");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Fruit Smoothie");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Fruit Juice");
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d[i];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = new Icon[10];
      this.field_94594_d[0] = par1IconRegister.registerIcon("forgottennature:FoodCoconutMilk");
      this.field_94594_d[1] = par1IconRegister.registerIcon("forgottennature:FoodFruitSmoothie");
      this.field_94594_d[2] = par1IconRegister.registerIcon("forgottennature:FoodFruitJuice");
   }

   public ItemStack onEaten(ItemStack stack, World par2World, EntityPlayer player) {
      --stack.stackSize;
      player.getFoodStats().addStats(this);
      par2World.playSoundAtEntity(player, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
      this.onFoodEaten(stack, par2World, player);
      player.inventory.addItemStackToInventory(new ItemStack(Item.itemsList[forgottennature.ItemNewCupID]));
      return stack;
   }

   public int getMetadata(int par1) {
      return par1 & 3;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 3; ++j) {
         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "coconutMilk";
      case 1:
         return "fruitSmoothie";
      case 2:
         return "fruitJuice";
      default:
         return "";
      }
   }
}
