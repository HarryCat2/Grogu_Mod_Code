package braden.grogu.client;

import braden.grogu.entities.GroguEntityModel;
import braden.grogu.entities.GroguEntityRenderer;
import braden.grogu.entities.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)

public class GroguClient implements ClientModInitializer{
    public static final EntityModelLayer MODEL_GROGU_LAYER = new EntityModelLayer(new Identifier("modentites", "grogu"), "main");
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.GROGU, (context) -> {
            return new GroguEntityRenderer(context) {
                @Override
                public Identifier getTexture(Entity entity) {
                    return null;
                }
            };
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_GROGU_LAYER, GroguEntityModel::getTexturedModelData);

    }

}