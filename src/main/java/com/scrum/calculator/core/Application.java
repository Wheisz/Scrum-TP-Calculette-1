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

import com.scrum.calculator.operations.AddOperation;
import com.scrum.calculator.operations.DivideOperation;
import com.scrum.calculator.operations.FreeOperation;
import com.scrum.calculator.operations.ModOperation;
import com.scrum.calculator.operations.MultiplyOperation;
import com.scrum.calculator.operations.PercentOperation;
import com.scrum.calculator.operations.SubOperation;
import com.scrum.calculator.scient.CosOperation;
import com.scrum.calculator.scient.SinOperation;
import com.scrum.calculator.scient.TanOperation;
import com.scrum.calculator.ui.ConsoleUserInterface;
import com.scrum.calculator.ui.UserInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Main application of the calculator.
 * @author Willy
 *
 */
public final class Application {

    /** Logger. */
    private static final Logger LOGGER = LogManager.getLogger();

    /** Invoker of operations. */
    private static InvokeOperation operations = new InvokeOperation();

    /** User interface. **/
    private final UserInterface userInterface;

    /**
     * Application constructor.
     * @param userInterfaceParam UserInteface wanted
     */
    public Application(final UserInterface userInterfaceParam) {
        this.userInterface = userInterfaceParam;
    }

    /**
     * Main method.
     * @param args String table.
     */
    public static void main(final String[] args) {
        UserInterface userInter = new ConsoleUserInterface();

        Application app = new Application(userInter);
        app.run();
    }

