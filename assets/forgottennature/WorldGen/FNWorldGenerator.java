package assets.forgottennature.WorldGen;

import assets.forgottennature.forgottennature;
import assets.forgottennature.Biomes.BiomeGenCrystalForest;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForest;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForestHills;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForestSnow;
import assets.forgottennature.Biomes.BiomeGenNeoRedwoodForestSnowHills;
import assets.forgottennature.Biomes.BiomeGenNeoTropicalForestHills;
import assets.forgottennature.Biomes.BiomeGenTropicalForest;
import assets.forgottennature.WorldGen.genAcacia;
import assets.forgottennature.WorldGen.genAngel;
import assets.forgottennature.WorldGen.genBeech;
import assets.forgottennature.WorldGen.genBukkit;
import assets.forgottennature.WorldGen.genCedar;
import assets.forgottennature.WorldGen.genCherry;
import assets.forgottennature.WorldGen.genCrystal;
import assets.forgottennature.WorldGen.genCrystalMushroom;
import assets.forgottennature.WorldGen.genCypress;
import assets.forgottennature.WorldGen.genDWillow;
import assets.forgottennature.WorldGen.genDecBush;
import assets.forgottennature.WorldGen.genDesertTree;
import assets.forgottennature.WorldGen.genEucalyptus;
import assets.forgottennature.WorldGen.genEverBush;
import assets.forgottennature.WorldGen.genFig;
import assets.forgottennature.WorldGen.genFruit;
import assets.forgottennature.WorldGen.genFruitBush;
import assets.forgottennature.WorldGen.genGinkgo;
import assets.forgottennature.WorldGen.genJoshua;
import assets.forgottennature.WorldGen.genNetherMushroom;
import assets.forgottennature.WorldGen.genNetherTree;
import assets.forgottennature.WorldGen.genPalm;
import assets.forgottennature.WorldGen.genPoplar;
import assets.forgottennature.WorldGen.genSequoia;
import assets.forgottennature.WorldGen.genWTEucalyptus;
import assets.forgottennature.WorldGen.genWalnut;
import assets.forgottennature.WorldGen.genWillow;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBeach;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.biome.BiomeGenTaiga;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class FNWorldGenerator implements IWorldGenerator {

   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
      if(world.provider.dimensionId == 0) {
         int i = chunkX * 16;
         int j = chunkZ * 16;
         BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(i, j);
         float biomeRain = world.getWorldChunkManager().getBiomeGenAt(i, j).rainfall;
         float biomeTemp = world.getWorldChunkManager().getBiomeGenAt(i, j).temperature;
         float biomeMinHeight = world.getWorldChunkManager().getBiomeGenAt(i, j).minHeight;
         int il;
         int k;
         int l;
         int tree;
         if(random.nextInt(10) == 0 && !(biome instanceof BiomeGenCrystalForest)) {
            int num = random.nextInt(10);

            for(tree = 0; tree < forgottennature.flowerGen; ++tree) {
               k = i + random.nextInt(8) + 8;
               l = j + random.nextInt(8) + 8;
               il = world.getHeightValue(k, l);
               if(world.getBlockId(k, il - 1, l) == Block.grass.blockID) {
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
                  world.setBlock(k, il, l, forgottennature.newFlowerID, num, 2);
               }
            }
         }

         for(tree = 0; tree < 15; ++tree) {
            if(forgottennature.StoneChert && random.nextInt(5) == 0) {
               il = i + random.nextInt(10);
               k = j + random.nextInt(10);
               l = random.nextInt(60) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 0, 10, 1)).generate(world, random, il, l, k);
               l = random.nextInt(25) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 0, 10, 1)).generate(world, random, il, l, k);
            }

            if(forgottennature.StoneGranite && random.nextInt(5) == 0) {
               il = i + random.nextInt(10);
               k = j + random.nextInt(10);
               l = random.nextInt(60) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 1, 20, 1)).generate(world, random, il, l, k);
               l = random.nextInt(25) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 1, 20, 1)).generate(world, random, il, l, k);
            }

            if(forgottennature.StoneGneiss && random.nextInt(5) == 0) {
               il = i + random.nextInt(10);
               k = j + random.nextInt(10);
               l = random.nextInt(60) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 2, 20, 1)).generate(world, random, il, l, k);
               l = random.nextInt(25) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 2, 20, 1)).generate(world, random, il, l, k);
            }

            if(forgottennature.StoneHornfels && random.nextInt(5) == 0) {
               il = i + random.nextInt(10);
               k = j + random.nextInt(10);
               l = random.nextInt(60) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 3, 20, 1)).generate(world, random, il, l, k);
               l = random.nextInt(25) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 3, 20, 1)).generate(world, random, il, l, k);
            }

            if(forgottennature.StoneMarble && random.nextInt(5) == 0) {
               il = i + random.nextInt(10);
               k = j + random.nextInt(10);
               l = random.nextInt(60) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 4, 20, 1)).generate(world, random, il, l, k);
               l = random.nextInt(25) + 4;
               (new WorldGenMinable(forgottennature.newStonesID, 4, 20, 1)).generate(world, random, il, l, k);
            }
         }

         if(biomeRain > 0.8F && biomeTemp > 0.5F && !(biome instanceof BiomeGenSwamp) && random.nextInt(2) == 0) {
            for(tree = 0; tree < 3; ++tree) {
               k = i + random.nextInt(14) + 8;
               l = j + random.nextInt(14) + 8;
               il = world.getHeightValue(k, l);
               if(world.getBlockId(k, il - 1, l) == Block.grass.blockID && forgottennature.bambooGeneration) {
                  world.setBlock(k, il, l, forgottennature.hempCottonBambooCornID, 8, 2);
               }
            }
         }

         genCedar var25;
         genEverBush var24;
         if(biomeTemp == 0.0F && biomeRain == 0.8F) {
            if(random.nextInt(20) == 0 && forgottennature.cedar) {
               var25 = new genCedar(forgottennature.leafIDindex + 2, 5, forgottennature.logIDindex + 1, 2);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var25.generate(world, random, k, il, l);
            }

            if(random.nextInt(9) == 0 && forgottennature.everBush) {
               var24 = new genEverBush(forgottennature.leafIDindex + 2, 2, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var24.generate(world, random, k, il, l);
            }
         }

         if(biome instanceof BiomeGenBeach) {
            genPalm var22;
            if(random.nextInt(7) == 0 && forgottennature.palm) {
               var22 = new genPalm(forgottennature.leafIDindex + 2, 3, forgottennature.logIDindex, 14);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var22.generate(world, random, k, il, l);
            }

            if(random.nextInt(7) == 0 && forgottennature.banana) {
               var22 = new genPalm(forgottennature.leafIDindex + 3, 5, forgottennature.logIDindex + 2, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var22.generate(world, random, k, il, l);
            }
         }

         if(biome instanceof BiomeGenDesert) {
            if(random.nextInt(45) == 0 && forgottennature.DesertIronwood) {
               genDesertTree var34 = new genDesertTree(forgottennature.leafIDindex, 6, forgottennature.logIDindex, 2);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var34.generate(world, random, k, il, l);
            }

            if(random.nextInt(50) == 0 && forgottennature.Joshua) {
               genJoshua var36 = new genJoshua(forgottennature.leafIDindex + 1, 7, forgottennature.logIDindex, 10);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var36.generate(world, random, k, il, l);
            }

            if(random.nextInt(51) == 0 && forgottennature.dWillow) {
               genDWillow var38 = new genDWillow(forgottennature.leafIDindex + 2, 4, forgottennature.logIDindex + 1, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var38.generate(world, random, k, il, l);
            }
         }

         if(biome instanceof BiomeGenPlains) {
            if(random.nextInt(12) == 0 && forgottennature.Cypress) {
               genCypress var28 = new genCypress(forgottennature.leafIDindex, 5, 17, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var28.generate(world, random, k, il, l);
            }

            if(random.nextInt(14) == 0 && forgottennature.poplar) {
               tree = 2 + random.nextInt(6);
               genPoplar tree1 = new genPoplar(forgottennature.leafIDindex + 2, 7, 17, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               tree1.generate(world, random, k, il, l);
            }

            if(random.nextInt(24) == 0 && forgottennature.Acacia) {
               genAcacia var30 = new genAcacia(forgottennature.leafIDindex + 1, 6, forgottennature.logIDindex, 8);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var30.generate(world, random, k, il, l);
            }

            if(random.nextInt(60) == 0 && forgottennature.Fig) {
               genFig var32 = new genFig(forgottennature.leafIDindex, 4, 0, 2);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var32.generate(world, random, k, il, l);
            }
         }

         genFruitBush var42;
         if(biome instanceof BiomeGenHills && random.nextInt(40) == 0 && forgottennature.huckleberry) {
            var42 = new genFruitBush(forgottennature.leafIDindex + 5, 0, 0);
            k = i + random.nextInt(12) + 8;
            l = j + random.nextInt(12) + 8;
            il = world.getHeightValue(k, l);
            var42.generate(world, random, k, il, l);
         }

         genCherry var49;
         if(biome instanceof BiomeGenForest) {
            if(random.nextInt(80) == 0 && forgottennature.bukkit) {
               genBukkit var44 = new genBukkit(forgottennature.leafIDindex + 3, 4, forgottennature.logIDindex + 2, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var44.generate(world, random, k, il, l);
            }

            if(random.nextInt(30) == 0 && forgottennature.raspberry) {
               var42 = new genFruitBush(forgottennature.leafIDindex + 4, 3, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var42.generate(world, random, k, il, l);
            }

            if(random.nextInt(30) == 0 && forgottennature.blueberry) {
               var42 = new genFruitBush(forgottennature.leafIDindex + 4, 1, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var42.generate(world, random, k, il, l);
            }

            if(random.nextInt(30) == 0 && forgottennature.blackberry) {
               var42 = new genFruitBush(forgottennature.leafIDindex + 4, 5, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var42.generate(world, random, k, il, l);
            }

            genFruit var40;
            if(random.nextInt(40) == 0 && forgottennature.Apple) {
               var40 = new genFruit(true, forgottennature.leafIDindex + 1, 3, 17, 0, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var40.generate(world, random, k, il, l);
            }

            if(random.nextInt(40) == 0 && forgottennature.orange) {
               var40 = new genFruit(false, forgottennature.leafIDindex + 3, 6, forgottennature.logIDindex + 2, 2, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var40.generate(world, random, k, il, l);
            }

            if(random.nextInt(40) == 0 && forgottennature.peach) {
               var40 = new genFruit(false, forgottennature.leafIDindex + 3, 7, forgottennature.logIDindex + 2, 3, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var40.generate(world, random, k, il, l);
            }

            if(random.nextInt(40) == 0 && forgottennature.lemon) {
               var40 = new genFruit(false, forgottennature.leafIDindex + 4, 0, forgottennature.logIDindex + 2, 4, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var40.generate(world, random, k, il, l);
            }

            if(random.nextInt(41) == 0 && forgottennature.Cherry) {
               var49 = new genCherry(forgottennature.leafIDindex + 1, 1, forgottennature.logIDindex, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var49.generate(world, random, k, il, l);
            }

            if(random.nextInt(42) == 0 && forgottennature.Jacaranda) {
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
               k = i + random.nextInt(18);
               l = j + random.nextInt(18);
               il = world.getHeightValue(k, l);
               (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
               k = i + random.nextInt(18);
               l = j + random.nextInt(18);
               il = world.getHeightValue(k, l);
               (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
               k = i + random.nextInt(18);
               l = j + random.nextInt(18);
               il = world.getHeightValue(k, l);
               (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
            }

            if(random.nextInt(50) == 0 && forgottennature.Eucalyptus) {
               genEucalyptus var55 = new genEucalyptus(forgottennature.leafIDindex, 7, forgottennature.logIDindex, 4);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var55.generate(world, random, k, il, l);
            }

            if(random.nextInt(50) == 0 && forgottennature.wTopEucalyptus) {
               genWTEucalyptus var53 = new genWTEucalyptus(forgottennature.leafIDindex + 3, 3, forgottennature.logIDindex + 1, 14);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var53.generate(world, random, k, il, l);
            }

            if(random.nextInt(50) == 0 && forgottennature.walnut) {
               genWalnut var46 = new genWalnut(forgottennature.leafIDindex + 3, 1, forgottennature.logIDindex + 1, 8);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var46.generate(world, random, k, il, l);
            }

            if(random.nextInt(50) == 0 && forgottennature.beech) {
               genBeech var45 = new genBeech(forgottennature.leafIDindex + 3, 0, forgottennature.logIDindex + 1, 6);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var45.generate(world, random, k, il, l);
            }

            if(random.nextInt(51) == 0 && forgottennature.ginkgo) {
               genGinkgo var48 = new genGinkgo(forgottennature.leafIDindex + 2, 6, forgottennature.logIDindex + 1, 4);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var48.generate(world, random, k, il, l);
            }

            if(random.nextInt(10) == 0 && forgottennature.decBush) {
               genDecBush var47 = new genDecBush(forgottennature.leafIDindex + 2, 1, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var47.generate(world, random, k, il, l);
            }

            if(random.nextInt(200) == 0 && forgottennature.AngelOak) {
               genAngel var57 = new genAngel(forgottennature.leafIDindex, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var57.generate(world, random, k, il, l);
            }
         }

         if(biome instanceof BiomeGenSwamp && random.nextInt(55) == 0 && forgottennature.Willow) {
            tree = 2 + random.nextInt(6);
            genWillow var21 = new genWillow(forgottennature.leafIDindex + 2, 0, forgottennature.logIDindex, 12, tree);
            k = i + random.nextInt(12) + 8;
            l = j + random.nextInt(12) + 8;
            il = world.getHeightValue(k, l);
            var21.generate(world, random, k, il, l);
         }

         if(biome instanceof BiomeGenTaiga) {
            if(random.nextInt(20) == 0 && forgottennature.RedMaple) {
               var49 = new genCherry(forgottennature.leafIDindex, 0, 17, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var49.generate(world, random, k, il, l);
            } else if(random.nextInt(20) == 0 && forgottennature.YellowMaple) {
               var49 = new genCherry(forgottennature.leafIDindex, 2, 17, 0);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var49.generate(world, random, k, il, l);
            }

            if(random.nextInt(150) == 0 && forgottennature.Sequoia) {
               genSequoia var56 = new genSequoia(forgottennature.leafIDindex + 1, 0, forgottennature.logIDindex, 6);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var56.generate(world, random, k, il, l);
            } else if(random.nextInt(15) == 0 && forgottennature.cedar) {
               var25 = new genCedar(forgottennature.leafIDindex + 2, 5, forgottennature.logIDindex + 1, 2);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var25.generate(world, random, k, il, l);
            }

            if(random.nextInt(9) == 0 && forgottennature.everBush) {
               var24 = new genEverBush(forgottennature.leafIDindex + 2, 2, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               il = world.getHeightValue(k, l);
               var24.generate(world, random, k, il, l);
            }
         }

         if(biome instanceof BiomeGenCrystalForest) {
            int var26;
            for(tree = 0; tree < 2; ++tree) {
               byte blackOrBlue;
               if(random.nextInt(60) == 0) {
                  blackOrBlue = 1;
               } else {
                  blackOrBlue = 0;
               }

               for(var26 = 0; var26 < 15; ++var26) {
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  if(world.getBlockId(k, il - 1, l) == Block.grass.blockID || world.getBlockId(k, il - 1, l) == forgottennature.groundID) {
                     world.setBlock(k, il, l, forgottennature.crystalStoneID, blackOrBlue, 2);
                  }
               }
            }

            byte var58 = 2;
            if(random.nextInt(25) == 0) {
               var58 = 4;
               if(random.nextInt(20) == 0) {
                  var58 = 8;
               }
            }

            for(var26 = 0; var26 <= forgottennature.newTreePerChunkCount; ++var26) {
               genCrystal tree2;
               if(random.nextInt(20) > 0) {
                  tree2 = new genCrystal(forgottennature.leafIDindex + 6, 1, forgottennature.crystalWoodID, 0, var58);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  tree2.generate(world, random, k, il, l);
               } else if(random.nextInt(20) > 0) {
                  tree2 = new genCrystal(forgottennature.leafIDindex + 6, 0, forgottennature.crystalWoodID, 1, var58);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  tree2.generate(world, random, k, il, l);
               }

               if(forgottennature.crystalMushrooms && random.nextInt(80) == 0) {
                  genCrystalMushroom var23 = new genCrystalMushroom(0);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var23.generate(world, random, k, il, l);
               }
            }

            for(var26 = 0; var26 < 15; ++var26) {
               il = i + random.nextInt(10);
               k = j + random.nextInt(10);
               l = random.nextInt(64) + 4;
               (new WorldGenMinable(forgottennature.blockCrystalID, 2)).generate(world, random, il, l, k);
               l = random.nextInt(25) + 4;
               (new WorldGenMinable(forgottennature.blockCrystalID, 2)).generate(world, random, il, l, k);
            }
         }

         if(biome instanceof BiomeGenNeoRedwoodForest || biome instanceof BiomeGenNeoRedwoodForestHills || biome instanceof BiomeGenNeoRedwoodForestSnow || biome instanceof BiomeGenNeoRedwoodForestSnowHills) {
            for(tree = 0; tree <= forgottennature.newTreePerChunkCount; ++tree) {
               if(random.nextInt(10) == 0 && forgottennature.Sequoia) {
                  genSequoia var27 = new genSequoia(forgottennature.leafIDindex + 1, 0, forgottennature.logIDindex, 6);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var27.generate(world, random, k, il, l);
               } else if(random.nextInt(3) > 0 && forgottennature.cedar) {
                  genCedar var37 = new genCedar(forgottennature.leafIDindex + 2, 5, forgottennature.logIDindex + 1, 2);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var37.generate(world, random, k, il, l);
               } else if(forgottennature.everBush) {
                  genEverBush var35 = new genEverBush(forgottennature.leafIDindex + 2, 2, 1);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var35.generate(world, random, k, il, l);
               }
            }
         }

         if(biome instanceof BiomeGenTropicalForest || biome instanceof BiomeGenNeoTropicalForestHills) {
            for(tree = 0; tree <= forgottennature.newTreePerChunkCount; ++tree) {
               if(random.nextInt(30) == 0 && forgottennature.beech) {
                  genBeech var54 = new genBeech(forgottennature.leafIDindex + 3, 0, forgottennature.logIDindex + 1, 6);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var54.generate(world, random, k, il, l);
               } else if(random.nextInt(11) == 0 && forgottennature.wTopEucalyptus) {
                  genWTEucalyptus var50 = new genWTEucalyptus(forgottennature.leafIDindex + 3, 3, forgottennature.logIDindex + 1, 14);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var50.generate(world, random, k, il, l);
               } else if(random.nextInt(11) == 0 && forgottennature.Eucalyptus) {
                  genEucalyptus var51 = new genEucalyptus(forgottennature.leafIDindex, 7, forgottennature.logIDindex, 4);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var51.generate(world, random, k, il, l);
               } else if(random.nextInt(50) == 0 && forgottennature.bukkit) {
                  genBukkit var41 = new genBukkit(forgottennature.leafIDindex + 3, 4, forgottennature.logIDindex + 2, 0);
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  var41.generate(world, random, k, il, l);
               } else {
                  genFruitBush var39;
                  if(random.nextInt(30) == 0 && forgottennature.raspberry) {
                     var39 = new genFruitBush(forgottennature.leafIDindex + 4, 3, 0);
                     k = i + random.nextInt(12) + 8;
                     l = j + random.nextInt(12) + 8;
                     il = world.getHeightValue(k, l);
                     var39.generate(world, random, k, il, l);
                  } else if(random.nextInt(30) == 0 && forgottennature.blueberry) {
                     var39 = new genFruitBush(forgottennature.leafIDindex + 4, 1, 0);
                     k = i + random.nextInt(12) + 8;
                     l = j + random.nextInt(12) + 8;
                     il = world.getHeightValue(k, l);
                     var39.generate(world, random, k, il, l);
                  } else if(random.nextInt(30) == 0 && forgottennature.blackberry) {
                     var39 = new genFruitBush(forgottennature.leafIDindex + 4, 5, 0);
                     k = i + random.nextInt(12) + 8;
                     l = j + random.nextInt(12) + 8;
                     il = world.getHeightValue(k, l);
                     var39.generate(world, random, k, il, l);
                  } else {
                     genFruit var43;
                     if(random.nextInt(50) == 0 && forgottennature.Apple) {
                        var43 = new genFruit(true, forgottennature.leafIDindex + 1, 3, 17, 0, 1);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var43.generate(world, random, k, il, l);
                     } else if(random.nextInt(50) == 0 && forgottennature.orange) {
                        var43 = new genFruit(false, forgottennature.leafIDindex + 3, 6, forgottennature.logIDindex + 2, 2, 1);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var43.generate(world, random, k, il, l);
                     } else if(random.nextInt(50) == 0 && forgottennature.peach) {
                        var43 = new genFruit(false, forgottennature.leafIDindex + 3, 7, forgottennature.logIDindex + 2, 3, 1);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var43.generate(world, random, k, il, l);
                     } else if(random.nextInt(50) == 0 && forgottennature.lemon) {
                        var43 = new genFruit(false, forgottennature.leafIDindex + 4, 0, forgottennature.logIDindex + 2, 4, 1);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var43.generate(world, random, k, il, l);
                     } else if(random.nextInt(50) == 0 && forgottennature.Cherry) {
                        genCherry var33 = new genCherry(forgottennature.leafIDindex + 1, 1, forgottennature.logIDindex, 0);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var33.generate(world, random, k, il, l);
                     } else if(random.nextInt(61) == 0 && forgottennature.walnut) {
                        genWalnut var31 = new genWalnut(forgottennature.leafIDindex + 3, 1, forgottennature.logIDindex + 1, 8);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var31.generate(world, random, k, il, l);
                     } else if(random.nextInt(60) == 0 && forgottennature.ginkgo) {
                        genGinkgo var29 = new genGinkgo(forgottennature.leafIDindex + 2, 6, forgottennature.logIDindex + 1, 4);
                        k = i + random.nextInt(12) + 8;
                        l = j + random.nextInt(12) + 8;
                        il = world.getHeightValue(k, l);
                        var29.generate(world, random, k, il, l);
                     }
                  }
               }

               if(random.nextInt(42) == 0 && forgottennature.Jacaranda) {
                  k = i + random.nextInt(12) + 8;
                  l = j + random.nextInt(12) + 8;
                  il = world.getHeightValue(k, l);
                  (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
                  k = i + random.nextInt(18);
                  l = j + random.nextInt(18);
                  il = world.getHeightValue(k, l);
                  (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
                  k = i + random.nextInt(18);
                  l = j + random.nextInt(18);
                  il = world.getHeightValue(k, l);
                  (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
                  k = i + random.nextInt(18);
                  l = j + random.nextInt(18);
                  il = world.getHeightValue(k, l);
                  (new genCherry(forgottennature.leafIDindex, 3, 17, 0)).generate(world, random, k, il, l);
               } else if(forgottennature.decBush) {
                  genDecBush var52 = new genDecBush(forgottennature.leafIDindex + 2, 1, 0);
                  k = i + random.nextInt(18) + 6;
                  l = j + random.nextInt(18) + 6;
                  il = world.getHeightValue(k, l);
                  var52.generate(world, random, k, il, l);
               }
            }
         }

         if(biome instanceof BiomeGenHell) {
            genNetherTree var61;
            byte var60;
            if(random.nextInt(15) == 0) {
               var61 = new genNetherTree(0, 0, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               var60 = 80;
               var61.generate(world, random, k, var60, l);
            } else if(random.nextInt(15) == 0) {
               var61 = new genNetherTree(1, 1, 1);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               var60 = 80;
               var61.generate(world, random, k, var60, l);
            } else if(random.nextInt(15) == 0) {
               genNetherMushroom var59 = new genNetherMushroom(forgottennature.logIDindex + 4);
               k = i + random.nextInt(12) + 8;
               l = j + random.nextInt(12) + 8;
               var60 = 80;
               var59.generate(world, random, k, var60, l);
            }
         }
      }

   }
}
