package com.riverstone.unknown303.norsemod.items;

import com.riverstone.unknown303.norsemod.NorseMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    CLOTHING("valhalla_merch", new int[]{ 0, 70, 65, 0 }, new int[] { 0, 2, 1, 0 }, 0,
            SoundEvents.ARMOR_EQUIP_ELYTRA, 0f, 0f, () -> Ingredient.of(ModItems.FABRIC.get())),
    BONE_STEEL("bone_steel", new int[]{608, 772, 741, 693}, new int[]{5, 11, 9, 5}, 25,
            SoundEvents.ARMOR_EQUIP_CHAIN, 4f, 0.175f, () -> Ingredient.of(ModItems.BONE_STEEL_INGOT.get()));

    private final String name;
    private final int[] DURABILITY;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int[] durability, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.DURABILITY = durability;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return this.DURABILITY[pType.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return NorseMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
