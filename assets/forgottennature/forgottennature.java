package assets.forgottennature;

import assets.forgottennature.Biomes.BiomeGenCrystalForest;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForest;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForestHills;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForestSnow;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForestSnowHills;
import assets.forgottennature.Biomes.BiomeGenNeoTropicalForestHills;
import assets.forgottennature.Biomes.BiomeGenTropicalForest;
import assets.forgottennature.Blocks.BlockCrystalBlock;
import assets.forgottennature.Blocks.BlockCrystalLeaves;
import assets.forgottennature.Blocks.BlockCrystalMushroom;
import assets.forgottennature.Blocks.BlockCrystalMushroomBlock;
import assets.forgottennature.Blocks.BlockCrystalStone;
import assets.forgottennature.Blocks.BlockCrystalWood;
import assets.forgottennature.Blocks.BlockGrapeTomCabPine;
import assets.forgottennature.Blocks.BlockHempCotBamCorn;
import assets.forgottennature.Blocks.BlockKCelOniGar;
import assets.forgottennature.Blocks.BlockLJ;
import assets.forgottennature.Blocks.BlockNetherLeaves;
import assets.forgottennature.Blocks.BlockNetherLogs;
import assets.forgottennature.Blocks.BlockNewFence;
import assets.forgottennature.Blocks.BlockNewFlowerPot;
import assets.forgottennature.Blocks.BlockNewFlowerPot2;
import assets.forgottennature.Blocks.BlockNewFlowerPot3;
import assets.forgottennature.Blocks.BlockNewFlowerPot4;
import assets.forgottennature.Blocks.BlockNewFlowers;
import assets.forgottennature.Blocks.BlockNewFruit;
import assets.forgottennature.Blocks.BlockNewGroundcover;
import assets.forgottennature.Blocks.BlockNewLeaves;
import assets.forgottennature.Blocks.BlockNewLeaves2;
import assets.forgottennature.Blocks.BlockNewLeaves3;
import assets.forgottennature.Blocks.BlockNewLeaves4;
import assets.forgottennature.Blocks.BlockNewLeaves5;
import assets.forgottennature.Blocks.BlockNewLeaves6;
import assets.forgottennature.Blocks.BlockNewLogs;
import assets.forgottennature.Blocks.BlockNewLogs2;
import assets.forgottennature.Blocks.BlockNewLogs3;
import assets.forgottennature.Blocks.BlockNewLogs4;
import assets.forgottennature.Blocks.BlockNewPlanks;
import assets.forgottennature.Blocks.BlockNewPlanks2;
import assets.forgottennature.Blocks.BlockNewSap;
import assets.forgottennature.Blocks.BlockNewSap2;
import assets.forgottennature.Blocks.BlockNewSap3;
import assets.forgottennature.Blocks.BlockNewSlab;
import assets.forgottennature.Blocks.BlockNewStairs;
import assets.forgottennature.Blocks.BlockNewStone;
import assets.forgottennature.Blocks.BlockNewTorch;
import assets.forgottennature.Blocks.BlockParsWChestRiceBroc;
import assets.forgottennature.Blocks.BlockPeaTurnGinger;
import assets.forgottennature.Blocks.BlockRope;
import assets.forgottennature.Blocks.FNBlockGlass;
import assets.forgottennature.Items.ItemBamboo;
import assets.forgottennature.Items.ItemCarbon;
import assets.forgottennature.Items.ItemCrystal;
import assets.forgottennature.Items.ItemCrystalBlock;
import assets.forgottennature.Items.ItemCrystalStone;
import assets.forgottennature.Items.ItemCrystalWood;
import assets.forgottennature.Items.ItemFoodDish;
import assets.forgottennature.Items.ItemFruit;
import assets.forgottennature.Items.ItemGeneral;
import assets.forgottennature.Items.ItemNetherLogs;
import assets.forgottennature.Items.ItemNewArmor;
import assets.forgottennature.Items.ItemNewAxe;
import assets.forgottennature.Items.ItemNewContainer;
import assets.forgottennature.Items.ItemNewCropFood;
import assets.forgottennature.Items.ItemNewCropGoods;
import assets.forgottennature.Items.ItemNewCropSeeds;
import assets.forgottennature.Items.ItemNewCup;
import assets.forgottennature.Items.ItemNewFence;
import assets.forgottennature.Items.ItemNewFlowers;
import assets.forgottennature.Items.ItemNewFood;
import assets.forgottennature.Items.ItemNewFood2;
import assets.forgottennature.Items.ItemNewFood3;
import assets.forgottennature.Items.ItemNewGlass;
import assets.forgottennature.Items.ItemNewHalfPlanks;
import assets.forgottennature.Items.ItemNewHoe;
import assets.forgottennature.Items.ItemNewLeaves;
import assets.forgottennature.Items.ItemNewLogs;
import assets.forgottennature.Items.ItemNewLogs2;
import assets.forgottennature.Items.ItemNewLogs3;
import assets.forgottennature.Items.ItemNewLogs4;
import assets.forgottennature.Items.ItemNewPA;
import assets.forgottennature.Items.ItemNewPlanks;
import assets.forgottennature.Items.ItemNewPlanks2;
import assets.forgottennature.Items.ItemNewSap;
import assets.forgottennature.Items.ItemNewSap2;
import assets.forgottennature.Items.ItemNewSap3;
import assets.forgottennature.Items.ItemNewShovel;
import assets.forgottennature.Items.ItemNewStone;
import assets.forgottennature.Items.ItemNewSword;
import assets.forgottennature.Items.ItemNut;
import assets.forgottennature.Items.ItemPowder;
import assets.forgottennature.Items.ItemRope;
import assets.forgottennature.Items.ItemSawItems;
import assets.forgottennature.Items.ItemTitanStonePA;
import assets.forgottennature.Items.ItemTorch;
import assets.forgottennature.Items.NewItemReed;
import assets.forgottennature.Proxy.FNClientProxy;
import assets.forgottennature.Proxy.FNCommonProxy;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.OreDictionary;

@Mod(
   modid = "forgottennature",
   name = "forgottennature",
   version = "1.3.0"
)
@NetworkMod(
   clientSideRequired = true,
   serverSideRequired = false
)
public class forgottennature {

