package com.riverstone.unknown303.norsemod.items;

import com.riverstone.unknown303.norsemod.NorseMod;
import com.riverstone.unknown303.norsemod.items.custom.MjolnirItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> MOD_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NorseMod.MOD_ID);

    public static final RegistryObject<Item> LOGO =
            MOD_ITEMS.register("logo",
                () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MJOLNIR =
            MOD_ITEMS.register("mjolnir",
                    () -> new MjolnirItem(ModToolTiers.GODLY, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        MOD_ITEMS.register(eventBus);
    }
}