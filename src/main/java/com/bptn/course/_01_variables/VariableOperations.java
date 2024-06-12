package com.bptn.course._01_variables;

public class VariableOperations {

	public static void main(String[] args) {
		int firstNumber = 3;
		
		int secondNumber = 4;
		
		int add = firstNumber + secondNumber;
		int subtract = firstNumber - secondNumber;
		int multiply = firstNumber * secondNumber;
		int divide = firstNumber / secondNumber;
		
		System.out.printf("firstNumber = %d \n", firstNumber);
		System.out.printf("secondNumber = %d \n", secondNumber);
		
		System.out.printf("added = %d \n", add);
		System.out.printf("subtracted = %d \n", subtract);
		System.out.printf("multiplied = %d \n", multiply);
		System.out.printf("divided = %d \n", divide);
		
		firstNumber = 7;
		secondNumber = 10;
		
		System.out.printf("firstNumber = %d \n", firstNumber);
		System.out.printf("secondNumber = %d \n", secondNumber);
		
		char singular = 'x';
		String course = "bptn";
		
		System.out.println("Char value = " + singular);
		System.out.println("String value = " + course);
				

	}

}
