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
		
		Float result = operation.execute(listOfFloat);
		
		System.out.println("Le résultat est :" + result);
	}
	
}
