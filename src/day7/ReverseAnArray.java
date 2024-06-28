package day7;

public class ReverseAnArray {

	public static void main(String[] args) {

		
		int a[]= {100,200,300,400,500};
		
		//enchaned for loop won't work here. because it read value from begining
				
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
