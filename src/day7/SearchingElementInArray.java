package day7;

public class SearchingElementInArray {

	public static void main(String[] args) {

//Search a Element in a Array (Linear Search)
		
		int a[]= {10,20,80,40,60,80};
		int search_element=80;
		
		boolean status=false;  //false- not found true-found
	//Normal For Loop	
	/*	for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		
		if(status==false)
        {
			System.out.println("Element not found");
        }
		
	*/
	//Enachaned For Loop	
		
        for(int x:a)
        {
        	if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
        }
        if(status==false)
        {
			System.out.println("Element not found");
        }

        
        
        
	}

}
