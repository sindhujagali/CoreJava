package day5;

public class WhileVsDowhileLoop {
	
	public static void main(String args[]) {
		
		
		//While Loop
		// First check condition and condition is false. So no statement is executed
			int i=10;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}		
		
		//Do while Loop
		// even though condition is false. First without checking condition first it will
		//print x value as 10 and later condition and it is false so it will stop
		int x=10;
		do
		{
			System.out.println(x);
			x++;
		}while(x<=5);
		
		
		
		
		
	}


	
	
	
	
	
}
