package day5;

public class ReverseNumber {

	public static void main(String[] args) {

//Using algorithm
		/*
		int num=1234;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10; // 0*10 +1234%10=4   4*10+123%10=43  43*10+12%10=432  432*10+1%10=4321      
			num=num/10;          //1234/10=123        123/10=12       12/10=1          1/10=0
		}
		System.out.println(rev);
	
*/
//Using StringBuffer Class
/*	int num=1234;
	StringBuffer rev;
	StringBuffer sb = new  StringBuffer(String.valueOf(num));
	rev=sb.reverse();
	System.out.println(rev);
*/	
//Using StringBuilder class

	int num=1234;
	int rev;
	StringBuilder sb1= new StringBuilder();
	sb1.append(num);
	
	StringBuilder rev1=sb1.reverse();
	System.out.println(rev1);
	
	
	}
	
}
