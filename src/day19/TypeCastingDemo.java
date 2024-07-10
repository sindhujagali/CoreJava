package day19;

public class TypeCastingDemo {

	public static void main(String[] args) {

//Upcasting==> Smaller value to Larger value
           // int-->Long
		   // float-->double
//Upcating is automatic process
		
//Downcasting==>Larger value to Smaller Value
        // Long-->int
		// double-->float		
//Downcasting in manual process
		
//1) Upcasting:---
		
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.3F;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
//2) Downcasting:---		
//Problem in downcasting will truncated or missing after that value will be stored 		
		long lvalue=10000;
	//	int ivalue=lvalue; //not able to downcast automatiaclly
	// Need to reduce the long value to small value 
		
		int ivalue=(int)lvalue;
		System.out.println(ivalue);
		
		double dvalue=112122.55;
		float fvalue=(float)dvalue;
		System.out.println(fvalue);

//Example 1:--
		
		int i=100;
		double d=i; //upcasting
		System.out.println(d);
		
//Example 2:--	
		
		double d1=10.5;
		int i1=(int)d1; //downcasting
		System.out.println(i1); //Result is 10 instead of 10.5
		
		
		
	}

}
