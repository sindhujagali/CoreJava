package day11;

public class Student {

	//class variables. can access in all places
	int sid;
	String sname;
	char grad;
	
	void printdata()
	{
		System.out.println(sid+" "+sname+" "+grad);
	}
	
	void setStudentData(int id,String name,char gr) //local variables. can access only within this method
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
	// Constructor is also a part of class. it is just like a method		
	// Constructor name should be same as Class Name		
	// Constructor will not return any value not even void		
	// Constructor can also make parameters
	// Only used for assigning data to varaiables.  
	
	Student(int id,String name,char gr) // method same should be same as Class name
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
	
	
}
