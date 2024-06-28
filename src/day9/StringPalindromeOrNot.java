package day9;

public class StringPalindromeOrNot {

	public static void main(String[] args) {

		
		String s="MADAM";
		String pal=s;
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(pal.equals(rev))
		{
			
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");

		}
	}

}
