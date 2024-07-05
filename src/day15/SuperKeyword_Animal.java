package day15;


public class SuperKeyword_Animal {
	
	String color ="white";
    
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog extends SuperKeyword_Animal
{
	String color ="black"; 
	void displaycolor()
	{
	  //System.out.println(color); // To get Dog class varaiable
		System.out.println(super.color); // To get parent class varaiable
	}
	
	void eat() //override
	{
	  //System.out.println("eating bread...");// To get Dog class method
		super.eat();// To get parent class method
	}
}