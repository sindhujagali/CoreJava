package day4;

public class LargestOf2Numbers {

	public static void main(String[] args) {
//Largest of 2 numbers
//Case 1:- by using if else condition
		int a=20, b=30;
		
	/*	if(a>b)
		{
			System.out.println("a is largest number");
		}
		else
		{
			System.out.println("b is largest number"); //b is largest number
		}
	*/	

//Case 2:- By using ternary operator
		
		int x=(a>b)?a:b; //expression is false. So b value assigned to x
		System.out.println(x);
		
		
		
		
	}

}
