package com.lance5057.extradelight;

import com.lance5057.extradelight.items.components.ChillComponent;

import net.minecraft.world.item.Items;
import net.minecraftforge.bus.api.SubscribeEvent;
import net.minecraftforge.fml.common.EventBusSubscriber;
import net.minecraftforge.neoforge.event.ModifyDefaultComponentsEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ExtraDelight.MOD_ID)
public class ExtraDelightEvents {

	@SubscribeEvent
	public static void modifyComponents(ModifyDefaultComponentsEvent event) {
		event.modify(Items.BLUE_ICE,
				builder -> builder.set(ExtraDelightComponents.CHILL.value(), new ChillComponent(10000)));
		event.modify(Items.PACKED_ICE,
				builder -> builder.set(ExtraDelightComponents.CHILL.value(), new ChillComponent(1000)));
		event.modify(Items.ICE, builder -> builder.set(ExtraDelightComponents.CHILL.value(), new ChillComponent(100)));
		event.modify(Items.SNOW_BLOCK,
				builder -> builder.set(ExtraDelightComponents.CHILL.value(), new ChillComponent(250)));
		event.modify(Items.SNOWBALL,
				builder -> builder.set(ExtraDelightComponents.CHILL.value(), new ChillComponent(50)));
	}
}
