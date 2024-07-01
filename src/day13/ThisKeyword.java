package day13;

public class ThisKeyword {

	//class variables. can access within class
	int x,y;
	
	//Constructor
/*	ThisKeyword(int x, int y) // Local variables/parameters are same as class variables. Can access only within same method/Constructor
	{
		this.x=x;
		this.y=y;
	}
*/	
	//user defined method
	void setdata(int x, int y)
	
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x+" "+y);
	}
	
	
	public static void main(String[] args) {

        // Constructor will invoke once object is created for class
/*		ThisKeyword th=new ThisKeyword(100,200);
		{
			th.display();
		}
*/
		
		ThisKeyword th=new ThisKeyword();
		{
			th.setdata(300, 400);
			th.display();
		}
		
		
	}

}
