package com.riverstone.unknown303.norsemod.items;

import com.riverstone.unknown303.norsemod.NorseMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NorseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NORSE_TAB =
            MOD_TABS.register("norse_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LOGO.get()))
                            .title(Component.translatable("creativetab.norsemc.norse_tab"))
                            .displayItems(((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.MJOLNIR.get());
                                pOutput.accept(ModItems.BLOOD_BUCKET.get());
                                pOutput.accept(ModItems.BLOOD_BOTTLE.get());
                            }))
                            .build());

    public static void register(IEventBus eventBus) {
        MOD_TABS.register(eventBus);
    }
}
