package day18;

public class FinallyBlock {

	public static void main(String[] args) {

//Case1:- Exception occured, catch block handled==>finally block will execute		
/*		System.out.println("Program Started...");
		String s=null;
		try
		{
		System.out.println(s.length());//NullPointerException
		}
		catch (Exception e)
		{
			
			System.out.println("catch block handled exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("You entered into finally block");
		}
		
		System.out.println("Program Completed...");
*/	
//Case2:-Exception occured, catch block NOT handled==>finally block will execute		
	/*	System.out.println("Program Started...");
		String s1=null;
		try
		{
		System.out.println(s1.length());//NullPointerException
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("catch block handled exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("You entered into finally block");
		}
		
		System.out.println("Program Completed...");		
	*/	
		
//Case3:-Exception NOT occured, catch block will skip==>finally block will execute		
				System.out.println("Program Started...");
				String s2="welcome";
				try
				{
				System.out.println(s2.length());
				}
				catch (ArrayIndexOutOfBoundsException e)
				{
					
					System.out.println("catch block handled exception");
					System.out.println(e.getMessage());
				}
				finally
				{
					System.out.println("You entered into finally block");
				}
				
				System.out.println("Program Completed...");			
		
		

	}

}
