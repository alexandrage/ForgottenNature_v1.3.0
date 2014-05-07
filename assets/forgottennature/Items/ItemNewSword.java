package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ItemNewSword extends ItemSword {

   @SideOnly(Side.CLIENT)
   private Icon field_94594_d;
   int ID;
   private int a;
   private final EnumToolMaterial b;


   public ItemNewSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
      super(par1, par2EnumToolMaterial);
      this.b = par2EnumToolMaterial;
      super.maxStackSize = 1;
      this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
      this.a = (int)(4.0F + par2EnumToolMaterial.getDamageVsEntity());
      this.ID = par1;
      if(par1 == forgottennature.newToolIndex - 250) {
         LanguageRegistry.addName(new ItemStack(this), "Titan Stone Sword");
      } else if(par1 == forgottennature.crystalToolIndex - 253) {
         LanguageRegistry.addName(new ItemStack(this), "Light Crystal Sword");
      } else if(par1 == forgottennature.crystalToolIndex - 247) {
         LanguageRegistry.addName(new ItemStack(this), "Dark Crystal Sword");
      } else if(par1 == forgottennature.newToolIndex - 252) {
         LanguageRegistry.addName(new ItemStack(this), "Obsidian Sword");
      }

   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      if(this.ID == forgottennature.crystalToolIndex - 253) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:SwordLightCrystal");
      } else if(this.ID == forgottennature.crystalToolIndex - 247) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:SwordDarkCrystal");
      } else if(this.ID == forgottennature.newToolIndex - 252) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:SwordObsidian");
      } else if(this.ID == forgottennature.newToolIndex - 250) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:SwordTitanStone");
      }

   }

   public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
      return par2Block.blockID == Block.web.blockID?15.0F:1.5F;
   }

   public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
      par1ItemStack.damageItem(1, par3EntityLiving);
      return true;
   }

   public boolean func_77660_a(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving) {
      if((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D) {
         par1ItemStack.damageItem(2, par7EntityLiving);
      }

      return true;
   }

   public int getDamageVsEntity(Entity par1Entity) {
      return this.a;
   }

   @SideOnly(Side.CLIENT)
   public boolean isFull3D() {
      return true;
   }

   public EnumAction getItemUseAction(ItemStack par1ItemStack) {
      return EnumAction.block;
   }

   public int getMaxItemUseDuration(ItemStack par1ItemStack) {
      return 72000;
   }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
      par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
      return par1ItemStack;
   }

   public boolean canHarvestBlock(Block par1Block) {
      return par1Block.blockID == Block.web.blockID;
   }

   public int getItemEnchantability() {
      return this.b.getEnchantability();
   }

   public String getToolMaterialName() {
      return this.b.toString();
   }

   public String getUnlocalizedName(ItemStack i) {
      return this.ID == forgottennature.crystalToolIndex - 253?"csword":(this.ID == forgottennature.crystalToolIndex - 247?"dsword":(this.ID == forgottennature.newToolIndex - 252?"obsidianSword":"tssword"));
   }
}
