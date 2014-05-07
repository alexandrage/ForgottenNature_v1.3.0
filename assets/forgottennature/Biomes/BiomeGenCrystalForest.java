package assets.forgottennature.Biomes;

import assets.forgottennature.Biomes.FNBiomeDecorator;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenCrystalForest extends BiomeGenBase {

   public BiomeGenCrystalForest(int par1) {
      super(par1);
      super.spawnableCreatureList.clear();
      super.spawnableCreatureList.add(new SpawnListEntry(EntitySkeleton.class, 10, 1, 1));
      super.spawnableCreatureList.add(new SpawnListEntry(EntityCreeper.class, 10, 1, 1));
      super.spawnableCreatureList.add(new SpawnListEntry(EntitySpider.class, 10, 1, 1));
      super.fillerBlock = (byte)Block.stone.blockID;
      super.minHeight = 0.1F;
      super.maxHeight = 0.3F;
      super.temperature = 0.8F;
      super.rainfall = 0.2F;
      this.setBiomeName("Crystal Forest");
   }

   public BiomeDecorator createBiomeDecorator() {
      return (new FNBiomeDecorator.Builder(this)).treesPerChunk(0).flowersPerChunk(0).grassPerChunk(0).build();
   }

   public int getBiomeFoliageColor() {
      double d = 0.0D;
      double d1 = 0.0D;
      d1 /= d;
      return ColorizerFoliage.getFoliageColor(d, d1) & 5368556;
   }

   public int getBiomeGrassColor() {
      double d = 0.0D;
      double d1 = 0.0D;
      d1 /= d;
      return ColorizerGrass.getGrassColor(d, d1) & 5368556;
   }
}
