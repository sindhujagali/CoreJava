package day11;

public class StudentMain {

	public static void main(String[] args) {

  //Student s=new Student();

 // 1) using object reference variables
		
	/*	s.sid=101;
		s.sname="sin";
		s.grad='A';
		s.printdata();
	*/

// 2) Using method [Assignment+Operator]
		
	//s.setStudentData(123, "Sindhu", 'A');
	//	s.printdata();
		
// 3) Using a Constructor [Only Assignment]
		
// Constructor is also a part of class. it is just like a method		
// Constructor name should be same as Class Name		
// Constructor will not return any value not even void		
// Constructor can also make parameters
// Only used for assigning data to varaiables.  	
		
	// No need to call method. Automically when object is created Constructor is invoked	
		
		Student s1=new Student(13, "Sinhu", 'A');
		s1.printdata();
		
	}

}
