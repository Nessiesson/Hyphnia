package net.dugged.hyphnia.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SnowLayerBlock.class)
public abstract class MSnowLayerDripping extends BlockMixin {
	@Override
	public void onAnimateTick(final BlockState state, final Level level, final BlockPos pos, final RandomSource random, final CallbackInfo ci) {
		if (random.nextInt(10) != 0) {
			return;
		}

		final BlockPos below = pos.below(2);
		if (level.getBlockState(below).isAir()) {
			final double dx = below.getX() + random.nextDouble();
			final double dy = below.getY() + 1D - 0.05D;
			final double dz = below.getZ() + random.nextDouble();
			level.addParticle(ParticleTypes.END_ROD, dx, dy, dz, 0D, -0.06D, 0D);
		}
	}
}
