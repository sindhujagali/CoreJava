package day5;

public class CountSumOfDigits {

	public static void main(String[] args) {

		
		int num=1234;
		
		int sum=0;
		
		while(num>0)
		{ 
			//get last digit and add to sum
			sum=sum+num%10; //0+4=4  4+3=7  7+2=9  9+1=10
			
			//Elimitate last digit
			num=num/10; //123  12  1 0
		}
		
		System.out.println("sum of digits "+sum);
	}

}
