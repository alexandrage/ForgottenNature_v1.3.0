package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genDWillow extends WorldGenerator {

   int leaf;
   int leafmeta;
   int log;
   int logmeta;


   public genDWillow(int i, int j, int k, int l) {
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

         while(met != 3 & met != 2 && met != 12) {
            --j;
            met = world.getBlockId(i, j, k);
            if(met == 8 | met == 9 | met == 1) {
               return false;
            }
         }

         int j1 = j + 1;
         int hl;
         int h;
         if(random.nextInt(10) > 0) {
            hl = random.nextInt(3) + 5;
            world.setBlock(i, j1 - 1, k, 3, 0, 2);

            for(h = 0; h <= hl; ++h) {
               if(world.getBlockId(i1, j1 + h, k1) == 0) {
                  world.setBlock(i1, j1 + h, k1, this.log, this.logmeta, 2);
               }

               if(h == hl - 2) {
                  branch(world, random, 2, i1, j1, h, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  branch(world, random, 2, i1, j1, h, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  branch(world, random, 2, i1, j1, h, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  branch(world, random, 2, i1, j1, h, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(h > 1 & h < hl) {
                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(5) == 0) {
                     branch(world, random, hl, i1, j1, h, k1, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }
               }
            }
         } else {
            h = random.nextInt(7) + 7;
            world.setBlock(i, j1 - 1, k, 3, 0, 2);

            for(int jj = 0; jj <= h; ++jj) {
               if(jj == h - 2) {
                  branch(world, random, 2, i1, j1, jj, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  branch(world, random, 2, i1, j1, jj, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  branch(world, random, 2, i1, j1, jj, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  branch(world, random, 2, i1, j1, jj, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(world.getBlockId(i1, j1 + jj, k1) == 0) {
                  world.setBlock(i1, j1 + jj, k1, this.log, this.logmeta, 2);
               }

               if(jj > 1 & jj < h) {
                  hl = h / jj + 1;
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
         }

         return true;
      }
   }

   public static void branch(World world, Random random, int H, int ii, int j, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      int index = 0;

      for(jj += j; index <= H; ++index) {
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

         if(random.nextInt(3) > 0) {
            ++jj;
         }

         if(index == H || random.nextInt(6) == 0) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
            leafGen(world, ii, jj, kk, leaf, leafmeta);
         }
      }

   }

   public static void leafGen(World world, int i3, int j3, int k3, int leaf, int leafmeta) {
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
