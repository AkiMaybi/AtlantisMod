package oceanmod.atlantis;

import necesse.engine.registries.TileRegistry;
import necesse.level.gameTile.GameTile;
import necesse.level.maps.Level;
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
    public int getGenerationTerrainTileID() {return TileRegistry.waterID;}

    @Override
    public int getGenerationCaveTileID() {return TileRegistryAtl.atlanteansandID;}

    @Override
    public int getGenerationCaveRockObjectID() {return ObjectRegistryAtl.atlanteanRockID;}

    @Override
    public float getGenerationCaveRockObjectChance() {
        return 0.31f;
    }

    @Override
    public GameTile getUnderLiquidTile(Level level, int tileX, int tileY) {
        return TileRegistry.getTile(TileRegistryAtl.atlanteansandID);
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
