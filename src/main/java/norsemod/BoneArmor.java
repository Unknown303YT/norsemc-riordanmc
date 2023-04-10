package norsemod;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BoneArmor extends ArmorItem {

    public BoneArmor(EquipmentSlot armorType) {
        super(NorseMod.boneArmor, armorType, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {

        player.addEffect(new MobEffectInstance(MobEffects.JUMP, 6000, 1));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 1));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 4));

    }

}
