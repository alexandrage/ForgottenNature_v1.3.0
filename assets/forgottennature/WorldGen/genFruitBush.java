package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genFruitBush extends WorldGenerator {

   int leaf;
   int leafmeta;
   int logmeta;


   public genFruitBush(int i, int j, int k) {
      this.leaf = i;
      this.leafmeta = j;
      this.logmeta = k;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else {
         int met = world.getBlockId(i, j, k);

         do {
            if(!(met != 3 & met != 2)) {
               world.setBlock(i, j, k, 3, 0, 2);
               int j1 = j + 1;
               world.setBlock(i, j1, k, 17, 0, 2);
               leafGen(world, random, 2, i, j1, k, this.leaf, this.leafmeta);
               return true;
            }

            --j;
            met = world.getBlockId(i, j, k);
         } while(!(met == 8 | met == 9 | met == 1));

         return false;
      }
   }

   public static void leafGen(World world, Random random, int var, int i3, int j3, int k3, int leaf, int leafmeta) {
      byte fruit = 0;

      for(int x = -var; x <= var; ++x) {
         for(int y = -var; y <= var; ++y) {
            if(random.nextInt(4) == 0) {
               fruit = 1;
            }

            if((Math.abs(x) != var || Math.abs(y) != var) && (Math.abs(x) != var - 1 || Math.abs(y) != var) && (Math.abs(x) != var || Math.abs(y) != var - 1) && world.getBlockId(i3 + x, j3, k3 + y) == 0) {
               world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta + fruit, 2);
            }

            fruit = 0;
            if(random.nextInt(4) == 0) {
               fruit = 1;
            }

            if(Math.abs(x) < var && Math.abs(y) < var && (Math.abs(x) != var - 1 || Math.abs(y) != var - 1)) {
               if(world.getBlockId(i3 + x, j3 + 1, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta + fruit, 2);
               }

               if(world.getBlockId(i3 + x, j3 - 1, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 - 1, k3 + y, leaf, leafmeta + fruit, 2);
               }
            }

            fruit = 0;
         }
      }

   }
}
