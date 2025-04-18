package net.kelpek.labmod.item;

import net.kelpek.labmod.LaBMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LaBMod.MOD_ID);

    public static final RegistryObject<Item> AGONITE = ITEMS.register("agonite",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RAW_AGONITE = ITEMS.register("raw_agonite",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
