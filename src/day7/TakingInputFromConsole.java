package day7;

import java.util.Scanner;

public class TakingInputFromConsole {

	public static void main(String[] args) {


		//int num=20; //hard coded value in code
		
		//Asking value in runtime by using Scanner Inbuild class
		
		//Create object for Class Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Number is "+num);
		
		System.out.println("Enter a decimal number");
		double num1=sc.nextDouble();
		System.out.println("Number is "+num1);
		
		System.out.println("Enter String");
		String st=sc.next();
		System.out.println("City is "+st);
		
	}

}
