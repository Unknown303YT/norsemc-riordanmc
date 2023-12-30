package com.riverstone.unknown303.norsemod.events;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import com.riverstone.unknown303.norsemod.NorseMod;
import com.riverstone.unknown303.norsemod.blocks.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Optional;

//@Mod.EventBusSubscriber(modid = NorseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeathEvents {
//    @SubscribeEvent
//    public static void dropBlood(PlayerEvent.PlayerRespawnEvent event) {
//        Player player = event.getEntity();
//        Optional<GlobalPos> loc = player.getLastDeathLocation();
//        BlockPos blockPos = loc.get().pos();
//        Level level = player.level();
//        level.setBlock(blockPos, new BlockState(ModBlocks.BLOOD_BLOCK.get(), ImmutableMap.of(), Mapc));
//        level.
//    }
}
