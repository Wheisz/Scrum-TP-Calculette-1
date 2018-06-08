package com.scrum.calculator.core;

import java.util.ArrayList;

/**
 * Abstract Operation class.
 * @author willy drouin
 */
public abstract class Operation {

	/**
	 * Number of parameters necessary to do the operation.
	 */
	protected int numberOfParameters;

	/**
	 * Method to execute operation.
	 * @param listNumber list of values to operate.
	 * @return result of operation.
	 */
	public abstract float execute(ArrayList<Float> listNumber);

	/**
	 * Getter number of parameters for operation.
	 * @return
	 */
	public int getNumberOfParameters(){
		return this.numberOfParameters;
	}
	
}
