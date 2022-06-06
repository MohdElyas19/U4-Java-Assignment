package com.assign13;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Start of main");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			
			String message = null;
			
			int num = num1/num2;
			
			if(num > 10) {
				message = "Welcome to Exception Handling";
				System.out.println("Message is :"+message.toUpperCase());
			}
			else {
				System.out.println("String value is null");
			}
			
			}catch(ArithmeticException ae) {
			System.out.println("num2 should not be 0");
		}catch(Exception e) {
			System.out.println("WELCOME TO EXCEPTION HANDLING");
		}
		
	}

}
