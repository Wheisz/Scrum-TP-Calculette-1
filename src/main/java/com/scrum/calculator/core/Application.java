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

/**
 * Main application of the calculator.
 * @author Willy
 *
 */
public final class Application {

    /**
     * Constructor.
     */
    private Application() { };

    /**
     * Main method.
     * @param args String table.
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
     * Do the main operation.
     * @param operationNumber Operation to do.
     */
    @SuppressWarnings({"PMD.NullAssignment", "PMD.LawOfDemeter"})
    private static void doOperation(final int operationNumber) {

        AbstractOperation operation;

        switch (operationNumber) {
        case 1:
            operation = (AbstractOperation) new AddOperation();
            break;

        case 2:
            operation = (AbstractOperation) new SubOperation();
            break;

        default:
            System.out.println("Cette opération n'existe pas.");
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
            final Float result = operation.execute();

            UserInterface.displayMessage("Le résultat est : " + result);
        }


    }
}
