package com.lance5057.extradelight;

import java.util.function.Supplier;

import com.lance5057.extradelight.loot.FoodLoot;
import com.mojang.serialization.Codec;

import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;

public class ExtraDelightLootModifiers {
	public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister
			.create(net.minecraftforge.registries.ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, ExtraDelight.MOD_ID);

	public static final Supplier<Codec<FoodLoot>> FOOD_LOOT = LOOT_MODIFIERS.register("food_loot", FoodLoot.CODEC);
}
