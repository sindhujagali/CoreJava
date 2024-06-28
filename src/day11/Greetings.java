package day11;

public class Greetings 
{
	
// 1) No parameters and No return values	
	
	void  m1()  //no parameters also called arugments and no return values means mention as void
	{
	  System.out.println("Hello..");
	}

//2) No Params Return value
	
	String m2()
	{
    return ("Hello how are you??"); //To return  value

	}
	
//3) Takes Params and No retrun value
	
	void m3(String name,int Age) //name is parameter with String datatype
	{
		System.out.println("Hello "+name+" "+Age);
	}
	
//4) Takes Params and Return Value
	
	String m4(String name)
	{
		return ("Hello "+name);
	}
	
	
}
