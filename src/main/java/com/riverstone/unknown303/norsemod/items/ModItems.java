package com.riverstone.unknown303.norsemod.items;

import com.riverstone.unknown303.norsemod.NorseMod;
import com.riverstone.unknown303.norsemod.fluid.ModFluids;
import com.riverstone.unknown303.norsemod.items.custom.DefaultArmorItem;
import com.riverstone.unknown303.norsemod.items.custom.DefaultItem;
import com.riverstone.unknown303.norsemod.items.custom.MjolnirItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NorseMod.MOD_ID);
    public static final RegistryObject<Item> LOGO = ITEMS.register("logo",
                () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));


    public static final RegistryObject<Item> MJOLNIR = ITEMS.register("mjolnir",
                    () -> new MjolnirItem("mjolnir", 2, ModToolTiers.GODLY, new Item.Properties().rarity(Rarity.EPIC).fireResistant()));

    public static final RegistryObject<BucketItem> BLOOD_BUCKET = ITEMS.register("blood_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_BLOOD, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle",
                    () -> new Item(new Item.Properties().stacksTo(1).craftRemainder(Items.GLASS_BOTTLE).food(ModFoods.BLOOD).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> BONE_STEEL_INGOT = ITEMS.register("bone_steel",
                    () -> new DefaultItem("bone_steel", 2, new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> RED_GOLD = ITEMS.register("red_gold",
                    () -> new DefaultItem("red_gold", 2, new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> FABRIC = ITEMS.register("fabric",
                    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VALHALLA_SHIRT = ITEMS.register("valhalla_shirt",
            () -> new DefaultArmorItem("valhalla_shirt", 1, ModArmorMaterials.CLOTHING, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> VALHALLA_JEANS = ITEMS.register("jeans",
            () -> new ArmorItem(ModArmorMaterials.CLOTHING, ArmorItem.Type.LEGGINGS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
