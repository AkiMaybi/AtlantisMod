package oceanmod.atlantis.objects;

import necesse.level.gameObject.GameObject;
import necesse.level.gameObject.RockObject;
import necesse.level.gameObject.SingleRockObject;

import java.awt.*;

public class RedCoral extends SingleRockObject {

    protected RedCoral(RockObject type, String textureName, Color mapColor, int minDropAmount, int maxDropAmount, int placedDropAmount, String... category) {
        super(type, textureName, mapColor, minDropAmount, maxDropAmount, placedDropAmount, category);
    }
}
