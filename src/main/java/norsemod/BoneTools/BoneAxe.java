package norsemod.BoneTools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import norsemod.NorseMod;

public class BoneAxe extends AxeItem {

    public BoneAxe() {
        super(NorseMod.itshistorical, 0F, 500F, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }
    
}
