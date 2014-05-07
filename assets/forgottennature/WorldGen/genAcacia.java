package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genAcacia extends WorldGenerator {

   int leaf;
   int leafmeta;
   int logmeta;
   int log;


   public genAcacia(int i, int j, int k, int l) {
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
               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               if(random.nextInt(3) == 0) {
                  rootGen(world, random, i, j, k, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
               }

               rootGen(world, random, i, j, k, 0, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
               int hl;
               int h;
               if(random.nextInt(10) < 9) {
                  hl = random.nextInt(3) + 5;
                  world.setBlock(i, j1 - 1, k, this.log, this.logmeta, 2);

                  for(h = 0; h <= hl; ++h) {
                     if(world.getBlockId(i1, j1 + h, k1) == 0) {
                        world.setBlock(i1, j1 + h, k1, this.log, this.logmeta, 2);
                     }

                     if(h == hl) {
                        leafGen(world, i1, j1 + h, k1, this.leaf, this.leafmeta);
                     }

                     if(h > 1 & h < hl) {
                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(6) == 0) {
                           branch(world, random, hl, i1, j1, h, k1, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }
                     }
                  }
               } else {
                  h = random.nextInt(7) + 7;
                  world.setBlock(i, j1 - 1, k, this.log, this.logmeta, 2);

                  for(int jj = 0; jj <= h; ++jj) {
                     if(world.getBlockId(i1, j1 + jj, k1) == 0) {
                        world.setBlock(i1, j1 + jj, k1, this.log, this.logmeta, 2);
                     }

                     if(jj == h) {
                        leafGen(world, i1, j1 + jj, k1, this.leaf, this.leafmeta);
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

            --j;
            met = world.getBlockId(i, j, k);
         } while(!(met == 8 | met == 9 | met == 1));

         return false;
      }
   }

   public static void branch(World world, Random random, int H, int ii, int j, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      int index = 0;
      int ind = j + H;
      jj += j;

      while(jj < ind) {
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

         if(jj == ind) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
            leafGen(world, ii, jj, kk, leaf, leafmeta);
         }

         ++index;
         if(index == 6) {
            int iiD = iD;
            int kkD = kD;
            if(iD == -1) {
               iiD = 1;
            }

            if(iD == 1) {
               iiD = -1;
            }

            if(kD == -1) {
               kkD = 1;
            }

            if(kD == 1) {
               kkD = -1;
            }

            branch(world, random, H, ii, j, jj - j, kk, iiD, kkD, leaf, leafmeta, log, logmeta);
         }
      }

   }

   public static void leafGen(World world, int i3, int j3, int k3, int leaf, int leafmeta) {
      for(int x = -3; x <= 3; ++x) {
         for(int y = -3; y <= 3; ++y) {
            if((Math.abs(x) != 3 || Math.abs(y) != 3) && (Math.abs(x) != 2 || Math.abs(y) != 3) && (Math.abs(x) != 3 || Math.abs(y) != 2) && world.getBlockId(i3 + x, j3, k3 + y) == 0) {
               world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta, 2);
            }

            if(Math.abs(x) < 3 && Math.abs(y) < 3 && (Math.abs(x) != 2 || Math.abs(y) != 2) && world.getBlockId(i3 + x, j3 + 1, k3 + y) == 0) {
               world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta, 2);
            }
         }
      }

   }

   public static void rootGen(World world, Random random, int ii, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
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

         int met = world.getBlockId(ii, jj, kk);
         if(met == 0 | met == 2 | met == 3 | met == 12 | met == 24) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
         }

         --jj;
      }

   }
}
