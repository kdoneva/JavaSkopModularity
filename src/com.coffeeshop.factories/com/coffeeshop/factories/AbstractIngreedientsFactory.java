package com.coffeeshop.factories;

import java.util.List;
import java.util.Random;

import com.coffeeshop.ingredients.*;

public abstract class AbstractIngreedientsFactory implements IngredientsFactory {

	private static final Random RANDOM = new Random();

	@Override
	public Ingredients create() {
		int ingreedientIndex = RANDOM.nextInt(ingreedients().size());
		return ingreedients().get(ingreedientIndex);
	}

	abstract List<? extends Ingredients> ingreedients();
}
