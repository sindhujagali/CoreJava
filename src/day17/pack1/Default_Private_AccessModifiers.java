package day17.pack1;

public class Default_Private_AccessModifiers {

	public static void main(String[] args) {

//default variables & methods can access within same package
//Test1 and Test2 classes are in same package
		
      AccessModifiers t= new AccessModifiers();
      System.out.println(t.x);
      t.m1();
     
//cannot access private variables and methods outside the class within same package also
    /*  System.out.println(t.y);
      t.m2();
      
     */ 
      
      
      
	}

}
