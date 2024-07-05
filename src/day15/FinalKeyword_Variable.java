package day15;


  class Test 
  {
	  int x=100;
	  final int y=100;
  }
  



public class FinalKeyword_Variable {

	public static void main(String[] args) {

   
		Test t=new Test();
		System.out.println(t.x); // o/p is 100 if varaible is not final can access
		
//can access the varaible and change the value of variable through object
		t.x=200;
		System.out.println(t.x); 
		
// y variable with final keyword. we can't change the value of variable here		
		//t.y=200; 
		System.out.println(t.y);
		

		
		
		
	}

}
