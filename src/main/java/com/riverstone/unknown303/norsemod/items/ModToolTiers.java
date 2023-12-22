package com.riverstone.unknown303.norsemod.items;

import com.riverstone.unknown303.norsemod.NorseMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier GODLY = TierSortingRegistry.registerTier(
            new ForgeTier(20, 1999999999, 1999999999F, 16F, 0,
                    null, () -> Ingredient.of()),
            new ResourceLocation(NorseMod.MOD_ID, "godly"), List.of(Tiers.NETHERITE), List.of());
}
