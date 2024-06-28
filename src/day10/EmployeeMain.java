package day10;

public class EmployeeMain {

	public static void main(String[] args) {

// If class and main method class in same package we can access directly
// If class and main method class in different package. we need to import that class package in 
	//in main method class
		
	// syntax to import:--
	// import packagename classname;
		
		Empolyee emp1=new Empolyee(); //object
		emp1.eid=101;
		emp1.ename="Sindhu";
		emp1.Job="QA";
		emp1.sal=2000000;
		emp1.display();
		
		Empolyee emp2=new Empolyee(); //object
		emp2.eid=102;
		emp2.ename="Dheeraj";
		emp2.Job="QA";
		emp2.sal=4000000;
		emp2.display();		
		

	}

}
