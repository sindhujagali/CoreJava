package day7;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		int a[]= {1,4,600,2,5};
		
		System.out.println("Before Sorting.. "+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) //Number of Passes
		{
			for(int j=0;j<n-1;j++) //Iterations in each pass
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("�fter Sorting"+Arrays.toString(a));
		
		
	}

}
