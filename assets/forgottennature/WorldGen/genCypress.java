package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genCypress extends WorldGenerator {

   int leaf;
   int leafmeta;
   int log;
   int logmeta;


   public genCypress(int i, int j, int k, int l) {
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
         byte h1 = 0;
         byte h2 = 0;
         byte h3 = 0;
         byte hight = 1;
         if(random.nextInt(7) < 2) {
            h1 = 1;
         }

         if(random.nextInt(7) < 2) {
            h2 = 1;
         }

         if(random.nextInt(2) == 0) {
            h3 = 1;
         }

         int var17 = hight + h1 + h2 + h3;
         int met = world.getBlockId(i, j, k);

         do {
            if(!(met != 3 & met != 2)) {
               world.setBlock(i, j, k, 3, 0, 2);
               int j1 = j + 1;

               for(int jn = 0; jn <= 4 * var17 + 1; ++jn) {
                  if(jn != 4 * var17 + 1) {
                     world.setBlock(i1, j1 + jn, k1, this.log, this.logmeta, 2);
                  }

                  int x;
                  int y;
                  if(var17 == 1 && jn >= 1) {
                     for(x = -1; x <= 1; ++x) {
                        for(y = -1; y <= 1; ++y) {
                           if((Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }
                        }
                     }
                  }

                  if(var17 == 2 && jn >= 1) {
                     for(x = -2; x <= 2; ++x) {
                        for(y = -2; y <= 2; ++y) {
                           if(Math.abs(x) <= 1 && Math.abs(y) <= 1 && (Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }

                           if(Math.abs(x) <= 1 && Math.abs(y) <= 1 && jn == 7 && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }

                           if((Math.abs(x) != 2 || Math.abs(y) != 2) && (Math.abs(x) != 2 || Math.abs(y) != 1) && (Math.abs(x) != 1 || Math.abs(y) != 2) && jn <= 6 && jn >= 2 && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }
                        }
                     }
                  }

                  if(var17 == 3 & jn >= 1) {
                     for(x = -2; x <= 2; ++x) {
                        for(y = -2; y <= 2; ++y) {
                           if(Math.abs(x) <= 1 && Math.abs(y) <= 1 && (Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }

                           if((Math.abs(x) != 2 || Math.abs(y) != 2) && (Math.abs(x) != 2 || Math.abs(y) != 1) && (Math.abs(x) != 1 || Math.abs(y) != 2) && jn <= 10 && jn >= 2 && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }
                        }
                     }
                  }

                  if(var17 == 4 & jn >= 1) {
                     for(x = -3; x <= 3; ++x) {
                        for(y = -3; y <= 3; ++y) {
                           if(Math.abs(x) <= 1 && Math.abs(y) <= 1 && (Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }

                           if(Math.abs(x) <= 1 && Math.abs(y) <= 1 && jn <= 14 && jn >= 2 && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }

                           if(Math.abs(x) <= 2 && Math.abs(y) <= 2 && (Math.abs(x) != 2 || Math.abs(y) != 2) && jn == 12 | jn == 11 | jn == 3 && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }

                           if((Math.abs(x) != 3 || Math.abs(y) != 3) && (Math.abs(x) != 3 || Math.abs(y) != 2) && (Math.abs(x) != 2 || Math.abs(y) != 3) && jn <= 10 && jn >= 4 && world.getBlockId(i1 + x, j1 + jn, k1 + y) == 0) {
                              world.setBlock(i1 + x, j1 + jn, k1 + y, this.leaf, this.leafmeta, 2);
                           }
                        }
                     }
                  }

                  if(jn == 4 * var17 + 1) {
                     world.setBlock(i1, j1 + jn + 1, k1, this.leaf, this.leafmeta, 2);
                  }

                  if(jn == 4 * var17 + 1 && (var17 == 4 || var17 == 3)) {
                     world.setBlock(i1, j1 + jn + 2, k1, this.leaf, this.leafmeta, 2);
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
}
