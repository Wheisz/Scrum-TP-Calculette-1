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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * Main application of the calculator.
 * @author Willy
 *
 */
public final class Application {

    /**
     * Logger for Application class.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Invoker of operations.
     */
    private static InvokeOperation operations = new InvokeOperation();

    /**
     * Value for addition.
     */
    private static final int ADDNUMBER = 1;
    /**
     * Value for subtraction.
     */
    private static final int SUBNUMBER = 2;
    /**
     * Value for multiplication.
     */
    private static final int MULTIPLYNUMBER = 3;
    /**
     * Value for division.
     */
    private static final int DIVIDENUMBER = 4;
    /**
     * Value for cosinus operation.
     */
    private static final int COSNUMBER = 5;
    /**
     * Value for sinus operation.
     */
    private static final int SINNUMBER = 6;
    /**
     * Value for tan operation.
     */
    private static final int TANNUMBER = 7;
    /**
     * Value for history.
     */
    private static final int HISTORYNUMBER = 8;
    /**
     * Value for leaving application.
     */
    private static final int LEAVENUMBER = 9;

    /**
     * Constructor.
     */
    private Application() { };

    /**
     * Main method.
     * @param args String table.
     */
    public static void main(final String[] args) {

        LOGGER.info("Application started");

        int userChoice = 0;
        final int LEAVE_NUMBER = 9;

        while (userChoice != LEAVE_NUMBER) {
            // User choice
            UserInterface.displayMessage("Veuillez choisir une op�ration");
            UserInterface.displayMessage(ADDNUMBER + " - Addition");
            UserInterface.displayMessage(SUBNUMBER + " - Soustraction");
            UserInterface.displayMessage(MULTIPLYNUMBER + " - Mutliplication");
            UserInterface.displayMessage(DIVIDENUMBER + " - Division");
            UserInterface.displayMessage(COSNUMBER + " - Cosinus");
            UserInterface.displayMessage(SINNUMBER + " - Sinus");
            UserInterface.displayMessage(TANNUMBER + " - Tangente");
            UserInterface.displayMessage(HISTORYNUMBER + " - Historique");
            UserInterface.displayMessage(LEAVENUMBER + " - Quitter");

            userChoice = UserInterface.getIntFromUser();         

            if (userChoice != LEAVE_NUMBER) {
                doOperation(userChoice);
            }
        }

        LOGGER.info("Application finished");
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
        case ADDNUMBER:
            operation = new AddOperation();
            break;
        // Soustraction
        case SUBNUMBER:
            operation = new SubOperation();
            break;

        // Multiplication
        case MULTIPLYNUMBER:
            operation = new MultiplyOperation();
            break;

        // Division
        case DIVIDENUMBER:
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
        case HISTORYNUMBER:
            UserInterface.displayMessage(operations.toStringHistory());
            break;

        default:
            UserInterface.displayMessage("Cette op�ration n'existe pas.");
            operation = null;
            break;
        }

        if (operation != null) {
            final ArrayList<Float> listOfFloat = new ArrayList<>();

            for (int i = 1; i <= operation.getNumberOfParams(); i++) {

                UserInterface.displayMessage("Entrez la valeur :" + i);
                listOfFloat.add(UserInterface.getFloatFromUser());
            }

            operation.setListNumber(listOfFloat);

            try {
                operations.storeAndExecute(operation);
                UserInterface.displayMessage(
                        "Le r�sultat est : " + operation.getResult());
            } catch (ArithmeticException e) {
                UserInterface.displayMessage(e.getMessage());
                doOperation(operationNumber);
            }
        }
    }
}
