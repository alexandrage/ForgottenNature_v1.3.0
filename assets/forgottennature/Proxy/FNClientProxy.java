package assets.forgottennature.Proxy;

import assets.forgottennature.forgottennature;
import assets.forgottennature.Blocks.RenderFlowerPot;
import assets.forgottennature.Blocks.RenderLogs;
import assets.forgottennature.Proxy.FNCommonProxy;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;

public class FNClientProxy extends FNCommonProxy {

   public static int armorObsidian;
   public static int armorTitanStone;


   @SideOnly(Side.CLIENT)
   public static void registerRenderStuff() {
      forgottennature.FNLogRenderID = RenderingRegistry.getNextAvailableRenderId();
      forgottennature.FNFlowerPotRenderID = RenderingRegistry.getNextAvailableRenderId();
      RenderingRegistry.registerBlockHandler(forgottennature.FNLogRenderID, new RenderLogs());
      RenderingRegistry.registerBlockHandler(forgottennature.FNFlowerPotRenderID, new RenderFlowerPot());
      int stairIndex = forgottennature.newStairsIdIndex;
      armorObsidian = ModLoader.addArmor("Obsidian");
      armorTitanStone = ModLoader.addArmor("TitanStone");
      LanguageRegistry.instance().addStringLocalization("itemGroup.tabFN", "en_US", "Forgotten Nature");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 0), "en_US", "Red Maple Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 1), "en_US", "Angel Oak Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 2), "en_US", "Yellow Maple Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 3), "en_US", "Jacaranda Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 4), "en_US", "Fig Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 5), "en_US", "Cypress Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 6), "en_US", "Desert Ironwood Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex], 1, 7), "en_US", "Eucalyptus Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 0), "en_US", "Sequoia Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 1), "en_US", "Pink Cherry Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 2), "en_US", "White Cherry Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 3), "en_US", "Apple Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 4), "en_US", "Apple Bud Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 5), "en_US", "Apple Fruit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 6), "en_US", "Acacia Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 1], 1, 7), "en_US", "Joshua Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 0), "en_US", "Swamp Willow Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 1), "en_US", "Deciduous Bush Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 2), "en_US", "Evergreen Bush Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 3), "en_US", "Palm Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 4), "en_US", "Desert Willow Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 5), "en_US", "Cedar Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 6), "en_US", "Ginkgo Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 2], 1, 7), "en_US", "Poplar Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 0), "en_US", "Beech Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 1), "en_US", "Walnut Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 3), "en_US", "WideTop Eucalyptus Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 4), "en_US", "Bukkit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 5), "en_US", "Banana Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 6), "en_US", "Orange Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 3], 1, 7), "en_US", "Peach Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 0), "en_US", "Lemon Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 1), "en_US", "Blueberry Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 2), "en_US", "Blueberry Fruit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 3), "en_US", "Raspberry Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 4), "en_US", "Raspberry Fruit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 5), "en_US", "Blackberry Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 6), "en_US", "Blackberry Fruit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 4], 1, 7), "en_US", "Cherry Fruit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 5], 1, 0), "en_US", "Huckleberry Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 5], 1, 1), "en_US", "Huckleberry Fruit Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 6], 1, 0), "en_US", "Dark Crystal Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 6], 1, 1), "en_US", "Crystal Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 7], 1, 0), "en_US", "Nether Ash Leaves");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.leafIDindex + 7], 1, 1), "en_US", "Nether Blaze Leaves");
      if(forgottennature.obsidianTools) {
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.helmetObsidian), "en_US", "Obsidian Helm");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.plateObsidian), "en_US", "Obsidian Plate");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.legsObsidian), "en_US", "Obsidian Legs");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.bootsObsidian), "en_US", "Obsidian Boots");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.helmetTitanStone), "en_US", "Titan Stone Helm");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.plateTitanStone), "en_US", "Titan Stone Plate");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.legsTitanStone), "en_US", "Titan Stone Legs");
         LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.bootsTitanStone), "en_US", "Titan Stone Boots");
      }

      LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.flowerPotItem), "en_US", "Sapling Pot");
      LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.flowerPotItem2), "en_US", "Sapling Pot2");
      LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.flowerPotItem3), "en_US", "Sapling and Crystal Pot");
      LanguageRegistry.instance().addNameForObject(new ItemStack(forgottennature.flowerPotItem4), "en_US", "FN Flower Pot");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 0]), "en_US", "Brown Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 1]), "en_US", "Purple Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 2]), "en_US", "Dark Red Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 3]), "en_US", "Dark Yellow Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 4]), "en_US", "Peach Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 5]), "en_US", "Orange Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 6]), "en_US", "Brightwood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 7]), "en_US", "Redwood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 8]), "en_US", "Acacia Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 9]), "en_US", "Bright Yellow Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 10]), "en_US", "Old Wood Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 11]), "en_US", "Bamboo Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 12]), "en_US", "Dried Bamboo Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 13]), "en_US", "Crystal Stairs");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 14]), "en_US", "Dark Crystal Stairs");
      if(forgottennature.stone) {
         LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 15]), "en_US", "Granite Brick Stairs");
         LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 16]), "en_US", "Gneiss Brick Stairs");
         LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 17]), "en_US", "Hornfels Brick Stairs");
         LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 18]), "en_US", "Marble Brick Stairs");
      }

      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.mushroomPlantID]), "en_US", "Crystal Mushroom");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[forgottennature.mushroomBlockID]), "en_US", "Crystal Mushroom Block");
      LanguageRegistry.instance().addNameForObject(new ItemStack(Item.itemsList[stairIndex + 0]), "es_ES", "Escaleras de Madera Marron");
   }
}
