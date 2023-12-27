package com.riverstone.unknown303.norsemod.fluid;

import com.riverstone.unknown303.norsemod.NorseMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static ResourceLocation BLOOD_OVERLAY_RL = new ResourceLocation(NorseMod.MOD_ID, "misc/in_blood_fluid");

    public static final DeferredRegister<FluidType> FlUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, NorseMod.MOD_ID);

    public static final RegistryObject<FluidType> BLOOD_FLUID_TYPE =
            register("blood_fluid", FluidType.Properties.create().lightLevel(2).density(10).viscosity(10).sound(SoundAction.get("squelch"),
                    SoundEvents.PLAYER_SPLASH).canExtinguish(true).canDrown(true).canPushEntity(true).supportsBoating(true));

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
            return FlUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, BLOOD_OVERLAY_RL,
                    0xA1751a1a, new Vector3f(117f / 255f, 26f / 255f, 26f / 255f), 3f, properties));
    }

    public static void register(IEventBus eventBus) {
        FlUID_TYPES.register(eventBus);
    }
}
