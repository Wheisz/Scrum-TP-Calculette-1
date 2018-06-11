/****************************************************************************
 * Calculator application.
 *
 * 
 * ***************************************************************************/
package com.scrum.calculator.core;

import com.scrum.calculator.add.AddOperation;
import com.scrum.calculator.ui.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main application of the calculator
 * @author Willy
 *
 */
public class Application {

	/**
	 * Main method
	 */
	public static void main(final String[] args) {

		// User choice
		UserInterface.displayMessage("Veuillez choisir une opération");
		UserInterface.displayMessage("1 - Addition");
		UserInterface.displayMessage("2 - Soustraction");
		UserInterface.displayMessage("3 - Mutliplication");

		doOperation(UserInterface.getIntFromUser());
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
		for (int i = 1; i <= operation.getNumberOfParams(); i++){

			UserInterface.displayMessage("Entrez la valeur :" + i);
			listOfFloat.add(UserInterface.getFloatFromUser());		

			operation.setListNumber(listOfFloat);
			Float result = operation.execute();

			UserInterface.displayMessage("Le résultat est : " + result);		


		}
	}
}
