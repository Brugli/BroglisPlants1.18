package net.brogli.broglisplants.event;

import net.brogli.broglisplants.BroglisPlants;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BroglisPlants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModForgeEvents {

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
