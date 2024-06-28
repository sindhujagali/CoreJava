package day5;

public class ContinueStatment {

	public static void main(String[] args) {

		//Example1
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue; // once 5==5 it will continue and jump to increment. So 5 will be missed
				//System.out.println(i); //==>syntax error.
			}
			System.out.println(i);
		}
		
		//Example2:- Skip 5,3,9
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==3|| i==9)
			{
				continue; // once 5==5 or 3==3 or 9==9 it will continue and jump to increment. So 5 will be missed
				//System.out.println(i); //==>syntax error.
			}
			System.out.println(i);
		}
		
	}

}
