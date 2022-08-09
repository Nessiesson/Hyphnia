package net.dugged.hyphnia.mixin;

import net.dugged.hyphnia.NonTrivialMixinInitializers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.List;

@Mixin(Items.class)
public abstract class MCreativeMenuFilter {
	@ModifyVariable(method = "registerBlock(Lnet/minecraft/world/item/BlockItem;)Lnet/minecraft/world/item/Item;", ordinal = 0, index = 0, name = "item", at = @At("HEAD"), argsOnly = true)
	private static BlockItem onRegister(final BlockItem item) {
		final List<String> addedItems = List.of(
				"block.minecraft.barrier",
				"block.minecraft.dragon_egg",
				"block.minecraft.command_block",
				"block.minecraft.spawner",
				"block.minecraft.structure_block"
		);

		if (addedItems.stream().anyMatch(it -> it.equals(item.getDescriptionId()))) {
			item.category = CreativeModeTab.TAB_REDSTONE;
		}

		return item;
	}

	@ModifyVariable(method = "registerItem(Lnet/minecraft/resources/ResourceLocation;Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/item/Item;", ordinal = 0, index = 1, name = "item", at = @At("HEAD"), argsOnly = true)
	private static Item onRegister(final Item item, final ResourceLocation idIn, final Item itemIn) {
		if (NonTrivialMixinInitializers.creativeMenuAddee().stream().noneMatch(it -> it.equals(idIn.toString()))) {
			item.category = CreativeModeTab.TAB_HOTBAR;
		}

		return item;
	}
}
