package net.dugged.hyphnia.mixin;

import net.minecraft.util.Mth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Mth.class)
public abstract class MthMixin {
	@ModifyConstant(method = "fastInvSqrt(F)F", constant = @Constant(intValue = 1597463007 /* 0x5F3759DF */))
	private static int morePrecise32BitFastInvSqrt(final int value) {
		return 0x5F375A86;
	}

	@ModifyConstant(method = "fastInvSqrt(D)D", constant = @Constant(longValue = 6910469410427058090L /*0x5FE6EB50C7B537AAL */))
	private static long morePrecise64BitFastInvSqrt(final long value) {
		return 0x5FE6EB50C7B537A9L;
	}
}
