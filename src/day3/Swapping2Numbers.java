package day3;

public class Swapping2Numbers 
{

	public static void main(String[] args) 
	{
		
	/*	int a=10,b=20;
		System.out.println("value of a & b before swapping: " +a+" "+b);
		a+=10;
		b-=10;
		System.out.println("value of a & b After swapping: " +a+" "+b);
				*/
	// Logic 1- Third variable
		
		int x=10,y=20;
		
	/*	System.out.println("value of a & b before swapping: " +x+" "+y);        
		int t=x;
		x=y;
		y=t;
		System.out.println("value of a & b After swapping: " +x+" "+y);
*/
     
   // Logic 2- without using third variable
		
	/*	x=x+y; //10+20=30 , x=30
		y=x-y; //30-20=10 , y=10
		x=x-y; //30-10=20 , x=20
		System.out.println("value of a & b After swapping: " +x+" "+y);
*/
  // Logic 3 - without using third varaibale
 // here x & y values should not be zero
		
		x=x*y; //10*20 ==>200
		y=x/y; // 200/20==>10
		x=x/y; // 200/10==>20
		System.out.println("value of a & b After swapping: " +x+" "+y);

		
	}

}
