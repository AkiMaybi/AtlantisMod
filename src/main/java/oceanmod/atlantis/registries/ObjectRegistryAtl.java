package oceanmod.atlantis.registries;

import necesse.engine.registries.ObjectRegistry;
import necesse.level.gameObject.RockObject;
import oceanmod.atlantis.objects.OceanAltar;

import java.awt.*;

public class ObjectRegistryAtl {
    public static int atlanteanRockID;
    public static int oceanAltarID;

    public static void registerObjects() {
        oceanAltarID = ObjectRegistry.registerObject("oceanaltar", new OceanAltar(), -1.0f, true);




        RockObject atlanteanRock;
        atlanteanRockID = ObjectRegistry.registerObject("atlanteanrock", atlanteanRock =
                new RockObject("atlanteanrock", new Color(5, 24, 61),
                        "sandstone", 0, 1, 1),
                1.0f, true);
    }
}
