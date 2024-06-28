package day9;

public class StringComparison {

	public static void main(String[] args) {

//Scenario1:-
		
		String s1="welcome";
		String s2="welcome";
		
		//No difference if String variables without new keyboard
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
//Scenario2		
		
		String c1=new String("welcome");
		String c2=new String("welcome");
		
		//when new keyboard is used object will be created
		System.out.println(c1==c2); //false . Used to compare objects
		System.out.println(c1.equals(c2)); //true. Used to compare values of Objects
		
//Scenario 3:-
		
		String a1="abc";
		String a2=new String("abc");
		
		System.out.println(a1==a2); //false . Used to compare objects
		System.out.println(a1.equals(a2)); //true. Used to
		
//Scenario4:- Objects will be equal
		
		String d1="abc";
		String d2=new String("abc");
		String d3=d2;
		System.out.println(d1==d2);//false
		System.out.println(d1.equals(d2));//true
		System.out.println(d2==d3);//true.Objects are equal because Assigning same object to s3
		System.out.println(d2.equals(d3));//true
		System.out.println(d1==d3);//false
		System.out.println(d1.equals(d3));//true
		
	}

}
