package assets.forgottennature.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genSequoia extends WorldGenerator {

   int leaf;
   int leafmeta;
   int log;
   int logmeta;


   public genSequoia(int l, int lm, int i, int j) {
      this.leaf = l;
      this.leafmeta = lm;
      this.log = i;
      this.logmeta = j;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else {
         int l = random.nextInt(23) + 16;
         int ls = l - 4;
         byte byte0 = 1;
         int iin = i;
         int kin = k;
         byte sub = 1;
         boolean flag1 = false;
         boolean center = false;
         if(random.nextInt(4) == 0) {
            byte0 = 1;
            if(random.nextInt(3) == 0) {
               byte0 = 2;
            }
         } else {
            flag1 = true;
         }

         byte byte1 = byte0;
         int met = world.getBlockId(i + 1, j, k);
         if(met == 8 | met == 9) {
            return false;
         } else {
            met = world.getBlockId(i, j, k);

            do {
               if(!(met != 3 & met != 2)) {
                  if(met != 2 && met != 3) {
                     return false;
                  }

                  int i1 = j + 1;
                  int j3;
                  int k3;
                  int j2;
                  if(!flag1) {
                     for(j3 = -byte0; j3 <= byte0; ++j3) {
                        for(j2 = -byte0; j2 <= byte0; ++j2) {
                           if(j3 == byte0) {
                              world.setBlock(iin + j3, i1, kin + j2, 0, 0, 2);
                           }

                           world.setBlock(iin + j3, i1 - 1, kin + j2, 3, 0, 2);

                           for(k3 = 0; k3 <= l; ++k3) {
                              world.setBlock(iin + j3, i1 + k3, kin + j2, this.log, this.logmeta, 2);
                           }

                           if(byte0 == Math.abs(j3) && byte0 == Math.abs(j2) && byte0 != 1) {
                              for(k3 = l; k3 >= 0; --k3) {
                                 world.setBlock(iin + j3, i1 + k3, kin + j2, 0, 0, 2);
                                 if(k3 >= l / 2 && world.getBlockId(iin + j3, i1 + k3, kin + j2) == 0) {
                                    world.setBlock(iin + j3, i1 + k3, kin + j2, this.leaf, this.leafmeta, 2);
                                 }
                              }
                           }
                        }
                     }

                     int var20 = byte0 + 1;

                     for(j3 = -var20; j3 <= var20; ++j3) {
                        for(j2 = -var20; j2 <= var20; ++j2) {
                           if(var20 == Math.abs(j3) || var20 == Math.abs(j2)) {
                              for(k3 = l / 2; k3 <= l; ++k3) {
                                 if(random.nextInt(1) == 0 && world.getBlockId(iin + j3, i1 + k3, kin + j2) == 0) {
                                    ;
                                 }

                                 world.setBlock(iin + j3, i1 + k3, kin + j2, this.leaf, this.leafmeta, 2);
                              }
                           }
                        }
                     }

                     for(j3 = l / 2; j3 <= l - 3; ++j3) {
                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin - byte1, i1 + j3, kin, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin + byte1, i1 + j3, kin, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin, i1 + j3, kin - byte1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin, i1 + j3, kin + byte1, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin - byte1, i1 + j3, kin + byte1, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin - byte1, i1 + j3, kin - byte1, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin + byte1, i1 + j3, kin + byte1, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }

                        if(random.nextInt(2) == 0) {
                           branches(world, random, iin + byte1, i1 + j3, kin - byte1, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                        }
                     }

                     return true;
                  }

                  for(j3 = -1; j3 <= 1 - sub; ++j3) {
                     for(j2 = -1; j2 <= 1 - sub; ++j2) {
                        if(j3 == 1) {
                           world.setBlock(iin + j3, i1, kin + j2, 0, 0, 2);
                        }

                        world.setBlock(iin + j3, i1 - 1, kin + j2, 3, 0, 2);
                        world.setBlock(iin + j3, i1, kin + j2, this.log, this.logmeta, 2);

                        for(k3 = 1; k3 <= ls; ++k3) {
                           world.setBlock(iin + j3, i1 + k3, kin + j2, this.log, this.logmeta, 2);
                        }
                     }
                  }

                  for(j3 = l / 2; j3 <= l - 6; ++j3) {
                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin - 1, i1 + j3, kin, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin, i1 + j3, kin, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin, i1 + j3, kin - 1, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin, i1 + j3, kin, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin - 1, i1 + j3, kin, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin - 1, i1 + j3, kin - 1, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin, i1 + j3, kin, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }

                     if(random.nextInt(4) == 0) {
                        branches(world, random, iin, i1 + j3, kin - 1, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                     }
                  }

                  return true;
               }

               --j;
               met = world.getBlockId(i, j, k);
            } while(met != 8 && met != 9 && met != 1);

            return false;
         }
      }
   }

   public static void branches(World world, Random random, int ii, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
      for(int br = 0; br < 9; ++br) {
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

         if(world.getBlockId(ii, jj, kk) == 0 || world.getBlockId(ii, jj, kk) == leaf) {
            world.setBlock(ii, jj, kk, log, logmeta, 2);
         }

         if(br == 8 || random.nextInt(6) == 0) {
            genSeqLeaves(world, ii, jj, kk, leaf, leafmeta);
         }

         ++jj;
      }

   }

   public static void genSeqLeaves(World world, int i3, int j3, int k3, int leaf, int leafmeta) {
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
         }
      }

   }
}
