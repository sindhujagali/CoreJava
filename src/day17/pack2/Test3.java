package day17.pack2;

import day17.pack1.AccessModifiers;

public class Test3 {

	public static void main(String[] args) {
		
	      AccessModifiers t= new AccessModifiers();
//can not access default variables & methods outside the package
	    
	   //   System.out.println(t.x);
	  //    t.m1();		
		
//can access public variables & methods outside the package		

	      System.out.println(t.a);
	      t.m4();	
	      
	}

}
