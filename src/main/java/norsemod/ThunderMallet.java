package norsemod;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import norsemod.HelperFiles.ModHelper;

public class ThunderMallet extends SwordItem {

    public ThunderMallet() {
        super(NorseMod.toomanygods, 0, 5000F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        
        ItemStack hammer = player.getItemInHand(hand);

        HitResult hit = player.pick(200D, player.getEyeHeight(), false);

        level.explode(player, hit.getLocation().x, hit.getLocation().y, hit.getLocation().z, 5F, Explosion.BlockInteraction.BREAK);
        ModHelper.spawnEntity(level, new BlockPos(hit.getLocation()), new LightningBolt(EntityType.LIGHTNING_BOLT, level));
        ModHelper.spawnEntity(level, new BlockPos(hit.getLocation()), new LightningBolt(EntityType.LIGHTNING_BOLT, level));
        ModHelper.spawnEntity(level, new BlockPos(hit.getLocation()), new LightningBolt(EntityType.LIGHTNING_BOLT, level));
        ModHelper.spawnEntity(level, new BlockPos(hit.getLocation()), new LightningBolt(EntityType.LIGHTNING_BOLT, level));

        return InteractionResultHolder.success(hammer);

    }

}
