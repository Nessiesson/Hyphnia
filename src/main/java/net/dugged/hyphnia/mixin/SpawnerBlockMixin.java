package net.dugged.hyphnia.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SpawnerBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnerBlock.class)
public abstract class SpawnerBlockMixin {
	@Inject(method = "getCloneItemStack", at = @At("HEAD"), cancellable = true)
	private void onPickBlock(final BlockGetter level, final BlockPos pos, final BlockState state, final CallbackInfoReturnable<ItemStack> cir) {
		cir.setReturnValue(new ItemStack((SpawnerBlock) (Object) this));
	}
}
