package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemNewArmor extends ItemArmor {

   @SideOnly(Side.CLIENT)
   private Icon[] cG;
   private int armID;


   public ItemNewArmor(int i, EnumArmorMaterial enumarmormaterial, int j, int k) {
      super(i, enumarmormaterial, j, k);
      this.armID = i;
   }

   @SideOnly(Side.CLIENT)
   public Icon getIconFromDamage(int par1) {
      return this.armID == forgottennature.armorID?this.cG[0]:(this.armID == forgottennature.armorID + 1?this.cG[1]:(this.armID == forgottennature.armorID + 2?this.cG[2]:(this.armID == forgottennature.armorID + 3?this.cG[3]:(this.armID == forgottennature.armorID + 4?this.cG[4]:(this.armID == forgottennature.armorID + 5?this.cG[5]:(this.armID == forgottennature.armorID + 6?this.cG[6]:this.cG[7]))))));
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      super.registerIcons(par1IconRegister);
      this.cG = new Icon[8];
      this.cG[0] = par1IconRegister.registerIcon("forgottennature:helmetObsidian");
      this.cG[1] = par1IconRegister.registerIcon("forgottennature:chestPlateObsidian");
      this.cG[2] = par1IconRegister.registerIcon("forgottennature:leggingsObsidian");
      this.cG[3] = par1IconRegister.registerIcon("forgottennature:bootsObsidian");
      this.cG[4] = par1IconRegister.registerIcon("forgottennature:helmetTitanStone");
      this.cG[5] = par1IconRegister.registerIcon("forgottennature:chestPlateTitanStone");
      this.cG[6] = par1IconRegister.registerIcon("forgottennature:leggingsTitanStone");
      this.cG[7] = par1IconRegister.registerIcon("forgottennature:bootsTitanStone");
   }

   public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer) {
      return this.armID <= forgottennature.armorID + 3?(this.armID != forgottennature.armorID && this.armID != forgottennature.armorID + 1 && itemstack.itemID != forgottennature.armorID + 3?(this.armID == forgottennature.armorID + 2?"forgottennature:textures/armor/obsidianArmor_2.png":"forgottennature:textures/armor/obsidianArmor_1.png"):"forgottennature:textures/armor/obsidianArmor_1.png"):(this.armID != forgottennature.armorID + 4 && this.armID != forgottennature.armorID + 5 && itemstack.itemID != forgottennature.armorID + 7?(this.armID == forgottennature.armorID + 6?"forgottennature:textures/armor/titanStoneArmor_2.png":"forgottennature:textures/armor/titanStoneArmor_1.png"):"forgottennature:textures/armor/titanStoneArmor_1.png");
   }
}
