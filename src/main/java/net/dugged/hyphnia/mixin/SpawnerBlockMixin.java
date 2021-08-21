package net.dugged.hyphnia.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.SpawnerBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnerBlock.class)
public abstract class SpawnerBlockMixin {
	@Inject(method = "getPickStack", at = @At("HEAD"), cancellable = true)
	private void onPickBlock(final BlockView world, final BlockPos pos, final BlockState state, final CallbackInfoReturnable<ItemStack> cir) {
		cir.setReturnValue(new ItemStack((SpawnerBlock) (Object) this));
	}
}
