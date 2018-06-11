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
