package day12;

public class Constructor_BoxMain {

	public static void main(String[] args) {

		//Will call default constructor
		//Constructor will call when object is created by default
		Constructor_Box b=new Constructor_Box(); //default Constructor will be invoke
		
		System.out.println(b.volume());
		
		//Second constructor will call
		Constructor_Box b1=new Constructor_Box(10.5,15.5,5.0);
		System.out.println(b1.volume());
		
		//Third constructor will call
		Constructor_Box b2=new Constructor_Box(10.5);
		System.out.println(b2.volume());

	}

}
