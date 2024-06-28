package day3;

public class TernaryOperator {

	public static void main(String[] args) {
//Ternary/Conditional Operator :- ?:
      //Synatx:- var= exp  ? result1: result2;		
		
		//example1:- 
		
	/*	int a=200, b=100;		
		int x= (a>b)? a: b; // a>b is true . Now a=100 is assigned to x
		// if experssion is true a value will assign to x
		// if expression is false b value will assign to x	
		System.out.println(x);
	*/
		
		//Example 2:-
		
	   //	int x=(1==1)?100:200; //expression is true
	   //	System.out.println(x); //100 is assigned to x
		
      //	   int x=(1==2)?100:200; //expression is false
     //	   System.out.println(x); //200	
		
		//Example 3:-
		
		int person_age=30;
		String res=(person_age>=18)? "Eligible":"Not eligible";
		System.out.println(res); //Eligible
		
		
	}

}
