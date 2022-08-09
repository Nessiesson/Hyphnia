package net.dugged.hyphnia.mixin;

import com.google.common.base.Splitter;
import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class MLongerChatMessages {
	@Mixin(ChatScreen.class)
	public static abstract class ChatScreenMixin {
		@Shadow
		public abstract boolean handleChatInput(final String string, final boolean bl);

		@ModifyArg(method = "init", index = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/EditBox;setMaxLength(I)V"))
		private int longerchat$allowLongerMessages(final int value) {
			return 2048;
		}

		@Inject(method = "handleChatInput", at = @At("HEAD"), cancellable = true)
		private void longerchat$splitMessages(final String message, final boolean bl, final CallbackInfoReturnable<Boolean> cir) {
			if (message.length() > 256) {
				boolean flag = false;
				for (final String fragment : Splitter.fixedLength(256).split(message)) {
					flag |= this.handleChatInput(fragment, bl);
				}

				cir.setReturnValue(flag);
			}
		}
	}
}
