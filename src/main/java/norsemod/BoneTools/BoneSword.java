package norsemod.BoneTools;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import norsemod.NorseMod;

public class BoneSword extends SwordItem {

    public BoneSword() {
        super(NorseMod.itshistorical, 0, 500F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
    
}
