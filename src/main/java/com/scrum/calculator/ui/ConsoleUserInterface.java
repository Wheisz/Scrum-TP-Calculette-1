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

package com.scrum.calculator.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * User interface class.
 * @author Willy
 *
 */
public final class ConsoleUserInterface implements UserInterface {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Scanner to get user values.
     */
    private static Scanner reader = new Scanner(System.in);

    /**
     * Private class.
     */
    public ConsoleUserInterface() {
        LOGGER.debug(this.getClass().getName() + " - Constructor");
    }

    /**
     * Display a message to the user.
     * @param message to display.
     */
    public void displayMessage(final String message) {
        LOGGER.debug(ConsoleUserInterface.class.getName()
                + " - displayMessage : " + message);
        System.out.println(message);
    }

    /**
     * Ask the user to choose a number.
     * @return User's number
     */
    public int getIntFromUser() {
        try {
            LOGGER.info(ConsoleUserInterface.class.getName()
                    + " - asking user for int");

            return Integer.parseInt(reader.nextLine());
        } catch (NumberFormatException e) {
            String errorMessage =
                    "Veuillez saisir une valeur valide : un entier";

            LOGGER.error(ConsoleUserInterface.class.getName()
                    + " - " + errorMessage, e);

            this.displayMessage(errorMessage);
            return getIntFromUser();
        }
    }

    /**
     * Ask the user to choose a float number.
     * @return Float number of the user
     */
    public float getFloatFromUser() {
        try {
            LOGGER.info(ConsoleUserInterface.class.getName()
                    + "  - asking user for float");

            return Float.parseFloat(reader.nextLine());
        } catch (NumberFormatException e) {
            String errorMessage =
                    "Veuillez saisir une valeur valide : un float";

            LOGGER.error(ConsoleUserInterface.class.getName()
                    + " - " + errorMessage, e);

            this.displayMessage(errorMessage);
            return getFloatFromUser();
        }
    }

    /**
     * Ask the user to input a string.
     * @return User string
     */
    public String getStringFromUser() {
        LOGGER.info(ConsoleUserInterface.class.getName()
                + " - asking user for string");
        displayMessage("Veuillez saisir une chaine de calcul valide :");

        return reader.nextLine();
    }
}
