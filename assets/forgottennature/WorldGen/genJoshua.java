package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genJoshua extends WorldGenerator {

   int leaf;
   int leafmeta;
   int logmeta;
   int log;


   public genJoshua(int i, int j, int k, int l) {
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
            if(!(met != 3 & met != 2 & met != 12)) {
               int j1 = j + 1;
               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, -1, 0, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 1, 0, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 0, -1, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 0, 1, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, -1, 1, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, -1, -1, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 1, 1, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 1, -1, this.log, this.logmeta);
               }

               rootGen(world, random, i, j, k, 0, 0, this.log, this.logmeta);
               int h = random.nextInt(3) + 5;
               world.setBlock(i, j1 - 1, k, this.log, this.logmeta, 2);

               for(int jj = j1; jj <= j1 + h; ++jj) {
                  world.setBlock(i1, jj, k1, this.log, this.logmeta, 2);
                  if(jj == j1 + h) {
                     leafGen(world, i1, jj, k1, this.leaf, this.leafmeta);
                  }

                  if(jj - j1 >= h / 2) {
                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branch(world, random, i1, jj, k1, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
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

   public static void branch(World world, Random random, int ii, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      for(int br = 0; br < 4; ++br) {
         if(iD == -1 && random.nextInt(3) > 0) {
            --ii;
         }

         if(iD == 1 && random.nextInt(3) > 0) {
            ++ii;
         }

         if(kD == -1 && random.nextInt(3) > 0) {
            --kk;
         }

         if(kD == 1 && random.nextInt(3) > 0) {
            ++kk;
         }

         if(world.getBlockId(ii, jj, kk) == 0 || world.getBlockId(ii, jj, kk) == leaf) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
         }

         if(random.nextInt(2) == 0) {
            ++jj;
         }

         if(br == 3 || random.nextInt(3) == 0) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
            leafGen(world, ii, jj, kk, leaf, leafmeta);
         }
      }

   }

   public static void leafGen(World world, int i3, int j3, int k3, int leaf, int leafmeta) {
      for(int x = -1; x <= 1; ++x) {
         for(int y = -1; y <= 1; ++y) {
            for(int jh = -1; jh <= 1; ++jh) {
               if((Math.abs(x) != 1 || Math.abs(y) != 1) && (Math.abs(y) != 1 || Math.abs(jh) != 1) && (Math.abs(x) != 1 || Math.abs(jh) != 1) && world.getBlockId(i3 + x, j3 + jh, k3 + y) == 0) {
                  world.setBlock(i3 + x, j3 + jh, k3 + y, leaf, leafmeta, 2);
               }
            }
         }
      }

   }

   public static void rootGen(World world, Random random, int ii, int jj, int kk, int iD, int kD, int log, int logmeta) {
      for(int br = 0; br < 6; ++br) {
         if(iD == -1 && random.nextInt(3) == 0) {
            --ii;
         }

         if(iD == 1 && random.nextInt(3) == 0) {
            ++ii;
         }

         if(kD == -1 && random.nextInt(3) == 0) {
            --kk;
         }

         if(kD == 1 && random.nextInt(3) == 0) {
            ++kk;
         }

         --jj;
         int met = world.getBlockId(ii, jj, kk);
         if(met == 0 | met == 2 | met == 3 | met == 12 | met == 24) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
         }
      }

   }
}
