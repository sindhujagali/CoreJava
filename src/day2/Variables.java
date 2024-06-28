package day2;

public class Variables 
{

	public static void main(String[] args) 
	{
      // One way
		
	/*	int a;  //declaration
		a=100;  //assignment
		
		System.out.println(a); 
		
	// second way
		
		int b=200; //declaration+assignment
		System.out.println(b); // 200
		
		b=300;
		System.out.println(b); //300
		
		//Now b variable value can be different. It will be 200 & 300 */
		
	// Appraoch 1 -[ if all variables belongs to different datatype]
		
	/*	int a=100;
		int b=100;
		int c=100;  */
		
	// Appraoch 2  -[only possible if all variables belongs to same datatype]
	/*	int a,b,c;
		a=100;
		b=200;
		c=300;    */
	
	// Approach 3 -[only possible if all variables belongs to same datatype]
		int a=100,b=200,c=300;
		
		System.out.println("Value of a is:"+a); // + is called concandation
		System.out.println("Value of a is:"+b);
		System.out.println("Value of a is:"+c);
		
//, operator not allowed in java
		// if we use System.out.println(a+b+c); ==>Result is 600
		System.out.println(a+" "+b+" "+c);
	}

}
