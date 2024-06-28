package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {


//Declare an Array

//Approach 1:- Fixed array
// If we already know how many values to store and in future don't want to add more values
			
/*		int a[][]= new int[3][2]; //3 rows and 2 coloumns
	//	int [][]a= new int[3][2] //This also correct
	//	int[]a[]=new int [3][2]  //This also correct
         a[0][0]=100;		
         a[0][1]=200;
         
         a[1][0]=300;		
         a[1][1]=400;		

         a[2][0]=500;		
         a[2][1]=600;
*/         
         		

//Approach 2:-		
		
		int a[][]= { {100,200}, //First row
				     {300,400}, //second row
				     {500,600}  //third row
				    };
		
		
		
//Find length of a array(size):---
		
		System.out.println("length of rows "+a.length); //row length
		System.out.println("length of coloumns "+a[0].length); //coloum length with specific row
		

//Single value from array:- Ex:- second row(2nd index) first column(1st index)
		
		System.out.println(a[2][1]); //600
		
//Read all values in an array
		
// we use looping statement.
// we use Nested for loop (one is for row and another for coloum)
		
		//Normal for loop
		
		//OR r<=2 OR r<a.length OR r<a.length-1
		for(int r=0;r<3;r++) // 0(true) 1(true) 2(true) 3(false)
		{
			//OR c<=1 OR c<=a[r].length-1 OR c<a[r].length
			for(int c=0;c<2;c++) //0(true) 1(true) 2(false) once it is false it will go up and increment
			                     //0(true) 1(true) 2(false) once it is false it will go up and increment
                                 //0(true) 1(true) 2(false) once it is false it will go up and increment

			{
				//System.out.println(a[r][c]);       // 100 200
				    System.out.print(a[r][c]+"   "); // 300 400
			}                                        // 500 600
				
				System.out.println();
			}                                
		
		
// Enchaned For loop
		
		for(int arr[]:a)
		{
			for (int x:arr)
			{
				System.out.print(x+"   ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
