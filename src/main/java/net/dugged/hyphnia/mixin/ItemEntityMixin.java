package net.dugged.hyphnia.mixin;

import net.minecraft.entity.ItemEntity;
import net.minecraft.world.World;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ItemEntity.class)
public abstract class ItemEntityMixin {
	@Redirect(method = "tick", at = @At(value = "FIELD", target = "Lnet/minecraft/world/World;isClient:Z", opcode = Opcodes.GETFIELD, ordinal = 0))
	private boolean mc123320$noclip(final World world) {
		return false;
	}

	@ModifyConstant(method = "tick", constant = @Constant(intValue = 4))
	private int mc123320$alwaysMove(int value) {
		return 1;
	}
}
