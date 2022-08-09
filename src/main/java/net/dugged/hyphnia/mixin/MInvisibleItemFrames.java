package net.dugged.hyphnia.mixin;

import net.minecraft.client.renderer.entity.ItemFrameRenderer;
import net.minecraft.world.entity.decoration.ItemFrame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class MInvisibleItemFrames {
	@Mixin(ItemFrame.class)
	public static abstract class ItemFrameMixin {
		@Inject(method = {"getWidth", "getHeight"}, at = @At("HEAD"), cancellable = true)
		private void smallerHitBox(final CallbackInfoReturnable<Integer> cir) {
			cir.setReturnValue(5);
		}
	}

	@Mixin(ItemFrameRenderer.class)
	public static abstract class ItemFrameRendererMixin {
		@Redirect(method = "render(Lnet/minecraft/world/entity/decoration/ItemFrame;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/decoration/ItemFrame;isInvisible()Z"))
		private boolean invisibleWithItems(final ItemFrame entity) {
			return !entity.getItem().isEmpty();
		}
	}
}
