package com.coffeeshop.app;


import java.util.ArrayList;
import java.util.List;

import com.coffeeshop.factories.*;
import com.coffeeshop.ingredients.*;
import com.coffeeshop.cup.*;

public class Main {

	public static void main(String[] args) {
		List<? super IngredientsFactory> ingreedientsFactories = new ArrayList<>();
		ingreedientsFactories.add(0, new CoffeeFactory());
		ingreedientsFactories.add(1, new AdditionsFactory());
		Cup cofeeDrink = Cup.createWithIngreedients(ingreedientsFactories);
		System.out.println(cofeeDrink);
		
	}

}
