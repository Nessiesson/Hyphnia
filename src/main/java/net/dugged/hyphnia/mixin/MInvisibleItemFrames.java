package net.dugged.hyphnia.mixin;

import net.minecraft.client.render.entity.ItemFrameEntityRenderer;
import net.minecraft.entity.decoration.ItemFrameEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class MInvisibleItemFrames {
	@Mixin(ItemFrameEntity.class)
	public static abstract class ItemFrameEntityMixin {
		@Inject(method = {"getWidthPixels", "getHeightPixels"}, at = @At("HEAD"), cancellable = true)
		private void smallerHitBox(final CallbackInfoReturnable<Integer> cir) {
			cir.setReturnValue(5);
		}
	}


	@Mixin(ItemFrameEntityRenderer.class)
	public static abstract class ItemFrameEntityRendererMixin {
		@SuppressWarnings("UnresolvedMixinReference")
		@Redirect(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/decoration/ItemFrameEntity;isInvisible()Z"))
		private boolean alwaysInvisible(final ItemFrameEntity entity) {
			return true;
		}
	}
}
