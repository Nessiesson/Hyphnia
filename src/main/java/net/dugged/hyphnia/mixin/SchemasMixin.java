package net.dugged.hyphnia.mixin;

import com.mojang.datafixers.DataFixerBuilder;
import net.dugged.hyphnia.LazyDataFixerBuilder;
import net.minecraft.datafixer.Schemas;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

// Stolen from https://github.com/astei/lazydfu
@Mixin(Schemas.class)
public abstract class SchemasMixin {
	@Redirect(method = "create", at = @At(value = "NEW", target = "com/mojang/datafixers/DataFixerBuilder"))
	private static DataFixerBuilder create$replaceBuilder(final int dataVersion) {
		return new LazyDataFixerBuilder(dataVersion);
	}
}
