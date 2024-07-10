package day19;

class Parent
{
	String name="John";
	void m1()
	{
		System.out.println("This is m1 from Parent");
	}
}

class Child extends Parent
{
	int id=100;
	void m2()
	{
		System.out.println("This is m2 from Child");
	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {

//No Downcasting & No UpCasting:---
		Child c = new Child();
		System.out.println(c.name);//Parent
		c.m1();//Parent
		System.out.println(c.id);//Child
		c.m2();//Child
		
//Upcasting object:---		
		Parent p =new Child(); //Upcasting
		System.out.println(p.name);//Parent
		p.m1();//Parent
//can not access child variable & method bcoz obj ref created for Parent class		
	//	System.out.println(p.id); //child
	//	p.m2();//child
		
/*
//Downcasting object:--NOT Possible
		Parent p1=new Parent();
		Child c1=(Child)p1; //Downcasting
//At runtime we get an exception ClassCastException		
//cannot access parent var & method. Not preferable most of times downcasting		
		System.out.println(c1.name);//Parent
		System.out.println(c1.id);//child
		c1.m1();//Parent
		c1.m2();//child
*/		
		
		
		
		
		


	}

}
