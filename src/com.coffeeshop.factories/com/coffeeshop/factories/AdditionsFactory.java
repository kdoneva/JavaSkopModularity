package com.coffeeshop.factories;

import java.util.Arrays;
import java.util.List;

import com.coffeeshop.ingredients.*;

public class AdditionsFactory extends AbstractIngreedientsFactory{

	private static final List<? extends Ingredients> ADDITION = Arrays.asList(
			new Addition("Milk"), 
			new Addition("Chocholate"),
			new Addition("Caramel"), 
			new Addition("Vanila"));
	
	@SuppressWarnings("unchecked")
	@Override
	 List<? extends Ingredients> ingreedients() {
		return ADDITION;
	}

}
