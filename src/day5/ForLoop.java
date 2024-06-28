package day5;

public class ForLoop {

	public static void main(String[] args) {

//for loop (Very imp loop)
//Example 1:- Print 1..10 number
		
		for(int i=1;i<=10;i++)
		{
		System.out.println(i);	
		}
		
//Example 2:- Print even numbers b/w 1..10 number
		
		for (int x=2;x<=10;x+=2)
		{
			System.out.println(x);
		}
		
//Example 3:- Print 1..10 even and odd numbers
		
		for(int a=1;a<=10;a++)
		{
			if(a%2==0)
			{
				System.out.println(a +"Even");
			}
			else
			{
				System.out.println(a+ "odd");
			}
		}
//Example 4:- Print 10..1 in desc order
		
		for(int y=10;y>=0;y--)
		{
			System.out.println(y);
		}
		
		
	}

}
