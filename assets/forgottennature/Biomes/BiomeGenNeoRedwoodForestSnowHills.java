package assets.forgottennature.Biomes;

import assets.forgottennature.Biomes.FNBiomeDecorator;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenNeoRedwoodForestSnowHills extends BiomeGenBase {

   public BiomeGenNeoRedwoodForestSnowHills(int i) {
      super(i);
      super.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
      super.minHeight = 0.1F;
      super.maxHeight = 2.0F;
      super.temperature = 0.0F;
      super.rainfall = 0.5F;
      this.setBiomeName("Redwood Forest Snow Hills");
   }

   public BiomeDecorator createBiomeDecorator() {
      return (new FNBiomeDecorator.Builder(this)).treesPerChunk(0).flowersPerChunk(2).grassPerChunk(4).build();
   }

   public int getBiomeFoliageColor() {
      double d = 0.0D;
      double d1 = 0.0D;
      d1 /= d;
      return ColorizerFoliage.getFoliageColor(d, d1) & 3385890;
   }

   public int getBiomeGrassColor() {
      double d = 0.0D;
      double d1 = 0.0D;
      d1 /= d;
      return ColorizerGrass.getGrassColor(d, d1) & 3385890;
   }
}
