package assets.forgottennature.Proxy;

import assets.forgottennature.FNFuelHandler;
import assets.forgottennature.forgottennature;
import assets.forgottennature.WorldGen.FNWorldGenerator;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class FNCommonProxy implements IGuiHandler {

   static Block newF;
   static Block newPlanks;
   static Block newPlanks2;
   static Block newLogs;
   static Block newLogs2;
   static Block newLogs3;
   static Block newSap;
   static Block newSap2;
   static Block newSap3;
   static Block newTorch;
   static Block crystalWood;
   static Block crystalLeaves;
   static int fenceID;
   static int halfStoneID;
   static int halfPlankID;
   static int halfPlankID2;
   static int ItemFruitID;
   static int ItemNewFoodID;
   static int ItemNewFoodID2;
   static int ItemNewFoodID3;
   static int newFoodDishID;
   static int newCropFoodID;
   static int newCropGoodsID;
   static int newStonesID;
   static int newStairsIdIndex;
   static int blockCrystalID;
   static int crystalItemID;
   static int crystalStoneID;
   static int crystalToolIndex;
   static int ItemNewCupID;
   static int ItemNewContainerID;
   static int newGlassID;
   static int sawItemID;


   public static void registerRenderStuff() {
      forgottennature.addVillages();
      GameRegistry.registerFuelHandler(new FNFuelHandler());
      GameRegistry.registerWorldGenerator(new FNWorldGenerator());
      MinecraftForge.addGrassPlant(newF, 0, 10);
      MinecraftForge.addGrassPlant(newF, 1, 10);
      MinecraftForge.addGrassPlant(newF, 2, 10);
      MinecraftForge.addGrassPlant(newF, 3, 10);
      MinecraftForge.addGrassPlant(newF, 4, 10);
      MinecraftForge.addGrassPlant(newF, 5, 10);
      MinecraftForge.addGrassPlant(newF, 6, 10);
      MinecraftForge.addGrassPlant(newF, 7, 10);
      MinecraftForge.addGrassPlant(newF, 8, 10);
      MinecraftForge.addGrassPlant(newF, 9, 10);
   }

   public static void newRecipes() {
      newF = forgottennature.newFlowers;
      newPlanks = forgottennature.newPlanks;
      newPlanks2 = forgottennature.newPlanks2;
      newLogs = forgottennature.newLogs;
      newLogs2 = forgottennature.newLogs2;
      newLogs3 = forgottennature.newLogs3;
      newSap = forgottennature.newSap;
      newSap2 = forgottennature.newSap2;
      newSap3 = forgottennature.newSap3;
      newTorch = forgottennature.newTorch;
      crystalWood = forgottennature.crystalWood;
      crystalLeaves = forgottennature.crystalLeaves;
      newFoodDishID = forgottennature.newFoodDishID;
      newCropFoodID = forgottennature.newCropFoodID;
      newCropGoodsID = forgottennature.newCropGoodsID;
      newStonesID = forgottennature.newStonesID;
      halfStoneID = forgottennature.halfStoneID;
      sawItemID = forgottennature.sawItemID;
      halfPlankID = forgottennature.halfPlankID;
      halfPlankID2 = forgottennature.halfPlankID2;
      ItemFruitID = forgottennature.ItemFruitID;
      ItemNewFoodID = forgottennature.ItemNewFoodID;
      ItemNewFoodID2 = forgottennature.ItemNewFoodID2;
      ItemNewFoodID3 = forgottennature.ItemNewFoodID3;
      newStairsIdIndex = forgottennature.newStairsIdIndex;
      blockCrystalID = forgottennature.blockCrystalID;
      crystalItemID = forgottennature.crystalItemID;
      crystalStoneID = forgottennature.crystalStoneID;
      crystalToolIndex = forgottennature.crystalToolIndex;
      ItemNewCupID = forgottennature.ItemNewCupID;
      ItemNewContainerID = forgottennature.ItemNewContainerID;
      newGlassID = forgottennature.newGlassID;
      fenceID = forgottennature.fenceID;
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap, 2, 6), new Object[]{new ItemStack(Item.appleRed, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap, 2, 1), new Object[]{new ItemStack(Item.itemsList[ItemFruitID], 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 3), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemNutID], 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 6), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemNutID], 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 11), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 12), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 13), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 9)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 14), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap2, 2, 15), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 8)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap3, 2, 1), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.newSap3, 2, 0), new Object[]{new ItemStack(Item.itemsList[forgottennature.ItemFruitID], 1, 6)});
      if(forgottennature.obsidianTools) {
         GameRegistry.addRecipe(new ItemStack(forgottennature.helmetObsidian, 1, 0), new Object[]{"&&&", "& &", "   ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.helmetObsidian, 1, 0), new Object[]{"   ", "&&&", "& &", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.plateObsidian, 1, 0), new Object[]{"& &", "&&&", "&&&", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.legsObsidian, 1, 0), new Object[]{"&&&", "& &", "& &", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.bootsObsidian, 1, 0), new Object[]{"   ", "& &", "& &", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.bootsObsidian, 1, 0), new Object[]{"& &", "& &", "   ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0)});
         if(forgottennature.titanStoneTrue) {
            GameRegistry.addRecipe(new ItemStack(forgottennature.newStonesID, 1, 9), new Object[]{"&*&", "*%*", "&*&", Character.valueOf('&'), new ItemStack(Block.glowStone, 1, 0), Character.valueOf('*'), new ItemStack(forgottennature.blockCrystalID, 1, 1), Character.valueOf('%'), new ItemStack(Item.eyeOfEnder, 1, 0)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.helmetTitanStone, 1, 0), new Object[]{"&&&", "& &", "   ", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.helmetTitanStone, 1, 0), new Object[]{"   ", "&&&", "& &", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.plateTitanStone, 1, 0), new Object[]{"& &", "&&&", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.legsTitanStone, 1, 0), new Object[]{"&&&", "& &", "& &", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.bootsTitanStone, 1, 0), new Object[]{"   ", "& &", "& &", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.bootsTitanStone, 1, 0), new Object[]{"& &", "& &", "   ", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 5, 1, 0), new Object[]{"&&&", " s ", " s ", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9), Character.valueOf('s'), new ItemStack(Block.blockDiamond, 1, 0)});
            GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 6, 1, 0), new Object[]{" & ", " & ", " s ", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 9), Character.valueOf('s'), new ItemStack(Block.blockDiamond, 1, 0)});
         }

         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex, 1, 0), new Object[]{"&&&", " s ", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 2, 1, 0), new Object[]{"&& ", " s ", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 2, 1, 0), new Object[]{" &&", " s ", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 1, 1, 0), new Object[]{"&& ", "&s ", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 1, 1, 0), new Object[]{" &&", " s&", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 3, 1, 0), new Object[]{" & ", " s ", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.newToolIndex + 4, 1, 0), new Object[]{" & ", " & ", " s ", Character.valueOf('&'), new ItemStack(Block.obsidian, 1, 0), Character.valueOf('s'), new ItemStack(Item.stick, 1)});
      }

      if(forgottennature.carbonItems) {
         GameRegistry.addRecipe(new ItemStack(forgottennature.carbonItemsID, 1, 0), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(Item.coal, 1, 0), Character.valueOf('G'), new ItemStack(Item.flint, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.carbonItemsID, 1, 0), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(Item.coal, 1, 1), Character.valueOf('G'), new ItemStack(Item.flint, 1)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.carbonItemsID, 1, 1), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.carbonItemsID, 1, 0), Character.valueOf('G'), new ItemStack(Block.obsidian, 1)});
         GameRegistry.addRecipe(new ItemStack(Item.diamond, 1), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.carbonItemsID, 1, 1), Character.valueOf('G'), new ItemStack(forgottennature.crystalItemID, 1, 2)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.carbonItemsID, 6, 2), new Object[]{"&&&", "GGG", "&&&", Character.valueOf('&'), new ItemStack(Item.silk, 1), Character.valueOf('G'), new ItemStack(Item.coal, 1, 0)});
         GameRegistry.addRecipe(new ItemStack(forgottennature.carbonItemsID, 6, 2), new Object[]{"&&&", "GGG", "&&&", Character.valueOf('&'), new ItemStack(Item.silk, 1), Character.valueOf('G'), new ItemStack(Item.coal, 1, 1)});
         GameRegistry.addRecipe(new ItemStack(Item.arrow, 4), new Object[]{" f ", " s ", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.carbonItemsID, 1, 2), Character.valueOf('s'), new ItemStack(Item.stick, 1), Character.valueOf('f'), new ItemStack(Item.flint, 1)});
      }

      GameRegistry.addRecipe(new ItemStack(Item.glowstone, 8), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(Item.redstone, 1), Character.valueOf('G'), new ItemStack(Item.ingotGold, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.flint, 2), new Object[]{new ItemStack(Block.gravel, 1), new ItemStack(Block.gravel, 1), new ItemStack(Block.gravel, 1), new ItemStack(Block.gravel, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 4), new Object[]{new ItemStack(Item.bone, 1), new ItemStack(Item.bone, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(Block.sapling, 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(Block.sapling, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(Block.sapling, 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(Block.sapling, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(Block.ice, 1), new Object[]{new ItemStack(Block.blockSnow, 1, 0), new ItemStack(Block.blockSnow, 1, 0), new ItemStack(Block.blockSnow, 1, 0), new ItemStack(Block.blockSnow, 1, 0)});

      int x;
      for(x = 0; x < 16; ++x) {
         GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(newSap, 1, x)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(newSap2, 1, x)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 1), new Object[]{new ItemStack(newSap3, 1, x)});
      }

      GameRegistry.addRecipe(new ItemStack(Block.obsidian, 8), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(Item.bucketLava, 1), Character.valueOf('G'), new ItemStack(Item.bucketWater, 1)});
      GameRegistry.addRecipe(new ItemStack(Block.mycelium, 1), new Object[]{"&&&", "&G&", "&&&", Character.valueOf('&'), new ItemStack(Block.mushroomBrown, 1), Character.valueOf('G'), new ItemStack(Block.dirt, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Block.grass, 1), new Object[]{new ItemStack(Block.dirt, 1), new ItemStack(Item.seeds, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 0), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 0), new ItemStack(Item.itemsList[newCropFoodID], 1, 6), new ItemStack(Item.itemsList[newCropFoodID], 1, 7), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 1), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 1), new ItemStack(Item.itemsList[newCropFoodID], 1, 2), new ItemStack(Item.itemsList[newCropFoodID], 1, 3), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 2), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 7), new ItemStack(Item.itemsList[newCropFoodID], 1, 14), new ItemStack(Item.itemsList[newCropFoodID], 1, 15), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 3), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 1), new ItemStack(Item.itemsList[newCropFoodID], 1, 2), new ItemStack(Item.itemsList[newCropFoodID], 1, 3), new ItemStack(Item.itemsList[newCropFoodID], 1, 7), new ItemStack(Item.itemsList[newCropFoodID], 1, 14), new ItemStack(Item.itemsList[newCropFoodID], 1, 15), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 4), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 2), new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 4), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 2), new ItemStack(Item.itemsList[newCropFoodID], 1, 2), new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 5), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 5), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 5), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 5), new ItemStack(Item.itemsList[newCropFoodID], 1, 5), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 5), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 5), new ItemStack(Item.itemsList[newCropFoodID], 1, 12), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 5), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 12), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 5), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 4), new ItemStack(Item.itemsList[newCropFoodID], 1, 12), new ItemStack(Item.itemsList[newCropFoodID], 1, 12), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 6), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 3), new ItemStack(Item.itemsList[newCropFoodID], 1, 6), new ItemStack(Item.itemsList[newCropFoodID], 1, 10), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 7), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.itemsList[newCropFoodID], 1, 14), new ItemStack(Item.itemsList[newCropFoodID], 1, 15), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 9), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 3), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 9), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 6), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 9), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 10), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 9), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 9), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 14), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 9), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 15), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 10), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 3), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 10), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 6), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 10), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 10), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 10), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 10), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 14), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 10), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 15), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 11), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 9), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.bowlEmpty, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newFoodDishID], 1, 12), new Object[]{new ItemStack(Item.itemsList[newCropFoodID], 1, 10), new ItemStack(Item.itemsList[newCropFoodID], 1, 11), new ItemStack(Item.itemsList[newCropFoodID], 1, 13), new ItemStack(Item.itemsList[newCropFoodID], 1, 14), new ItemStack(Item.bowlEmpty, 1)});

      for(x = 0; x < 10; ++x) {
         for(int y = 0; y < 10; ++y) {
            if(x != y) {
               GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID3], 1, 2), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 0), new ItemStack(Item.itemsList[ItemFruitID], 1, x), new ItemStack(Item.itemsList[ItemFruitID], 1, y)});
               GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID3], 1, 1), new Object[]{Item.snowball, new ItemStack(Item.itemsList[ItemNewCupID], 1, 0), new ItemStack(Item.itemsList[ItemFruitID], 1, x), new ItemStack(Item.itemsList[ItemFruitID], 1, y)});
               GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID2], 1, 0), new Object[]{Item.bowlEmpty, new ItemStack(Item.itemsList[ItemFruitID], 1, x), new ItemStack(Item.itemsList[ItemFruitID], 1, y), new ItemStack(Item.appleRed, 1)});
            }

            if(y < 3) {
               GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID], 1, 4), new Object[]{Item.bread, new ItemStack(Item.itemsList[ItemFruitID], 1, x), new ItemStack(Item.itemsList[forgottennature.ItemNutID], 1, y)});
            }

            for(int z = 0; z < 10; ++z) {
               if(x != y) {
                  if(y != z && x != z) {
                     GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID2], 1, 0), new Object[]{Item.bowlEmpty, new ItemStack(Item.itemsList[ItemFruitID], 1, x), new ItemStack(Item.itemsList[ItemFruitID], 1, y), new ItemStack(Item.itemsList[ItemFruitID], 1, z)});
                  }

                  if(z < 3) {
                     GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID2], 1, 1), new Object[]{Item.bowlEmpty, new ItemStack(Item.itemsList[ItemFruitID], 1, x), new ItemStack(Item.itemsList[ItemFruitID], 1, y), new ItemStack(Item.itemsList[forgottennature.ItemNutID], 1, z)});
                  }
               }
            }
         }
      }

      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID], 1, 0), new Object[]{Item.bread, new ItemStack(Item.itemsList[ItemFruitID], 1, 5), new ItemStack(Item.itemsList[ItemFruitID], 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID], 1, 1), new Object[]{Item.bread, new ItemStack(Item.itemsList[ItemFruitID], 1, 6), new ItemStack(Item.itemsList[ItemFruitID], 1, 6)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID], 1, 2), new Object[]{Item.bread, new ItemStack(Item.itemsList[ItemFruitID], 1, 7), new ItemStack(Item.itemsList[ItemFruitID], 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID], 1, 3), new Object[]{Item.bread, new ItemStack(Item.itemsList[ItemFruitID], 1, 8), new ItemStack(Item.itemsList[ItemFruitID], 1, 8)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewFoodID3], 1, 0), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 0), new ItemStack(Item.itemsList[forgottennature.ItemNutID], 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(Block.cloth, 1, 0), new Object[]{new ItemStack(Item.itemsList[newCropGoodsID], 1, 0), new ItemStack(Item.itemsList[newCropGoodsID], 1, 0), new ItemStack(Item.itemsList[newCropGoodsID], 1, 0), new ItemStack(Item.itemsList[newCropGoodsID], 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newCropGoodsID], 1, 2), new Object[]{new ItemStack(Item.itemsList[newCropGoodsID], 1, 1), new ItemStack(Item.itemsList[newCropGoodsID], 1, 1), new ItemStack(Item.itemsList[newCropGoodsID], 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newCropGoodsID], 1, 3), new Object[]{new ItemStack(Item.itemsList[newCropGoodsID], 1, 2), new ItemStack(Item.itemsList[newCropGoodsID], 1, 2), new ItemStack(Item.itemsList[newCropGoodsID], 1, 2), new ItemStack(Item.itemsList[newCropGoodsID], 1, 2), new ItemStack(Item.itemsList[newCropGoodsID], 1, 2), new ItemStack(Item.itemsList[newCropGoodsID], 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.rope, 1, 0), new Object[]{new ItemStack(Item.itemsList[newCropGoodsID], 1, 3), new ItemStack(Item.itemsList[newCropGoodsID], 1, 3), new ItemStack(Item.itemsList[newCropGoodsID], 1, 3), new ItemStack(Item.itemsList[newCropGoodsID], 1, 3), new ItemStack(Item.itemsList[newCropGoodsID], 1, 3), new ItemStack(Item.itemsList[newCropGoodsID], 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 1, 12), new Object[]{new ItemStack(newPlanks, 1, 11)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 1, 11), new Object[]{new ItemStack(Item.itemsList[forgottennature.hempCottonBambooCornID], 1, 11), new ItemStack(Item.itemsList[forgottennature.hempCottonBambooCornID], 1, 11), new ItemStack(Item.itemsList[forgottennature.hempCottonBambooCornID], 1, 11), new ItemStack(Item.itemsList[forgottennature.hempCottonBambooCornID], 1, 11)});
      if(forgottennature.craftGunpowder) {
         GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 3, 0), new Object[]{new ItemStack(Item.itemsList[forgottennature.powderID], 1, 0), new ItemStack(Item.itemsList[forgottennature.powderID], 1, 1), new ItemStack(Item.coal, 1, 0)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.gunpowder, 3, 0), new Object[]{new ItemStack(Item.itemsList[forgottennature.powderID], 1, 0), new ItemStack(Item.itemsList[forgottennature.powderID], 1, 1), new ItemStack(Item.coal, 1, 1)});
      }

      if(forgottennature.StoneGranite || forgottennature.StoneChert || forgottennature.StoneHornfels || forgottennature.StoneMarble || forgottennature.StoneGneiss) {
         GameRegistry.addShapelessRecipe(new ItemStack(Item.flint, 4), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 0)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 1)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 2)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 3)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 4)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newStonesID], 4, 5), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 1), new ItemStack(Item.itemsList[newStonesID], 1, 1), new ItemStack(Item.itemsList[newStonesID], 1, 1), new ItemStack(Item.itemsList[newStonesID], 1, 1)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newStonesID], 4, 6), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 2), new ItemStack(Item.itemsList[newStonesID], 1, 2), new ItemStack(Item.itemsList[newStonesID], 1, 2), new ItemStack(Item.itemsList[newStonesID], 1, 2)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newStonesID], 4, 7), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 3), new ItemStack(Item.itemsList[newStonesID], 1, 3), new ItemStack(Item.itemsList[newStonesID], 1, 3), new ItemStack(Item.itemsList[newStonesID], 1, 3)});
         GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[newStonesID], 4, 8), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 4), new ItemStack(Item.itemsList[newStonesID], 1, 4), new ItemStack(Item.itemsList[newStonesID], 1, 4), new ItemStack(Item.itemsList[newStonesID], 1, 4)});
         GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + 15], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 5)});
         GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + 16], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 6)});
         GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + 17], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 7)});
         GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + 18], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(forgottennature.newStones, 1, 8)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 0), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 1), new ItemStack(Item.itemsList[newStonesID], 1, 1), new ItemStack(Item.itemsList[newStonesID], 1, 1)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 1), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 2), new ItemStack(Item.itemsList[newStonesID], 1, 2), new ItemStack(Item.itemsList[newStonesID], 1, 2)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 2), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 3), new ItemStack(Item.itemsList[newStonesID], 1, 3), new ItemStack(Item.itemsList[newStonesID], 1, 3)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 3), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 4), new ItemStack(Item.itemsList[newStonesID], 1, 4), new ItemStack(Item.itemsList[newStonesID], 1, 4)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 4), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 5), new ItemStack(Item.itemsList[newStonesID], 1, 5), new ItemStack(Item.itemsList[newStonesID], 1, 5)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 5), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 6), new ItemStack(Item.itemsList[newStonesID], 1, 6), new ItemStack(Item.itemsList[newStonesID], 1, 6)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 6), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 7), new ItemStack(Item.itemsList[newStonesID], 1, 7), new ItemStack(Item.itemsList[newStonesID], 1, 7)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.blocksList[halfStoneID], 6, 7), new Object[]{new ItemStack(Item.itemsList[newStonesID], 1, 8), new ItemStack(Item.itemsList[newStonesID], 1, 8), new ItemStack(Item.itemsList[newStonesID], 1, 8)});
      }

      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 9), new Object[]{new ItemStack(newF, 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 6), new Object[]{new ItemStack(newF, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 11), new Object[]{new ItemStack(newF, 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 6), new Object[]{new ItemStack(newF, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 11), new Object[]{new ItemStack(newF, 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 9), new Object[]{new ItemStack(newF, 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 5), new Object[]{new ItemStack(newF, 1, 6)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 14), new Object[]{new ItemStack(newF, 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 13), new Object[]{new ItemStack(newF, 1, 8)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.dyePowder, 1, 7), new Object[]{new ItemStack(newF, 1, 9)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 2), new Object[]{new ItemStack(newLogs, 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs, 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs, 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 7), new Object[]{new ItemStack(newLogs, 1, 6)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 8), new Object[]{new ItemStack(newLogs, 1, 8)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs, 1, 10)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 10), new Object[]{new ItemStack(newLogs, 1, 12)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 3), new Object[]{new ItemStack(newLogs, 1, 14)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 6)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 8)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 10)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 12)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 14)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs3, 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 3), new Object[]{new ItemStack(newLogs3, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 5), new Object[]{new ItemStack(newLogs3, 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 4), new Object[]{new ItemStack(newLogs3, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 9), new Object[]{new ItemStack(newLogs3, 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs3, 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 3), new Object[]{new ItemStack(newLogs3, 1, 6)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 5), new Object[]{new ItemStack(newLogs3, 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 4), new Object[]{new ItemStack(newLogs3, 1, 8)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 9), new Object[]{new ItemStack(newLogs3, 1, 9)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs3, 1, 10)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 3), new Object[]{new ItemStack(newLogs3, 1, 11)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 5), new Object[]{new ItemStack(newLogs3, 1, 12)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 4), new Object[]{new ItemStack(newLogs3, 1, 13)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 9), new Object[]{new ItemStack(newLogs3, 1, 14)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 13), new Object[]{new ItemStack(forgottennature.netherLogs, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 14), new Object[]{new ItemStack(forgottennature.netherLogs, 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 2), new Object[]{new ItemStack(newLogs, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs, 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 7), new Object[]{new ItemStack(newLogs, 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 8), new Object[]{new ItemStack(newLogs, 1, 9)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs, 1, 11)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 10), new Object[]{new ItemStack(newLogs, 1, 13)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 3), new Object[]{new ItemStack(newLogs, 1, 15)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 9)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 11)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs2, 1, 13)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 6), new Object[]{new ItemStack(newLogs2, 1, 15)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 0), new Object[]{new ItemStack(newLogs3, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 3), new Object[]{new ItemStack(newLogs3, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 5), new Object[]{new ItemStack(newLogs3, 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 4), new Object[]{new ItemStack(newLogs3, 1, 7)});
      GameRegistry.addShapelessRecipe(new ItemStack(newPlanks, 4, 9), new Object[]{new ItemStack(newLogs3, 1, 9)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 0), new Object[]{"&& ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(Block.planks, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 0), new Object[]{"&& ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(Block.planks, 1, 1)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 0), new Object[]{"&& ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(Block.planks, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 0), new Object[]{"&& ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(Block.planks, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 1), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 1), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 10)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 1), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(Block.planks, 1, 1)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 2), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 4)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 2), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 5)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 2), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(Block.planks, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 2), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(Block.planks, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 3), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 6)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 3), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 14)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 3), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(Block.planks, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 4), new Object[]{" & ", "& &", " & ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 6)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 4), new Object[]{" & ", "& &", " & ", Character.valueOf('&'), new ItemStack(Block.planks, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 5), new Object[]{" & ", "& &", " & ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 8)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 6), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 6), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(newPlanks, 1, 10)});
      GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 6), new Object[]{"& &", " & ", "& &", Character.valueOf('&'), new ItemStack(Block.planks, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[forgottennature.powderID], 8, 2), new Object[]{new ItemStack(forgottennature.netherLogs, 1, 3), new ItemStack(Block.netherrack)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[forgottennature.powderID], 8, 3), new Object[]{new ItemStack(forgottennature.netherLogs, 1, 0), new ItemStack(Block.slowSand)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[sawItemID], 1, 0), new Object[]{"   ", "&&&", " & ", Character.valueOf('&'), new ItemStack(Item.ingotIron, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[sawItemID], 1, 0), new Object[]{"&&&", " & ", "   ", Character.valueOf('&'), new ItemStack(Item.ingotIron, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[sawItemID], 1, 2), new Object[]{"s&&", "& &", "&&&", Character.valueOf('s'), new ItemStack(Item.ingotIron, 1), Character.valueOf('&'), new ItemStack(Block.planks)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[sawItemID], 1, 1), new Object[]{new ItemStack(Item.itemsList[sawItemID], 1, 0), new ItemStack(Item.itemsList[sawItemID], 1, 0), new ItemStack(Item.itemsList[sawItemID], 1, 0), new ItemStack(Item.itemsList[sawItemID], 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[forgottennature.sawID], 1), new Object[]{new ItemStack(Item.itemsList[sawItemID], 1, 1), new ItemStack(Item.itemsList[sawItemID], 1, 2)});

      for(x = 0; x < 15; ++x) {
         GameRegistry.addRecipe(new ItemStack(newPlanks2, 4, 0), new Object[]{"&& ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addShapelessRecipe(new ItemStack(Block.planks, 1), new Object[]{new ItemStack(newPlanks, 1, x)});
         if(x < 8) {
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID], 6, x), new Object[]{"   ", "   ", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID], 6, x), new Object[]{"   ", "&&&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID], 6, x), new Object[]{"&&&", "   ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         } else if(x < 13) {
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, x - 8), new Object[]{"   ", "   ", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, x - 8), new Object[]{"   ", "&&&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, x - 8), new Object[]{"&&&", "   ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         }

         if(x < 13) {
            GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + x], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         }

         GameRegistry.addRecipe(new ItemStack(Item.itemsList[sawItemID], 1, 2), new Object[]{"s&&", "& &", "&&&", Character.valueOf('s'), new ItemStack(Item.ingotIron, 1), Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[]{"   ", " & ", " & ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[]{" & ", " & ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[]{"   ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[]{"&  ", "&  ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[]{"   ", "  &", "  &", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[]{"  &", "  &", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood), new Object[]{"&&&", " * ", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.shovelWood), new Object[]{" & ", " * ", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.shovelWood), new Object[]{"&  ", "*  ", "*  ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.shovelWood), new Object[]{"  &", "  *", "  *", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.hoeWood), new Object[]{"&& ", " * ", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.hoeWood), new Object[]{" &&", " * ", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.axeWood), new Object[]{"&& ", "&* ", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.axeWood), new Object[]{" &&", " *&", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.swordWood), new Object[]{" & ", " & ", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.swordWood), new Object[]{"&  ", "&  ", "*  ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.swordWood), new Object[]{"  &", "  &", "  *", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"   ", "&& ", "&& ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"&& ", "&& ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"   ", " &&", " &&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{" &&", " &&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.chest), new Object[]{"&&&", "& &", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.bookShelf), new Object[]{"&&&", "***", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.book)});
         GameRegistry.addRecipe(new ItemStack(Item.boat), new Object[]{"   ", "& &", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.boat), new Object[]{"& &", "&&&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty, 4), new Object[]{"& &", " & ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty, 4), new Object[]{"   ", "& &", " & ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[]{"   ", "&& ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[]{"&& ", "   ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[]{"   ", "   ", "&& ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[]{"   ", "   ", " &&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[]{"   ", " &&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks), new Object[]{" &&", "   ", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[]{"&&&", "&&&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2), new Object[]{"   ", "&&&", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.doorWood), new Object[]{"&& ", "&& ", "&& ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Item.doorWood), new Object[]{" &&", " &&", " &&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x)});
         GameRegistry.addRecipe(new ItemStack(Block.jukebox), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.diamond)});
         GameRegistry.addRecipe(new ItemStack(Block.music), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.redstone)});
         GameRegistry.addRecipe(new ItemStack(Block.pistonBase), new Object[]{"&&&", "$*$", "$r$", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('$'), Block.cobblestone, Character.valueOf('*'), new ItemStack(Item.ingotIron), Character.valueOf('r'), new ItemStack(Item.redstone)});
         GameRegistry.addRecipe(new ItemStack(Item.sign), new Object[]{"&&&", "&&&", " * ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Item.bed), new Object[]{"&&&", "***", "   ", Character.valueOf('*'), new ItemStack(newPlanks, 1, x), Character.valueOf('&'), Block.cloth});
         GameRegistry.addRecipe(new ItemStack(Item.bed), new Object[]{"   ", "&&&", "***", Character.valueOf('*'), new ItemStack(newPlanks, 1, x), Character.valueOf('&'), Block.cloth});
         GameRegistry.addRecipe(new ItemStack(Block.fenceGate), new Object[]{"*&*", "*&*", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
         GameRegistry.addRecipe(new ItemStack(Block.fenceGate), new Object[]{"   ", "*&*", "*&*", Character.valueOf('&'), new ItemStack(newPlanks, 1, x), Character.valueOf('*'), new ItemStack(Item.stick)});
      }

      GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, 5), new Object[]{"   ", "   ", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, 5), new Object[]{"   ", "&&&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, 5), new Object[]{"&&&", "   ", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, 6), new Object[]{"   ", "   ", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, 6), new Object[]{"   ", "&&&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[halfPlankID2], 6, 6), new Object[]{"&&&", "   ", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + 13], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.blocksList[newStairsIdIndex + 14], 4), new Object[]{"&  ", "&& ", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[blockCrystalID], 8, 3), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('&'), new ItemStack(Block.stone), Character.valueOf('*'), new ItemStack(Item.itemsList[blockCrystalID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[blockCrystalID], 8, 2), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('&'), new ItemStack(Block.stone), Character.valueOf('*'), new ItemStack(Item.itemsList[blockCrystalID], 1, 0)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[forgottennature.mushroomPlantID], 1, 0), new Object[]{"&&&", " & ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[forgottennature.mushroomPlantID], 1, 0), new Object[]{"   ", "&&&", " & ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[crystalItemID], 9, 2), new Object[]{new ItemStack(Item.itemsList[blockCrystalID], 1, 0)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[crystalItemID], 9, 0), new Object[]{new ItemStack(Item.itemsList[blockCrystalID], 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[crystalItemID], 9, 1), new Object[]{new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[crystalItemID], 9, 4), new Object[]{new ItemStack(Item.itemsList[crystalItemID], 1, 0)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 2), new Object[]{"&&&", "&&&", "&&&", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 0), new Object[]{"&&&", "&&&", "&&&", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(crystalLeaves, 1, 0), new Object[]{new ItemStack(Item.itemsList[crystalItemID], 1, 4), new ItemStack(Item.itemsList[crystalItemID], 1, 4), new ItemStack(Item.itemsList[crystalItemID], 1, 4), new ItemStack(Item.itemsList[crystalItemID], 1, 4)});
      GameRegistry.addShapelessRecipe(new ItemStack(crystalLeaves, 1, 1), new Object[]{new ItemStack(Item.itemsList[crystalItemID], 1, 1), new ItemStack(Item.itemsList[crystalItemID], 1, 1), new ItemStack(Item.itemsList[crystalItemID], 1, 1), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(crystalWood, 4, 3), new Object[]{new ItemStack(crystalWood, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(crystalWood, 4, 2), new Object[]{new ItemStack(crystalWood, 1, 0)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 3), new Object[]{"   ", " & ", " & ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 3), new Object[]{"   ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 3), new Object[]{"   ", "  &", "  &", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 3), new Object[]{" & ", " & ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 3), new Object[]{"&  ", "&  ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 1, 3), new Object[]{"  &", "  &", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 4, 3), new Object[]{"   ", " & ", " & ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 4, 3), new Object[]{"   ", "&  ", "&  ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 4, 3), new Object[]{"   ", "  &", "  &", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 4, 3), new Object[]{" & ", " & ", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 4, 3), new Object[]{"&  ", "&  ", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalItemID], 4, 3), new Object[]{"  &", "  &", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(crystalStoneID, 1, 0), new Object[]{"& &", " & ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(crystalStoneID, 1, 0), new Object[]{"   ", "& &", " & ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(crystalStoneID, 1, 1), new Object[]{"& &", " & ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 4)});
      GameRegistry.addRecipe(new ItemStack(crystalStoneID, 1, 1), new Object[]{"   ", "& &", " & ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 4)});
      GameRegistry.addRecipe(new ItemStack(blockCrystalID, 1, 0), new Object[]{"&&&", "&&&", "&&&", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addRecipe(new ItemStack(blockCrystalID, 1, 1), new Object[]{"&&&", "&&&", "&&&", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0)});
      if(forgottennature.crystalTools) {
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex]), new Object[]{"&&&", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 1]), new Object[]{"&& ", "&* ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 1]), new Object[]{" &&", " *&", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 4]), new Object[]{"&& ", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 4]), new Object[]{"&& ", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 2]), new Object[]{" & ", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 3]), new Object[]{" & ", " & ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 2), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 5]), new Object[]{"&&&", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 6]), new Object[]{"&& ", "&* ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 6]), new Object[]{" &&", " *&", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 7]), new Object[]{"&& ", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 7]), new Object[]{"&& ", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 8]), new Object[]{" & ", " * ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
         GameRegistry.addRecipe(new ItemStack(Item.itemsList[crystalToolIndex + 9]), new Object[]{" & ", " & ", " * ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 0), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 3)});
      }

      GameRegistry.addRecipe(new ItemStack(newSap3, 1, 2), new Object[]{"&&&", " & ", " & ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 1)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"   ", "&& ", "&& ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"&& ", "&& ", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"   ", " &&", " &&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{" &&", " &&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"   ", "&& ", "&& ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"&& ", "&& ", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{"   ", " &&", " &&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.workbench), new Object[]{" &&", " &&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.chest, 1), new Object[]{"&&&", "& &", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2)});
      GameRegistry.addRecipe(new ItemStack(Block.chest, 1), new Object[]{"&&&", "& &", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3)});
      GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[]{"&&&", "***", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2), Character.valueOf('*'), new ItemStack(Item.book)});
      GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[]{"&&&", "***", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3), Character.valueOf('*'), new ItemStack(Item.book)});
      GameRegistry.addRecipe(new ItemStack(Item.bed), new Object[]{"***", "&&&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2), Character.valueOf('*'), Block.cloth});
      GameRegistry.addRecipe(new ItemStack(Item.bed), new Object[]{"   ", "***", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2), Character.valueOf('*'), Block.cloth});
      GameRegistry.addRecipe(new ItemStack(Item.bed), new Object[]{"***", "&&&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3), Character.valueOf('*'), Block.cloth});
      GameRegistry.addRecipe(new ItemStack(Item.bed), new Object[]{"   ", "***", "&&&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3), Character.valueOf('*'), Block.cloth});
      GameRegistry.addRecipe(new ItemStack(newTorch, 8, 0), new Object[]{"   ", " * ", " & ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 3), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addRecipe(new ItemStack(newTorch, 8, 0), new Object[]{" * ", " & ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 3), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addRecipe(new ItemStack(newTorch, 8, 0), new Object[]{"   ", "*  ", "&  ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 3), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addRecipe(new ItemStack(newTorch, 8, 0), new Object[]{"*  ", "&  ", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 3), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addRecipe(new ItemStack(newTorch, 8, 0), new Object[]{"   ", "  *", "  &", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 3), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addRecipe(new ItemStack(newTorch, 8, 0), new Object[]{"  *", "  &", "   ", Character.valueOf('&'), new ItemStack(Item.itemsList[crystalItemID], 1, 3), Character.valueOf('*'), new ItemStack(Item.itemsList[crystalItemID], 1, 2)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new Object[]{Item.bucketEmpty, Item.beefRaw});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new Object[]{Item.bucketEmpty, Item.chickenRaw});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new Object[]{Item.bucketEmpty, Item.fishRaw});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new Object[]{Item.bucketEmpty, Item.porkRaw});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 2), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 3)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 3), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 5)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 4), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 5), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Item.dyePowder, 1, 11)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 6), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Item.dyePowder, 1, 14)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 7), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 14)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 8), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 1)});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.itemsList[ItemNewContainerID], 1, 9), new Object[]{new ItemStack(Item.itemsList[ItemNewCupID], 1, 1), new ItemStack(Item.dyePowder, 1, 11)});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 0), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 2), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 0), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 2), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 0), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 2), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 0), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 2), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 1), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 3), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 1), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 3), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 1), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 3), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 1), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 3), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 2), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 4), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 2), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 4), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 2), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 4), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 2), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 4), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 3), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 5), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 3), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 5), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 3), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 5), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 3), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 5), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 4), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 6), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 4), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 6), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 4), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 6), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 4), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 6), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 5), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 7), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 5), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 7), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 5), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 7), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 5), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 7), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 7), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 8), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 7), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 8), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 7), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 8), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 7), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 8), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 9), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 9), Character.valueOf('&'), newLogs});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 9), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 9), Character.valueOf('&'), newLogs2});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 9), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 9), Character.valueOf('&'), newLogs3});
      GameRegistry.addRecipe(new ItemStack(newPlanks, 32, 9), new Object[]{"&&&", "&*&", "&&&", Character.valueOf('*'), new ItemStack(Item.itemsList[ItemNewContainerID], 1, 9), Character.valueOf('&'), Block.wood});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[ItemNewCupID], 6, 0), new Object[]{"& &", "& &", "&&&", Character.valueOf('&'), Block.thinGlass});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 0), new Object[]{" & ", "&&&", " & ", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 8, 1), new Object[]{"&&&", "&p&", "&&&", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('p'), new ItemStack(Block.thinGlass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 2), new Object[]{"&s&", "s&s", "&s&", Character.valueOf('&'), new ItemStack(Item.itemsList[newGlassID], 1, 1), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 9, 3), new Object[]{"&&&", "&&&", "&&&", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 4), new Object[]{"&s&", "s&s", "&s&", Character.valueOf('&'), new ItemStack(Item.itemsList[newGlassID], 1, 3), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 5), new Object[]{" & ", "& &", " & ", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 6), new Object[]{"&& ", " & ", " &&", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 7), new Object[]{"&& ", "&& ", "   ", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 7), new Object[]{" &&", " &&", "   ", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 7), new Object[]{"   ", "&& ", "&& ", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 7), new Object[]{"   ", " &&", " &&", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 8), new Object[]{"&s&", "s&s", "&s&", Character.valueOf('&'), new ItemStack(Item.itemsList[newGlassID], 1, 7), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 9), new Object[]{"s&s", "& &", "s&s", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 10), new Object[]{"&s&", "s&s", "&s&", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 11), new Object[]{"s&s", "&s&", "s&s", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 12), new Object[]{"sss", "&&&", "sss", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 4, 13), new Object[]{"& &", "   ", "& &", Character.valueOf('&'), new ItemStack(Block.glass)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 14), new Object[]{"ss ", "&& ", "&& ", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 5, 14), new Object[]{" ss", " &&", " &&", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[newGlassID], 6, 15), new Object[]{"&s&", "&s&", "&s&", Character.valueOf('&'), new ItemStack(Block.glass), Character.valueOf('s'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 0), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 0), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 0), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 0), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 1), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 1), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 1), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 1), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 2), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 2), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 2), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 2), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 3), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 3), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 3), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 3), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 4), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 4), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 4), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 4), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 5), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 5), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 5), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 5), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 6), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 6), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 6), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 6), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 7), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 7), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 7), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 7), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 8), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 8), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 8), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 8), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 9), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 9), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 9), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 9), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 10), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 10), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 10), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 10), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 11), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 11), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 11), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 11), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 12), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(newPlanks, 1, 12), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 12), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(newPlanks, 1, 12), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 13), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 13), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 2), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 14), new Object[]{"&*&", "&*&", "   ", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addRecipe(new ItemStack(Item.itemsList[fenceID], 3, 14), new Object[]{"   ", "&*&", "&*&", Character.valueOf('&'), new ItemStack(crystalWood, 1, 3), Character.valueOf('*'), new ItemStack(Item.stick)});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.flowerPotItem), new Object[]{Item.flowerPot});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.flowerPotItem2), new Object[]{forgottennature.flowerPotItem});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.flowerPotItem3), new Object[]{forgottennature.flowerPotItem2});
      GameRegistry.addShapelessRecipe(new ItemStack(forgottennature.flowerPotItem4), new Object[]{forgottennature.flowerPotItem3});
      GameRegistry.addShapelessRecipe(new ItemStack(Item.flowerPot), new Object[]{forgottennature.flowerPotItem4});
   }

   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      return null;
   }
}
