package assets.forgottennature.Biomes;

import assets.forgottennature.Biomes.FNBiomeDecorator;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenNeoTropicalForestHills extends BiomeGenBase {

   public BiomeGenNeoTropicalForestHills(int par1) {
      super(par1);
      super.spawnableMonsterList.add(new SpawnListEntry(EntityOcelot.class, 2, 1, 1));
      super.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
      super.minHeight = 0.0F;
      super.maxHeight = 2.0F;
      super.temperature = 0.9F;
      super.rainfall = 0.9F;
      this.setBiomeName("Neo Tropical Forest Hills");
   }

   public BiomeDecorator createBiomeDecorator() {
      return (new FNBiomeDecorator.Builder(this)).treesPerChunk(0).flowersPerChunk(2).grassPerChunk(8).build();
   }

   public int getBiomeFoliageColor() {
      double d = 0.0D;
      double d1 = 0.0D;
      d1 /= d;
      return ColorizerFoliage.getFoliageColor(d, d1) & 7260929;
   }

   public int getBiomeGrassColor() {
      double d = 0.0D;
      double d1 = 0.0D;
      d1 /= d;
      return ColorizerGrass.getGrassColor(d, d1) & 7260929;
   }
}
