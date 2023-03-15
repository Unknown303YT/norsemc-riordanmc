package norsemod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class CustomItem extends Item {

    public CustomItem() {
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }

}
