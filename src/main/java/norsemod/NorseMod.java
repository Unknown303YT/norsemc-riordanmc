package norsemod;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import norsemod.BoneTools.BoneAxe;
import norsemod.BoneTools.BoneHoe;
import norsemod.BoneTools.BonePickaxe;
import norsemod.BoneTools.BoneShovel;
import norsemod.BoneTools.BoneSword;
import norsemod.HelperFiles.ArmorHelper;
import norsemod.HelperFiles.ModHelper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NorseMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NorseMod
{
    public static final String MODID = "norsemc";
    public static final String MODNAME = "NorseMC";
    public static String VERSION = "1.6.0";

    public static NorseMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    public static CustomMaterial boneSteel;
    public static RedGold redGold;
    public static Tier itshistorical; // Bone Steel Tier
    public static Tier toomanygods; // God Tier
    public static ThunderMallet hesnotblonde; // Mjolnir
    public static CustomItem blood;

    public static BoneSword jack;
    public static BonePickaxe picktheBones;
    public static BoneAxe axeforyou;
    public static BoneShovel lovelyshovely;
    public static BoneHoe hoehoehoeMerryChristmas;

    public static CustomMaterial fabric;

    public static ArmorMaterial boneArmor;
    public static ArmorMaterial hotelValhalla;

    public static BoneArmor hardHat;
    public static BoneArmor beserker;
    public static BoneArmor tightPants;
    public static BoneArmor mustbeUncomfortable;

    public static ValhallaArmor halfbornGunderson; // He never wears this in combat :)
    public static ValhallaArmor magicJeans;

    public NorseMod() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModHelper.ENTITIES.register(modEventBus);

        //*********** INITIALIZE MATERIALS ******************
        itshistorical = ModHelper.addTier(5, 5000, 21, 17F, 25);
        toomanygods = ModHelper.addTier(1999999999, 1999999999, 1999999999, 1000F, 20);

        boneArmor = ArmorHelper.addArmorMaterial(MODID + ":bs_armor", 750, new int[]{13, 12, 5, 5},
        25, SoundEvents.ARMOR_EQUIP_IRON, 17F, 17, Ingredient.of(boneSteel));
        hotelValhalla = ArmorHelper.addArmorMaterial(MODID + ":valhalla_armor", 750, new int[]{2, 2, 1, 1},
        0, SoundEvents.ARMOR_EQUIP_ELYTRA, 1F, 1, Ingredient.of(fabric));

        //*********** INITIALIZE VARIABLES ******************
        boneSteel = new CustomMaterial();
        redGold = new RedGold();
        hesnotblonde = new ThunderMallet();
        blood = new CustomItem();

        jack = new BoneSword();
        picktheBones = new BonePickaxe();
        axeforyou = new BoneAxe();
        lovelyshovely = new BoneShovel();
        hoehoehoeMerryChristmas = new BoneHoe();

        fabric = new CustomMaterial();

        hardHat = new BoneArmor(EquipmentSlot.HEAD);
        beserker = new BoneArmor(EquipmentSlot.CHEST);
        tightPants = new BoneArmor(EquipmentSlot.LEGS);
        mustbeUncomfortable = new BoneArmor(EquipmentSlot.FEET);

        halfbornGunderson = new ValhallaArmor(EquipmentSlot.CHEST);
        magicJeans = new ValhallaArmor(EquipmentSlot.LEGS);


        // ****************** REGISTER ITEMS ******************
        ModHelper.registerItem(boneSteel, "bone_steel");
        ModHelper.registerItem(redGold, "red_gold");
        ModHelper.registerItem(hesnotblonde, "mjolnir");
        ModHelper.registerItem(blood, "blood");

        ModHelper.registerItem(jack, "bs_sword");
        ModHelper.registerItem(picktheBones, "bs_pickaxe");
        ModHelper.registerItem(axeforyou, "bs_axe");
        ModHelper.registerItem(lovelyshovely, "bs_shovel");
        ModHelper.registerItem(hoehoehoeMerryChristmas, "bs_hoe");

        ModHelper.registerItem(fabric, "fabric");

        ModHelper.registerItem(hardHat, "bs_helmet");
        ModHelper.registerItem(beserker, "bs_chestplate");
        ModHelper.registerItem(tightPants, "bs_leggings");
        ModHelper.registerItem(mustbeUncomfortable, "bs_boots");

        ModHelper.registerItem(halfbornGunderson, "valhalla_shirt");
        ModHelper.registerItem(magicJeans, "valhalla_jeans");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ ModHelper.doItemRegistry(event); }

}
