package com.coffeeshop.factories;

import java.util.Arrays;
import java.util.List;

import com.coffeeshop.ingredients.*;

public class CoffeeFactory extends AbstractIngreedientsFactory {
	
	private static final List<? extends Ingredients> COFFEE = Arrays.asList(
			new Coffee("Java"), 
			new Coffee("Moka"),
			new Coffee("Grand"), 
			new Coffee("Nescafe"));

	@SuppressWarnings("unchecked")
	@Override
	protected List<? extends Ingredients> ingreedients() {
		return COFFEE;
	}
}
