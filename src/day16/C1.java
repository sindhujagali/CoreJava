package day16;

public class C1 extends C2 implements I1, I2 //hybrid inheritance
//public class C1 implements I1, I2 //multiple inheritance
{
	
	public void m1() //abstract method from I1 interface class
	{
		System.out.println(x);
	}
	
	public void m2() //abstract method from I2 interface class
	{
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
		C1 c1obj=new C1();
		c1obj.m1();
		c1obj.m2();
		c1obj.m3();
       

	}

}
