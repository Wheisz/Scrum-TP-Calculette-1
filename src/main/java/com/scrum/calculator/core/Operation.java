/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 */

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
	protected int numberOfParams;

	/**
	 * List of numbers to operate.
	 */
	protected ArrayList<Float> listNumber;

	/**
	 * Constructor.
	 */
	protected Operation() {
	}

	/**
	 * Method to execute operation.
	 * @return result of operation.
	 */
	public abstract float execute();

	/**
	 * Getter number of parameters for operation.
	 * @return
	 */
	public int getNumberOfParams(){
		return this.numberOfParams;
	}

	/**
	 * Setter of the list of number to operate
	 * @param listNumber
	 */
	public void setListNumber(final ArrayList<Float> listNumber) {
		this.listNumber = listNumber;
	}
	
}
