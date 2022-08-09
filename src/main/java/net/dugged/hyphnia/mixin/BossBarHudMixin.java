package net.dugged.hyphnia.mixin;

import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.gui.components.BossHealthOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BossHealthOverlay.class)
public abstract class BossBarHudMixin {
	@Redirect(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/platform/Window;getGuiScaledHeight()I"))
	private int onlyOneBossBar(final Window instance) {
		return 36;
	}
}
