package net.dugged.hyphnia.mixin;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.DeathScreen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(DeathScreen.class)
public abstract class DeathScreenMixin {
	@Shadow
	@Final
	private List<Button> exitButtons;

	@Inject(method = "tick", at = @At("RETURN"))
	private void removeRespawnDelay(final CallbackInfo ci) {
		this.exitButtons.forEach(it -> it.active = true);
	}
}
