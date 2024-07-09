package day16;


interface Shape //interface class

{
	
	int length=10; //by default in interface it is final & static variable
	int width=20; //final & static variable
	
	//abstract method. by default modifier is public
	// no implementation for abstract method in interface class
	void circle(); 
	
	//default method. implementation in interface class
	default void square()
	{
		System.out.println("This is square..- default method");
	}
	
	//default method. implementation in interface class
	static void rectangle()
	{
		System.out.println("This is rectangle..- static method");
	}
	
}


public class InterfaceDemo implements Shape

{
	
	int height=40;
	
	 //implementation interface abstract method in class
	//should mention as public because in interface it is public
	// but in class default access modifier is default
	public void circle() 
	{
		System.out.println("This is circle..- abstract method");
	}
    
	//class predefined method
	void triangle()
	{
		System.out.println("This is triangle...");
	}
	

	public static void main(String[] args) 
	{
//Scenario 1:--		
       //create object for class and access 4 methods
		
		InterfaceDemo id=new InterfaceDemo();
		id.circle(); //abstract
		id.square(); //default
		id.triangle(); //Class method
		System.out.println(id.height);//class variable
		
		
		//static method can access directly without obj reference
		//can access with Interface class name
		
		Shape.rectangle(); //static method
		System.out.println(Shape.length * Shape.width);//accessing static variable directly
		

//Scenario 2:--
		
		//Shape is interface class name 
		//InterfaceDemo is class name
		Shape id1=new InterfaceDemo();
		id1.circle(); //abstract
		id1.square(); //default
	//	System.out.println(id1.height); //cann't access this  class variable here
	//	id1.triangle(); //cann't access this predefined class method here
		Shape.rectangle(); //static method can access directly from interface
		System.out.println(Shape.length * Shape.width);//accessing static variable directly

		

	}

}
