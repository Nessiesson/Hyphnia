package net.dugged.hyphnia.mixin;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemEntity.class)
public abstract class MSmoothItemMovement {
	@Redirect(method = "tick", at = @At(value = "FIELD", target = "Lnet/minecraft/world/level/Level;isClientSide:Z", opcode = Opcodes.GETFIELD, ordinal = 0))
	private boolean mc123320$noclip(final Level world) {
		return false;
	}

	@ModifyConstant(method = "tick", constant = @Constant(intValue = 4))
	private int mc123320$alwaysMove(int value) {
		return 1;
	}
}
