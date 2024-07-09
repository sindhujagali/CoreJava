package day17.pack1;


public class AccessModifiers {

//can access default variable & method within package within all classes
	int x=100; //by default access modifier is default
	void m1() //by default access modifier is default
	{
		System.out.println("This is m1");
	}

//private variables and methods can access only within same class
	private int y=200;
	private void m2()
	{
		System.out.println("This is m2");
	}
//protected variables and methods can access outide the package by using inheritance	
	protected int z=200;
	protected void m3()
	{
		System.out.println("This is m3");
	}
	
//public varibales & mehtods can access within project
	
	public int a=200;
	public void m4()
	{
		System.out.println("This is m4");
	}
	
		
}
