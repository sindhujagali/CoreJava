package day18;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {

//Example 1:---
	/*	System.out.println("Program Started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int num=sc.nextInt();
		
		System.out.println(100/num); //ArithmeticException if we pass value as 0
		
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");
	*/	

//Example 2 :---
		/*	
	        System.out.println("Program Started...");
			
			Scanner sc=new Scanner(System.in);
		    
			int a[]=new int[5];
			System.out.println("Enter the position(0-4):");
			int pos=sc.nextInt();
			
			System.out.println("Enter the value");
			int value=sc.nextInt();
			
			a[pos]=value;//ArrayIndexOutOfBoundsException when we enter position as 5

			System.out.println("Program Completed...");
			System.out.println("Program Exited...");
		*/

		
//Example 3:--
		/*	
		System.out.println("Program Started...");
		
		String s="welcome";
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num); 
		
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");

		*/
		
//Example 4:--		
		System.out.println("Program Started...");
		String s=null;
		System.out.println(s.length());//NullPointerException
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");
	}

}
