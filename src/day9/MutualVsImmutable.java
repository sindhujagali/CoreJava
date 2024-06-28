package day9;

import java.util.Arrays;

public class MutualVsImmutable {

	public static void main(String[] args) {

//mutable --can change
		int a[]= {20,10,40,50,30};
		
		System.out.println("Before sorting"+Arrays.toString(a));
		Arrays.sort(a); //sort method changing array values. It is mutable
		System.out.println("After sorting"+Arrays.toString(a));

//immutable -- can not change
		
		String s=new String("welcome");
		
		//s.concat("to java"); //concat method is not changed. It is immutable
		

		String contactstring=s.concat("To Java");
		System.out.println(contactstring);

	}

}
