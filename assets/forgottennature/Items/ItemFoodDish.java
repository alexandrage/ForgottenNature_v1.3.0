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

public class ItemFoodDish extends ItemFood {

   @SideOnly(Side.CLIENT)
   private Icon field_94594_d;
   private int oniGar;
   private int pTGinger;
   private int wChestnut;


   public ItemFoodDish(int i) {
      super(i, 6, 1.0F, false);
      this.setMaxDamage(0);
      this.setHasSubtypes(true);
      this.setMaxStackSize(64);
      LanguageRegistry.addName(new ItemStack(this, 1, 0), "Veggie Bowl (Resistance)");
      LanguageRegistry.addName(new ItemStack(this, 1, 1), "Veggie Bowl (Speed)");
      LanguageRegistry.addName(new ItemStack(this, 1, 2), "Veggie Bowl (The Getaway)");
      LanguageRegistry.addName(new ItemStack(this, 1, 3), "Veggie Bowl (Major Fleeing)");
      LanguageRegistry.addName(new ItemStack(this, 1, 4), "Veggie Bowl (Mining)");
      LanguageRegistry.addName(new ItemStack(this, 1, 5), "Veggie Bowl (Clensing Regen)");
      LanguageRegistry.addName(new ItemStack(this, 1, 6), "Veggie Bowl (Regen)");
      LanguageRegistry.addName(new ItemStack(this, 1, 7), "Veggie Bowl (Regen Berserk)");
      LanguageRegistry.addName(new ItemStack(this, 1, 9), "Veggie Bowl (Night-Eye Regen)");
      LanguageRegistry.addName(new ItemStack(this, 1, 10), "Veggie Bowl (Amphibious Regen)");
      LanguageRegistry.addName(new ItemStack(this, 1, 11), "Veggie Bowl (Amphibious Night-Eye)");
      LanguageRegistry.addName(new ItemStack(this, 1, 12), "Veggie Bowl (Warrior)");
   }

   public int getMetadata(int par1) {
      return par1 & 15;
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94594_d = par1IconRegister.registerIcon("forgottennature:VeggieBowl");
   }

   public ItemStack onEaten(ItemStack itemstack, World par2World, EntityPlayer entityplayer) {
      --itemstack.stackSize;
      entityplayer.getFoodStats().addStats(this);
      par2World.playSoundAtEntity(entityplayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
      if(itemstack.getItemDamage() == 0) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 400, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 1));
      } else if(itemstack.getItemDamage() == 1) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 400, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
      } else if(itemstack.getItemDamage() == 2) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400, 2));
         entityplayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 1));
      } else if(itemstack.getItemDamage() == 3) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 2));
         entityplayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 300, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 1));
      } else if(itemstack.getItemDamage() == 4) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 2));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
      } else if(itemstack.getItemDamage() == 5) {
         entityplayer.clearActivePotions();
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 1));
      } else if(itemstack.getItemDamage() == 6) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20, 3));
         entityplayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 100, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 1));
      } else if(itemstack.getItemDamage() == 7) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 100, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 2));
         entityplayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 1));
      } else if(itemstack.getItemDamage() == 9) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 2));
      } else if(itemstack.getItemDamage() == 10) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 2));
         entityplayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 300, 1));
      } else if(itemstack.getItemDamage() == 11) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 80, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 300, 1));
      } else if(itemstack.getItemDamage() == 12) {
         entityplayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 400, 1));
         entityplayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 140, 1));
      }

      entityplayer.inventory.addItemStackToInventory(new ItemStack(Item.bowlEmpty));
      return itemstack;
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int i, CreativeTabs tabs, List list) {
      for(int j = 0; j < 13; ++j) {
         if(j == 8) {
            ++j;
         }

         list.add(new ItemStack(i, 1, j));
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      switch(i.getItemDamage()) {
      case 0:
         return "Veggie Bowl (Resistance)";
      case 1:
         return "Veggie Bowl (speed)";
      case 2:
         return "Veggie Bowl (The Getaway)";
      case 3:
         return "Veggie Bowl(Major Fleeing)";
      case 4:
         return "Veggie Bowl(Mining)";
      case 5:
         return "Veggie Bowl(Clensing Regen)";
      case 6:
         return "Veggie Bowl(Regen)";
      case 7:
         return "Veggie Bowl(regen berserk)";
      case 8:
         return "empty";
      case 9:
         return "Veggie Bowl(nighteye Regen)";
      case 10:
         return "Veggie Bowl(amphibious regen)";
      case 11:
         return "Veggie Bowl(amphibious nighteye)";
      case 12:
         return "Veggie Bowl(warrior)";
      default:
         return "";
      }
   }
}
