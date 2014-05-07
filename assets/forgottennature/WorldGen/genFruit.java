package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genFruit extends WorldGenerator {

   int leaf;
   int leafmeta;
   int I;
   int log;
   int logmeta;
   boolean flower;


   public genFruit(boolean flag, int i, int j, int k, int l, int is) {
      this.flower = flag;
      this.leaf = i;
      this.leafmeta = j;
      this.log = k;
      this.logmeta = l;
      this.I = is;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else if(this.I == 0) {
         return false;
      } else {
         int l = random.nextInt(3) + 4;
         if(j >= 1 && j + l + 1 <= 256) {
            int met = world.getBlockId(i, j - 1, k);
            if((met == Block.grass.blockID || met == Block.dirt.blockID) && j < 256 - l - 1) {
               world.setBlock(i, j - 1, k, Block.dirt.blockID, 0, 2);

               int j3;
               for(j3 = 0; j3 < l; ++j3) {
                  world.setBlock(i, j + j3, k, this.log, this.logmeta, 2);
                  if(j3 == l - 1) {
                     genLeaves(world, random, this.flower, i, j + j3, k, this.leaf, this.leafmeta);
                  }
               }

               for(j3 = 0; j3 <= 1; ++j3) {
                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }

                  if(random.nextInt(8) == 0) {
                     branches(world, random, this.flower, i, j + j3, k, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static void branches(World world, Random random, boolean flower, int ii, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      for(int br = 0; br < 4; ++br) {
         if(iD == -1 && random.nextInt(2) == 0) {
            --ii;
         }

         if(iD == 1 && random.nextInt(2) == 0) {
            ++ii;
         }

         if(kD == -1 && random.nextInt(2) == 0) {
            --kk;
         }

         if(kD == 1 && random.nextInt(2) == 0) {
            ++kk;
         }

         world.setBlock(ii, jj, kk, log, logmeta, 2);
         if(br == 3) {
            genLeaves(world, random, flower, ii, jj, kk, leaf, leafmeta);
         }

         ++jj;
      }

   }

   public static void genLeaves(World world, Random random, boolean flower, int i3, int j3, int k3, int leaf, int leafmeta) {
      for(int x = -2; x <= 2; ++x) {
         for(int y = -2; y <= 2; ++y) {
            if((Math.abs(x) != 2 || Math.abs(y) != 2) && world.getBlockId(i3 + x, j3, k3 + y) == 0) {
               if(random.nextInt(4) > 0 | !flower) {
                  world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta, 2);
               } else {
                  world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta + 1, 2);
               }
            }

            if(Math.abs(x) < 2 && Math.abs(y) < 2 && (Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i3 + x, j3 + 1, k3 + y) == 0) {
               if(random.nextInt(4) > 0 | !flower) {
                  world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta, 2);
               } else {
                  world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta + 1, 2);
               }
            }
         }
      }

   }
}
