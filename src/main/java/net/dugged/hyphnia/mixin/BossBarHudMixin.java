package net.dugged.hyphnia.mixin;

import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BossBarHud.class)
public abstract class BossBarHudMixin {
	@Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;getScaledHeight()I"))
	private int onlyOneBossBar(final Window window) {
		return 36;
	}
}
