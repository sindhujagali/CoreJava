package day7;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array no need to be sorting order
		//Value should be in range [1 to 5]
		
		int a[]= {1,2,4,5};
		
		//First sum values in array:- 1+2+4+5=12 (sum1)
		//Second sum all values in range:-1+2+3+4+5=15 (sum2)
		//sum2-sum1=15-12=3 (missing value)
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];//1 3 7 12
			
		}
		System.out.println("Sum of values in array "+sum1);
		
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;//1 3 6 10 15
			
		}
		System.out.println("Sum of values in range "+sum2);
		
		System.out.println("Missing number is  "+(sum2-sum1));

		
		
		
	}

}
