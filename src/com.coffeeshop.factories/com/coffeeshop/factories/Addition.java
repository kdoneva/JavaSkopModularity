package com.coffeeshop.factories;

import com.coffeeshop.ingredients.*;

public class Addition implements Ingredients{

	String additionName;
	
	public Addition(String additionName) {
		this.additionName = additionName;
	}

	@Override
	public String display() {
		return additionName;
	}

}
