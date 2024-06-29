package day6;

public class SingleDimensionalArray 

{

	public static void main(String[] args) 
	
	{
//Declaring an array
//Approach 1:- If we already know how many values to store and in future don't want to add more values
		
	/*	int a[]=new int[5]; //declare an array
	//	int []a= new int[5] //This also correct
		a[0]=100; // add values into array OR store values in array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
     */
//Approach 2:- create and assign in single line
// If we don't no how many values want to store and in future want to add more values. Better to go with approach2 
		
		//int a[]; //throw an error because did not specify how much size
		//int a[]={}; //return length as zero
		int a[]= {100,200,300,400,500};

//Find size(length) of an array
		
	//System.out.println("Length of array "+ a.length);
		
//Read specify value from a array
		
	//	System.out.println(a[4]); //here 4 is index number
		
//Read all values in an array :- Use for loop most of the time
//Normal for loop
		
  /*   for(int i=0;i<a.length;i++) //can use i<5 or i<=4. if we don't size  then use a.length (i<=a.length-1 OR i<a.length)
		{
			System.out.println(a[i]);
		}
*/	
//enchanced forloop /for each loop :-- Most use them in array and collection concept
		
//	syntax:-
		for(int x:a) // x is variable. for each loop no need of condition & inc/desc
		{
			System.out.println(x);
	}
		
		
	
		
		
		
		

		
	}

}
