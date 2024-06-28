package day7;

import java.util.Arrays;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {


		int numbers[]= {-10, 24, 50, -88, 9685};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)//1 2 3 4
		{
			if(numbers[i]>largest)//24 50 9685
			{
				largest=numbers[i]; //24 50 9685
			}
			else if(numbers[i]<smallest)//-88
			{
				smallest=numbers[i]; //-88
			}
		}
		
		System.out.println("Given Array "+Arrays.toString(numbers));
		System.out.println("Largest number in Array  "+largest);//9685
		System.out.println("smallest number in Array  "+smallest);//-88

		
		
	}

}
