package com.coffeeshop.factories;

import com.coffeeshop.ingredients.*;

public class Coffee implements Ingredients {

	private final String coffeeName;

	public Coffee(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	@Override
	public String display() {
		return coffeeName;
	}

}
