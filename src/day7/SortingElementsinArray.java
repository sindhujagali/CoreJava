package day7;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {

        int a[]= {100,600,200,400,500};
        
        System.out.println("Before Sorting..");
        System.out.println(Arrays.toString(a));//[100, 600, 200, 400, 500]

        
        Arrays.sort(a);
        
        System.out.println("After Sorting..");
        System.out.println(Arrays.toString(a));//[100, 200, 400, 500, 600]

	}

}
