/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

/****************************************************************************
 * Calculator application.
 *
 * 
 * ***************************************************************************/
package com.scrum.calculator.core;

import com.scrum.calculator.add.AddOperation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main application of the calculator
 * @author Willy
 *
 */
public class Application {
	
	// Reader to the user
	private static Scanner reader = new Scanner(System.in);
		
	/**
	 * Main method
	 */
	public static void main(final String[] args) {

		// User choice
		System.out.println("Veuillez choisir une op�ration");
		System.out.println("1 - Addition");
		System.out.println("2 - Soustraction");
		System.out.println("3 -  Mutliplication");
		
		doOperation(reader.nextInt());
	}
	
	/**
	 * Do the operation
	 * @param operationNumber id of operation
	 */
	private static void doOperation(int operationNumber){
		
		Operation operation = null;
		ArrayList<Float> listOfFloat = new ArrayList<Float>();
		
		
		switch(operationNumber){
		case 1: 
			operation = (Operation) new AddOperation();
			break;		
		
			
		case 2:
			//operation = (IOperation) new Substraction();
			break;
			
		}
		
		for (int i = 0; i < operation.getNumberOfParams(); i++){
			
			System.out.println("Entrez la valeur " + i);
			listOfFloat.add(reader.nextFloat());		
		}

		operation.setListNumber(listOfFloat);
		Float result = operation.execute();
		
		System.out.println("Le résultat est :" + result);
	}
	
}
