/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/****************************************************************************
 * Calculator application.
 *
 *
 * ***************************************************************************/
package com.scrum.calculator.core;

import com.scrum.calculator.add.AddOperation;
import com.scrum.calculator.divide.DivideOperation;
import com.scrum.calculator.multiply.MultiplyOperation;
import com.scrum.calculator.scient.CosOperation;
import com.scrum.calculator.scient.SinOperation;
import com.scrum.calculator.scient.TanOperation;
import com.scrum.calculator.sub.SubOperation;
import com.scrum.calculator.ui.UserInterface;

import java.util.ArrayList;

/**
 * Main application of the calculator.
 * @author Willy
 *
 */
public final class Application {

    private static InvokeOperation operations = new InvokeOperation();

    /**
     * Constructor.
     */
    private Application() { };

    /**
     * Main method.
     * @param args String table.
     */
    public static void main(final String[] args) { 

        int userChoice = 0;

        while (userChoice != 9) {
            // User choice
            UserInterface.displayMessage("Veuillez choisir une op�ration");
            UserInterface.displayMessage("1 - Addition");
            UserInterface.displayMessage("2 - Soustraction");
            UserInterface.displayMessage("3 - Mutliplication");
            UserInterface.displayMessage("4 - Division");
            UserInterface.displayMessage("5 - Cosinus");
            UserInterface.displayMessage("6 - Sinus");
            UserInterface.displayMessage("7 - Tangente");
            UserInterface.displayMessage("8 - Historique");
            UserInterface.displayMessage("9 - Quitter");

            userChoice = UserInterface.getIntFromUser();         

            if (userChoice != 9 )
                doOperation(userChoice);    
        }

        UserInterface.displayMessage("Ex�cution termin�e.");
    }

    /**
     * Do the main operation.
     * @param operationNumber Operation to do.
     */
    @SuppressWarnings({"PMD.NullAssignment", "PMD.LawOfDemeter"})
    private static void doOperation(final int operationNumber) {

        AbstractOperation operation = null;

        switch (operationNumber) {
        // Addition
        case 1:
            operation = new AddOperation();
            break;
        // Soustraction
        case 2:
            operation = new SubOperation();
            break;

        // Multiplication
        case 3:
            operation = new MultiplyOperation();
            break;       

        // Division
        case 4:
            operation = new DivideOperation();
            break;

        // Cosinus
        case 5:
            operation = new CosOperation();
            break;
            
        // Sinus
        case 6:
            operation = new SinOperation();
            break;
            
        // Tangente
        case 7:
            operation = new TanOperation();
            break;
            
        // Historique
        case 8:
            UserInterface.displayMessage(operations.toStringHistory());
            break;

        default:
            UserInterface.displayMessage("Cette op�ration n'existe pas.");
            operation = null;
            break;
        }

        if (operation != null) {
            final ArrayList<Float> listOfFloat = new ArrayList<Float>();

            for (int i = 1; i <= operation.getNumberOfParams(); i++) {

                UserInterface.displayMessage("Entrez la valeur :" + i);
                listOfFloat.add(UserInterface.getFloatFromUser());
            }

            operation.setListNumber(listOfFloat);

            try {
                operations.storeAndExecute(operation);
                UserInterface.displayMessage("Le r�sultat est : " + operation.getResult());
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                doOperation(operationNumber);
            }
        }
    }
}
