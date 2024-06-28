package day10;

public class Student 
{

	int sid;
	String sname;
	char grad='A'; //If value is everytime is same
	//It is not recommened if in future value change in objects level 
	void printData()
	{
		System.out.println(sid+"   "+sname+"  "+grad);
	}
	
}