   @SidedProxy(
      clientSide = "assets.forgottennature.Proxy.FNClientProxy",
      serverSide = "assets.forgottennature.Proxy.FNCommonProxy"
   )
   public static FNCommonProxy proxy;
   public static int mushroomPlantID;
   public static int mushroomBlockID;
   public static int kCeleryOnionGarlicID;
   public static int peanutTurnipGingerID;
   public static int parsleyWChestnutRiceBroccoliID;
   public static int hempCottonBambooCornID;
   public static int grapeTomatoCabbagePineappleID;
   public static int ropeID;
   public static int newCropSeedsID;
   public static int newCropFoodID;
   public static int newCropGoodsID;
   public static int newFoodDishID;
   public static int newStonesID;
   public static int newGlassID;
   public static int leafIDindex;
   public static int logIDindex;
   public static int sapIDindex;
   public static int plankID;
   public static int plankID2;
   public static int fruitID;
   public static int ItemFruitID;
   public static int ItemNutID;
   public static int ItemNewFoodID;
   public static int ItemNewFoodID2;
   public static int ItemNewFoodID3;
   public static int ItemNewContainerID;
   public static int ItemNewCupID;
   public static int crystalToolIndex;
   public static int newToolIndex;
   public static int armorID;
   public static int crystalStoneID;
   public static int crystalItemID;
   public static int crystalWoodID;
   public static int blockCrystalID;
   public static int fenceID;
   public static int torchID;
   public static int groundID;
   public static int sawID;
   public static int sawItemID;
   public static int newFlowerID;
   public static int halfPlankID;
   public static int doubleHalfPlankID;
   public static int halfPlankID2;
   public static int doubleHalfPlankID2;
   public static int halfStoneID;
   public static int doubleHalfStoneID;
   public static int newStairsIdIndex;
   public static int powderID;
   public static int carbonItemsID;
   public static int tropicalID;
   public static int redwoodID;
   public static int tropicalHillsID;
   public static int redwoodHillsID;
   public static int redwoodSnowHillsID;
   public static int redwoodSnowID;
   public static int crystalForestID;
   public static int newSeedWeight;
   public static int bamSpreadBuffer;
   public static boolean bambooGeneration;
   public static boolean bambooSpread;
   public static boolean lumberjack;
   public static boolean lumberjackDamage;
   public static int lumberjackPower;
   public static boolean leafDecay;
   public static boolean AngelOak;
   public static boolean Eucalyptus;
   public static boolean Fig;
   public static boolean Jacaranda;
   public static boolean Sequoia;
   public static boolean Apple;
   public static boolean YellowMaple;
   public static boolean RedMaple;
   public static boolean DesertIronwood;
   public static boolean Cypress;
   public static boolean Cherry;
   public static boolean Acacia;
   public static boolean Joshua;
   public static boolean Willow;
   public static boolean decBush;
   public static boolean everBush;
   public static boolean palm;
   public static boolean dWillow;
   public static boolean cedar;
   public static boolean ginkgo;
   public static boolean poplar;
   public static boolean beech;
   public static boolean walnut;
   public static boolean wTopEucalyptus;
   public static boolean bukkit;
   public static boolean banana;
   public static boolean orange;
   public static boolean peach;
   public static boolean lemon;
   public static boolean blueberry;
   public static boolean raspberry;
   public static boolean blackberry;
   public static boolean huckleberry;
   public static boolean redwoodForestc;
   public static boolean tropicalForestc;
   public static boolean tropicalForestHillsc;
   public static boolean redwoodForestHillsc;
   public static boolean redwoodForestHillsSnowc;
   public static boolean redwoodForestSnowc;
   public static boolean CrystalForest;
   public static boolean vanDesert;
   public static boolean vanExtremeHills;
   public static boolean vanForest;
   public static boolean vanJungle;
   public static boolean vanPlains;
   public static boolean vanSwampland;
   public static boolean vanTaiga;
   public static boolean crystalGround;
   public static boolean figFruit;
   public static boolean crystalTools;
   public static boolean obsidianTools;
   public static boolean StoneGranite;
   public static boolean StoneChert;
   public static boolean StoneMarble;
   public static boolean StoneHornfels;
   public static boolean StoneGneiss;
   public static boolean stone = true;
   public static boolean titanStoneTrue = true;
   public static boolean carbonItems;
   public static boolean craftGunpowder;
   public static boolean crystalMushrooms;
   public static int newTreePerChunkCount;
   public static int newLeafDecayBuffer;
   public static int flowerGen;
   public static int extraAxe1ID;
   public static int extraAxe2ID;
   public static int extraAxe3ID;
   public static int extraAxe4ID;
   public static int FNLogRenderID;
   public static int FNFlowerPotRenderID;
   public static int flowerPotID;
   public static int flowerPotID2;
   public static int flowerPotID3;
   public static int flowerPotID4;
   public static Block kCelOniGar;
   public static Block turnGinPea;
   public static Block parsWChestRiceBrocc;
   public static Block hempCotBamCorn;
   public static Block grapeTomCabPine;
   public static Block rope;
   public static Block newLeaves;
   public static Block newLeaves2;
   public static Block newLeaves3;
   public static Block newLeaves4;
   public static Block newLeaves5;
   public static Block newLeaves6;
   public static Block netherLeaves;
   public static Block newLogs;
   public static Block newLogs2;
   public static Block newLogs3;
   public static Block newLogs4;
   public static Block netherLogs;
   public static Block newSap;
   public static Block newSap2;
   public static Block newSap3;
   public static Block newPlanks;
   public static Block newPlanks2;
   public static Block newFruit;
   public static Block crystalStone;
   public static Block crystalBlock;
   public static Block crystalWood;
   public static Block crystalLeaves;
   public static Block newFence;
   public static Block newTorch;
   public static Block newGround;
   public static Block newFlowers;
   public static Block newStairs1;
   public static Block newStairs2;
   public static Block newStairs3;
   public static Block newStairs4;
   public static Block newStairs5;
   public static Block newStairs6;
   public static Block newStairs7;
   public static Block newStairs8;
   public static Block newStairs9;
   public static Block newStairs10;
   public static Block newStairs11;
   public static Block newStairs12;
   public static Block newStairs13;
   public static Block newStairs14;
   public static Block newStairs15;
   public static Block newStoneStairs1;
   public static Block newStoneStairs2;
   public static Block newStoneStairs3;
   public static Block newStoneStairs4;
   public static BlockHalfSlab newHalfPlanks;
   public static BlockHalfSlab newDoubleHalfPlanks;
   public static BlockHalfSlab newHalfPlanks2;
   public static BlockHalfSlab newDoubleHalfPlanks2;
   public static BlockHalfSlab newHalfStone;
   public static BlockHalfSlab newDoubleHalfStone;
   public static Block LJ;
   public static Block FNStone;
   public static Block FNSandStone;
   public static Block FNGlass;
   public static Block newStones;
   public static Block mushroomCrystal;
   public static Block mushroomCrystalBlock;
   public static Block flowerPot;
   public static Block flowerPot2;
   public static Block flowerPot3;
   public static Block flowerPot4;
   public static Item flowerPotItem;
   public static Item flowerPotItem2;
   public static Item flowerPotItem3;
   public static Item flowerPotItem4;
   public static Item helmetObsidian;
   public static Item plateObsidian;
   public static Item legsObsidian;
   public static Item bootsObsidian;
   public static Item helmetTitanStone;
   public static Item plateTitanStone;
   public static Item legsTitanStone;
   public static Item bootsTitanStone;
   public static BiomeGenBase neoTropicalForest;
   public static BiomeGenBase neoRedwoodForest;
   public static BiomeGenBase neoTropicalForestHills;
   public static BiomeGenBase neoRedwoodForestHills;
   public static BiomeGenBase neoRedwoodForestSnowHills;
   public static BiomeGenBase neoRedwoodForestSnow;
   public static BiomeGenBase crystalForest;
   public static EnumToolMaterial crystal = EnumHelper.addToolMaterial("Crystal", 1, 128, 7.0F, 2.0F, 22);
   public static EnumToolMaterial darkCrystal = EnumHelper.addToolMaterial("Dark Crystal", 3, 1000, 7.0F, 3.0F, 8);
   public static EnumToolMaterial obsidian = EnumHelper.addToolMaterial("Obsidian", 3, 1000, 10.0F, 3.0F, 1);
   public static EnumToolMaterial titanStone = EnumHelper.addToolMaterial("titanStone", 3, 15000, 25.0F, 4.0F, 22);
   public static EnumToolMaterial saw = EnumHelper.addToolMaterial("Saw", 3, 2000, 10.0F, 2.0F, 14);
   static EnumArmorMaterial armorObsidian = EnumHelper.addArmorMaterial("Obsidian", 29, new int[]{3, 8, 6, 3}, 1);
   static EnumArmorMaterial armorTitanStone = EnumHelper.addArmorMaterial("TitanStone", 50, new int[]{5, 10, 8, 5}, 25);
   public static CreativeTabs tabFN = new CreativeTabs("tabFN") {
      public ItemStack getIconItemStack() {
         return new ItemStack(Item.itemsList[forgottennature.sapIDindex], 1, 8);
      }
   };


