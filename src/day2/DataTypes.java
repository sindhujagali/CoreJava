package day2;

public class DataTypes 
{

	public static void main(String[] args) 
	{
		//Numeric data types
		
		int a=100, b=200;
		System.out.println("the value of a is :"+a); // + is concendation
		System.out.println("the value of a is :"+b);
		System.out.println(a+b); // + is used to sum
		System.out.println("the sum of a & b is :"+(a+b));

        byte c=125, d= -127;
        System.out.println("the value of c is :"+c);
        System.out.println("the value of d is :"+d);
        
        short sh=3535;
        System.out.println(sh);
        
        long l=121212121212121l;  // Needed to write L or l (literal) 
        System.out.println(l);
        
        // Decimal numbers - float, double
        
        float price= 56.96F;    // Needed to write F or f (literal)
        System.out.println(price);
        
        double itmprice=234.2345678;
        System.out.println(itmprice);
        
        // Character datatype
        
        char ch='S';
        System.out.println(ch);
        
        //multiple characters - NON Primitive datatype
        
        String st="sindhu";
        System.out.println(st);
        
        //char grade='ABC'; //Invalid
        //String grade='ABC'; //Invalid
        // String grade='A'; //Invalid
        String grade="A";  //Valid       
        System.out.println(grade);
        
        //Boolean datatype
        
        boolean bl=false;// boolean can be true or false
           bl=true;
        
        System.out.println(bl);
        
        // boolean bh="true"; // Invalid ("") means String not boolean
        // boolean bh="false"; // Invalid ("") means String not boolean
        
        // String bh= true; // Invalid
           String bh="true";  //valid
           System.out.println(bh);   
	}

}
