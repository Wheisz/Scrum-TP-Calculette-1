/*
 *  Copyright 2018 - Ida Willy Théodore - M2 - IIA Laval
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 */

package com.scrum.calculator.ui;

import java.util.Scanner;

public class UserInterface {

	private static Scanner reader = new Scanner(System.in);
	
	public static void displayMessage(String message){
		System.out.println(message);
	}
	
	public static int getIntFromUser(){
		return reader.nextInt();
	}
	
	public static float getFloatFromUser(){
		return reader.nextFloat();
	}
}
