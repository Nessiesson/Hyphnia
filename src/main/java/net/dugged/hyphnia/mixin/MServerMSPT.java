package net.dugged.hyphnia.mixin;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.util.Mth;
import org.apache.commons.lang3.StringUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class MServerMSPT {
	@Mixin(Gui.class)
	public static abstract class GuiMixin {
		@Shadow
		@Final
		private Minecraft minecraft;

		@Unique
		private static int hyphnia$getTicktimeColour(final double mspt) {
			final double percentage = Mth.clamp(mspt / 50D, 0D, 1D);
			final int red = (int) Mth.clamp(255D * percentage, 0D, 255D) << 16;
			final int green = (int) Mth.clamp(255D * 8D - 255D * 8D * percentage, 0D, 255D) << 8;
			return red | green;
		}

		@Inject(method = "setOverlayMessage", at = @At("HEAD"), cancellable = true)
		private void parseDuggedMSPT(final Component message, final boolean tinted, final CallbackInfo ci) {
			final String string = message.getString();
			if (StringUtils.isNumeric(string)) {
				final int mspt = Integer.parseInt(string);
				if (mspt == 0) {
					return;
				}

				final double tps = Math.min(20D, 1000D / mspt);
				final Style tickStyle = Style.EMPTY.withColor(hyphnia$getTicktimeColour(mspt));
				final Style grey = Style.EMPTY.withColor(ChatFormatting.GRAY);
				final Component footer = CommonComponents.joinLines(Component.literal("MSPT: ").setStyle(grey), Component.literal(String.valueOf(mspt)).setStyle(tickStyle), Component.literal(" TPS: ").setStyle(grey), Component.literal(String.format("%.1f", tps)).setStyle(tickStyle));
				this.minecraft.gui.getTabList().setFooter(footer);
				ci.cancel();
			}
		}
	}
}
