package com.lance5057.extradelight.workstations.chiller;

import net.minecraftforge.neoforge.fluids.FluidStack;
import net.minecraftforge.neoforge.items.IItemHandler;
import net.minecraftforge.neoforge.items.wrapper.RecipeWrapper;

public class ChillerRecipeWrapper extends RecipeWrapper {
	FluidStack tank;

	public ChillerRecipeWrapper(IItemHandler inv, FluidStack tank) {
		super(inv);
		this.tank = tank;
	}

}
