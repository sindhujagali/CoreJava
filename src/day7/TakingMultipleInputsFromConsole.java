package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromConsole {

	public static void main(String[] args) {

		//Create object for Class Scanner
		//int datatype
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num=sc.nextInt();
		
		System.out.println("Enter second Number");
		int num1=sc.nextInt();
		
		System.out.println("Addition of 2 number :"+(num+num1));
		
		//String Datatype
		
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Name is "+name);
		
		
		//int datatype
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter Unknown value");
		Object value=sc.next();
		System.out.println("output is "+value);
	}

}
