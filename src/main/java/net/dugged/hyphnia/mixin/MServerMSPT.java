package net.dugged.hyphnia.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.StringUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class MServerMSPT {
	@Mixin(InGameHud.class)
	public static abstract class InGameHudMixin {
		@Shadow
		@Final
		private MinecraftClient client;

		@Inject(method = "setOverlayMessage", at = @At("HEAD"), cancellable = true)
		private void parseDuggedMSPT(final Text message, final boolean tinted, final CallbackInfo ci) {
			final String string = message.getString();
			if (StringUtils.isNumeric(string)) {
				final int mspt = Integer.parseInt(string);
				if (mspt == 0) {
					return;
				}

				final double tps = Math.min(20D, 1000D / mspt);
				final Style tickStyle = Style.EMPTY.withColor(hyphnia$getTicktimeColour(mspt));
				final Text tickInfo = LiteralText.EMPTY.copy()
						.append(new LiteralText("MSPT: ").formatted(Formatting.GRAY))
						.append(new LiteralText(String.format("%d", mspt)).setStyle(tickStyle))
						.append(new LiteralText(" TPS: ").formatted(Formatting.GRAY))
						.append(new LiteralText(String.format("%.1f", tps)).setStyle(tickStyle));

				this.client.inGameHud.getPlayerListHud().setFooter(tickInfo);
				ci.cancel();
			}
		}

		@Unique
		private static int hyphnia$getTicktimeColour(final double mspt) {
			final double percentage = MathHelper.clamp(mspt / 50D, 0D, 1D);
			final int red = (int) MathHelper.clamp(255D * percentage, 0D, 255D) << 16;
			final int green = (int) MathHelper.clamp(255D * 8D - 255D * 8D * percentage, 0D, 255D) << 8;
			return red | green;
		}
	}
}
