package day5;

public class ReverseANumber2_Palindrome2 {

	
	//Reverse a Number 5678
	public static void main(String[] args) {

    /*   int num=5678;
       int rev=0;
       
       while(num!=0)
       {
    	   rev=rev*10 + num%10;
    	   num=num/10;
    	   
       }
	System.out.println(rev);
		*/
		
// Number is palindrome or not

				int x=568;
				int rev=0;
				int org_num=x;
				
				while(x!=0)
				{
					rev=rev*10 + x%10;
					x=x/10;
				}
				System.out.println(rev);
						
		       if(org_num==rev)
		       {
		    	   System.out.println("It is palindrom");
		       }
		
		       else
		       {
		    	   System.out.println("It is not palindrom");
		       }
	}

		
		
		
		
		
		
		
		
		
		
		
}


