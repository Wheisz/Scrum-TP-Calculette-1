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

import java.util.Scanner;

/**
 * User interface class.
 * @author Willy
 *
 */
public final class UserInterface {

    /**
     * Scanner to get user values.
     */
    private static Scanner reader = new Scanner(System.in);

    /**
     * Private class.
     */
    private UserInterface() { };

    /**
     * Display a message to the user.
     * @param message to display.
     */
    public static void displayMessage(final String message) {
        System.out.println(message);
    }

    /**
     * Ask the user to choose a number.
     * @return User's number
     */
    public static int getIntFromUser() {
        try {
            return Integer.parseInt(reader.nextLine());
        } catch (NumberFormatException e) {
            UserInterface.displayMessage("Veuillez saisir une valeur valide.");
            return getIntFromUser();
        }
    }

    /**
     * Ask the user to choose a float number.
     * @return Float number of the user
     */
    public static float getFloatFromUser() {
        try {
            return Float.parseFloat(reader.nextLine());
        } catch (NumberFormatException e) {
            UserInterface.displayMessage("Veuillez saisir une valeur valide.");
            return getFloatFromUser();
        }
    }
}
