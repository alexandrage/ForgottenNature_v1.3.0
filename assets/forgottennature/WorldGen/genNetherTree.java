package assets.forgottennature.WorldGen;

import assets.forgottennature.forgottennature;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class genNetherTree extends WorldGenerator {

   int leaf;
   int leafmeta;
   int I;
   int log;
   int logmeta;
   int dir;


   public genNetherTree(int i, int k, int is) {
      this.leaf = forgottennature.leafIDindex + 7;
      this.log = forgottennature.logIDindex + 4;
      this.dir = 0;
      this.leafmeta = i;
      this.logmeta = k;
      this.I = is;
   }

   public boolean generate(World world, Random random, int i, int j, int k) {
      if(world.isRemote) {
         return false;
      } else if(this.I == 0) {
         return false;
      } else {
         int l = random.nextInt(3) + 2;
         if(j >= 1 && j + l + 1 <= 256) {
            int ID = world.getBlockId(i, j - 1, k);

            do {
               if(ID == Block.netherrack.blockID) {
                  if(world.getBlockId(i, j + 1, k) != 0) {
                     return false;
                  }

                  ++j;
                  int brightest = world.getBlockLightValue(i, j, k);
                  boolean next = false;
                  world.setBlock(i, j - 1, k, Block.netherrack.blockID, 0, 2);
                  world.setBlock(i, j + 1, k, this.log, this.logmeta, 2);

                  int l1;
                  int j3;
                  for(l1 = -1; l1 < 2; ++l1) {
                     for(j3 = -1; j3 < 2; ++j3) {
                        int var12 = world.getBlockLightValue(i + l1, j, k + j3);
                        if(var12 > brightest) {
                           brightest = var12;
                           if(l1 == -1 && j3 == l1) {
                              this.dir = 1;
                           } else if(l1 == -1 && j3 == 0) {
                              this.dir = 2;
                           } else if(l1 == -1 && j3 == 1) {
                              this.dir = 3;
                           } else if(l1 == 0 && j3 == 1) {
                              this.dir = 4;
                           } else if(l1 == 1 && j3 == l1) {
                              this.dir = 5;
                           } else if(l1 == 1 && j3 == 0) {
                              this.dir = 6;
                           } else if(l1 == 1 && j3 == -1) {
                              this.dir = 7;
                           } else if(l1 == 0 && j3 == -1) {
                              this.dir = 8;
                           }
                        }
                     }
                  }

                  for(l1 = 0; l1 < l; ++l1) {
                     if(this.dir == 0) {
                        world.setBlock(i, j + l1, k, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i, j + l1, k, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(8) == 0) {
                              branches(world, random, i, j + j3, k, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 1) {
                        world.setBlock(i - 1 * l1, j + l1, k - 1 * l1, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i - 1 * l1, j + l1, k - 1 * l1, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 2) {
                        world.setBlock(i - 1 * l1, j + l1, k, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i - 1 * l1, j + l1, k, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 3) {
                        world.setBlock(i - 1 * l1, j + l1, k + 1 * l1, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i - 1 * l1, j + l1, k + 1 * l1, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, -1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 4) {
                        world.setBlock(i, j + l1, k + 1 * l1, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i, j + l1, k + 1 * l1, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, -1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 5) {
                        world.setBlock(i + 1 * l1, j + l1, k + 1 * l1, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i + 1 * l1, j + l1, k + 1 * l1, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 0, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 6) {
                        world.setBlock(i + 1 * l1, j + l1, k, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i + 1 * l1, j + l1, k, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, 1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 7) {
                        world.setBlock(i + 1 * l1, j + l1, k - 1 * l1, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i + 1 * l1, j + l1, k - 1 * l1, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, 0, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 0, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     } else if(this.dir == 8) {
                        world.setBlock(i, j + l1, k - 1 * l1, this.log, this.logmeta, 2);
                        if(l1 == l - 1) {
                           genLeaves(world, random, i, j + l1, k - 1 * l1, this.leaf, this.leafmeta);
                        }

                        for(j3 = 0; j3 <= 1; ++j3) {
                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, -1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }

                           if(random.nextInt(2) == 0) {
                              branches(world, random, i, j + j3, k, 1, -1, this.leaf, this.leafmeta, this.log, this.logmeta);
                           }
                        }
                     }
                  }

                  return true;
               }

               --j;
               ID = world.getBlockId(i, j, k);
            } while(ID != 8 && ID != 9 && ID != 1 && ID != 7);

            return false;
         } else {
            return false;
         }
      }
   }

   public static void branches(World world, Random random, int ii, int jj, int kk, int iD, int kD, int leaf, int leafmeta, int log, int logmeta) {
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
            genLeaves(world, random, ii, jj, kk, leaf, leafmeta);
         }

         ++jj;
      }

   }

   public static void genLeaves(World world, Random random, int i3, int j3, int k3, int leaf, int leafmeta) {
      for(int x = -2; x <= 2; ++x) {
         for(int y = -2; y <= 2; ++y) {
            if((Math.abs(x) != 2 || Math.abs(y) != 2) && world.getBlockId(i3 + x, j3, k3 + y) == 0) {
               world.setBlock(i3 + x, j3, k3 + y, leaf, leafmeta, 2);
            }

            if(Math.abs(x) < 2 && Math.abs(y) < 2 && (Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i3 + x, j3 + 1, k3 + y) == 0) {
               world.setBlock(i3 + x, j3 + 1, k3 + y, leaf, leafmeta, 2);
            }

            if(Math.abs(x) < 2 && Math.abs(y) < 2 && (Math.abs(x) != 1 || Math.abs(y) != 1) && world.getBlockId(i3 + x, j3 - 1, k3 + y) == 0) {
               world.setBlock(i3 + x, j3 - 1, k3 + y, leaf, leafmeta, 2);
            }
         }
      }

   }
}
