package net.dugged.hyphnia.mixin;

import net.minecraft.server.command.ServerCommandSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerCommandSource.class)
public abstract class MAlwaysAllowCommandsSSP {
	@Inject(method = "hasPermissionLevel", at = @At("HEAD"), cancellable = true)
	private void alwaysAllowCommand(final int level, final CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
