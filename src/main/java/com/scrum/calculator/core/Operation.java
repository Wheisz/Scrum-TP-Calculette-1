package com.scrum.calculator.core;

import java.util.ArrayList;

public abstract class Operation {

	private float numberOfParameters;
		
	abstract float execute(ArrayList<Float> listNumber);
	
	public float getNumberOfParameters(){
		return this.numberOfParameters;
	}
	
}
