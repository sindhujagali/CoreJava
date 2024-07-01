package day12;

public class Adder {

//MethodOverloading Example	
	
	int a=10,b=20;
	
	//First method with no parameters
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	//Duplicate even returntype is different because method with no parameters
/*	int sum()
	{
		return (a+b);
	}
*/	
	//second method with 2 parameters with same method name
	void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	
	//third method with 2 parameters with same name but different datatype
	
	void sum(int x, double y)
	{
		System.out.println(x+y);
	}

	//Fourth method with 2 parameters with same name and same datatype but order of parameters is changed
	
	void sum(double y, int x)
	{
		System.out.println(x+y);
	}
	
	void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
}
