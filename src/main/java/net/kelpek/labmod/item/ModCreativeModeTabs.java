package net.kelpek.labmod.item;

import net.kelpek.labmod.LaBMod;
import net.kelpek.labmod.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LaBMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AGONITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("agonite_items_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AGONITE.get()))
                .title(Component.translatable("creativetab.labmod.agonite_items"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.AGONITE.get());
                    output.accept(ModItems.RAW_AGONITE.get());

                }).build());

    public static final RegistryObject<CreativeModeTab> AGONITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("agonite_blocks_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AGONITE_BLOCK.get()))
                .withTabsBefore(AGONITE_ITEMS_TAB.getId())
                .title(Component.translatable("creativetab.labmod.agonite_blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.AGONITE_BLOCK.get());
                    output.accept(ModBlocks.RAW_AGONITE_BLOCK.get());
                    output.accept(ModBlocks.AGONITE_ORE.get());
                    output.accept(ModBlocks.AGONITE_DEEPSLATE_ORE.get());

                }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
