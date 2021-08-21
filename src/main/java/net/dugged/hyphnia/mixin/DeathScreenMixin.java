package net.dugged.hyphnia.mixin;

import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
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
	private List<ButtonWidget> buttons;

	@Inject(method = "tick", at = @At("RETURN"))
	private void removeRespawnDelay(final CallbackInfo ci) {
		this.buttons.forEach(it -> it.active = true);
	}
}
