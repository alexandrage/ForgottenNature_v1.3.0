package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genBeech extends WorldGenerator {

   int leaf;
   int leafmeta;
   int log;
   int logmeta;


   public genBeech(int i, int j, int k, int l) {
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
               int h = random.nextInt(15) + 6;
               world.setBlock(i, j1 - 1, k, 3, 0, 2);

               for(int jj = 0; jj <= h; ++jj) {
                  world.setBlock(i1, j1 + jj, k1, this.log, this.logmeta, 2);
                  if(jj == h) {
                     leafGen(world, i1, j1 + jj, k1, this.leaf, this.leafmeta);
                  }

                  if(jj > 3 & jj < h) {
                     int hl = h / jj + 1;
                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(hl) == 0) {
                        branch(world, random, h, i1, j1, jj, k1, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }
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

   public static void branch(World world, Random random, int H, int ii, int j, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      int index = 0;
      int lengthToGo = H - jj;

      for(jj += j; index <= lengthToGo; ++index) {
         if(iD == -1 && random.nextInt(3) > 0) {
            --ii;
            if(kD == 0 && random.nextInt(4) == 0) {
               kk = kk + random.nextInt(3) - 1;
            }
         }

         if(iD == 1 && random.nextInt(3) > 0) {
            ++ii;
            if(kD == 0 && random.nextInt(4) == 0) {
               kk = kk + random.nextInt(3) - 1;
            }
         }

         if(kD == -1 && random.nextInt(3) > 0) {
            --kk;
            if(iD == 0 && random.nextInt(4) == 0) {
               ii = ii + random.nextInt(3) - 1;
            }
         }

         if(kD == 1 && random.nextInt(3) > 0) {
            ++kk;
            if(iD == 0 && random.nextInt(4) == 0) {
               ii = ii + random.nextInt(3) - 1;
            }
         }

         if(world.getBlockId(ii, j + jj, kk) == 0 || world.getBlockId(ii, j + jj, kk) == leaf) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
         }

         if(random.nextInt(3) == 0) {
            leafGen(world, ii, jj, kk, leaf, leafmeta);
         }

         if(random.nextInt(3) > 0) {
            ++jj;
         }

         if(index == lengthToGo) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
            leafGen(world, ii, jj, kk, leaf, leafmeta);
         }
      }

   }

   public static void leafGen(World world, int i3, int j3, int k3, int leaf, int leafmeta) {
      for(int x = -3; x <= 3; ++x) {
         for(int y = -3; y <= 3; ++y) {
            if((Math.abs(x) != 3 || Math.abs(y) != 3) && (Math.abs(x) != 2 || Math.abs(y) != 3) && (Math.abs(x) != 3 || Math.abs(y) != 2) && world.getBlockId(i3 + x, j3, k3 + y) == 0) {
               world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta, 2);
            }

            if(Math.abs(x) < 3 && Math.abs(y) < 3 && (Math.abs(x) != 2 || Math.abs(y) != 2)) {
               if(world.getBlockId(i3 + x, j3 + 1, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta, 2);
               }

               if(world.getBlockId(i3 + x, j3 - 1, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 - 1, k3 + y, leaf, leafmeta, 2);
               }
            }

            if(Math.abs(x) + Math.abs(y) < 2) {
               if(world.getBlockId(i3 + x, j3 + 2, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 + 2, k3 + y, leaf, leafmeta, 2);
               }

               if(world.getBlockId(i3 + x, j3 - 2, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 - 2, k3 + y, leaf, leafmeta, 2);
               }
            }
         }
      }

   }
}
