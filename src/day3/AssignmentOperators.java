package day3;

public class AssignmentOperators
{

	public static void main(String[] args) 
	{
// Assignment Operators = += -=  *= /= %=
		
		int a=10;
		a+=5;      //  a=a+5; 
		System.out.println(a); //15
		
		//a is 15 now
		a-=5;     //a=a-5;
		System.out.println(a); //5
		
		//a is 5 now
		a*=2;    //a=a*2;
		System.out.println(a); //20
        
		//a is 20 now
		a/=2; //a=a/2;
		System.out.println(a); //5
		
		//a is 5 now
		a%=2; //a=a%2;
		System.out.println(a); //0
		
// difference b/w == = ?
		// == is relational opertor which compare b/w two variables and always return true or false
		// = is assignment operator which assign value to variable
		
	}

}
