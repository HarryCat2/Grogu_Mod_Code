package braden.grogu.entities;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.Identifier;


public class GroguEntityRenderer<T extends EntityModel<GroguEntity>> extends EntityRenderer<GroguEntity> {

    public GroguEntityRenderer(EntityRendererFactory.Context context, GroguEntityModel entityModel, float f) {
        super(context);
    }

    public GroguEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(GroguEntity entity) {
        return null;
    }
}
