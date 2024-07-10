package day18;

import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {

	System.out.println("Program Started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num); //ArithmeticException if we pass value as 0
		}
		catch (ArithmeticException e)
		{
			System.out.println("Invalid number");
		}
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");

		
		
		

	}

}
