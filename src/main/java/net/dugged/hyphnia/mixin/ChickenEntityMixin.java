package net.dugged.hyphnia.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChickenEntity.class)
public abstract class ChickenEntityMixin extends AnimalEntity {
	protected ChickenEntityMixin(final EntityType<? extends AnimalEntity> type, final World world) {
		super(type, world);
	}

	@Inject(method = "tickMovement", at = @At("HEAD"))
	private void derpyChicken(final CallbackInfo ci) {
		if (this.world.isClient) {
			this.setPitch(-90F);
		}
	}
}
