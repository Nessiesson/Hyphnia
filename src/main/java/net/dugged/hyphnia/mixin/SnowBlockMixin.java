package net.dugged.hyphnia.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.SnowBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

import static net.minecraft.block.FallingBlock.canFallThrough;

@Mixin(SnowBlock.class)
public abstract class SnowBlockMixin {
	@Inject(method = "randomTick", at = @At("HEAD"))
	private void snowDripping(final BlockState state, final ServerWorld world, final BlockPos pos, final Random random, final CallbackInfo ci) {
		if (random.nextInt(10) == 0 && canFallThrough(world.getBlockState(pos.down()))) {
			final double dx = pos.getX() + random.nextDouble();
			final double dy = pos.getY() - 0.05D;
			final double dz = pos.getZ() + random.nextDouble();
			world.addParticle(ParticleTypes.END_ROD, dx, dy, dz, 0D, -0.06D, 0D);
		}
	}
}
