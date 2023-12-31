package com.riverstone.unknown303.norsemod.datagen.statesandmodels;

import com.riverstone.unknown303.norsemod.NorseMod;
import com.riverstone.unknown303.norsemod.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NorseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LOGO);
        simpleItem(ModItems.BLOOD_BUCKET);
        simpleItem(ModItems.BLOOD_BOTTLE);
        simpleItem(ModItems.BONE_STEEL_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<? extends Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NorseMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
