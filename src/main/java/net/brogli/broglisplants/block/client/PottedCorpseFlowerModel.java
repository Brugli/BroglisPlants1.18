package net.brogli.broglisplants.block.client;

import net.brogli.broglisplants.BroglisPlants;
import net.brogli.broglisplants.block.entity.PottedEntityCorpseFlower;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PottedCorpseFlowerModel extends AnimatedGeoModel<PottedEntityCorpseFlower> {

    @Override
    public ResourceLocation getModelLocation(PottedEntityCorpseFlower object) {
        return new ResourceLocation(BroglisPlants.MOD_ID, "geo/entity_corpse_flower_potted.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PottedEntityCorpseFlower object) {
        return new ResourceLocation(BroglisPlants.MOD_ID, "textures/block/entity_corpse_flower.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PottedEntityCorpseFlower animatable) {
        return new ResourceLocation(BroglisPlants.MOD_ID, "animations/entity_corpse_flower.animation.json");
    }
}
