package net.dugged.hyphnia;


import java.util.List;

public class NonTrivialMixinInitializers {
/*	public static ItemGroup noneItemGroup() {
		return new ItemGroup() {
			@Override
			public ItemStack createIcon() {
				return null;
			}
		};
	}*/

	public static List<String> creativeMenuAddee() {
		return List.of(
				"minecraft:air",
				"minecraft:stone",
				"minecraft:granite",
				"minecraft:polished_granite",
				"minecraft:diorite",
				"minecraft:polished_diorite",
				"minecraft:andesite",
				"minecraft:polished_andesite",
				"minecraft:dripstone_block",
				"minecraft:grass_block",
				"minecraft:dirt",
				"minecraft:coarse_dirt",
				"minecraft:podzol",
				"minecraft:cobblestone",
				"minecraft:oak_planks",
				"minecraft:spruce_planks",
				"minecraft:birch_planks",
				"minecraft:jungle_planks",
				"minecraft:acacia_planks",
				"minecraft:dark_oak_planks",
				"minecraft:oak_sapling",
				"minecraft:spruce_sapling",
				"minecraft:birch_sapling",
				"minecraft:jungle_sapling",
				"minecraft:acacia_sapling",
				"minecraft:dark_oak_sapling",
				"minecraft:bedrock",
				"minecraft:sand",
				"minecraft:red_sand",
				"minecraft:gravel",
				"minecraft:coal_ore",
				"minecraft:iron_ore",
				"minecraft:gold_ore",
				"minecraft:redstone_ore",
				"minecraft:emerald_ore",
				"minecraft:lapis_ore",
				"minecraft:diamond_ore",
				"minecraft:nether_quartz_ore",
				"minecraft:coal_block",
				"minecraft:iron_block",
				"minecraft:gold_block",
				"minecraft:diamond_block",
				"minecraft:oak_log",
				"minecraft:spruce_log",
				"minecraft:birch_log",
				"minecraft:jungle_log",
				"minecraft:acacia_log",
				"minecraft:dark_oak_log",
				"minecraft:oak_leaves",
				"minecraft:spruce_leaves",
				"minecraft:birch_leaves",
				"minecraft:jungle_leaves",
				"minecraft:acacia_leaves",
				"minecraft:dark_oak_leaves",
				"minecraft:sponge",
				"minecraft:wet_sponge",
				"minecraft:glass",
				"minecraft:lapis_block",
				"minecraft:sandstone",
				"minecraft:chiseled_sandstone",
				"minecraft:cobweb",
				"minecraft:grass",
				"minecraft:fern",
				"minecraft:dead_bush",
				"minecraft:seagrass",
				"minecraft:white_wool",
				"minecraft:orange_wool",
				"minecraft:magenta_wool",
				"minecraft:light_blue_wool",
				"minecraft:yellow_wool",
				"minecraft:lime_wool",
				"minecraft:pink_wool",
				"minecraft:gray_wool",
				"minecraft:light_gray_wool",
				"minecraft:cyan_wool",
				"minecraft:purple_wool",
				"minecraft:blue_wool",
				"minecraft:brown_wool",
				"minecraft:green_wool",
				"minecraft:red_wool",
				"minecraft:black_wool",
				"minecraft:dandelion",
				"minecraft:poppy",
				"minecraft:blue_orchid",
				"minecraft:allium",
				"minecraft:azure_bluet",
				"minecraft:red_tulip",
				"minecraft:orange_tulip",
				"minecraft:white_tulip",
				"minecraft:pink_tulip",
				"minecraft:oxeye_daisy",
				"minecraft:brown_mushroom",
				"minecraft:red_mushroom",
				"minecraft:sugar_cane",
				"minecraft:oak_slab",
				"minecraft:spruce_slab",
				"minecraft:birch_slab",
				"minecraft:jungle_slab",
				"minecraft:acacia_slab",
				"minecraft:dark_oak_slab",
				"minecraft:stone_slab",
				"minecraft:smooth_stone_slab",
				"minecraft:sandstone_slab",
				"minecraft:petrified_oak_slab",
				"minecraft:cobblestone_slab",
				"minecraft:brick_slab",
				"minecraft:stone_brick_slab",
				"minecraft:nether_brick_slab",
				"minecraft:quartz_slab",
				"minecraft:red_sandstone_slab",
				"minecraft:purpur_slab",
				"minecraft:bricks",
				"minecraft:bookshelf",
				"minecraft:mossy_cobblestone",
				"minecraft:obsidian",
				"minecraft:torch",
				"minecraft:end_rod",
				"minecraft:chorus_plant",
				"minecraft:chorus_flower",
				"minecraft:purpur_block",
				"minecraft:purpur_pillar",
				"minecraft:purpur_stairs",
				"minecraft:spawner",
				"minecraft:oak_stairs",
				"minecraft:chest",
				"minecraft:crafting_table",
				"minecraft:farmland",
				"minecraft:furnace",
				"minecraft:ladder",
				"minecraft:cobblestone_stairs",
				"minecraft:snow",
				"minecraft:ice",
				"minecraft:snow_block",
				"minecraft:cactus",
				"minecraft:clay",
				"minecraft:jukebox",
				"minecraft:oak_fence",
				"minecraft:spruce_fence",
				"minecraft:birch_fence",
				"minecraft:jungle_fence",
				"minecraft:acacia_fence",
				"minecraft:dark_oak_fence",
				"minecraft:pumpkin",
				"minecraft:carved_pumpkin",
				"minecraft:jack_o_lantern",
				"minecraft:netherrack",
				"minecraft:soul_sand",
				"minecraft:soul_torch",
				"minecraft:glowstone",
				"minecraft:infested_stone",
				"minecraft:infested_cobblestone",
				"minecraft:infested_stone_bricks",
				"minecraft:infested_mossy_stone_bricks",
				"minecraft:infested_cracked_stone_bricks",
				"minecraft:infested_chiseled_stone_bricks",
				"minecraft:stone_bricks",
				"minecraft:mossy_stone_bricks",
				"minecraft:cracked_stone_bricks",
				"minecraft:chiseled_stone_bricks",
				"minecraft:brown_mushroom_block",
				"minecraft:red_mushroom_block",
				"minecraft:mushroom_stem",
				"minecraft:iron_bars",
				"minecraft:glass_pane",
				"minecraft:melon",
				"minecraft:vine",
				"minecraft:brick_stairs",
				"minecraft:stone_brick_stairs",
				"minecraft:mycelium",
				"minecraft:lily_pad",
				"minecraft:nether_bricks",
				"minecraft:cracked_nether_bricks",
				"minecraft:chiseled_nether_bricks",
				"minecraft:nether_brick_fence",
				"minecraft:nether_brick_stairs",
				"minecraft:enchanting_table",
				"minecraft:end_portal_frame",
				"minecraft:end_stone",
				"minecraft:end_stone_bricks",
				"minecraft:dragon_egg",
				"minecraft:sandstone_stairs",
				"minecraft:ender_chest",
				"minecraft:emerald_block",
				"minecraft:spruce_stairs",
				"minecraft:birch_stairs",
				"minecraft:jungle_stairs",
				"minecraft:command_block",
				"minecraft:beacon",
				"minecraft:cobblestone_wall",
				"minecraft:mossy_cobblestone_wall",
				"minecraft:anvil",
				"minecraft:chipped_anvil",
				"minecraft:damaged_anvil",
				"minecraft:chiseled_quartz_block",
				"minecraft:quartz_block",
				"minecraft:quartz_bricks",
				"minecraft:quartz_pillar",
				"minecraft:quartz_stairs",
				"minecraft:white_terracotta",
				"minecraft:orange_terracotta",
				"minecraft:magenta_terracotta",
				"minecraft:light_blue_terracotta",
				"minecraft:yellow_terracotta",
				"minecraft:lime_terracotta",
				"minecraft:pink_terracotta",
				"minecraft:gray_terracotta",
				"minecraft:light_gray_terracotta",
				"minecraft:cyan_terracotta",
				"minecraft:purple_terracotta",
				"minecraft:blue_terracotta",
				"minecraft:brown_terracotta",
				"minecraft:green_terracotta",
				"minecraft:red_terracotta",
				"minecraft:black_terracotta",
				"minecraft:barrier",
				"minecraft:light",
				"minecraft:hay_block",
				"minecraft:white_carpet",
				"minecraft:orange_carpet",
				"minecraft:magenta_carpet",
				"minecraft:light_blue_carpet",
				"minecraft:yellow_carpet",
				"minecraft:lime_carpet",
				"minecraft:pink_carpet",
				"minecraft:gray_carpet",
				"minecraft:light_gray_carpet",
				"minecraft:cyan_carpet",
				"minecraft:purple_carpet",
				"minecraft:blue_carpet",
				"minecraft:brown_carpet",
				"minecraft:green_carpet",
				"minecraft:red_carpet",
				"minecraft:black_carpet",
				"minecraft:terracotta",
				"minecraft:packed_ice",
				"minecraft:acacia_stairs",
				"minecraft:dark_oak_stairs",
				"minecraft:dirt_path",
				"minecraft:sunflower",
				"minecraft:lilac",
				"minecraft:rose_bush",
				"minecraft:peony",
				"minecraft:tall_grass",
				"minecraft:large_fern",
				"minecraft:white_stained_glass",
				"minecraft:orange_stained_glass",
				"minecraft:magenta_stained_glass",
				"minecraft:light_blue_stained_glass",
				"minecraft:yellow_stained_glass",
				"minecraft:lime_stained_glass",
				"minecraft:pink_stained_glass",
				"minecraft:gray_stained_glass",
				"minecraft:light_gray_stained_glass",
				"minecraft:cyan_stained_glass",
				"minecraft:purple_stained_glass",
				"minecraft:blue_stained_glass",
				"minecraft:brown_stained_glass",
				"minecraft:green_stained_glass",
				"minecraft:red_stained_glass",
				"minecraft:black_stained_glass",
				"minecraft:white_stained_glass_pane",
				"minecraft:orange_stained_glass_pane",
				"minecraft:magenta_stained_glass_pane",
				"minecraft:light_blue_stained_glass_pane",
				"minecraft:yellow_stained_glass_pane",
				"minecraft:lime_stained_glass_pane",
				"minecraft:pink_stained_glass_pane",
				"minecraft:gray_stained_glass_pane",
				"minecraft:light_gray_stained_glass_pane",
				"minecraft:cyan_stained_glass_pane",
				"minecraft:purple_stained_glass_pane",
				"minecraft:blue_stained_glass_pane",
				"minecraft:brown_stained_glass_pane",
				"minecraft:green_stained_glass_pane",
				"minecraft:red_stained_glass_pane",
				"minecraft:black_stained_glass_pane",
				"minecraft:prismarine",
				"minecraft:prismarine_bricks",
				"minecraft:dark_prismarine",
				"minecraft:sea_lantern",
				"minecraft:red_sandstone",
				"minecraft:chiseled_red_sandstone",
				"minecraft:red_sandstone_stairs",
				"minecraft:repeating_command_block",
				"minecraft:chain_command_block",
				"minecraft:magma_block",
				"minecraft:nether_wart_block",
				"minecraft:red_nether_bricks",
				"minecraft:bone_block",
				"minecraft:structure_void",
				"minecraft:shulker_box",
				"minecraft:white_shulker_box",
				"minecraft:orange_shulker_box",
				"minecraft:magenta_shulker_box",
				"minecraft:light_blue_shulker_box",
				"minecraft:yellow_shulker_box",
				"minecraft:lime_shulker_box",
				"minecraft:pink_shulker_box",
				"minecraft:gray_shulker_box",
				"minecraft:light_gray_shulker_box",
				"minecraft:cyan_shulker_box",
				"minecraft:purple_shulker_box",
				"minecraft:blue_shulker_box",
				"minecraft:brown_shulker_box",
				"minecraft:green_shulker_box",
				"minecraft:red_shulker_box",
				"minecraft:black_shulker_box",
				"minecraft:white_glazed_terracotta",
				"minecraft:orange_glazed_terracotta",
				"minecraft:magenta_glazed_terracotta",
				"minecraft:light_blue_glazed_terracotta",
				"minecraft:yellow_glazed_terracotta",
				"minecraft:lime_glazed_terracotta",
				"minecraft:pink_glazed_terracotta",
				"minecraft:gray_glazed_terracotta",
				"minecraft:light_gray_glazed_terracotta",
				"minecraft:cyan_glazed_terracotta",
				"minecraft:purple_glazed_terracotta",
				"minecraft:blue_glazed_terracotta",
				"minecraft:brown_glazed_terracotta",
				"minecraft:green_glazed_terracotta",
				"minecraft:red_glazed_terracotta",
				"minecraft:black_glazed_terracotta",
				"minecraft:white_concrete",
				"minecraft:orange_concrete",
				"minecraft:magenta_concrete",
				"minecraft:light_blue_concrete",
				"minecraft:yellow_concrete",
				"minecraft:lime_concrete",
				"minecraft:pink_concrete",
				"minecraft:gray_concrete",
				"minecraft:light_gray_concrete",
				"minecraft:cyan_concrete",
				"minecraft:purple_concrete",
				"minecraft:blue_concrete",
				"minecraft:brown_concrete",
				"minecraft:green_concrete",
				"minecraft:red_concrete",
				"minecraft:black_concrete",
				"minecraft:white_concrete_powder",
				"minecraft:orange_concrete_powder",
				"minecraft:magenta_concrete_powder",
				"minecraft:light_blue_concrete_powder",
				"minecraft:yellow_concrete_powder",
				"minecraft:lime_concrete_powder",
				"minecraft:pink_concrete_powder",
				"minecraft:gray_concrete_powder",
				"minecraft:light_gray_concrete_powder",
				"minecraft:cyan_concrete_powder",
				"minecraft:purple_concrete_powder",
				"minecraft:blue_concrete_powder",
				"minecraft:brown_concrete_powder",
				"minecraft:green_concrete_powder",
				"minecraft:red_concrete_powder",
				"minecraft:black_concrete_powder",
				"minecraft:redstone",
				"minecraft:redstone_torch",
				"minecraft:redstone_block",
				"minecraft:repeater",
				"minecraft:comparator",
				"minecraft:piston",
				"minecraft:sticky_piston",
				"minecraft:slime_block",
				"minecraft:observer",
				"minecraft:hopper",
				"minecraft:dispenser",
				"minecraft:dropper",
				"minecraft:lever",
				"minecraft:daylight_detector",
				"minecraft:tripwire_hook",
				"minecraft:trapped_chest",
				"minecraft:tnt",
				"minecraft:redstone_lamp",
				"minecraft:note_block",
				"minecraft:stone_button",
				"minecraft:oak_button",
				"minecraft:stone_pressure_plate",
				"minecraft:light_weighted_pressure_plate",
				"minecraft:heavy_weighted_pressure_plate",
				"minecraft:oak_pressure_plate",
				"minecraft:iron_door",
				"minecraft:oak_door",
				"minecraft:iron_trapdoor",
				"minecraft:oak_trapdoor",
				"minecraft:oak_fence_gate",
				"minecraft:powered_rail",
				"minecraft:detector_rail",
				"minecraft:rail",
				"minecraft:activator_rail",
				"minecraft:saddle",
				"minecraft:minecart",
				"minecraft:chest_minecart",
				"minecraft:furnace_minecart",
				"minecraft:tnt_minecart",
				"minecraft:hopper_minecart",
				"minecraft:carrot_on_a_stick",
				"minecraft:elytra",
				"minecraft:oak_boat",
				"minecraft:spruce_boat",
				"minecraft:birch_boat",
				"minecraft:jungle_boat",
				"minecraft:acacia_boat",
				"minecraft:dark_oak_boat",
				"minecraft:structure_block",
				"minecraft:flint_and_steel",
				"minecraft:apple",
				"minecraft:bow",
				"minecraft:arrow",
				"minecraft:coal",
				"minecraft:charcoal",
				"minecraft:diamond",
				"minecraft:emerald",
				"minecraft:lapis_lazuli",
				"minecraft:quartz",
				"minecraft:iron_ingot",
				"minecraft:gold_ingot",
				"minecraft:wooden_sword",
				"minecraft:wooden_shovel",
				"minecraft:wooden_pickaxe",
				"minecraft:wooden_axe",
				"minecraft:wooden_hoe",
				"minecraft:stone_sword",
				"minecraft:stone_shovel",
				"minecraft:stone_pickaxe",
				"minecraft:stone_axe",
				"minecraft:stone_hoe",
				"minecraft:golden_sword",
				"minecraft:golden_shovel",
				"minecraft:golden_pickaxe",
				"minecraft:golden_axe",
				"minecraft:golden_hoe",
				"minecraft:iron_sword",
				"minecraft:iron_shovel",
				"minecraft:iron_pickaxe",
				"minecraft:iron_axe",
				"minecraft:iron_hoe",
				"minecraft:diamond_sword",
				"minecraft:diamond_shovel",
				"minecraft:diamond_pickaxe",
				"minecraft:diamond_axe",
				"minecraft:diamond_hoe",
				"minecraft:stick",
				"minecraft:bowl",
				"minecraft:mushroom_stew",
				"minecraft:string",
				"minecraft:feather",
				"minecraft:gunpowder",
				"minecraft:wheat_seeds",
				"minecraft:wheat",
				"minecraft:bread",
				"minecraft:leather_helmet",
				"minecraft:leather_chestplate",
				"minecraft:leather_leggings",
				"minecraft:leather_boots",
				"minecraft:chainmail_helmet",
				"minecraft:chainmail_chestplate",
				"minecraft:chainmail_leggings",
				"minecraft:chainmail_boots",
				"minecraft:iron_helmet",
				"minecraft:iron_chestplate",
				"minecraft:iron_leggings",
				"minecraft:iron_boots",
				"minecraft:diamond_helmet",
				"minecraft:diamond_chestplate",
				"minecraft:diamond_leggings",
				"minecraft:diamond_boots",
				"minecraft:golden_helmet",
				"minecraft:golden_chestplate",
				"minecraft:golden_leggings",
				"minecraft:golden_boots",
				"minecraft:flint",
				"minecraft:porkchop",
				"minecraft:cooked_porkchop",
				"minecraft:painting",
				"minecraft:golden_apple",
				"minecraft:enchanted_golden_apple",
				"minecraft:oak_sign",
				"minecraft:bucket",
				"minecraft:water_bucket",
				"minecraft:lava_bucket",
				"minecraft:snowball",
				"minecraft:leather",
				"minecraft:milk_bucket",
				"minecraft:brick",
				"minecraft:clay_ball",
				"minecraft:paper",
				"minecraft:book",
				"minecraft:slime_ball",
				"minecraft:egg",
				"minecraft:compass",
				"minecraft:bundle",
				"minecraft:fishing_rod",
				"minecraft:clock",
				"minecraft:spyglass",
				"minecraft:glowstone_dust",
				"minecraft:cod",
				"minecraft:salmon",
				"minecraft:tropical_fish",
				"minecraft:pufferfish",
				"minecraft:cooked_cod",
				"minecraft:cooked_salmon",
				"minecraft:ink_sac",
				"minecraft:cocoa_beans",
				"minecraft:orange_dye",
				"minecraft:magenta_dye",
				"minecraft:light_blue_dye",
				"minecraft:yellow_dye",
				"minecraft:lime_dye",
				"minecraft:pink_dye",
				"minecraft:gray_dye",
				"minecraft:light_gray_dye",
				"minecraft:cyan_dye",
				"minecraft:purple_dye",
				"minecraft:green_dye",
				"minecraft:red_dye",
				"minecraft:bone_meal",
				"minecraft:bone",
				"minecraft:sugar",
				"minecraft:cake",
				"minecraft:white_bed",
				"minecraft:orange_bed",
				"minecraft:magenta_bed",
				"minecraft:light_blue_bed",
				"minecraft:yellow_bed",
				"minecraft:lime_bed",
				"minecraft:pink_bed",
				"minecraft:gray_bed",
				"minecraft:light_gray_bed",
				"minecraft:cyan_bed",
				"minecraft:purple_bed",
				"minecraft:blue_bed",
				"minecraft:brown_bed",
				"minecraft:green_bed",
				"minecraft:red_bed",
				"minecraft:black_bed",
				"minecraft:cookie",
				"minecraft:filled_map",
				"minecraft:shears",
				"minecraft:melon_slice",
				"minecraft:pumpkin_seeds",
				"minecraft:melon_seeds",
				"minecraft:beef",
				"minecraft:cooked_beef",
				"minecraft:chicken",
				"minecraft:cooked_chicken",
				"minecraft:rotten_flesh",
				"minecraft:ender_pearl",
				"minecraft:blaze_rod",
				"minecraft:ghast_tear",
				"minecraft:gold_nugget",
				"minecraft:nether_wart",
				"minecraft:potion",
				"minecraft:glass_bottle",
				"minecraft:spider_eye",
				"minecraft:fermented_spider_eye",
				"minecraft:blaze_powder",
				"minecraft:magma_cream",
				"minecraft:brewing_stand",
				"minecraft:cauldron",
				"minecraft:ender_eye",
				"minecraft:glistering_melon_slice",
				"minecraft:axolotl_spawn_egg",
				"minecraft:bat_spawn_egg",
				"minecraft:bee_spawn_egg",
				"minecraft:blaze_spawn_egg",
				"minecraft:cat_spawn_egg",
				"minecraft:cave_spider_spawn_egg",
				"minecraft:chicken_spawn_egg",
				"minecraft:cod_spawn_egg",
				"minecraft:cow_spawn_egg",
				"minecraft:creeper_spawn_egg",
				"minecraft:dolphin_spawn_egg",
				"minecraft:donkey_spawn_egg",
				"minecraft:drowned_spawn_egg",
				"minecraft:elder_guardian_spawn_egg",
				"minecraft:enderman_spawn_egg",
				"minecraft:endermite_spawn_egg",
				"minecraft:evoker_spawn_egg",
				"minecraft:fox_spawn_egg",
				"minecraft:ghast_spawn_egg",
				"minecraft:glow_squid_spawn_egg",
				"minecraft:goat_spawn_egg",
				"minecraft:guardian_spawn_egg",
				"minecraft:hoglin_spawn_egg",
				"minecraft:horse_spawn_egg",
				"minecraft:husk_spawn_egg",
				"minecraft:llama_spawn_egg",
				"minecraft:magma_cube_spawn_egg",
				"minecraft:mooshroom_spawn_egg",
				"minecraft:mule_spawn_egg",
				"minecraft:ocelot_spawn_egg",
				"minecraft:panda_spawn_egg",
				"minecraft:parrot_spawn_egg",
				"minecraft:phantom_spawn_egg",
				"minecraft:pig_spawn_egg",
				"minecraft:piglin_spawn_egg",
				"minecraft:piglin_brute_spawn_egg",
				"minecraft:pillager_spawn_egg",
				"minecraft:polar_bear_spawn_egg",
				"minecraft:pufferfish_spawn_egg",
				"minecraft:rabbit_spawn_egg",
				"minecraft:ravager_spawn_egg",
				"minecraft:salmon_spawn_egg",
				"minecraft:sheep_spawn_egg",
				"minecraft:shulker_spawn_egg",
				"minecraft:silverfish_spawn_egg",
				"minecraft:skeleton_spawn_egg",
				"minecraft:skeleton_horse_spawn_egg",
				"minecraft:slime_spawn_egg",
				"minecraft:spider_spawn_egg",
				"minecraft:squid_spawn_egg",
				"minecraft:stray_spawn_egg",
				"minecraft:strider_spawn_egg",
				"minecraft:trader_llama_spawn_egg",
				"minecraft:tropical_fish_spawn_egg",
				"minecraft:turtle_spawn_egg",
				"minecraft:vex_spawn_egg",
				"minecraft:villager_spawn_egg",
				"minecraft:vindicator_spawn_egg",
				"minecraft:wandering_trader_spawn_egg",
				"minecraft:witch_spawn_egg",
				"minecraft:wither_skeleton_spawn_egg",
				"minecraft:wolf_spawn_egg",
				"minecraft:zoglin_spawn_egg",
				"minecraft:zombie_spawn_egg",
				"minecraft:zombie_horse_spawn_egg",
				"minecraft:zombie_villager_spawn_egg",
				"minecraft:zombified_piglin_spawn_egg",
				"minecraft:experience_bottle",
				"minecraft:fire_charge",
				"minecraft:writable_book",
				"minecraft:written_book",
				"minecraft:item_frame",
				"minecraft:flower_pot",
				"minecraft:carrot",
				"minecraft:potato",
				"minecraft:baked_potato",
				"minecraft:poisonous_potato",
				"minecraft:map",
				"minecraft:golden_carrot",
				"minecraft:skeleton_skull",
				"minecraft:wither_skeleton_skull",
				"minecraft:player_head",
				"minecraft:zombie_head",
				"minecraft:creeper_head",
				"minecraft:dragon_head",
				"minecraft:nether_star",
				"minecraft:pumpkin_pie",
				"minecraft:firework_rocket",
				"minecraft:firework_star",
				"minecraft:enchanted_book",
				"minecraft:nether_brick",
				"minecraft:prismarine_shard",
				"minecraft:prismarine_crystals",
				"minecraft:rabbit",
				"minecraft:cooked_rabbit",
				"minecraft:rabbit_stew",
				"minecraft:rabbit_foot",
				"minecraft:rabbit_hide",
				"minecraft:armor_stand",
				"minecraft:iron_horse_armor",
				"minecraft:golden_horse_armor",
				"minecraft:diamond_horse_armor",
				"minecraft:lead",
				"minecraft:name_tag",
				"minecraft:command_block_minecart",
				"minecraft:mutton",
				"minecraft:cooked_mutton",
				"minecraft:white_banner",
				"minecraft:orange_banner",
				"minecraft:magenta_banner",
				"minecraft:light_blue_banner",
				"minecraft:yellow_banner",
				"minecraft:lime_banner",
				"minecraft:pink_banner",
				"minecraft:gray_banner",
				"minecraft:light_gray_banner",
				"minecraft:cyan_banner",
				"minecraft:purple_banner",
				"minecraft:blue_banner",
				"minecraft:brown_banner",
				"minecraft:green_banner",
				"minecraft:red_banner",
				"minecraft:black_banner",
				"minecraft:end_crystal",
				"minecraft:chorus_fruit",
				"minecraft:popped_chorus_fruit",
				"minecraft:beetroot",
				"minecraft:beetroot_seeds",
				"minecraft:beetroot_soup",
				"minecraft:dragon_breath",
				"minecraft:splash_potion",
				"minecraft:spectral_arrow",
				"minecraft:tipped_arrow",
				"minecraft:lingering_potion",
				"minecraft:shield",
				"minecraft:totem_of_undying",
				"minecraft:shulker_shell",
				"minecraft:iron_nugget",
				"minecraft:music_disc_13",
				"minecraft:music_disc_cat",
				"minecraft:music_disc_blocks",
				"minecraft:music_disc_chirp",
				"minecraft:music_disc_far",
				"minecraft:music_disc_mall",
				"minecraft:music_disc_mellohi",
				"minecraft:music_disc_stal",
				"minecraft:music_disc_strad",
				"minecraft:music_disc_ward",
				"minecraft:music_disc_11",
				"minecraft:music_disc_wait",
				"minecraft:music_disc_pigstep"
		);
	}
}