    /**
     * Main run of the application.
     */
    public void run() {
        LOGGER.info("Application started");
        int userChoice = 0;

        while (userChoice != Constants.LEAVENUMBER) {

            // Display the main menu messages
            this.displayMenuMessages();

            // Get the wanted operation of user
            userChoice = this.userInterface.getIntFromUser();

            // If the user don't want to leave (9), do operation
            if (userChoice != Constants.LEAVENUMBER) {
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
    private void doOperation(final int operationNumber) {

        AbstractOperation operation = this.getChosenOperation(operationNumber);

        if (operation != null) {

            // Get the floats from the user
            final ArrayList<Float> listOfFloat = (ArrayList<Float>)
                    this.getUserFloats(operation.getNumberOfParams());

            // Set the list to the operations
            operation.setListNumber(listOfFloat);

            try {
                LOGGER.info("Application - doOperation - trying "
                        + "storeAndExecute operation : "
                        + operation.getClass().getName());

                // Store them for the history and execute them
                operations.storeAndExecute(operation);
                this.userInterface.displayMessage(
                        "Le résultat est : " + operation.getResult());

            } catch (ArithmeticException e) {
                LOGGER.error("Application - doOperation - failed "
                        + "storeAndExecute operation : "
                        + operation.getClass().getName()
                        + "message error = " + e.getMessage(), e);

                this.userInterface.displayMessage(e.getMessage());
                doOperation(operationNumber);
            }
        }
    }

    /**
     * Do the free operation while the user input a valid string.
     * @return AbstractOpeartion casted
     */
    public AbstractOperation doSetStringOperation() {
        FreeOperation freeOpe = new FreeOperation();

        try {
            freeOpe.setStringCalc(this.userInterface.getStringFromUser());
        } catch (ArithmeticException e) {
            LOGGER.info("Application - doOperation - failed "
                    + "manual fonction operation : "
                    + freeOpe.getClass().getName()
                    + e.getMessage());
            this.userInterface.displayMessage(e.getMessage());
            return null;
        }

        return (AbstractOperation) freeOpe;
    }

    /**
     * Display the main menu message.
     */
    public void displayMenuMessages() {
        // User choice
        this.userInterface.displayMessage("Veuillez choisir une op�ration");

        this.userInterface.displayMessage(Constants.ADDNUMBER + " - Addition");
        this.userInterface.displayMessage(
                Constants.SUBNUMBER + " - Soustraction");
        this.userInterface.displayMessage(
                Constants.MULTIPLYNUMBER + " - Mutliplication");
        this.userInterface.displayMessage(
                Constants.DIVIDENUMBER + " - Division");
        this.userInterface.displayMessage(Constants.COSNUMBER + " - Cosinus");
        this.userInterface.displayMessage(Constants.SINNUMBER + " - Sinus");
        this.userInterface.displayMessage(Constants.TANNUMBER + " - Tangente");
        this.userInterface.displayMessage(Constants.MODNUMBER + " - Modulo");
        this.userInterface.displayMessage(
                Constants.PERCENTNUMBER + " - Percentage");
        this.userInterface.displayMessage(
                Constants.MANUALFONCTION + " - Calcul libre");
        this.userInterface.displayMessage(
                Constants.HISTORYNUMBER + " - Historique");
        this.userInterface.displayMessage(
                Constants.CLEARHISTORYNUMBER + " - Effacer "
                + "Historique");
        this.userInterface.displayMessage(Constants.LEAVENUMBER + " - Quitter");
    }

    /**
     * Get the chosen operation.
     * @param operationNumber The wanted operation
     * @return AbstractOperation
     */
    public AbstractOperation getChosenOperation(final int operationNumber) {

        switch (operationNumber) {

        // Addition
        case Constants.ADDNUMBER:
            LOGGER.info("Application - doOperation : Addition");
            return (AbstractOperation) new AddOperation();

        // Soustraction
        case Constants.SUBNUMBER:
            LOGGER.info("Application - doOperation : Soustraction");
            return (AbstractOperation) new SubOperation();

        // Multiplication
        case Constants.MULTIPLYNUMBER:
            LOGGER.info("Application - doOperation : Multiplication");
            return (AbstractOperation) new MultiplyOperation();

        // Division
        case Constants.DIVIDENUMBER:
            LOGGER.info("Application - doOperation : Division");
            return (AbstractOperation) new DivideOperation();

        // Cosinus
        case Constants.COSNUMBER:
            LOGGER.info("Application - doOperation : Cosinus");
            return (AbstractOperation) new CosOperation();

        // Sinus
        case Constants.SINNUMBER:
            LOGGER.info("Application - doOperation : Sinus");
            return (AbstractOperation) new SinOperation();

            // Tangente
        case Constants.TANNUMBER:
            LOGGER.info("Application - doOperation : Tangente");
            return (AbstractOperation) new TanOperation();

            // Modulo
        case Constants.MODNUMBER:
            LOGGER.info("Application - doOperation : Modulo");
            return (AbstractOperation) new ModOperation();

            // Percent
        case Constants.PERCENTNUMBER:
            LOGGER.info("Application - doOperation : Percent");
            return (AbstractOperation) new PercentOperation();

        // Free operation
        case Constants.MANUALFONCTION:
            LOGGER.info("Application - doOperation : Free operation");

            AbstractOperation operationTemp = null;

            // While the value is not good
            while (operationTemp == null) {
                operationTemp = doSetStringOperation();
            }

            return (AbstractOperation) operationTemp;

        // Historique
        case Constants.HISTORYNUMBER:
            LOGGER.info("Application - doOperation : Historique");
            this.userInterface.displayMessage(operations.toStringHistory());
            return null;

        // Effacer Historique
        case Constants.CLEARHISTORYNUMBER:
            LOGGER.info("Application - doOperation : EffacerHistorique");
            this.userInterface.displayMessage(operations.clearHistory());
            return null;

        default:
            LOGGER.info("Application - doOperation : inconnue");
            this.userInterface.displayMessage("Cette opération n'existe pas.");
            return null;
        }
    }

    /**
     * Get the floats from user.
     * @param numberOfParams List of floats
     * @return List of float
     */
    public List<Float> getUserFloats(final int numberOfParams) {

        ArrayList<Float> listOfFloat = new ArrayList<Float>();

        for (int i = 1; i <= numberOfParams; i++) {
            this.userInterface.displayMessage("Entrez la valeur :" + i);
            listOfFloat.add(this.userInterface.getFloatFromUser());
        }

        return (List<Float>) listOfFloat;
    }
}
