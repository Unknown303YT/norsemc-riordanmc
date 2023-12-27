package com.riverstone.unknown303.norsemod.blocks;

import com.riverstone.unknown303.norsemod.NorseMod;
import com.riverstone.unknown303.norsemod.fluid.ModFluids;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NorseMod.MOD_ID);

    public static final RegistryObject<LiquidBlock> BLOOD_BLOCK = BLOCKS.register("blood_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BLOOD, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
