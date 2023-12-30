package com.riverstone.unknown303.norsemod.datagen;

import com.riverstone.unknown303.norsemod.NorseMod;
import com.riverstone.unknown303.norsemod.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLOOD_BOTTLE.get(), 3)
                .requires(Items.GLASS_BOTTLE, 3)
                .requires(ModItems.BLOOD_BUCKET.get(), 1)
                .unlockedBy(getHasName(ModItems.BLOOD_BUCKET.get()), has(ModItems.BLOOD_BUCKET.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLOOD_BUCKET.get())
                .requires(ModItems.BLOOD_BOTTLE.get(), 3)
                .requires(Items.BUCKET)
                .unlockedBy(getHasName(ModItems.BLOOD_BOTTLE.get()), has(ModItems.BLOOD_BOTTLE.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, NorseMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

    protected static void oreBlocks(RegistryObject<ItemLike> oreSingle, RegistryObject<Block> oreBlock, RecipeCategory category, Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(category, oreSingle.get(), 9)
                .requires(oreBlock.get())
                .unlockedBy(getHasName(oreBlock.get()), has(oreBlock.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(category, oreBlock.get())
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .define('O', oreSingle.get())
                .unlockedBy(getHasName(oreSingle.get()), has(oreSingle.get()))
                .save(pWriter);
    }
}
