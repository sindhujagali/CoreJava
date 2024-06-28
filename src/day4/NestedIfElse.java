package day4;

public class NestedIfElse {

	public static void main(String[] args) {
		
		
//NestedIfElse
// One if condition can have multiple if else conditions
		
		if(true)
		{
			if(true)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}			
		}
		else
		{
			System.out.println("123");
		}

// Example 5:- display week names based on week numbers

		int weekno=6;
		
		if(weekno==1)
		{
			System.out.println("sunday");
		}
		else if (weekno==2)
		{
			System.out.println("Monday");			
		}
		else if (weekno==3)
		{
			System.out.println("Tuesday");			
		}
		else if (weekno==4)
		{
			System.out.println("Wednesday");			
		}
		else if (weekno==5)
		{
			System.out.println("Thursday");			
		}
		else if (weekno==6)
		{
			System.out.println("Friday");			
		}
		else if (weekno==7)
		{
			System.out.println("Saturday");			
		}
		else
		{
			System.out.println("Invalid week name");
		}
		
		
		

	}

}
