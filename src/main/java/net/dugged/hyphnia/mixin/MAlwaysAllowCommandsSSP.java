package net.dugged.hyphnia.mixin;

import net.minecraft.commands.CommandSourceStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CommandSourceStack.class)
public abstract class MAlwaysAllowCommandsSSP {
	@Inject(method = "hasPermission", at = @At("HEAD"), cancellable = true)
	private void alwaysAllowCommand(final int level, final CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
