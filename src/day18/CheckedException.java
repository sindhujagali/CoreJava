package day18;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("Program Started...");
		System.out.println("Program InProgress...");

//1)By using try..catch block
		//Thread is class having sleep method
		//sleep method will help to wait for sometime before exectuting remaining steps
		
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)//InterruptedException
		{}
		
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");
		
//2) By using throws keyword
		
		System.out.println("Program Started...");
		System.out.println("Program InProgress...");
		Thread.sleep(5000);
		System.out.println("Program Completed...");
		System.out.println("Program Exited...");

	}

}
