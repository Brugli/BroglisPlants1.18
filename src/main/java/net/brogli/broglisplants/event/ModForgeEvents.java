package net.brogli.broglisplants.event;

import net.brogli.broglisplants.BroglisPlants;
import net.brogli.broglisplants.world.feature.BroglisPlantsPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BroglisPlants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModForgeEvents {

    @SubscribeEvent
    public static void addPlants(BiomeLoadingEvent e) {
        switch (e.getName().getPath()) {
            case "swamp" :
                e.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(BroglisPlantsPlacedFeatures.FLYTRAP_PLACED.get()));
                break;

            case "old_growth_pine_taiga" :
                e.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(BroglisPlantsPlacedFeatures.CORPSE_FLOWER_PLACED.get()));
                System.out.println("Plant generated!");
                break;

            case "old_growth_spruce_taiga" :
                e.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(BroglisPlantsPlacedFeatures.CORPSE_FLOWER_PLACED.get()));
                System.out.println("Plant generated!");
                break;

            case "dark_forest" :
                e.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(BroglisPlantsPlacedFeatures.DEADLY_NIGHTSHADE_PLACED.get()));
                break;
        }
    }

//    @SubscribeEvent
//    public static void SeedPlantEvent(final ItemExpireEvent event) {
//
//        Level level = event.getEntity().getLevel();
//        ItemStack stack = event.getEntity().getItem();
//        assert stack.getEntityRepresentation() != null;
//        Block blockBelow = level.getBlockState(stack.getEntityRepresentation().blockPosition().below()).getBlock();
//        Block blockAbove = level.getBlockState(stack.getEntityRepresentation().blockPosition().above()).getBlock();
//        Block block = level.getBlockState(stack.getEntityRepresentation().blockPosition()).getBlock();
//
//        if (!level.isClientSide) {
//            if (event.getEntity().getItem().is(BroglisPlantsItems.ITEM_FLYTRAP_SEEDS.get())) {
//
//                if (block == Blocks.MUD && blockAbove == Blocks.AIR) {
//                    level.setBlock(stack.getEntityRepresentation().blockPosition().above(), BroglisPlantsBlocks.FLYTRAP_BLOCK.get().defaultBlockState(), 2);
//                }
//            }
//            if (event.getEntity().getItem().is(BroglisPlantsItems.ITEM_CORPSE_FLOWER_SEEDS.get())) {
//
//                if (blockBelow == Blocks.PODZOL && block == Blocks.AIR) {
//                    level.setBlock(stack.getEntityRepresentation().blockPosition(), BroglisPlantsBlocks.CORPSE_FLOWER_BLOCK.get().defaultBlockState(), 2);
//                }
//            }
//        }
//    }
}
