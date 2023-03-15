package norsemod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import norsemod.BoneSteel.BoneSteel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NorseMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NorseMod
{
    public static final String MODID = "norsemc";
    public static final String MODNAME = "The Norse Mythology Mod for Minecraft";
    public static String VERSION = "1.0.0";

    public static NorseMod instance;
    private static final Logger LOGGER = LogManager.getLogger();

    //*********** DECLARE VARIABLES ******************
    //public static BoneSteel boneSteel;
    //public static Currency redGold;
    public static ThunderMallet hesnotblonde; // Mjolnir
//    public static Tier itshistorical; // Bone Steel Tier
    public static Tier toomanygods; // God Tier
    //public static CustomItem blood;

    public NorseMod() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Codakid.ENTITIES.register(modEventBus);

        //*********** INITIALIZE MATERIALS ******************
//        itshistorical = Codakid.addTier(0, 0, 0, 0, 0)
        toomanygods = Codakid.addTier(1999999999, 1999999999, 1999999999, 1999999999, 50);

        //*********** INITIALIZE VARIABLES ******************
        //boneSteel = new BoneSteel();
        //redGold = new Currency();
        hesnotblonde = new ThunderMallet();
        //blood = new CustomItem();

        // ****************** REGISTER ITEMS ******************
        //Codakid.registerItem(boneSteel, "bone_steel");
        //Codakid.registerItem(redGold, "red_gold");
        Codakid.registerItem(hesnotblonde, "mjolnir");
        //Codakid.registerItem(blood, "blood");

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){ Codakid.doItemRegistry(event); }

}
