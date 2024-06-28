package day10;

public class Empolyee {

//Class contains Variables and Methods
	
//Variables:-
	int eid;
	String ename;
	String Job;
	int sal;
	
//Methods:- Creating additional User defined methods along with main method	
//Method should define with return type. If don't return anything we need mention as void
// Can't create method inside another method
//If we create variables in method that are called local variables and can be accessed only within that method.
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(Job);
		System.out.println(sal);
	}

/*	public static void main(String[] args) 
	{
//Objects can be created only in main method
		
		Empolyee emp1=new Empolyee(); //object
//emp1 is having own copy of Variables and methods of class
// Now assign values to variables
		
		emp1.eid=101;
		emp1.ename="Sindhu";
		emp1.Job="QA";
		emp1.sal=2000000;
		
// To print call display method	
		
		emp1.display();
//If we don't have method (display) in class. we can print directly with object variables
//always recommended to create User defined method and access in all objects		
		System.out.println(emp1.eid);
		
//Another object:---
		
		Empolyee emp2=new Empolyee(); //object
//emp2 is having own copy of Variables and methods of class
// Now assign values to variables
				
				emp2.eid=102;
				emp2.ename="Dheeraj";
				emp2.Job="QA";
				emp2.sal=4000000;
				
		// To print call display method	
				
				emp2.display();		
		
	}
*/
}
