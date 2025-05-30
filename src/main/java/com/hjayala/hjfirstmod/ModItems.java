package com.hjayala.hjfirstmod;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    //Create Deferred Registry for ITEMS
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HJFirstMod.MOD_ID);

    public static final DeferredItem<Item> CALENDAR = ITEMS.register("calendar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
