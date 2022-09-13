package net.otherdev.whisper.client.render;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.otherdev.whisper.entity.WhimsyEntity;

public class WhimsyEntityRenderer extends EntityRenderer<WhimsyEntity> {

    protected WhimsyEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public Identifier getTexture(WhimsyEntity entity) {
        return null;
    }
}
