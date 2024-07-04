package day14;

class Parent //Parent is Parent Class
{
	void display(int a)
	{
		System.out.println(a);
	}
} 
 
class Child1 extends Parent //Child1 is child class
{                  
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent //Child2 is child class
{
	void print(int c)
	{
		System.out.println(c);
	}
}


public class Hierarchy_Inheritance {

	public static void main(String[] args) {
	
		Child1 C1=new Child1();
		C1.display(100);
		C1.show(200);
		
		Child2 C2=new Child2();
		C2.display(1000);
		C2.print(3000);

	}

}
