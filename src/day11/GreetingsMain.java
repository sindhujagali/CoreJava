package day11;

public class GreetingsMain {

	public static void main(String[] args) 
	{
	
		Greetings G1=new Greetings();
		G1.m1();
		
		
		String s=G1.m2(); //method m2 is returning value. To hold that create a varaible
		System.out.println(s);//Print the variable
		//OR
		System.out.println(G1.m2());
		
		
		G1.m3("Sindhu",30);//Pass parameter

		
		String d=G1.m4("Dheeraj");
		System.out.println(d);
		//OR
		System.out.println(G1.m4("Dheeraj"));
		
		
		
	}

}
