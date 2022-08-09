package net.dugged.hyphnia.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Chicken.class)
public abstract class ChickenEntityMixin extends Animal {
	protected ChickenEntityMixin(final EntityType<? extends Animal> type, final Level level) {
		super(type, level);
	}

	@Inject(method = "aiStep", at = @At("HEAD"))
	private void derpyChicken(final CallbackInfo ci) {
		if (this.level.isClientSide) {
			this.setYRot(90F);
		}
	}
}
