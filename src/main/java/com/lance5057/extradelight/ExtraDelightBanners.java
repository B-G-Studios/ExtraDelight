package com.lance5057.extradelight;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ExtraDelightBanners {
	public static final DeferredRegister<BannerPattern> BANNER_PATTERNS = DeferredRegister
			.create(Registries.BANNER_PATTERN, ExtraDelight.MOD_ID);

	public static final TagKey<BannerPattern> CITRUS_PATTERN_TAG = TagKey.create(Registries.BANNER_PATTERN,
			ExtraDelight.modLoc("citrus"));

	public static final RegistryObject<BannerPattern> CITRUS_PITH = BANNER_PATTERNS.register("banner_pattern_citrus_pith",
			() -> new BannerPattern("ed_citrus_pith"));
	
	public static final RegistryObject<BannerPattern> CITRUS_FRUIT = BANNER_PATTERNS.register("banner_pattern_citrus_fruit",
			() -> new BannerPattern("ed_citrus_fruit"));
}
