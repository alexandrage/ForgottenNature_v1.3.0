package assets.forgottennature.Items;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.Icon;

public class ItemNewPA extends ItemTool {

   @SideOnly(Side.CLIENT)
   private Icon field_94594_d;
   int ID;
   private static Block[] c = new Block[]{Block.cobblestone, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockIron, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.oreLapis, Block.blockLapis, Block.obsidian};


   public ItemNewPA(int i, EnumToolMaterial enumtoolmaterial) {
      super(i, 2.0F, enumtoolmaterial, c);
      super.maxStackSize = 1;
      this.ID = i;
      if(i == forgottennature.crystalToolIndex - 256) {
         LanguageRegistry.addName(new ItemStack(this), "Light Crystal Pickaxe");
      } else if(i == forgottennature.crystalToolIndex - 251) {
         LanguageRegistry.addName(new ItemStack(this), "Dark Crystal Pickaxe");
      } else if(i == forgottennature.newToolIndex - 256) {
         LanguageRegistry.addName(new ItemStack(this), "Obsidian Pickaxe");
      }

   }

   public boolean canHarvestBlock(Block par1Block) {
      return par1Block == Block.obsidian?super.toolMaterial.getHarvestLevel() >= 1:(par1Block != Block.blockDiamond && par1Block != Block.oreDiamond?(par1Block == Block.oreEmerald?super.toolMaterial.getHarvestLevel() >= 1:(par1Block != Block.blockGold && par1Block != Block.oreGold?(par1Block != Block.blockIron && par1Block != Block.oreIron?(par1Block != Block.blockLapis && par1Block != Block.oreLapis?(par1Block != Block.oreRedstone && par1Block != Block.oreRedstoneGlowing?(par1Block.blockMaterial == Material.rock?true:par1Block.blockMaterial == Material.iron):super.toolMaterial.getHarvestLevel() >= 1):super.toolMaterial.getHarvestLevel() >= 1):super.toolMaterial.getHarvestLevel() >= 1):super.toolMaterial.getHarvestLevel() >= 2)):super.toolMaterial.getHarvestLevel() >= 1);
   }

   public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
      return par2Block != null && (par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.rock)?super.efficiencyOnProperMaterial:super.getStrVsBlock(par1ItemStack, par2Block);
   }

   public Icon getIconFromDamage(int i) {
      return this.field_94594_d;
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      if(this.ID == forgottennature.crystalToolIndex - 256) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:PickaxeLightCrystal");
      } else if(this.ID == forgottennature.crystalToolIndex - 251) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:PickaxeDarkCrystal");
      } else if(this.ID == forgottennature.newToolIndex - 256) {
         this.field_94594_d = par1IconRegister.registerIcon("forgottennature:PickaxeObsidian");
      }

   }

   public String getUnlocalizedName(ItemStack i) {
      return this.ID == forgottennature.crystalToolIndex - 256?"cpaxe":(this.ID == forgottennature.crystalToolIndex - 251?"dpaxe":"opaxe");
   }

}
