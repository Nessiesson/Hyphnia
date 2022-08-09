package net.dugged.hyphnia.mixin;

import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public abstract class GameRenderer_PredicateMixin {
	@Dynamic
	@Inject(method = "method_18144(Lnet/minecraft/entity/Entity;)Z", at = @At("HEAD"), cancellable = true)
	private static void ignoreDeadEntities(final Entity entity, final CallbackInfoReturnable<Boolean> cir) {
		if (entity instanceof LivingEntity && ((LivingEntity) entity).getHealth() <= 0F) {
			cir.setReturnValue(false);
		}
	}
}
