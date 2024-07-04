package day14;

class A1 //A1 is Parent Class
{
	int a;
	void display()
	{
		System.out.println(a);
	}
} 
 
class B1 extends A1 //B1 is child class first time
{                   //B1 is parent class now when extended to C1
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class C1 extends B1 //C1 is child class
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}


public class MultiLevel_Inhertiance {

	public static void main(String[] args) {
	
		C1 cobj=new C1();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();

	}

}
