package norsemod.HelperFiles;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class ArmorHelper {

    public static ArmorMaterial addArmorMaterial(String name, int durability, int[] slotProtections, int enchantability, SoundEvent soundOnEquip, float toughness, float knockbackResistance, Ingredient repairItem){

        return new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(@NotNull EquipmentSlot slot) {
                return durability;
            }

            @Override
            public int getDefenseForSlot(@NotNull EquipmentSlot slot) {
                return switch (slot) {
                    case HEAD -> slotProtections[0];
                    case CHEST -> slotProtections[1];
                    case LEGS -> slotProtections[2];
                    case FEET -> slotProtections[3];
                    default -> 0;
                };
            }

            @Override
            public int getEnchantmentValue() {
                return enchantability;
            }

            @Override
            public @NotNull SoundEvent getEquipSound() {
                return soundOnEquip;
            }

            @Override
            public @NotNull Ingredient getRepairIngredient() {
                return repairItem;
            }

            @Override
            public @NotNull String getName() {
                return name;
            }

            @Override
            public float getToughness() {
                return toughness;
            }

            @Override
            public float getKnockbackResistance() {
                return knockbackResistance;
            }
        };
    }
}
