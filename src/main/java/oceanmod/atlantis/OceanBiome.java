package oceanmod.atlantis;

import necesse.engine.registries.TileRegistry;
import necesse.level.maps.biomes.Biome;
import necesse.level.maps.biomes.FishingLootTable;
import necesse.level.maps.biomes.MobSpawnTable;
import oceanmod.atlantis.registries.ObjectRegistryAtl;
import oceanmod.atlantis.registries.TileRegistryAtl;

public class OceanBiome extends Biome {
    public static FishingLootTable surfaceFish;
    public static MobSpawnTable surfaceMobs;
    public static MobSpawnTable caveMobs;
    public static MobSpawnTable deepCaveMobs;
    public static MobSpawnTable surfaceCritters;
    public static MobSpawnTable caveCritters;



    @Override
    public int getGenerationTerrainTileID() {return TileRegistryAtl.atlanteansandID;}

    @Override
    public int getGenerationCaveTileID() {return TileRegistryAtl.atlanteansandID;}

    @Override
    public int getGenerationCaveRockObjectID() {return ObjectRegistryAtl.atlanteanRockID;}

    @Override
    public float getGenerationCaveRockObjectChance() {
        return 0.31f;
    }

    @Override
    public int getGenerationBeachTileID() {return TileRegistry.waterID;}

    static {
        surfaceMobs = new MobSpawnTable();
        caveMobs = new MobSpawnTable();
        deepCaveMobs = new MobSpawnTable();
        surfaceFish = new FishingLootTable();
        surfaceCritters = new MobSpawnTable();
        caveCritters = new MobSpawnTable();
    }
}
