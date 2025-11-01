package oceanmod.atlantis.registries;

import necesse.engine.registries.TileRegistry;
import oceanmod.atlantis.tiles.AtlanteanSand;

public class TileRegistryAtl {
    public static int atlanteansandID;

    public static void registerTiles() {
        atlanteansandID = TileRegistry.registerTile("atlantean_sand", new AtlanteanSand(), 1, true);
    }
}
