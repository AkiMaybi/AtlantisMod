package oceanmod.atlantis.objects;

import necesse.engine.gameLoop.tickManager.TickManager;
import necesse.engine.localization.Localization;
import necesse.engine.util.GameBlackboard;
import necesse.entity.mobs.PlayerMob;
import necesse.entity.objectEntity.ObjectEntity;
import necesse.gfx.camera.GameCamera;
import necesse.gfx.drawOptions.texture.TextureDrawOptions;
import necesse.gfx.drawables.LevelSortedDrawable;
import necesse.gfx.drawables.OrderableDrawables;
import necesse.gfx.gameTexture.GameTexture;
import necesse.gfx.gameTooltips.ListGameTooltips;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.Item;
import necesse.inventory.item.placeableItem.objectItem.ObjectItem;
import necesse.inventory.item.toolItem.ToolType;
import necesse.level.gameObject.GameObject;
import necesse.level.maps.Level;
import necesse.level.maps.light.GameLight;

import java.awt.*;
import java.util.List;

import static necesse.level.gameObject.FallenIcicleObject.texture;

public class OceanAltar extends GameObject {
    public OceanAltar() {
        super(new Rectangle(5, 20, 64, 64));
        hoverHitbox = new Rectangle(0, -32, 32, 64);
        toolType = ToolType.PICKAXE;
        isLightTransparent = false;
        mapColor = new Color(6, 24, 75);
    }

    @Override
    public void loadTextures() {
        super.loadTextures();
        texture = GameTexture.fromFile("objects/AtlanteanRunes");
    }

    @Override
    public void addDrawables(List<LevelSortedDrawable> list, OrderableDrawables tileList, Level level, int tileX, int tileY, TickManager tickManager, GameCamera camera, PlayerMob perspective) {
        GameLight light = level.getLightLevel(tileX, tileY);
        int drawX = camera.getTileDrawX(tileX);
        int drawY = camera.getTileDrawY(tileY);
        TextureDrawOptions options = texture.initDraw().light(light).pos(drawX - 16, drawY - texture.getHeight() + 32);

        list.add(new LevelSortedDrawable(this, tileX, tileY) {
            @Override
            public int getSortY() {
                return 6;
            }

            @Override
            public void draw(TickManager tickManager) {
                options.draw();
            }
        });
    }

    @Override
    public void drawPreview(Level level, int tileX, int tileY, int rotation, float alpha, PlayerMob player, GameCamera camera) {
        int drawX = camera.getTileDrawX(tileX);
        int drawY = camera.getTileDrawY(tileY);
        texture.initDraw().alpha(alpha).draw(drawX, drawY - texture.getHeight() + 32);
    }

    @Override
    public ObjectEntity getNewObjectEntity(Level level, int x, int y) {
        return new OceanAltarEntity(level, x, y);
    }

    @Override
    public Item generateNewObjectItem() {
        return new OceanAltarItem(this);
    }

    public static class OceanAltarEntity extends ObjectEntity {

        public OceanAltarEntity(Level level, int tileX, int tileY) {
            super(level, "atlanteanrunes", tileX, tileY);
        }
    }

    public static class OceanAltarItem extends ObjectItem {

        public OceanAltarItem(GameObject gameObject) {
            super(gameObject);
            rarity = Rarity.RARE;
        }

        @Override
        public ListGameTooltips getTooltips(InventoryItem item, PlayerMob perspective, GameBlackboard blackboard) {
            ListGameTooltips tooltips = super.getTooltips(item, perspective, blackboard);
            return tooltips;
        }
    }
}
