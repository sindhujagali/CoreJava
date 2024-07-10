package day18;

public class MultipleCatchBlocks {

	public static void main(String[] args) {


		System.out.println("Program Started...");
		String s=null;
		try
		{
		System.out.println(s.length());//NullPointerException
		}
//multiple catch blocks we can write for one try block
		
/*		catch (ArithmeticException e)
		{
			
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e)
		{
			
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");
*/		
//To overover multiple blocks. we can write one catch block with mentioned as Super class Exception		
		
		catch (Exception e)
		{
			
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");
		
		

	}

}
