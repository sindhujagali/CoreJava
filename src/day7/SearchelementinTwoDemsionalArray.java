package day7;

public class SearchelementinTwoDemsionalArray {

	public static void main(String[] args) {

		int a[][]= { {100,200}, {200,300}, {400,500}};
		
		 int search_element=300;
		 boolean status= false;
		 
		 for(int arr[]:a)
		 {
			 for(int x:arr)
			 {	 
			 if(x==search_element)
			 {
				 System.out.println("element found");
				 status=true;
				 break;
				 
			 }
            
		 }
		
		}
		 if(status==false)
         {
				 System.out.println("element not found");

         }
		
	}
}

