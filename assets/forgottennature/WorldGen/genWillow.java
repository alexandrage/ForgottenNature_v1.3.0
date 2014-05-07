package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genWillow extends WorldGenerator {

   int leaf;
   int leafmeta;
   int logmeta;
   int size;
   int log;


   public genWillow(int i, int j, int l, int k, int s) {
      this.leaf = i;
      this.leafmeta = j;
      this.log = l;
      this.logmeta = k;
      this.size = s;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else {
         this.size += random.nextInt(6);
         int i1 = i;
         int k1 = k;
         int met = world.getBlockId(i, j, k);

         while(true) {
            if(met != 3 && met != 2 && met != 1) {
               --j;
               met = world.getBlockId(i, j, k);
               if(met != 8 && met != 9 && met != 1) {
                  continue;
               }

               return false;
            }

            int j1 = j + 1;

            int g;
            for(g = -1; g <= 1; ++g) {
               for(int k2 = -1; k2 <= 1; ++k2) {
                  world.setBlock(i1 + g, j1 - 1, k1 + k2, 3, 0, 2);

                  for(int k3 = 0; k3 <= 4; ++k3) {
                     world.setBlock(i1 + g, j1 + k3, k1 + k2, this.log, this.logmeta, 2);
                  }
               }
            }

            for(g = 5; g <= 6 + this.size / 2; ++g) {
               world.setBlock(i1, j1 + g, k1, this.log, this.logmeta, 3);
            }

            mainBranch(world, random, i1 + 2, j1 + 4, k1 + 2, 1, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1 + 2, j1 + 4, k1, 1, 0, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1 + 1, j1 + 5, k1 + 1, 1, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1 + 1, j1 + 5, k1, 1, 0, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            innerInner(world, random, i1, j1 + 6 + this.size / 2, k1, 1, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1 + 2, j1 + 4, k1 - 2, 1, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1, j1 + 4, k1 - 2, 0, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1 + 1, j1 + 5, k1 - 1, 1, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1, j1 + 5, k1 - 1, 0, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            innerInner(world, random, i1, j1 + 6 + this.size / 2, k1, 1, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1 - 2, j1 + 4, k1 - 2, -1, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1 - 2, j1 + 4, k1, -1, 0, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1 - 1, j1 + 5, k1 - 1, -1, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1 - 1, j1 + 5, k1, -1, 0, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            innerInner(world, random, i1, j1 + 6 + this.size / 2, k1, -1, -1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1 - 2, j1 + 4, k1 + 2, -1, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            mainBranch(world, random, i1, j1 + 4, k1 + 2, 0, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1 - 1, j1 + 5, k1 + 1, -1, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            inner(world, random, i1, j1 + 5, k1 + 1, 0, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            innerInner(world, random, i1, j1 + 6 + this.size / 2, k1, -1, 1, this.size, this.leaf, this.leafmeta, this.log, this.logmeta);
            return true;
         }
      }
   }

   public static void mainBranch(World world, Random random, int i2, int j2, int k2, int iD, int kD, int size, int leaf, int leafmeta, int log, int logmeta) {
      byte a = 0;
      byte b = 0;
      byte c = 0;
      byte d = 0;
      byte bend = 0;
      int pos = 2 * size + size / 2;
      if(kD == 1 && iD == 0) {
         a = -1;
         b = 1;
         c = 1;
         d = 1;
      }

      if(kD == 1 && iD == -1) {
         a = -1;
         b = 0;
         c = 0;
         d = 1;
      }

      if(kD == 0 && iD == -1) {
         a = -1;
         b = 1;
         c = -1;
         d = -1;
      }

      if(kD == -1 && iD == -1) {
         a = -1;
         b = 0;
         c = 0;
         d = -1;
      }

      if(kD == -1 && iD == 0) {
         a = -1;
         b = -1;
         c = 1;
         d = -1;
      }

      if(kD == -1 && iD == 1) {
         a = 1;
         b = 0;
         c = 0;
         d = -1;
      }

      if(kD == 0 && iD == 1) {
         a = 1;
         b = 1;
         c = 1;
         d = -1;
      }

      if(kD == 1 && iD == 1) {
         a = 1;
         b = 1;
         c = -1;
         d = 1;
      }

      int ind = 0;

      while(ind < pos) {
         if(world.getBlockId(i2, j2, k2) == 0) {
            ;
         }

         world.setBlock(i2, j2, k2, log, logmeta, 2);
         world.setBlock(i2, j2 - 1, k2, log, logmeta, 2);
         if(iD == 0) {
            i2 = i2 + random.nextInt(3) - 1;
         }

         if(kD == 0) {
            k2 = k2 + random.nextInt(3) - 1;
         }

         if(kD == 1) {
            k2 += random.nextInt(2);
         }

         if(kD == -1) {
            k2 -= random.nextInt(2);
         }

         if(iD == 1) {
            i2 += random.nextInt(2);
         }

         if(iD == -1) {
            i2 -= random.nextInt(2);
         }

         if(bend == 0 && random.nextInt(3) == 0) {
            ++j2;
         }

         if(bend == 2 && random.nextInt(2) == 0) {
            --j2;
         }

         if(random.nextInt(24) == 0) {
            secFlag(world, random, i2, j2, k2, a, b, size, leaf, leafmeta, log, logmeta);
            secFlag(world, random, i2, j2, k2, c, d, size, leaf, leafmeta, log, logmeta);
         }

         if(ind == pos / 3) {
            bend = 1;
         }

         if(ind == 2 * pos / 3) {
            bend = 2;
         }

         ++ind;
         if(random.nextInt(4) > 0) {
            genWillowLeaves(world, random, i2, j2, k2, leaf, leafmeta);
            world.setBlock(i2, j2, k2, log, logmeta, 2);
         }
      }

   }

   public static void secFlag(World world, Random random, int i11, int j11, int k11, int iD, int kD, int size, int leaf, int leafmeta, int log, int logmeta) {
      for(int index0 = 0; index0 < 2 * size; ++index0) {
         j11 = j11 + random.nextInt(3) - 1;
         if(iD == 1) {
            i11 += random.nextInt(2);
         }

         if(iD == -1) {
            i11 -= random.nextInt(2);
         }

         if(iD == 0) {
            i11 = i11 + random.nextInt(3) - 1;
         }

         if(kD == 1) {
            k11 += random.nextInt(2);
         }

         if(kD == -1) {
            k11 -= random.nextInt(2);
         }

         if(kD == 0) {
            k11 = k11 + random.nextInt(3) - 1;
         }

         if(world.getBlockId(i11, j11, k11) == 0) {
            ;
         }

         world.setBlock(i11, j11, k11, log, logmeta, 2);
         if(random.nextInt(4) > 0) {
            world.setBlock(i11, j11, k11, log, logmeta, 2);
            genWillowLeaves(world, random, i11, j11, k11, leaf, leafmeta);
         }
      }

   }

   public static void inner(World world, Random random, int i3, int j3, int k3, int iD, int kD, int size, int leaf, int leafmeta, int log, int logmeta) {
      int pos = 2 * size;
      int index = 0;
      int jindex = 5;

      while(index < pos && jindex < 14) {
         if(world.getBlockId(i3, j3, k3) == 0) {
            ;
         }

         world.setBlock(i3, j3, k3, log, logmeta, 2);
         int rat = 1 + index / 4;
         if(random.nextInt(rat) == 0) {
            ++j3;
            ++jindex;
         }

         if(iD == 0) {
            i3 = i3 + random.nextInt(3) - 1;
         }

         if(kD == 0) {
            k3 = k3 + random.nextInt(3) - 1;
         }

         if(kD == 1) {
            k3 += random.nextInt(2);
         }

         if(kD == -1) {
            k3 -= random.nextInt(2);
         }

         if(iD == 1) {
            i3 += random.nextInt(2);
         }

         if(iD == -1) {
            i3 -= random.nextInt(2);
         }

         ++index;
         if(random.nextInt(4) > 0) {
            genWillowLeaves(world, random, i3, j3, k3, leaf, leafmeta);
            world.setBlock(i3, j3, k3, log, logmeta, 2);
         }
      }

   }

   public static void innerInner(World world, Random random, int i4, int j4, int k4, int iD, int kD, int size, int leaf, int leafmeta, int log, int logmeta) {
      int index1 = 0;
      int jindex1 = 6 + size / 2;

      while(index1 < 2 * size + 1 && jindex1 < 16) {
         world.setBlock(i4, j4, k4, log, logmeta, 2);
         ++j4;
         ++jindex1;
         if(random.nextInt(3) == 0) {
            if(iD == -1) {
               --i4;
            }

            if(iD == 1) {
               ++i4;
            }
         }

         if(random.nextInt(3) == 0) {
            if(kD == -1) {
               --k4;
            }

            if(kD == 1) {
               ++k4;
            }
         }

         ++index1;
         if(random.nextInt(4) > 0) {
            genWillowLeaves(world, random, i4, j4, k4, leaf, leafmeta);
            world.setBlock(i4, j4, k4, log, logmeta, 2);
         }
      }

   }

   public static void genWillowLeaves(World world, Random random, int i3, int j3, int k3, int leaf, int leafmeta) {
      world.setBlock(i3, j3 + 1, k3, leaf, leafmeta, 2);
      world.setBlock(i3, j3 + 2, k3, leaf, leafmeta, 2);

      for(int jh = 1; jh >= -2; --jh) {
         if(world.getBlockId(i3, j3 + jh - 1, k3) == 0) {
            world.setBlock(i3, j3 + jh - 1, k3, leaf, leafmeta, 2);
         }

         for(int x = -1; x <= 1; ++x) {
            for(int y = -1; y <= 1; ++y) {
               if(x != 0 | y != 0 && Math.abs(x) != 1 | Math.abs(y) != 1 && world.getBlockId(i3 + x, j3 + jh, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 + jh, k3 + y, leaf, leafmeta, 2);
               }
            }
         }
      }

   }
}
