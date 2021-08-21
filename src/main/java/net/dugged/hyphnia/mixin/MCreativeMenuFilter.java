package net.dugged.hyphnia.mixin;

import net.dugged.hyphnia.HyphniaMod;
import net.dugged.hyphnia.NonTrivialMixinInitializers;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.List;

@Mixin(Items.class)
public abstract class MCreativeMenuFilter {
	@ModifyVariable(method = "register(Lnet/minecraft/item/BlockItem;)Lnet/minecraft/item/Item;", ordinal = 0, index = 0, name = "item", at = @At("HEAD"))
	private static BlockItem onRegister(final BlockItem item) {
		final List<String> addedItems = List.of(
				"block.minecraft.barrier",
				"block.minecraft.dragon_egg",
				"block.minecraft.command_block",
				"block.minecraft.spawner",
				"block.minecraft.structure_block"
		);

		if (addedItems.stream().anyMatch(it -> it.equals(item.getTranslationKey()))) {
			item.group = ItemGroup.REDSTONE;
		}

		return item;
	}

	@ModifyVariable(method = "register(Lnet/minecraft/util/Identifier;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;", ordinal = 0, index = 1, name = "item", at = @At("HEAD"))
	private static Item onRegister(final Item item, final Identifier idIn, final Item itemIn) {
		if (NonTrivialMixinInitializers.creativeMenuAddee().stream().noneMatch(it -> it.equals(idIn.toString()))) {
			item.group = ItemGroup.HOTBAR;
		}

		return item;
	}
}
