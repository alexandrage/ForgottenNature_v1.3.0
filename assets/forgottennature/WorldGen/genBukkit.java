package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genBukkit extends WorldGenerator {

   int leaf;
   int leafmeta;
   int log;
   int logmeta;


   public genBukkit(int i, int j, int k, int l) {
      this.leaf = i;
      this.leafmeta = j;
      this.log = k;
      this.logmeta = l;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else {
         int i1 = i;
         int k1 = k;
         int met = world.getBlockId(i, j, k);

         do {
            if(!(met != 3 & met != 2)) {
               int j1 = j + 1;
               int h = 10 + random.nextInt(5);
               world.setBlock(i, j1 - 1, k, 3, 0, 2);

               for(int jj = 0; jj <= h; ++jj) {
                  world.setBlock(i1, j1 + jj, k1, this.log, this.logmeta, 2);
                  if(jj == h) {
                     branch(world, random, i1, j1, jj, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     branch(world, random, i1, j1, jj, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     branch(world, random, i1, j1, jj, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     branch(world, random, i1, j1, jj, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }
               }

               return true;
            }

            --j;
            met = world.getBlockId(i, j, k);
         } while(!(met == 8 | met == 9 | met == 1));

         return false;
      }
   }

   public static void branch(World world, Random random, int ii, int j, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      int diff = random.nextInt(3) - 1;
      int index = 0;

      for(jj += j; index <= 6 + diff; ++index) {
         if(iD == -1) {
            --ii;
         }

         if(iD == 1) {
            ++ii;
         }

         if(kD == -1) {
            --kk;
         }

         if(kD == 1) {
            ++kk;
         }

         if(world.getBlockId(ii, j + jj, kk) == 0 || world.getBlockId(ii, j + jj, kk) == leaf) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
         }

         ++jj;
         if(index == 6 + diff) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
            extraWood(world, iD, kD, ii, jj, kk, log, logmeta, leaf, leafmeta);
            leafGen(world, ii, jj, kk, leaf, leafmeta);
         }
      }

   }

   public static void leafGen(World world, int i3, int j3, int k3, int leaf, int leafmeta) {
      for(int x = -5; x <= 5; ++x) {
         for(int y = -5; y <= 5; ++y) {
            if(Math.abs(x) + Math.abs(y) < 7 && world.getBlockId(i3 + x, j3, k3 + y) == 0) {
               world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta, 2);
            }

            if(Math.abs(x) < 5 && Math.abs(y) < 5 && Math.abs(x) + Math.abs(y) < 6) {
               if(world.getBlockId(i3 + x, j3 + 1, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta, 2);
               }

               if(world.getBlockId(i3 + x, j3 - 1, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 - 1, k3 + y, leaf, leafmeta, 2);
               }
            }
         }
      }

   }

   public static void extraWood(World world, int iD, int kD, int ii, int jj, int kk, int log, int logmeta, int leaf, int leafmeta) {
      for(int x = -2; x <= 2; ++x) {
         for(int y = -2; y <= 2; ++y) {
            if(y != 0 && x == 0 || y == 0 && x != 0) {
               world.setBlock(ii + x, jj, kk + y, log, logmeta, 2);
            }
         }
      }

      if(iD == 1) {
         world.setBlock(ii - 3, jj, kk, log, logmeta, 2);
         world.setBlock(ii - 4, jj, kk, log, logmeta, 2);
         leafGen(world, ii - 7, jj, kk, leaf, leafmeta);
      }

      if(iD == -1) {
         world.setBlock(ii + 3, jj, kk, log, logmeta, 2);
         world.setBlock(ii + 4, jj, kk, log, logmeta, 2);
      }

      if(kD == 1) {
         world.setBlock(ii, jj, kk - 3, log, logmeta, 2);
         world.setBlock(ii, jj, kk - 4, log, logmeta, 2);
      }

      if(kD == -1) {
         world.setBlock(ii, jj, kk + 3, log, logmeta, 2);
         world.setBlock(ii, jj, kk + 4, log, logmeta, 2);
      }

   }
}
