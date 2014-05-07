package assets.forgottennature.WorldGen;

import assets.forgottennature.forgottennature;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genNetherMushroom extends WorldGenerator {

   int block;


   public genNetherMushroom(int i) {
      this.block = i;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else {
         int l = random.nextInt(6) + 6;
         if(j >= 4 && j + l + 1 < 256) {
            int ID = world.getBlockId(i, j, k);

            do {
               if(ID == Block.netherrack.blockID) {
                  if(world.getBlockId(i, j + 1, k) != 0) {
                     return false;
                  }

                  ++j;
                  world.setBlock(i, j - 1, k, Block.netherrack.blockID, 0, 2);
                  boolean flag = false;
                  int l1 = 0;
                  genCap(world, random, i, j + l / 4 + 2, k, this.block, 13, l);

                  while(!flag && l1 < 6) {
                     world.setBlock(i - 1 * l1, j + l1, k, this.block, 2, 2);
                     world.setBlock(i + 1 * l1, j + l1, k, this.block, 2, 2);
                     world.setBlock(i, j + l1, k - 1 * l1, this.block, 2, 2);
                     world.setBlock(i, j + l1, k + 1 * l1, this.block, 2, 2);
                     ++l1;
                     if(world.getBlockId(i, j + l1, k + 1 * l1) == forgottennature.logIDindex + 4) {
                        flag = true;
                     }
                  }

                  return true;
               }

               --j;
               ID = world.getBlockId(i, j, k);
            } while(ID != 8 && ID != 9 && ID != 1 && ID != 7);

            return false;
         } else {
            return false;
         }
      }
   }

   public static void genCap(World world, Random random, int i3, int j3, int k3, int block, int blockmeta, int l) {
      int height = l / 6;
      int tier = 0;
      boolean x = false;
      ++j3;

      for(int z = 0; z <= random.nextInt(Math.abs(l / 2 - 2)) + 2; ++z) {
         for(int y = -height; y <= height; ++y) {
            for(int var14 = -height; var14 <= height; ++var14) {
               int mult = var14 * var14 + y * y;
               if(mult <= height * height && mult >= tier * tier && world.getBlockId(i3 + var14, j3 - z, k3 + y) == 0) {
                  world.setBlock(i3 + var14, j3 - z, k3 + y, block, blockmeta, 2);
               }

               if(var14 == height && y == var14) {
                  tier = var14;
               }
            }
         }

         if(height == l / 6) {
            height = l / 3;
         } else if(height == l / 3) {
            height = l / 2;
         } else if(height == l / 2) {
            height = l * 2 / 3;
         } else {
            height = l * 5 / 6;
         }
      }

   }
}
