package norsemod.BoneTools;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.PickaxeItem;
import norsemod.NorseMod;

public class BonePickaxe extends PickaxeItem {

    public BonePickaxe() {
        super(NorseMod.itshistorical, 0, 500F, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }
    
}
