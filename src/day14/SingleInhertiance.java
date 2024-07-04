package day14;

class A //A is Parent Class
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
} 
 
class B extends A //B is child class
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}


public class SingleInhertiance {

	public static void main(String[] args) {
	
		B bobj=new B();
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();

	}

}
