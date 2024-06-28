package day11;

public class ConstructorDemo {
	
	int x,y;

//Default Constructor. No parameters	
	ConstructorDemo()
	{
		x=200;
		y=300;
	}

//Parameterized Constructor
	ConstructorDemo(int a, int b)
	{
		x=a;
		y=b;
	}

//User defined method	
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {


		ConstructorDemo cd=new ConstructorDemo(); //invoke default Constructor
		cd.sum();
		
		ConstructorDemo cd1=new ConstructorDemo(10,20);//invoke Parameterized constructor
        cd1.sum();
	}

}
