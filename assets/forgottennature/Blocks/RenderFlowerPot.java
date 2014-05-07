package assets.forgottennature.Blocks;

import assets.forgottennature.forgottennature;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class RenderFlowerPot implements ISimpleBlockRenderingHandler {

   public final Minecraft field_94177_n;
   public IBlockAccess blockAccess;


   public RenderFlowerPot(IBlockAccess par1IBlockAccess) {
      this.blockAccess = par1IBlockAccess;
      this.field_94177_n = Minecraft.getMinecraft();
   }

   public RenderFlowerPot() {
      this.field_94177_n = Minecraft.getMinecraft();
   }

   public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {}

   public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
      renderer.renderStandardBlock(block, x, y, z);
      Tessellator var5 = Tessellator.instance;
      var5.setBrightness(block.getMixedBrightnessForBlock(renderer.blockAccess, x, y, z));
      float var6 = 1.0F;
      int var7 = block.colorMultiplier(renderer.blockAccess, x, y, z);
      Icon var8 = block.getBlockTextureFromSide(0);
      float var9 = (float)(var7 >> 16 & 255) / 255.0F;
      float var10 = (float)(var7 >> 8 & 255) / 255.0F;
      float var11 = (float)(var7 & 255) / 255.0F;
      float var12;
      float var14;
      if(EntityRenderer.anaglyphEnable) {
         var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
         float dirt = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
         var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
         var9 = var12;
         var10 = dirt;
         var11 = var14;
      }

      boolean dirt1 = true;
      if(block == forgottennature.flowerPot4) {
         dirt1 = true;
      }

      var5.setColorOpaque_F(var6 * var9, var6 * var10, var6 * var11);
      var12 = 0.1865F;
      renderer.renderFaceXPos(block, (double)((float)x - 0.5F + var12), (double)y, (double)z, var8);
      renderer.renderFaceXNeg(block, (double)((float)x + 0.5F - var12), (double)y, (double)z, var8);
      renderer.renderFaceZPos(block, (double)x, (double)y, (double)((float)z - 0.5F + var12), var8);
      renderer.renderFaceZNeg(block, (double)x, (double)y, (double)((float)z + 0.5F - var12), var8);
      renderer.renderFaceYPos(block, (double)x, (double)((float)y - 0.5F + var12 + 0.1875F), (double)z, this.getBlockIcon(Block.dirt));
      int var19 = renderer.blockAccess.getBlockMetadata(x, y, z);
      if(var19 != 0) {
         var14 = 0.0F;
         float var15 = 4.0F;
         float var16 = 0.0F;
         Object var17 = null;
         var5.addTranslation(var14 / 16.0F, var15 / 16.0F, var16 / 16.0F);
         if(block == forgottennature.flowerPot) {
            if(var19 == 1) {
               renderer.drawCrossedSquares(forgottennature.newSap, 0, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 2) {
               renderer.drawCrossedSquares(forgottennature.newSap, 1, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 3) {
               renderer.drawCrossedSquares(forgottennature.newSap, 2, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 4) {
               renderer.drawCrossedSquares(forgottennature.newSap, 3, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 5) {
               renderer.drawCrossedSquares(forgottennature.newSap, 4, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 6) {
               renderer.drawCrossedSquares(forgottennature.newSap, 5, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 7) {
               renderer.drawCrossedSquares(forgottennature.newSap, 6, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 8) {
               renderer.drawCrossedSquares(forgottennature.newSap, 7, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 9) {
               renderer.drawCrossedSquares(forgottennature.newSap, 8, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 10) {
               renderer.drawCrossedSquares(forgottennature.newSap, 9, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 11) {
               renderer.drawCrossedSquares(forgottennature.newSap, 10, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 12) {
               renderer.drawCrossedSquares(forgottennature.newSap, 11, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 13) {
               renderer.drawCrossedSquares(forgottennature.newSap, 12, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 14) {
               renderer.drawCrossedSquares(forgottennature.newSap, 13, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 15) {
               renderer.drawCrossedSquares(forgottennature.newSap, 14, (double)x, (double)y, (double)z, 0.75F);
            }
         }

         if(block == forgottennature.flowerPot2) {
            if(var19 == 1) {
               renderer.drawCrossedSquares(forgottennature.newSap, 15, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 2) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 0, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 3) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 1, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 4) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 2, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 5) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 3, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 6) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 4, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 7) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 5, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 8) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 6, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 9) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 7, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 10) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 8, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 11) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 9, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 12) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 10, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 13) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 11, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 14) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 12, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 15) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 13, (double)x, (double)y, (double)z, 0.75F);
            }
         }

         if(block == forgottennature.flowerPot3) {
            if(var19 == 1) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 14, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 2) {
               renderer.drawCrossedSquares(forgottennature.newSap2, 15, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 3) {
               renderer.drawCrossedSquares(forgottennature.newSap3, 0, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 4) {
               renderer.drawCrossedSquares(forgottennature.newSap3, 1, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 5) {
               renderer.drawCrossedSquares(forgottennature.newSap3, 2, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 6) {
               renderer.drawCrossedSquares(forgottennature.newSap3, 3, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 7) {
               renderer.drawCrossedSquares(forgottennature.newSap3, 4, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 8) {
               renderer.drawCrossedSquares(forgottennature.newSap3, 5, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 9) {
               renderer.drawCrossedSquares(forgottennature.crystalStone, 0, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 10) {
               renderer.drawCrossedSquares(forgottennature.crystalStone, 1, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 11) {
               renderer.drawCrossedSquares(forgottennature.mushroomCrystal, 0, (double)x, (double)y, (double)z, 0.75F);
            }
         }

         if(block == forgottennature.flowerPot4) {
            if(var19 == 1) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 0, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 2) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 1, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 3) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 2, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 4) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 3, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 5) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 4, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 6) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 5, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 7) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 6, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 8) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 7, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 9) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 8, (double)x, (double)y, (double)z, 0.75F);
            } else if(var19 == 10) {
               renderer.drawCrossedSquares(forgottennature.newFlowers, 9, (double)x, (double)y, (double)z, 0.75F);
            }
         }

         var5.addTranslation(-var14 / 16.0F, -var15 / 16.0F, -var16 / 16.0F);
      }

      return true;
   }

   public Icon getBlockIcon(Block par1Block) {
      return this.getIconSafe(par1Block.getBlockTextureFromSide(1));
   }

   public Icon getIconSafe(Icon par1Icon) {
      if(par1Icon == null) {
         par1Icon = ((TextureMap)Minecraft.getMinecraft().getTextureManager().getTexture(TextureMap.locationBlocksTexture)).getAtlasSprite("missingno");
      }

      return (Icon)par1Icon;
   }

   public boolean shouldRender3DInInventory() {
      return true;
   }

   public int getRenderId() {
      return 51;
   }
}
