package com.bptn.course._02_variables;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an Integer: ");
		int num = scan.nextInt();
		
		scan.nextLine(); //Flush the buffer
		
		System.out.println("Please enter a String: ");
		String str = scan.nextLine();
		
		System.out.println("The number is: " + num);
		System.out.println("The string is: " + str);
		
		scan.close();
	}

}
