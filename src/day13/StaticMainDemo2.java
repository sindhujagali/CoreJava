package day13;

public class StaticMainDemo2 {

	public static void main(String[] args) {


 //1) Static variables & Methods can be access without creating object
		
 // If static variables and static methods are not within same class. Static Variables/Methods can access in another class by explicity mentioned classname
		
		System.out.println(StaticDemo2.a);
		StaticDemo2.m1();
		
   //2) Non Static variables & Methods can be access with creating object for Class
		      
		StaticDemo2 s= new StaticDemo2();
		System.out.println(s.b);
		s.m2();
		
		s.m();


	}

}
