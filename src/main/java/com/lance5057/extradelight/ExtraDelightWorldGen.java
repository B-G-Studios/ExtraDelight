package com.lance5057.extradelight;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraftforge.registries.DeferredRegister;

public class ExtraDelightWorldGen {
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(net.minecraftforge.registries.ForgeRegistries.FEATURES,
			ExtraDelight.MOD_ID);

	public static final ResourceKey<Level> CORNFIELD = ResourceKey.create(Registries.DIMENSION,
			new ResourceLocation(ExtraDelight.MOD_ID, "cornfield"));
	public static final ResourceKey<Biome> CORNFIELD_BIOME = ResourceKey.create(Registries.BIOME,
			new ResourceLocation(ExtraDelight.MOD_ID, "cornfield"));
	public static final ResourceKey<DimensionType> CORNFIELD_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
			new ResourceLocation(ExtraDelight.MOD_ID, "corn"));
	public static final ResourceKey<LevelStem> CORNFIELD_STEM = ResourceKey.create(Registries.LEVEL_STEM,
			new ResourceLocation(ExtraDelight.MOD_ID, "cornfield"));
	public static final ResourceKey<NoiseGeneratorSettings> CORNFIELD_NOISE = ResourceKey
			.create(Registries.NOISE_SETTINGS, new ResourceLocation(ExtraDelight.MOD_ID, "cornfield"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_CORN_MAZE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "corn_maze_feature"));
	public static final ResourceKey<PlacedFeature> PLACED_CORN_MAZE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "corn_placer"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_CORN_RAIL = ResourceKey.create(
			Registries.CONFIGURED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "corn_rail_feature"));
	public static final ResourceKey<PlacedFeature> PLACED_CORN_RAIL = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "rail_placer"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_CINNAMON_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "cinnamon"));
	public static final ResourceKey<PlacedFeature> PLACED_CINNAMON_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "cinnamon"));
	
	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_HAZELNUT_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "hazelnut"));
	public static final ResourceKey<PlacedFeature> PLACED_HAZELNUT_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "hazelnut"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_APPLE_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "apple"));
	public static final ResourceKey<PlacedFeature> PLACED_APPLE_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "apple"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_LEMON_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "lemon"));
	public static final ResourceKey<PlacedFeature> PLACED_LEMON_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "lemon"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_LIME_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "lime"));
	public static final ResourceKey<PlacedFeature> PLACED_LIME_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "lime"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_ORANGE_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "orange"));
	public static final ResourceKey<PlacedFeature> PLACED_ORANGE_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "orange"));

	public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_GRAPEFRUIT_TREE = ResourceKey.create(
			Registries.CONFIGURED_FEATURE, new ResourceLocation(ExtraDelight.MOD_ID, "grapefruit"));
	public static final ResourceKey<PlacedFeature> PLACED_GRAPEFRUIT_TREE = ResourceKey.create(Registries.PLACED_FEATURE,
			new ResourceLocation(ExtraDelight.MOD_ID, "grapefruit"));

	public static final ResourceKey<StructureSet> STRUCTURE_SET = ResourceKey.create(Registries.STRUCTURE_SET,
			new ResourceLocation(ExtraDelight.MOD_ID, "structure_set"));

	public static final ResourceLocation BARN = new ResourceLocation(ExtraDelight.MOD_ID, "barn");
	public static final ResourceLocation CAMP1 = new ResourceLocation(ExtraDelight.MOD_ID, "camp1");
	public static final ResourceLocation CAMP2 = new ResourceLocation(ExtraDelight.MOD_ID, "camp2");
	public static final ResourceLocation DOLL_CIRCLE = new ResourceLocation(ExtraDelight.MOD_ID, "doll_circle");
	public static final ResourceLocation DOLL_CIRCLE1 = new ResourceLocation(ExtraDelight.MOD_ID, "doll_circle1");
	public static final ResourceLocation DOLL_CIRCLE2 = new ResourceLocation(ExtraDelight.MOD_ID, "doll_circle2");
	public static final ResourceLocation DOLL_CIRCLE3 = new ResourceLocation(ExtraDelight.MOD_ID, "doll_circle3");
	public static final ResourceLocation DOLL_CIRCLE4 = new ResourceLocation(ExtraDelight.MOD_ID, "doll_circle4");
	public static final ResourceLocation FOUNTAIN = new ResourceLocation(ExtraDelight.MOD_ID, "fountain");
	public static final ResourceLocation HAUNTEDHOUSE = new ResourceLocation(ExtraDelight.MOD_ID, "hauntedhouse");
	public static final ResourceLocation PUMPKIN_PATCH2 = new ResourceLocation(ExtraDelight.MOD_ID, "pumpkin_patch2");
	public static final ResourceLocation PUMPKIN_PATCH3 = new ResourceLocation(ExtraDelight.MOD_ID, "pumpkin_patch3");
	public static final ResourceLocation PUMPKIN_PATCH4 = new ResourceLocation(ExtraDelight.MOD_ID, "pumpkin_patch4");
	public static final ResourceLocation PUMPKIN_PATCH5 = new ResourceLocation(ExtraDelight.MOD_ID, "pumpkin_patch5");
	public static final ResourceLocation PUMPKIN_PILE1 = new ResourceLocation(ExtraDelight.MOD_ID, "pumpkin_pile1");
	public static final ResourceLocation RAIL_STOP = new ResourceLocation(ExtraDelight.MOD_ID, "rail_stop");
	public static final ResourceLocation SACRIFICE = new ResourceLocation(ExtraDelight.MOD_ID, "sacrifice");
	public static final ResourceLocation SACRIFICE2 = new ResourceLocation(ExtraDelight.MOD_ID, "sacrifice2");
	public static final ResourceLocation SIGN = new ResourceLocation(ExtraDelight.MOD_ID, "sign");
	public static final ResourceLocation TABLE1 = new ResourceLocation(ExtraDelight.MOD_ID, "table1");
	public static final ResourceLocation TABLE2 = new ResourceLocation(ExtraDelight.MOD_ID, "table2");
	public static final ResourceLocation TABLE3 = new ResourceLocation(ExtraDelight.MOD_ID, "table3");
	public static final ResourceLocation TABLE4 = new ResourceLocation(ExtraDelight.MOD_ID, "table4");
}
