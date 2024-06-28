package day9;

public class ReverseAString {

	public static void main(String[] args) {

//Approach 1:- length() , charAt()
		
	/*	String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse a String "+rev);
      */
		
//Approach 2:--	by converting string to char array type. using toCharArray() method
		
		/*	String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		
		{
			
		//	System.out.println(a[i]);
			rev=rev+a[i];
		}
		
		System.out.println("Reverse string "+rev);
 */
		
//Approach 3:--using StringBuffer class
		
		StringBuffer s=new StringBuffer("welcome");
		//StringBuffer s="welcome"; ==>will throw an error. Because StringBuffer is immutabile objects
		
		//Direct method is have reverse in StringBuffer
		
		System.out.println("Reverse a String "+s.reverse());
		
		
//Approach 4:--using StringBuilder class
		
		StringBuilder s1=new StringBuilder("welcome");
		//StringBuilder s="welcome"; ==>will throw an error. Because StringBuffer is immutabile objects
				
		//Direct method is have reverse in StringBuilder
				
		System.out.println("Reverse a String "+s1.reverse());		
	}

}
