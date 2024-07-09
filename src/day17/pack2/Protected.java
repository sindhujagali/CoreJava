package day17.pack2;
import day17.pack1.AccessModifiers;


public class Protected extends AccessModifiers{

	public static void main(String[] args) {

//By using inheritance we can access protected variables & methods by created object to child class
	      Protected t= new Protected();
	      System.out.println(t.z);
	      t.m3();
		

	}

}
