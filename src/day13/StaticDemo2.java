package day13;

public class StaticDemo2 {

	
	static int a=10; //Static variable
    int b=20;        //Non Static Variable
    
    static void m1() //Static Method
    {
    	
    	System.out.println("static method with static variable...");
    	
    }
    
     void m2()    //Non Static Method
    {
    	
    	System.out.println("non static method with non static variable...");
    	
    }
     
    //non-static method can access everything directly
     
     void m()
     {
    	 System.out.println(a); //static variable
    	 System.out.println(b); //non static variable
    	 m1();                  //Static Method
    	 m2();                  //Non Static Method
     }
	
	
	
	
	
	
	
	
	
}
