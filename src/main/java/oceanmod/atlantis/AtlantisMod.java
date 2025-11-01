package oceanmod.atlantis;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import oceanmod.atlantis.registries.*;

@ModEntry
public class AtlantisMod {

    public void init() {
        ExtraRegistriesAtl.registerExtras();
        ItemRegistryAtl.registerItems();
        MobRegistryAtl.registerMobs();
        ObjectRegistryAtl.registerObjects();
        TileRegistryAtl.registerTiles();
        WeaponsRegistryAtl.registerWeapons();
        BiomeRegistry.registerBiome("ocean", new OceanBiome().setGenerationWeight(2f), true );

    }

    public void initResources() {
        // Sometimes your textures will have a black or other outline unintended under rotation or scaling
        // This is caused by alpha blending between transparent pixels and the edge
        // To fix this, run the preAntialiasTextures gradle task
        // It will process your textures and save them again with a fixed alpha edge color
//
//        ExampleMob.texture = GameTexture.fromFile("mobs/examplemob");
    }

    public void postInit() {
        // Add recipes
        // Example staff recipe, crafted in workstation using 4 example items and 10 gold bars
//        Recipes.registerModRecipe(new Recipe(
//                "examplestaff",
//                1,
//                RecipeTechRegistry.WORKSTATION,
//                new Ingredient[]{
//                        new Ingredient("", 4),
//                        new Ingredient("goldbar", 10)
//                }
//        ).showAfter("exampleitem")); // Show the recipe after example item recipe

        // Add out example mob to default cave mobs.
        // Spawn tables use a ticket/weight system. In general, common mobs have about 100 tickets.
//        Biome.defaultCaveMobs
//                .add(100, "examplemob");

    }

}
