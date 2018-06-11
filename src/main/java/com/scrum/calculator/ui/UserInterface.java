package com.scrum.calculator.ui;

import java.util.Scanner;

/**
 * User interface class.
 * @author Willy
 *
 */
public final class UserInterface {

    /**
     * Private class.
     */
    private UserInterface() { };

    /**
     * Scanner to get user values.
     */
    private static Scanner reader = new Scanner(System.in);

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
        return reader.nextInt();
    }

    /**
     * Ask the user to choose a float number.
     * @return Float number of the user
     */
    public static float getFloatFromUser() {
        return reader.nextFloat();
    }
}
