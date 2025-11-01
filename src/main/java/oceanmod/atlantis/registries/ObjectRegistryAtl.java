package oceanmod.atlantis.registries;

import necesse.engine.registries.ObjectRegistry;
import necesse.level.gameObject.RockObject;

import java.awt.*;

public class ObjectRegistryAtl {
    public static int atlanteanRockID;

    public static void registerObjects() {


        RockObject atlanteanRock;
        atlanteanRockID = ObjectRegistry.registerObject("atlanteanrock", atlanteanRock =
                new RockObject("atlanteanrock", new Color(5, 24, 61),
                        "sandstone", 0, 1, 1),
                1.0f, true);
    }
}
