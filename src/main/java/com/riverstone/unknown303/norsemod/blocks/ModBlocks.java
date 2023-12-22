package com.riverstone.unknown303.norsemod.blocks;

import com.riverstone.unknown303.norsemod.NorseMod;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> MOD_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NorseMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        MOD_BLOCKS.register(eventBus);
    }
}
