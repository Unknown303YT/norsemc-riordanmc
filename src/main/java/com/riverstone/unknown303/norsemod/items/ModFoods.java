package com.riverstone.unknown303.norsemod.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BLOOD = new FoodProperties.Builder().nutrition(0).saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 1, false, false, true), 1).effect(() -> new MobEffectInstance(MobEffects.POISON, 400, 1, false, false, true), 1).alwaysEat().build();
}
