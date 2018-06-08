package com.scrum.calculator.core;

public class Application {
	
	public static void main(){

		System.out.println("Veuillez choisir une opération");
		System.out.println("1 - Addition");
		System.out.println("2 - Soustraction");
		System.out.println("3 -  Mutliplication");
		
		
	}
	
	private void doOperation(int operationNumber){
		
		Operation operation = null;
		
		switch(operationNumber){
		case 1: 
			operation = (IOperation) new Addition();
			break;		
		
			
		case 2:
			operation = (IOperation) new Substraction();
			break;
			
		}
		
		
	}
	
}
