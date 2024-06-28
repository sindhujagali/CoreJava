package day4;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
//Smallest of 3 numbers
		
		int a=80,b=90,c=60;
		if(a<b && a<c) //false
		{
			System.out.println("a is smallest number");
		}
		else if (b<a && b<c) // false
		{
			System.out.println("b is smallest number");
		}
		else
		{
			System.out.println("c is smallest number");
		}
	}

}
