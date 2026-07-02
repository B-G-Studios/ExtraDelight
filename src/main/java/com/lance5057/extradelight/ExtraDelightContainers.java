package com.lance5057.extradelight;

import java.util.function.Supplier;

import com.lance5057.extradelight.blocks.countercabinet.CounterCabinetMenu;
import com.lance5057.extradelight.blocks.picnicbasket.PicnicBasketMenu;
import com.lance5057.extradelight.blocks.sink.SinkCabinetMenu;
import com.lance5057.extradelight.displays.food.FoodDisplayMenu;
import com.lance5057.extradelight.displays.knife.KnifeBlockMenu;
import com.lance5057.extradelight.displays.spice.SpiceRackMenu;
import com.lance5057.extradelight.displays.wreath.WreathMenu;
import com.lance5057.extradelight.gui.StyleableMenu;
import com.lance5057.extradelight.workstations.chiller.ChillerMenu;
import com.lance5057.extradelight.workstations.doughshaping.DoughShapingMenu;
import com.lance5057.extradelight.workstations.meltingpot.MeltingPotMenu;
import com.lance5057.extradelight.workstations.mixingbowl.MixingBowlMenu;
import com.lance5057.extradelight.workstations.oven.OvenMenu;
import com.lance5057.extradelight.workstations.vat.VatMenu;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.bus.api.IEventBus;
import net.minecraftforge.common.extensions.IMenuTypeExtension;
import net.minecraftforge.registries.DeferredRegister;

public class ExtraDelightContainers {

	public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(Registries.MENU,
			ExtraDelight.MOD_ID);

	public static final Supplier<MenuType<OvenMenu>> OVEN_MENU = MENU_TYPES.register("oven",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(OvenMenu::new));
	public static final Supplier<MenuType<MixingBowlMenu>> MIXING_BOWL_MENU = MENU_TYPES.register("mixing_bowl",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(MixingBowlMenu::new));

	public static final Supplier<MenuType<FoodDisplayMenu>> FOOD_DISPLAY_MENU = MENU_TYPES.register("food_display",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(FoodDisplayMenu::new));
	public static final Supplier<MenuType<KnifeBlockMenu>> KNIFE_BLOCK_MENU = MENU_TYPES.register("knife_block",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(KnifeBlockMenu::new));
	public static final Supplier<MenuType<SpiceRackMenu>> SPICE_RACK_MENU = MENU_TYPES.register("spice_rack",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(SpiceRackMenu::new));

	public static final Supplier<MenuType<DoughShapingMenu>> DOUGH_SHAPING_MENU = MENU_TYPES.register("dough_shaping",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(DoughShapingMenu::new));
	public static final Supplier<MenuType<WreathMenu>> WREATH_MENU = MENU_TYPES.register("wreath",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(WreathMenu::new));
	public static final Supplier<MenuType<SinkCabinetMenu>> SINK_MENU = MENU_TYPES.register("sink",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(SinkCabinetMenu::new));
	public static final Supplier<MenuType<CounterCabinetMenu>> COUNTER_CABINET_MENU = MENU_TYPES
			.register("counter_cabinet", () -> net.minecraftforge.common.extensions.IForgeMenuType.create(CounterCabinetMenu::new));
	public static final Supplier<MenuType<StyleableMenu>> STYLE_MENU = MENU_TYPES.register("style",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(StyleableMenu::new));

	public static final Supplier<MenuType<MeltingPotMenu>> MELTING_POT_MENU = MENU_TYPES.register("melting_pot",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(MeltingPotMenu::new));
	public static final Supplier<MenuType<ChillerMenu>> CHILLER_MENU = MENU_TYPES.register("chiller",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(ChillerMenu::new));

	public static final Supplier<MenuType<VatMenu>> VAT_MENU = MENU_TYPES.register("vat",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(VatMenu::new));

	public static final Supplier<MenuType<PicnicBasketMenu>> PICNIC_BASKET_MENU = MENU_TYPES.register("picnic_basket",
			() -> net.minecraftforge.common.extensions.IForgeMenuType.create(PicnicBasketMenu::new));

	public static void register(IEventBus modBus) {
		MENU_TYPES.register(modBus);
	}

}
