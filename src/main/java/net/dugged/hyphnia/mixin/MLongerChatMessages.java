package net.dugged.hyphnia.mixin;

import com.google.common.base.Splitter;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class MLongerChatMessages {
	@Mixin(ChatScreen.class)
	public static abstract class ChatScreenMixin {
		@Unique
		private static final int HYPHNIA$CHAT_MESSAGE_LIMIT = 2048;

		@ModifyArg(method = "init", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/widget/TextFieldWidget;setMaxLength(I)V"))
		private int longerchat$allowLongerMessages(final int value) {
			return HYPHNIA$CHAT_MESSAGE_LIMIT;
		}
	}

	@Mixin(Screen.class)
	public static abstract class ScreenMixin {
		@Shadow
		public abstract void sendMessage(final String message, final boolean toHud);

		@Inject(method = "sendMessage(Ljava/lang/String;)V", at = @At("HEAD"), cancellable = true)
		private void longerchat$splitMessages(final String message, final CallbackInfo ci) {
			ci.cancel();
			for (final String fragment : Splitter.fixedLength(256).split(message)) {
				this.sendMessage(fragment, true);
			}
		}
	}
}
