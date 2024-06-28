package day7;

public class FindHowManyDuplicatesinArray {

	public static void main(String[] args) {

		int a[]= {100,200,100,300,100,100,500};
		int num=100;
		int count=0;
		
		for (int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
