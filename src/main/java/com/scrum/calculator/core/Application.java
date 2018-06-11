/*
 *  Copyright 2018 - Ida Willy ThÃ©odore - M2 - IIA Laval
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
import com.scrum.calculator.sub.SubOperation;
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
			operation = (Operation) new SubOperation();
			break;

		}
		for (int i = 1; i <= operation.getNumberOfParams(); i++){

			UserInterface.displayMessage("Entrez la valeur :" + i);
			listOfFloat.add(UserInterface.getFloatFromUser());		
		}
		
		operation.setListNumber(listOfFloat);
		Float result = operation.execute();

		UserInterface.displayMessage("Le résultat est : " + result);		

	}
}
