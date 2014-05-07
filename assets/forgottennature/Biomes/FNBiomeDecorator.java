package assets.forgottennature.Biomes;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

class FNBiomeDecorator extends BiomeDecorator {

   private FNBiomeDecorator() {
      super((BiomeGenBase)null);
   }

   private FNBiomeDecorator(FNBiomeDecorator.Builder builder) {
      super(builder.biome);
      super.waterlilyPerChunk = builder.waterlilyPerChunk;
      super.treesPerChunk = builder.treesPerChunk;
      super.flowersPerChunk = builder.flowersPerChunk;
      super.grassPerChunk = builder.grassPerChunk;
      super.deadBushPerChunk = builder.deadBushPerChunk;
      super.mushroomsPerChunk = builder.mushroomsPerChunk;
      super.reedsPerChunk = builder.reedsPerChunk;
      super.cactiPerChunk = builder.cactiPerChunk;
      super.sandPerChunk = builder.sandPerChunk;
      super.sandPerChunk2 = builder.sandPerChunk2;
      super.clayPerChunk = builder.clayPerChunk;
      super.bigMushroomsPerChunk = builder.bigMushroomsPerChunk;
   }

   // $FF: synthetic method
   FNBiomeDecorator(FNBiomeDecorator.Builder x0, FNBiomeDecorator.NamelessClass1085827220 x1) {
      this(x0);
   }

   static class Builder {

      private final BiomeGenBase biome;
      private int waterlilyPerChunk = 0;
      private int treesPerChunk = 0;
      private int flowersPerChunk = 2;
      private int grassPerChunk = 1;
      private int deadBushPerChunk = 0;
      private int mushroomsPerChunk = 0;
      private int reedsPerChunk = 0;
      private int cactiPerChunk = 0;
      private int sandPerChunk = 1;
      private int sandPerChunk2 = 3;
      private int clayPerChunk = 1;
      private int bigMushroomsPerChunk = 0;
      protected World currentWorld;
      protected Random randomGenerator;
      protected int chunk_X;
      protected int chunk_Z;


      Builder(BiomeGenBase biome) {
         this.biome = biome;
      }

      FNBiomeDecorator.Builder bigMushroomsPerChunk(int val) {
         this.bigMushroomsPerChunk = val;
         return this;
      }

      FNBiomeDecorator build() {
         return new FNBiomeDecorator(this, (FNBiomeDecorator.NamelessClass1085827220)null);
      }

      FNBiomeDecorator.Builder cactiPerChunk(int val) {
         this.cactiPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder clayPerChunk(int val) {
         this.clayPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder deadBushPerChunk(int val) {
         this.deadBushPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder flowersPerChunk(int val) {
         this.flowersPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder grassPerChunk(int val) {
         this.grassPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder mushroomsPerChunk(int val) {
         this.mushroomsPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder reedsPerChunk(int val) {
         this.reedsPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder sandPerChunk(int val, int val2) {
         this.sandPerChunk = val;
         this.sandPerChunk2 = val2;
         return this;
      }

      FNBiomeDecorator.Builder treesPerChunk(int val) {
         this.treesPerChunk = val;
         return this;
      }

      FNBiomeDecorator.Builder waterlilyPerChunk(int val) {
         this.waterlilyPerChunk = val;
         return this;
      }
   }

   // $FF: synthetic class
   static class NamelessClass1085827220 {
   }
}
