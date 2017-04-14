package com.coffeeshop.cup;

import java.util.ArrayList;
import java.util.List;
import com.coffeeshop.ingredients.*;

public class Cup {

	private final List<Ingredients> mixture;

	private Cup(List<Ingredients> mixture) {
		this.mixture = mixture;
	}

	public static Cup createWithIngreedients(List<? super IngredientsFactory> ingreedientsFactories) {
		List<Ingredients> mixturePrep = new ArrayList<>();
		mixturePrep.add(0, ((IngredientsFactory) ingreedientsFactories.get(0)).create());
		mixturePrep.add(1, ((IngredientsFactory) ingreedientsFactories.get(1)).create());
		return new Cup(mixturePrep);
	};

	@Override
	public String toString() {
		return mixture.get(0).display()+" "+mixture.get(1).display();
	}

}
