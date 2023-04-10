package norsemod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ValhallaArmor extends ArmorItem {

    public ValhallaArmor(EquipmentSlot armorType) {
        super(NorseMod.hotelValhalla, armorType, new Properties().tab(CreativeModeTab.TAB_MISC));
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {

        player.addEffect(new MobEffectInstance(MobEffects.JUMP, 6000, 0));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 0));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 0));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0));

    }

}