   @PostInit
   public void postInit(FMLPostInitializationEvent event) {}

   @Init
   public void load(FMLInitializationEvent event) {
      if(lumberjack) {
         Block.blocksList[17] = null;
         LJ = (new BlockLJ(17)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("log").setTextureName("log");
      }

      flowerPot = (new BlockNewFlowerPot(flowerPotID)).setHardness(0.0F).setStepSound(Block.soundPowderFootstep).setUnlocalizedName("flowerPot1");
      flowerPot2 = (new BlockNewFlowerPot2(flowerPotID2)).setHardness(0.0F).setStepSound(Block.soundPowderFootstep).setUnlocalizedName("flowerPot2");
      flowerPot3 = (new BlockNewFlowerPot3(flowerPotID3)).setHardness(0.0F).setStepSound(Block.soundPowderFootstep).setUnlocalizedName("flowerPot3");
      flowerPot4 = (new BlockNewFlowerPot4(flowerPotID4)).setHardness(0.0F).setStepSound(Block.soundPowderFootstep).setUnlocalizedName("flowerPot4");
      flowerPotItem = (new NewItemReed(flowerPotID, flowerPot)).setUnlocalizedName("flowerPot1").setCreativeTab(tabFN);
      flowerPotItem2 = (new NewItemReed(flowerPotID2, flowerPot2)).setUnlocalizedName("flowerPot2").setCreativeTab(tabFN);
      flowerPotItem3 = (new NewItemReed(flowerPotID3, flowerPot3)).setUnlocalizedName("flowerPot3").setCreativeTab(tabFN);
      flowerPotItem4 = (new NewItemReed(flowerPotID4, flowerPot4)).setUnlocalizedName("flowerPot4").setCreativeTab(tabFN);
      mushroomCrystalBlock = (new BlockCrystalMushroomBlock(mushroomBlockID)).setHardness(2.0F).setStepSound(Block.soundGlassFootstep).setLightValue(0.9F).setUnlocalizedName("Crystal Mushroom Block").setCreativeTab(tabFN);
      mushroomCrystal = (new BlockCrystalMushroom(mushroomPlantID)).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setLightValue(0.8F).setUnlocalizedName("Crystal Mushroom").setCreativeTab(tabFN);
      newLeaves = (new BlockNewLeaves(leafIDindex, leafDecay, newLeafDecayBuffer, fruitID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newLeaves2 = (new BlockNewLeaves2(leafIDindex + 1, leafDecay, newLeafDecayBuffer)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newLeaves3 = (new BlockNewLeaves3(leafIDindex + 2, leafDecay, newLeafDecayBuffer, fruitID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newLeaves4 = (new BlockNewLeaves4(leafIDindex + 3, leafDecay, newLeafDecayBuffer, fruitID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newLeaves5 = (new BlockNewLeaves5(leafIDindex + 4, leafDecay, newLeafDecayBuffer, ItemFruitID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newLeaves6 = (new BlockNewLeaves6(leafIDindex + 5, leafDecay, newLeafDecayBuffer, ItemFruitID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      crystalLeaves = (new BlockCrystalLeaves(leafIDindex + 6)).setHardness(0.3F).setLightOpacity(0).setStepSound(Block.soundGrassFootstep).setLightValue(0.9F).setCreativeTab(tabFN);
      netherLeaves = (new BlockNetherLeaves(leafIDindex + 7, leafDecay, newLeafDecayBuffer)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newLogs = (new BlockNewLogs(logIDindex)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabFN);
      newLogs2 = (new BlockNewLogs2(logIDindex + 1)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabFN);
      newLogs3 = (new BlockNewLogs3(logIDindex + 2)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabFN);
      newLogs4 = (new BlockNewLogs4(logIDindex + 3)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
      netherLogs = (new BlockNetherLogs(logIDindex + 4)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabFN);
      newSap = (new BlockNewSap(sapIDindex)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newSap2 = (new BlockNewSap2(sapIDindex + 1)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newSap3 = (new BlockNewSap3(sapIDindex + 2)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(tabFN);
      newPlanks = (new BlockNewPlanks(plankID)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabFN);
      newPlanks2 = (new BlockNewPlanks2(plankID2)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(tabFN);
      newFruit = (new BlockNewFruit(fruitID, 0, ItemNutID, ItemFruitID)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("fruit");
      crystalStone = (new BlockCrystalStone(crystalStoneID)).setHardness(0.5F).setStepSound(Block.soundGlassFootstep).setLightValue(0.9F).setUnlocalizedName("crystalStone").setCreativeTab(tabFN);
      crystalBlock = (new BlockCrystalBlock(blockCrystalID)).setHardness(2.0F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setUnlocalizedName("crystalBlock").setCreativeTab(tabFN);
      crystalWood = (new BlockCrystalWood(crystalWoodID)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setLightValue(0.96F).setUnlocalizedName("crystalWood").setCreativeTab(tabFN);
      newFence = (new BlockNewFence(fenceID, "wood", Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("fence");
      newTorch = (new BlockNewTorch(torchID, 167)).setHardness(0.0F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setCreativeTab(tabFN);
      newGround = (new BlockNewGroundcover(groundID)).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setLightValue(0.6F).setCreativeTab(tabFN);
      newFlowers = (new BlockNewFlowers(newFlowerID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Flowers").setCreativeTab(tabFN);
      newHalfPlanks = (BlockHalfSlab)((BlockHalfSlab)(new BlockNewSlab(halfPlankID, false, Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Half Plank").setCreativeTab(tabFN));
      newDoubleHalfPlanks = (BlockHalfSlab)((BlockHalfSlab)(new BlockNewSlab(doubleHalfPlankID, true, Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Half Plank"));
      newHalfPlanks2 = (BlockHalfSlab)((BlockHalfSlab)(new BlockNewSlab(halfPlankID2, false, Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Half Plank").setCreativeTab(tabFN));
      newDoubleHalfPlanks2 = (BlockHalfSlab)((BlockHalfSlab)(new BlockNewSlab(doubleHalfPlankID2, true, Material.wood)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Half Plank"));
      newStairs1 = (new BlockNewStairs(newStairsIdIndex, newPlanks, 0)).setUnlocalizedName("stairsWood0").setCreativeTab(tabFN);
      newStairs2 = (new BlockNewStairs(newStairsIdIndex + 1, newPlanks, 1)).setUnlocalizedName("stairsWood1").setCreativeTab(tabFN);
      newStairs3 = (new BlockNewStairs(newStairsIdIndex + 2, newPlanks, 2)).setUnlocalizedName("stairsWood2").setCreativeTab(tabFN);
      newStairs4 = (new BlockNewStairs(newStairsIdIndex + 3, newPlanks, 3)).setUnlocalizedName("stairsWood3").setCreativeTab(tabFN);
      newStairs5 = (new BlockNewStairs(newStairsIdIndex + 4, newPlanks, 4)).setUnlocalizedName("stairsWood4").setCreativeTab(tabFN);
      newStairs6 = (new BlockNewStairs(newStairsIdIndex + 5, newPlanks, 5)).setUnlocalizedName("stairsWood5").setCreativeTab(tabFN);
      newStairs7 = (new BlockNewStairs(newStairsIdIndex + 6, newPlanks, 6)).setUnlocalizedName("stairsWood6").setCreativeTab(tabFN);
      newStairs8 = (new BlockNewStairs(newStairsIdIndex + 7, newPlanks, 7)).setUnlocalizedName("stairsWood7").setCreativeTab(tabFN);
      newStairs9 = (new BlockNewStairs(newStairsIdIndex + 8, newPlanks, 8)).setUnlocalizedName("stairsWood8").setCreativeTab(tabFN);
      newStairs10 = (new BlockNewStairs(newStairsIdIndex + 9, newPlanks, 9)).setUnlocalizedName("stairsWood9").setCreativeTab(tabFN);
      newStairs11 = (new BlockNewStairs(newStairsIdIndex + 10, newPlanks, 10)).setUnlocalizedName("stairsWood10").setCreativeTab(tabFN);
      newStairs12 = (new BlockNewStairs(newStairsIdIndex + 11, newPlanks, 11)).setUnlocalizedName("stairsWood11").setCreativeTab(tabFN);
      newStairs13 = (new BlockNewStairs(newStairsIdIndex + 12, newPlanks, 12)).setUnlocalizedName("stairsWood12").setCreativeTab(tabFN);
      newStairs14 = (new BlockNewStairs(newStairsIdIndex + 13, crystalWood, 2)).setUnlocalizedName("stairsWood13").setLightValue(0.8F).setCreativeTab(tabFN);
      newStairs15 = (new BlockNewStairs(newStairsIdIndex + 14, crystalWood, 3)).setUnlocalizedName("stairsWood14").setLightValue(0.8F).setCreativeTab(tabFN);
      kCelOniGar = (new BlockKCelOniGar(kCeleryOnionGarlicID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("newCrops1");
      turnGinPea = (new BlockPeaTurnGinger(peanutTurnipGingerID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("newCrops2");
      parsWChestRiceBrocc = (new BlockParsWChestRiceBroc(parsleyWChestnutRiceBroccoliID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("newCrops3");
      hempCotBamCorn = (new BlockHempCotBamCorn(hempCottonBambooCornID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("newCrops4").setCreativeTab(tabFN);
      grapeTomCabPine = (new BlockGrapeTomCabPine(grapeTomatoCabbagePineappleID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("newCrops5");
      rope = (new BlockRope(ropeID)).setHardness(0.5F).setResistance(1.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Rope");
      FNGlass = (new FNBlockGlass(newGlassID, Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("glass").setCreativeTab(tabFN);
      if(titanStoneTrue || stone) {
         Item.itemsList[newStonesID] = (new ItemNewStone(newStonesID - 256)).setUnlocalizedName("Stone2");
         newStones = (new BlockNewStone(newStonesID)).setHardness(1.5F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Stone2").setCreativeTab(tabFN);
         if(stone) {
            newHalfStone = (BlockHalfSlab)((BlockHalfSlab)(new BlockNewSlab(halfStoneID, false, Material.rock)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Half block").setCreativeTab(tabFN));
            newDoubleHalfStone = (BlockHalfSlab)((BlockHalfSlab)(new BlockNewSlab(doubleHalfStoneID, true, Material.rock)).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("Half block"));
            Item.itemsList[halfStoneID] = (new ItemNewHalfPlanks(halfStoneID - 256, newHalfStone, newDoubleHalfStone, false)).setUnlocalizedName("half block");
            Item.itemsList[doubleHalfStoneID] = (new ItemNewHalfPlanks(doubleHalfStoneID - 256, newHalfStone, newDoubleHalfStone, true)).setUnlocalizedName("half block");
            newStoneStairs1 = (new BlockNewStairs(newStairsIdIndex + 15, newStones, 5)).setUnlocalizedName("stairsStone1").setCreativeTab(tabFN);
            newStoneStairs2 = (new BlockNewStairs(newStairsIdIndex + 16, newStones, 6)).setUnlocalizedName("stairsStone2").setCreativeTab(tabFN);
            newStoneStairs3 = (new BlockNewStairs(newStairsIdIndex + 17, newStones, 7)).setUnlocalizedName("stairsStone3").setCreativeTab(tabFN);
            newStoneStairs4 = (new BlockNewStairs(newStairsIdIndex + 18, newStones, 8)).setUnlocalizedName("stairsStone4").setCreativeTab(tabFN);
         }
      }

      Item.itemsList[torchID] = (new ItemTorch(torchID - 256)).setUnlocalizedName("cTorch");
      Item.itemsList[groundID] = (new ItemGeneral(groundID - 256)).setUnlocalizedName("cground");

      int x;
      for(x = 0; x < 19; ++x) {
         if(x < 15) {
            Item.itemsList[newStairsIdIndex + x] = (new ItemGeneral(newStairsIdIndex - 256 + x)).setUnlocalizedName("newStairs" + x);
         }

         if(x > 14 && stone) {
            Item.itemsList[newStairsIdIndex + x] = (new ItemGeneral(newStairsIdIndex - 256 + x)).setUnlocalizedName("newStairs" + x);
         }
      }

      Item.itemsList[mushroomBlockID] = (new ItemGeneral(mushroomBlockID - 256)).setUnlocalizedName("cMBlock");
      Item.itemsList[mushroomPlantID] = (new ItemGeneral(mushroomPlantID - 256)).setUnlocalizedName("cMushroom");
      Item.itemsList[newGlassID] = new ItemNewGlass(newGlassID - 256);

      for(x = 0; x < 8; ++x) {
         Item.itemsList[leafIDindex + x] = new ItemNewLeaves(leafIDindex - 256 + x);
      }

      Item.itemsList[sapIDindex] = new ItemNewSap(sapIDindex - 256);
      Item.itemsList[sapIDindex + 1] = new ItemNewSap2(sapIDindex - 255);
      Item.itemsList[sapIDindex + 2] = new ItemNewSap3(sapIDindex - 254);
      Item.itemsList[logIDindex] = new ItemNewLogs(logIDindex - 256);
      Item.itemsList[logIDindex + 1] = new ItemNewLogs2(logIDindex - 255);
      Item.itemsList[logIDindex + 2] = new ItemNewLogs3(logIDindex - 254);
      Item.itemsList[logIDindex + 3] = new ItemNewLogs4(logIDindex - 253);
      Item.itemsList[logIDindex + 4] = new ItemNetherLogs(logIDindex - 252);
      Item.itemsList[newFlowerID] = new ItemNewFlowers(newFlowerID - 256);
      Item.itemsList[plankID] = new ItemNewPlanks(plankID - 256);
      Item.itemsList[plankID2] = new ItemNewPlanks2(plankID2 - 256);
      Item.itemsList[halfPlankID] = (new ItemNewHalfPlanks(halfPlankID - 256, newHalfPlanks, newDoubleHalfPlanks, false)).setUnlocalizedName("half plank");
      Item.itemsList[doubleHalfPlankID] = (new ItemNewHalfPlanks(doubleHalfPlankID - 256, newHalfPlanks, newDoubleHalfPlanks, true)).setUnlocalizedName("half plank");
      Item.itemsList[halfPlankID2] = (new ItemNewHalfPlanks(halfPlankID2 - 256, newHalfPlanks2, newDoubleHalfPlanks2, false)).setUnlocalizedName("half plank");
      Item.itemsList[doubleHalfPlankID2] = (new ItemNewHalfPlanks(doubleHalfPlankID2 - 256, newHalfPlanks2, newDoubleHalfPlanks2, true)).setUnlocalizedName("half plank");
      Item.itemsList[crystalStoneID] = (new ItemCrystalStone(crystalStoneID - 256)).setUnlocalizedName("CrystalStone");
      Item.itemsList[blockCrystalID] = (new ItemCrystalBlock(blockCrystalID - 256)).setUnlocalizedName("CrystalBlock");
      Item.itemsList[crystalWoodID] = (new ItemCrystalWood(crystalWoodID - 256)).setUnlocalizedName("Crystalwood");
      Item.itemsList[fenceID] = (new ItemNewFence(fenceID - 256, fenceID)).setUnlocalizedName("Fence").setCreativeTab(tabFN);
      Item.itemsList[ropeID] = (new ItemRope(ropeID - 256)).setUnlocalizedName("Rope").setCreativeTab(tabFN);
      Item.itemsList[hempCottonBambooCornID] = (new ItemBamboo(hempCottonBambooCornID - 256)).setUnlocalizedName("Bamboo");
      Item.itemsList[ItemFruitID] = (new ItemFruit(ItemFruitID - 256)).setCreativeTab(tabFN);
      Item.itemsList[ItemNewFoodID] = (new ItemNewFood(ItemNewFoodID - 256)).setCreativeTab(tabFN);
      Item.itemsList[ItemNewFoodID2] = (new ItemNewFood2(ItemNewFoodID2 - 256)).setContainerItem(Item.bowlEmpty).setCreativeTab(tabFN);
      Item.itemsList[ItemNewFoodID3] = (new ItemNewFood3(ItemNewFoodID3 - 256)).setContainerItem(Item.itemsList[ItemNewCupID]).setCreativeTab(tabFN);
      Item.itemsList[ItemNewCupID] = (new ItemNewCup(ItemNewCupID - 256)).setCreativeTab(tabFN);
      Item.itemsList[ItemNutID] = (new ItemNut(ItemNutID - 256)).setCreativeTab(tabFN);
      Item.itemsList[ItemNewContainerID] = (new ItemNewContainer(ItemNewContainerID - 256)).setContainerItem(Item.bucketEmpty).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex] = (new ItemNewPA(crystalToolIndex - 256, crystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 1] = (new ItemNewAxe(crystalToolIndex - 255, crystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 2] = (new ItemNewShovel(crystalToolIndex - 254, crystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 3] = (new ItemNewSword(crystalToolIndex - 253, crystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 4] = (new ItemNewHoe(crystalToolIndex - 252, crystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 5] = (new ItemNewPA(crystalToolIndex - 251, darkCrystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 6] = (new ItemNewAxe(crystalToolIndex - 250, darkCrystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 7] = (new ItemNewHoe(crystalToolIndex - 249, darkCrystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 8] = (new ItemNewShovel(crystalToolIndex - 248, darkCrystal)).setCreativeTab(tabFN);
      Item.itemsList[crystalToolIndex + 9] = (new ItemNewSword(crystalToolIndex - 247, darkCrystal)).setCreativeTab(tabFN);
      if(obsidianTools) {
         helmetObsidian = (new ItemNewArmor(armorID, armorObsidian, FNClientProxy.armorObsidian, 0)).setUnlocalizedName("helmetObsidian").setCreativeTab(tabFN);
         plateObsidian = (new ItemNewArmor(armorID + 1, armorObsidian, FNClientProxy.armorObsidian, 1)).setUnlocalizedName("chestPlateObsidian").setCreativeTab(tabFN);
         legsObsidian = (new ItemNewArmor(armorID + 2, armorObsidian, FNClientProxy.armorObsidian, 2)).setUnlocalizedName("leggingsObsidian").setCreativeTab(tabFN);
         bootsObsidian = (new ItemNewArmor(armorID + 3, armorObsidian, FNClientProxy.armorObsidian, 3)).setUnlocalizedName("bootsObsidian").setCreativeTab(tabFN);
         helmetTitanStone = (new ItemNewArmor(armorID + 4, armorTitanStone, FNClientProxy.armorTitanStone, 0)).setUnlocalizedName("helmetTitanStone").setCreativeTab(tabFN);
         plateTitanStone = (new ItemNewArmor(armorID + 5, armorTitanStone, FNClientProxy.armorTitanStone, 1)).setUnlocalizedName("chestPlateTitanStone").setCreativeTab(tabFN);
         legsTitanStone = (new ItemNewArmor(armorID + 6, armorTitanStone, FNClientProxy.armorTitanStone, 2)).setUnlocalizedName("leggingsTitanStone").setCreativeTab(tabFN);
         bootsTitanStone = (new ItemNewArmor(armorID + 7, armorTitanStone, FNClientProxy.armorTitanStone, 3)).setUnlocalizedName("bootsTitanStone").setCreativeTab(tabFN);
         Item.itemsList[newToolIndex] = (new ItemNewPA(newToolIndex - 256, obsidian)).setCreativeTab(tabFN);
         Item.itemsList[newToolIndex + 1] = (new ItemNewAxe(newToolIndex - 255, obsidian)).setCreativeTab(tabFN);
         Item.itemsList[newToolIndex + 2] = (new ItemNewHoe(newToolIndex - 254, obsidian)).setCreativeTab(tabFN);
         Item.itemsList[newToolIndex + 3] = (new ItemNewShovel(newToolIndex - 253, obsidian)).setCreativeTab(tabFN);
         Item.itemsList[newToolIndex + 4] = (new ItemNewSword(newToolIndex - 252, obsidian)).setCreativeTab(tabFN);
         Item.itemsList[newToolIndex + 5] = (new ItemTitanStonePA(newToolIndex - 251, titanStone)).setCreativeTab(tabFN);
         Item.itemsList[newToolIndex + 6] = (new ItemNewSword(newToolIndex - 250, titanStone)).setCreativeTab(tabFN);
      }

      Item.itemsList[sawID] = (new ItemNewAxe(sawID - 256, saw)).setCreativeTab(tabFN);
      Item.itemsList[crystalItemID] = (new ItemCrystal(crystalItemID - 256)).setUnlocalizedName("Crystal").setCreativeTab(tabFN);
      Item.itemsList[sawItemID] = (new ItemSawItems(sawItemID - 256)).setCreativeTab(tabFN);
      Item.itemsList[powderID] = (new ItemPowder(powderID - 256)).setCreativeTab(tabFN);
      Item.itemsList[newCropSeedsID] = (new ItemNewCropSeeds(newCropSeedsID - 256, kCeleryOnionGarlicID, peanutTurnipGingerID, parsleyWChestnutRiceBroccoliID, hempCottonBambooCornID, grapeTomatoCabbagePineappleID, Block.tilledField.blockID)).setUnlocalizedName("NewSeeds").setCreativeTab(tabFN);
      Item.itemsList[newCropFoodID] = (new ItemNewCropFood(newCropFoodID - 256, kCeleryOnionGarlicID, peanutTurnipGingerID, parsleyWChestnutRiceBroccoliID)).setUnlocalizedName("NewFood").setCreativeTab(tabFN);
      Item.itemsList[newCropGoodsID] = (new ItemNewCropGoods(newCropGoodsID - 256)).setCreativeTab(tabFN);
      Item.itemsList[newFoodDishID] = (new ItemFoodDish(newFoodDishID - 256)).setContainerItem(Item.bowlEmpty).setCreativeTab(tabFN);
      Item.itemsList[carbonItemsID] = (new ItemCarbon(carbonItemsID - 256)).setCreativeTab(tabFN);
      FNCommonProxy var10000 = proxy;
      FNCommonProxy.registerRenderStuff();
      FNClientProxy.registerRenderStuff();
      FNClientProxy.newRecipes();
      GameRegistry.addSmelting(newLogs.blockID, new ItemStack(Item.coal, 1, 1), 1.0F);
      GameRegistry.addSmelting(newLogs2.blockID, new ItemStack(Item.coal, 1, 1), 1.0F);
      GameRegistry.addSmelting(newLogs3.blockID, new ItemStack(Item.coal, 1, 1), 1.0F);
      neoTropicalForest = new BiomeGenTropicalForest(tropicalID);
      neoRedwoodForest = new BiomeGenNeoRedwoodForest(redwoodID);
      neoTropicalForestHills = new BiomeGenNeoTropicalForestHills(tropicalHillsID);
      neoRedwoodForestHills = new BiomeGenNeoRedwoodForestHills(redwoodHillsID);
      neoRedwoodForestSnowHills = new BiomeGenNeoRedwoodForestSnowHills(redwoodSnowHillsID);
      neoRedwoodForestSnow = new BiomeGenNeoRedwoodForestSnow(redwoodSnowID);
      crystalForest = new BiomeGenCrystalForest(crystalForestID);
      if(tropicalForestc) {
         GameRegistry.addBiome(neoTropicalForest);
      } else {
         GameRegistry.removeBiome(neoTropicalForest);
      }

      if(redwoodForestc) {
         GameRegistry.addBiome(neoRedwoodForest);
      } else {
         GameRegistry.removeBiome(neoRedwoodForest);
      }

      if(tropicalForestHillsc) {
         GameRegistry.addBiome(neoTropicalForestHills);
      } else {
         GameRegistry.removeBiome(neoTropicalForestHills);
      }

      if(redwoodForestHillsc) {
         GameRegistry.addBiome(neoRedwoodForestHills);
      } else {
         GameRegistry.removeBiome(neoRedwoodForestHills);
      }

      if(redwoodForestHillsSnowc) {
         GameRegistry.addBiome(neoRedwoodForestSnowHills);
      } else {
         GameRegistry.removeBiome(neoRedwoodForestSnowHills);
      }

      if(redwoodForestSnowc) {
         GameRegistry.addBiome(neoRedwoodForestSnow);
      } else {
         GameRegistry.removeBiome(neoRedwoodForestSnow);
      }

      if(CrystalForest) {
         GameRegistry.addBiome(crystalForest);
      } else {
         GameRegistry.removeBiome(crystalForest);
      }

      if(!vanDesert) {
         GameRegistry.removeBiome(BiomeGenBase.desert);
      }

      if(!vanExtremeHills) {
         GameRegistry.removeBiome(BiomeGenBase.extremeHills);
      }

      if(!vanForest) {
         GameRegistry.removeBiome(BiomeGenBase.forest);
      }

      if(!vanJungle) {
         GameRegistry.removeBiome(BiomeGenBase.jungle);
      }

      if(!vanPlains) {
         GameRegistry.removeBiome(BiomeGenBase.plains);
      }

      if(!vanSwampland) {
         GameRegistry.removeBiome(BiomeGenBase.swampland);
      }

      if(!vanTaiga) {
         GameRegistry.removeBiome(BiomeGenBase.taiga);
      }

      for(x = 0; x < 11; ++x) {
         MinecraftForge.addGrassSeed(new ItemStack(newCropSeedsID, 1, x), newSeedWeight);
      }

      MinecraftForge.addGrassSeed(new ItemStack(newCropFoodID, 1, 1), newSeedWeight);
      MinecraftForge.addGrassSeed(new ItemStack(newCropFoodID, 1, 2), newSeedWeight);
      MinecraftForge.addGrassSeed(new ItemStack(newCropFoodID, 1, 4), newSeedWeight);
      MinecraftForge.addGrassSeed(new ItemStack(newCropFoodID, 1, 5), newSeedWeight);
      MinecraftForge.addGrassSeed(new ItemStack(newCropFoodID, 1, 6), newSeedWeight);
      MinecraftForge.addGrassSeed(new ItemStack(newCropFoodID, 1, 9), newSeedWeight);
      OreDictionary.registerOre("plankWood", newPlanks);
      OreDictionary.registerOre("plankWood", newPlanks2);
      OreDictionary.registerOre("logWood", newLogs);
      OreDictionary.registerOre("logWood", newLogs2);
      OreDictionary.registerOre("logWood", newLogs3);
      OreDictionary.registerOre("logWood", newLogs4);
      OreDictionary.registerOre("logWood", netherLogs);
   }

   public static void addVillages() {
      enableVillageSpawnBiomeChanges();
      MapGenVillage.villageSpawnBiomes.add(neoTropicalForest);
      MapGenVillage.villageSpawnBiomes.add(neoTropicalForestHills);
      MapGenVillage.villageSpawnBiomes.add(neoRedwoodForestHills);
      MapGenVillage.villageSpawnBiomes.add(neoRedwoodForest);
      MapGenVillage.villageSpawnBiomes.add(neoRedwoodForestSnowHills);
      MapGenVillage.villageSpawnBiomes.add(neoRedwoodForestSnow);
      MapGenVillage.villageSpawnBiomes.add(crystalForest);
   }

   private static void enableVillageSpawnBiomeChanges() {
      ArrayList villageSpawnBiomes = new ArrayList();
      villageSpawnBiomes.addAll(MapGenVillage.villageSpawnBiomes);
      Field field = MapGenVillage.class.getDeclaredFields()[0];
      field.setAccessible(true);

      try {
         Field e = Field.class.getDeclaredField("modifiers");
         e.setAccessible(true);
         e.setInt(field, field.getModifiers() & -17);
         field.set((Object)null, villageSpawnBiomes);
      } catch (Exception var3) {
         FMLLog.log(Level.SEVERE, var3, "Could not access village spawn biomes.", new Object[1]);
      }

   }

   @PreInit
   public void preInit(FMLPreInitializationEvent event) {
      Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());

      try {
         cfg.load();
         kCeleryOnionGarlicID = cfg.get("block", "CeleryOnionGarlicID", 162).getInt();
         peanutTurnipGingerID = cfg.get("block", "PeanutTurnipGingerID", 163).getInt();
         parsleyWChestnutRiceBroccoliID = cfg.get("block", "ParsleyWChestnutRiceBroccoliID", 164).getInt();
         hempCottonBambooCornID = cfg.get("block", "HempCottonBambooCornID", 165).getInt();
         grapeTomatoCabbagePineappleID = cfg.get("block", "GrapeTomatoCabbagePineappleID", 166).getInt();
         torchID = cfg.get("block", "torchID", 175).getInt();
         ropeID = cfg.get("block", "ropeID", 176).getInt();
         halfPlankID = cfg.get("block", "New Half Planks ID", 177).getInt();
         doubleHalfPlankID = cfg.get("block", "New DoubleHalf Planks ID", 178).getInt();
         halfPlankID2 = cfg.get("block", "New Half Planks ID2", 179).getInt();
         doubleHalfPlankID2 = cfg.get("block", "New DoubleHalf Planks ID2", 180).getInt();
         mushroomBlockID = cfg.get("block", "Crystal Mushroom ID", 181).getInt();
         mushroomPlantID = cfg.get("block", "Crystal MushroomBlock ID", 182).getInt();
         fenceID = cfg.get("block", "fenceID", 183).getInt();
         newGlassID = cfg.get("block", "New Glass ID", 184).getInt();
         newStonesID = cfg.get("block", "New Stones ID", 185).getInt();
         halfStoneID = cfg.get("block", "New Half StoneID", 186).getInt();
         doubleHalfStoneID = cfg.get("block", "New DoubleHalf StoneID", 187).getInt();
         flowerPotID = cfg.get("block", "New Flower Pot ID", 188).getInt();
         flowerPotID2 = cfg.get("block", "New Flower Pot ID2", 189).getInt();
         flowerPotID3 = cfg.get("block", "New Flower Pot ID3", 190).getInt();
         flowerPotID4 = cfg.get("block", "New Flower Pot ID4", 191).getInt();
         Property err = cfg.get("block", "New Stair Index", 200);
         err.comment = "This Stair ID is the zero index for 19 stair IDs. 0-18";
         newStairsIdIndex = err.getInt(200);
         groundID = cfg.get("block", "groundID", 4071).getInt();
         crystalWoodID = cfg.get("block", "crystalWoodID", 4072).getInt();
         crystalStoneID = cfg.get("block", "crystalStoneID", 4073).getInt();
         blockCrystalID = cfg.get("block", "crystalBlockID", 4074).getInt();
         fruitID = cfg.get("block", "fruitID", 4075).getInt();
         plankID = cfg.get("block", "plankID", 4076).getInt();
         plankID2 = cfg.get("block", "plankID2", 4078).getInt();
         logIDindex = cfg.get("block", "logIDindex", 4079).getInt();
         leafIDindex = cfg.get("block", "leafIDindex", 4084).getInt();
         newFlowerID = cfg.get("block", "FlowerID", 4092).getInt();
         sapIDindex = cfg.get("block", "sapIDindex", 4093).getInt();
         bambooGeneration = cfg.get("general", "Bamboo Generation", true).getBoolean(true);
         bambooSpread = cfg.get("general", "Bamboo Spread", true).getBoolean(true);
         Property bamSpreadb = cfg.get("general", "Bamboo Spread Buffer", 200);
         bamSpreadb.comment = "BAMBOO SPREAD BUFFER (below) sets the spread mitigation for bamboo. The higher it is set, the slower it spreads.";
         bamSpreadBuffer = bamSpreadb.getInt(200);
         if(bamSpreadBuffer < 1) {
            bamSpreadBuffer = 1;
         }

         Property seedDrop = cfg.get("general", "Crop Seeds Drop Weight", 10);
         seedDrop.comment = "CROP SEEDS DROP WEIGHT (below) is the chance in which new seeds will drop from tall grass. Setting it to zero will DISABLE all new seed drops. 10 sets the drop chance equal to wheat seeds. Higher numbers will make the new seeds more common than wheat seeds.";
         newSeedWeight = seedDrop.getInt(10);
         ItemFruitID = cfg.get("item", "ItemFruitID", 20000).getInt();
         ItemNutID = cfg.get("item", "ItemNutID", 20001).getInt();
         ItemNewFoodID = cfg.get("item", "ItemNewFoodID", 20002).getInt();
         ItemNewContainerID = cfg.get("item", "ItemNewContainerID", 20003).getInt();
         crystalToolIndex = cfg.get("item", "Crystal Tool Index 0-9", 20004).getInt();
         crystalItemID = cfg.get("item", "crystalItemID", 20014).getInt();
         sawID = cfg.get("item", "SawID", 20015).getInt();
         sawItemID = cfg.get("item", "Saw Items ID", 20016).getInt();
         ItemNewFoodID2 = cfg.get("item", "ItemNewFoodID2", 20018).getInt();
         ItemNewFoodID3 = cfg.get("item", "ItemNewFoodID3", 20019).getInt();
         ItemNewCupID = cfg.get("item", "ItemNewCupID", 20020).getInt();
         powderID = cfg.get("item", "ItemPowderID", 20021).getInt();
         newCropSeedsID = cfg.get("item", "NewCropSeedsID", 20022).getInt();
         newCropFoodID = cfg.get("item", "NewCropFoodID", 20023).getInt();
         newCropGoodsID = cfg.get("item", "NewCropGoodsID", 20024).getInt();
         newFoodDishID = cfg.get("item", "FoodDishID", 20025).getInt();
         carbonItemsID = cfg.get("item", "CarbonItemsID", 20026).getInt();
         newToolIndex = cfg.get("item", "New Tool Index 0-6", 20027).getInt();
         armorID = cfg.get("item", "Armor Index 0-7", 20034).getInt();
         tropicalID = cfg.get("general", "Biomes: Neo Tropical Forest ID", 70).getInt();
         redwoodID = cfg.get("general", "Biomes: Neo Redwood Forest ID", 71).getInt();
         tropicalHillsID = cfg.get("general", "Biomes: Neo Tropical Forest Hills ID", 72).getInt();
         redwoodHillsID = cfg.get("general", "Biomes: Neo Redwood Forest Hills ID", 73).getInt();
         redwoodSnowHillsID = cfg.get("general", "Biomes: Neo Redwood Forest Snow Hills ID", 74).getInt();
         redwoodSnowID = cfg.get("general", "Biomes: Neo Redwood Forest Snow ID", 75).getInt();
         crystalForestID = cfg.get("general", "Biomes: Crystal Forest ID", 76).getInt();
         extraAxe1ID = cfg.get("item", "extraAxe1ID", 0).getInt();
         if(extraAxe1ID == 0) {
            extraAxe1ID = crystalToolIndex + 6;
         }

         extraAxe2ID = cfg.get("item", "extraAxe2ID", 0).getInt();
         if(extraAxe2ID == 0) {
            extraAxe2ID = crystalToolIndex + 6;
         }

         extraAxe3ID = cfg.get("item", "extraAxe3ID", 0).getInt();
         if(extraAxe3ID == 0) {
            extraAxe3ID = crystalToolIndex + 6;
         }

         extraAxe4ID = cfg.get("item", "extraAxe4ID", 0).getInt();
         if(extraAxe4ID == 0) {
            extraAxe4ID = crystalToolIndex + 6;
         }

         crystalTools = cfg.get("general", "Crafting: Crystal Tools", true).getBoolean(true);
         obsidianTools = cfg.get("general", "Crafting: Obsidian Tools and Armor", true).getBoolean(true);
         lumberjack = cfg.get("general", "Lumberjack", true).getBoolean(true);
         lumberjackDamage = cfg.get("general", "Lumberjack Extra damage to Axe", true).getBoolean(true);
         lumberjackPower = cfg.get("general", "Lumberjack Power", 1600).getInt();
         Fig = cfg.get("general", "Trees: Fig", true).getBoolean(true);
         Apple = cfg.get("general", "Trees: Apple", true).getBoolean(true);
         Cherry = cfg.get("general", "Trees: Cherry", true).getBoolean(true);
         Acacia = cfg.get("general", "Trees: Acacia", true).getBoolean(true);
         Joshua = cfg.get("general", "Trees: Joshua", true).getBoolean(true);
         Willow = cfg.get("general", "Trees: Willow", true).getBoolean(true);
         Cypress = cfg.get("general", "Trees: Cypress", true).getBoolean(true);
         Sequoia = cfg.get("general", "Trees: Sequoia", true).getBoolean(true);
         RedMaple = cfg.get("general", "Trees: Red Maple", true).getBoolean(true);
         AngelOak = cfg.get("general", "Trees: Angel Oak", true).getBoolean(true);
         Jacaranda = cfg.get("general", "Trees: Jacaranda", true).getBoolean(true);
         leafDecay = cfg.get("general", "Trees: Leaf Decay", true).getBoolean(true);
         Eucalyptus = cfg.get("general", "Trees: Eucalyptus", true).getBoolean(true);
         YellowMaple = cfg.get("general", "Trees: Yellow Maple", true).getBoolean(true);
         DesertIronwood = cfg.get("general", "Trees: Desert Ironwood", true).getBoolean(true);
         decBush = cfg.get("general", "Bushes: Deciduous Bush", true).getBoolean(true);
         everBush = cfg.get("general", "Bushes: Evergreen Bush", true).getBoolean(true);
         palm = cfg.get("general", "Trees: Palm", true).getBoolean(true);
         dWillow = cfg.get("general", "Trees: Desert Willow", true).getBoolean(true);
         cedar = cfg.get("general", "Trees: Cedar", true).getBoolean(true);
         ginkgo = cfg.get("general", "Trees: Ginkgo", true).getBoolean(true);
         poplar = cfg.get("general", "Trees: Poplar", true).getBoolean(true);
         beech = cfg.get("general", "Trees: Beech", true).getBoolean(true);
         walnut = cfg.get("general", "Trees: Walnut", true).getBoolean(true);
         wTopEucalyptus = cfg.get("general", "Trees: WideTop Eucalyptus", true).getBoolean(true);
         bukkit = cfg.get("general", "Trees: Bukkit Tree", true).getBoolean(true);
         banana = cfg.get("general", "Trees: Banana", true).getBoolean(true);
         orange = cfg.get("general", "Trees: Orange", true).getBoolean(true);
         peach = cfg.get("general", "Trees: Peach", true).getBoolean(true);
         lemon = cfg.get("general", "Trees: Lemon", true).getBoolean(true);
         blueberry = cfg.get("general", "Bushes: Blueberry Bush", true).getBoolean(true);
         raspberry = cfg.get("general", "Bushes: Raspberry Bush", true).getBoolean(true);
         blackberry = cfg.get("general", "Bushes: Blackberry Bush", true).getBoolean(true);
         huckleberry = cfg.get("general", "Bushes: Huckleberry Bush", true).getBoolean(true);
         redwoodForestc = cfg.get("general", "Biomes: Redwood Forest", true).getBoolean(true);
         tropicalForestc = cfg.get("general", "Biomes: Tropical Forest", true).getBoolean(true);
         tropicalForestHillsc = cfg.get("general", "Biomes: Tropical Forest Hills", true).getBoolean(true);
         redwoodForestHillsc = cfg.get("general", "Biomes: Redwood Forest Hills", true).getBoolean(true);
         redwoodForestHillsSnowc = cfg.get("general", "Biomes: Redwood Forest Snow Hills", true).getBoolean(true);
         redwoodForestSnowc = cfg.get("general", "Biomes: Redwood Forest Snow", true).getBoolean(true);
         CrystalForest = cfg.get("general", "Biomes: Crystal Forest", true).getBoolean(true);
         crystalMushrooms = cfg.get("general", "Crystal Mushrooms", true).getBoolean(true);
         vanDesert = cfg.get("general", "Biomes: Vanilla Desert", true).getBoolean(true);
         vanExtremeHills = cfg.get("general", "Biomes: Vanilla Extreme Hills", true).getBoolean(true);
         vanForest = cfg.get("general", "Biomes: Vanilla Forest", true).getBoolean(true);
         vanJungle = cfg.get("general", "Biomes: Vanilla Jungle", true).getBoolean(true);
         vanPlains = cfg.get("general", "Biomes: Vanilla Plains", true).getBoolean(true);
         vanSwampland = cfg.get("general", "Biomes: Vanilla Swampland", true).getBoolean(true);
         vanTaiga = cfg.get("general", "Biomes: Vanilla Taiga", true).getBoolean(true);
         figFruit = cfg.get("general", "Fig Fruit", true).getBoolean(true);
         StoneGranite = cfg.get("general", "Stone: Granite Generation", true).getBoolean(true);
         StoneChert = cfg.get("general", "Stone: Chert Generation", true).getBoolean(true);
         StoneMarble = cfg.get("general", "Stone: Marble Generation", true).getBoolean(true);
         StoneHornfels = cfg.get("general", "Stone: Hornfels Generation", true).getBoolean(true);
         StoneGneiss = cfg.get("general", "Stone: Gneiss Generation", true).getBoolean(true);
         if(!StoneGranite && !StoneChert && !StoneHornfels && !StoneMarble && !StoneGneiss) {
            stone = false;
         }

         titanStoneTrue = cfg.get("general", "Stone: Titan Stone", true).getBoolean(true);
         craftGunpowder = cfg.get("general", "Crafting: Gunpowder", true).getBoolean(true);
         newTreePerChunkCount = cfg.get("general", "New Trees Per Chunk", 3).getInt();
         FNLogRenderID = cfg.get("general", "LogRenderID", 50).getInt();
         FNFlowerPotRenderID = cfg.get("general", "FlowerPotRenderID", 51).getInt();
         newLeafDecayBuffer = cfg.get("general", "New Leaf Decay Buffer", 2).getInt();
         carbonItems = cfg.get("general", "Carbon Item Recipes", true).getBoolean(true);
         Property flowerGroups = cfg.get("general", "FN flower generation", 8);
         flowerGroups.comment = "This determines how many times a group of FN flowers will try to generate for every 10 chunks. Default value is 8";
         flowerGen = flowerGroups.getInt(8);
      } catch (Exception var10) {
         FMLLog.log(Level.SEVERE, var10, "Forgotten Nature has a problem loading configuration", new Object[0]);
      } finally {
         cfg.save();
      }

   }

}
