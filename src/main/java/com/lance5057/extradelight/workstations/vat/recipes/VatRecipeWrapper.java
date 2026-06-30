package com.lance5057.extradelight.workstations.vat.recipes;

import com.lance5057.extradelight.workstations.FancyTank;

import net.minecraftforge.neoforge.items.IItemHandler;
import net.minecraftforge.neoforge.items.wrapper.RecipeWrapper;

public class VatRecipeWrapper extends RecipeWrapper {

	final FancyTank tank;

	public VatRecipeWrapper(IItemHandler inv, FancyTank fluid) {
		super(inv);
		this.tank = fluid;
	}

	public FancyTank getTank() {
		return tank;
	}
}
