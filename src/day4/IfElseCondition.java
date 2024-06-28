package day4;

public class IfElseCondition {

	public static void main(String[] args) {
		// syntax
		
		/*
		 if(condition) //if condition true if statment will execute
		 {
		   statments; 
		 }
		 else  //if condition is false else statment will execute
		 {
		   statments;
		 }
		 */
//Example 1:--		
	/*	int person_age=30;
		if(person_age>=38) // used relational operators. If expression is true then will execute statments.
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
	*/	
		// if Single statments no need of {}
		// we have multiple statments. we need use {}
		// Better to use {} even statments is single
		int person_age=30;
		if(person_age>=38) // used relational operators. If expression is true then will execute statments.
		
			System.out.println("eligible for vote");

		else
		
			System.out.println("Not eligible for vote");
		
//Example 2:- Even or Odd number
// If any number divide by 2 and reminder is 0 then it is even number
// If any number divide by 2 and remainder is other than 0 then it is odd number
		
		int num=10;
		if(num%2==0) // % returns reminder value
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");

		}

//Example3:- Check number is positive,negative or zero
//If any number greater than zero==>Positive number
//If any number less than zero==>Negative number
//If any number equal to zero==>Zero
//Multiple conditions called as if..else ladder

		//syntax:- 
		/*
		 if(condition1)
		 {
		 }
		 else if (condition2)
		 {
		 }
		 else if (condtion3)
		 {
		 }
		 else
		 {
		 }
		 */
		int num1=0;
		if(num1>0)
		{
			System.out.println("Positive number");
		}
		else if (num1<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("zero");
		}
		
//Example4:- Largest of 3 numbers
//By comparing each number with another number
//a>b and a>c ==>a is largest
		
		int a=10,b=20,c=30;
		if (a>b && a>c)
		{
			System.out.println("a is largest number");
		}
		else if (b>a && b>c)
		{
			System.out.println("ab is largest number");
		}
		else
		{
			System.out.println("c is largest number");
		}
		
//Example 5:- Multiple statments
// we can pass any expression or can pass directly boolean value
// always if will return boolean value
	/*	if(false)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2); 
		}
    */
		
	/*	if (1==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);

		}
	*/
		

		
	}

}
