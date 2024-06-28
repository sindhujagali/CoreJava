package day3;

public class Operators 
{

	public static void main(String[] args) 
	{

		//1) Arithmetic Operators + - * / % 		
		// Works on Numeric type of data
		
		int a=20, b=10;
		
		int result= a+b;
		System.out.println("sum of a and b is:"+result); //addition of 2 variables
		System.out.println("sum of a and b is:"+(a+b)); //addition of 2 variables
		System.out.println("Diff of a and b is:"+(a-b)); //subtraction of 2 variables
		System.out.println("Muliplication of a and b is:"+(a*b)); //multiplication of 2 variables
		System.out.println("Division of a and b is:"+(a/b)); //Division of 2 variables ==>Quatation value
		System.out.println("Modulo division of a and b is:"+(a%b)); //modulo division of 2 variables ==>Remainder value

		
		
		//2) Relational/Comparison Operators  > >= < <= != ==
		// these are used to compare 2 variables and most imp operators and can use any datatypes
		// All will returns boolean value (true or false)
		
		System.out.println(a>b); //result as true ==>Greater than
		System.out.println(a<b); //result as false ==>less than
		System.out.println(a>=b);// result as true ==>Greater or equal
		System.out.println(a<=b);// result as false ==>Less or equal		
		b=20;	
		System.out.println(a>=b);// result as true ==>Greater or equal
		System.out.println(a<=b);// result as true ==>Less or equal
		System.out.println(a!=b);// result as false ==>Not equal
		System.out.println(a==b);// result as true  ==>Equal

		boolean resu= a>b;
		System.out.println(resu); //result is false
		
		
		//3) Logical Operators && || !
		// Always returns boolean values (true or false)
		// Only can use boolean data type
		
		// && ==>AND operator Both boolean variables should be true
		boolean c=true, d=true;		
		System.out.println(c&&d); //result true
		c=false;
		d=true;
		System.out.println(c&&d); //result false
		c=true;
		d=false;
		System.out.println(c&&d); //result false
		c=false;
		d=false;
		System.out.println(c&&d); //result false

        // || ==>OR Operator. Atleast one variable should be true
		c=true;
		d=true;
		System.out.println(c||d); //result true
		c=true;
		d=false;
		System.out.println(c||d); //result true
		c=false;
		d=true;
		System.out.println(c||d); //result true		
		c=false;
		d=false;
		System.out.println(c||d); //result false
		
		// ! ==>NOT Operator. Opposite variable value.
		c=true;
		System.out.println(!c); //result false
		c=false;
		System.out.println(!c); //result true
	   
		// More Examples:--
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true

		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10)); //true

	
		
		
	}

}
