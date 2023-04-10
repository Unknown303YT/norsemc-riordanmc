package norsemod.BoneTools;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShovelItem;
import norsemod.NorseMod;

public class BoneShovel extends ShovelItem {

    public BoneShovel() {
        super(NorseMod.itshistorical, 0F, 500F, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }
    
}
