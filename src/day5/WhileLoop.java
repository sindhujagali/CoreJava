package day5;

public class WhileLoop {

	public static void main(String[] args) {
		// While Loop
		
//Example1:- print 1..10 numbers
		
	/*	int i=1; //initilization
		while(i<=10) //condition. when i value become 10 it will stop
		{
			System.out.println(i);
			i++; //inc
		}
*/
		
//Example 2:- print hello message 10 times
		
/*		int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
*/
		
//Example 3:- Print only even numbers between 1 to 10		
//Approach 1		
		int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
//Approach 2
		
		int a=1;
		while(a<=10)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			a++;
		}

//Example4:- Print 1...10 and every number should print whether even or odd number		
		
		int b=1;
		while(b<=10)
		{
			if(b%2==0)
			{
				System.out.println(b + " is even number");
			}
			else
			{
				System.out.println(b + "is odd number");
				
			}
			b++;
		}

//Example 5:- Print 10 .... 1 in desc order
		
		int x=10;
		while(x>=1) // OR x>0
		{
			System.out.println(x);
			x--;
		}
	
	}

}
