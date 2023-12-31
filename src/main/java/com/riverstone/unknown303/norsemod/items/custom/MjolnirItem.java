package com.riverstone.unknown303.norsemod.items.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.WorldOptions;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class MjolnirItem extends SwordItem {
    String name;
    int lines;
    public MjolnirItem(String name, int lines, Tier pTier, Properties pProperties) {
        super(pTier, 0, 0, pProperties);
        this.name = name;
        this.lines = lines;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack hammer = player.getItemInHand(hand);

        HitResult hit = player.pick(30D, player.getEyeHeight(), false);

        level.explode(player, hit.getLocation().x, hit.getLocation().y, hit.getLocation().z, 5F, Level.ExplosionInteraction.MOB);
        spawnEntity(level, hit.getLocation(), new LightningBolt(EntityType.LIGHTNING_BOLT, level));
        spawnEntity(level, hit.getLocation(), new LightningBolt(EntityType.LIGHTNING_BOLT, level));
        spawnEntity(level, hit.getLocation(), new LightningBolt(EntityType.LIGHTNING_BOLT, level));
        spawnEntity(level, hit.getLocation(), new LightningBolt(EntityType.LIGHTNING_BOLT, level));

        return InteractionResultHolder.success(hammer);
    }

    public void spawnEntity(Level level, Vec3 pos, Entity entity) {
        Random random = new Random();
        entity.setPos(pos.x+random.nextInt(2), pos.y()+random.nextInt(2), pos.z()+random.nextInt(2));
        level.addFreshEntity(entity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        for (int i = 1; i <= this.lines; i++) {
            pTooltipComponents.add(Component.translatable("item.norsemc." + name + ".tooltip.line" + i));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
