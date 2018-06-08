package com.scrum.calculator.core;

import java.util.ArrayList;

public abstract class Operation {

	private int numberOfParameters;
		
	public abstract float execute(ArrayList<Float> listNumber);
	
	public int getNumberOfParameters(){
		return this.numberOfParameters;
	}
	
}
