package norsemod.BoneTools;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import norsemod.NorseMod;

public class BoneHoe extends HoeItem {

    public BoneHoe() {
        super(NorseMod.itshistorical, 0, 500F, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }

}
