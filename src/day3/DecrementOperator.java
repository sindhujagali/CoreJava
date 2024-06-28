package day3;

public class DecrementOperator {
	
	public static void main(String args[]) 
	{
		//1) -- is called decrement operator
		  //case 1	
	       int a=10;
	       System.out.println(a); // 10
	       
	       a--; // a=a-1; 
	       System.out.println(a); //reassigning the  9 to same varaible
	       
	       //case 2 :-- Post increment (First Assignment will happen. Next decrement  will happen)
	       
	       int b=10;
	       int res=b--; // 10 will assign to res varaible first and then decrement will happen
	       System.out.println(res); //10
	       System.out.println(b);   //9

	      //case 3 :-- Pre increment (First decrement will value and later assignment will happen)
	       
	       int c=10;
	       int result= --c; // First value is decremented 9 and later assigned to result varaiable
	       System.out.println(result); //9
	       System.out.println(c);   //9

	}

}
