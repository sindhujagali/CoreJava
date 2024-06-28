package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

//String also having Index. Start with zero
	//	String s="welcome";	
	//	String s1= new String("Welcome"); ==>This also correct	
	//	System.out.println(s);
		
//Methods:-
		
//1)length() - returns length of a string(number of characters)
		
		String s="welcome";
		int l=s.length(); // store value in some variable
		System.out.println(l);
		//OR
		System.out.println(s.length());
		//OR
		System.out.println("welcome".length());
		
//2) concat() - joining strings. 	
		
		String s1="Welcome";
		String s2="Java";
		String s3="Automatation";
		
		System.out.println(s1+s2); //welcome Java
		System.out.println(s1.concat(s2)); //using concat method
		
		System.out.println(s1+s2+s3); //welcome Java Automatation

		System.out.println(s1.concat(s2).concat(s3)); //using concat method.welcome Java Automatation
		
		System.out.println(s1.concat(s2+s3)); //these is also correct
		
	//without variables concat strings	
		
		System.out.println("Welcome"+"to Java"); //using + operator
		System.out.println("Welcome".concat("to Java"));//using concat
		
		
//3) trim() --Remove spaces right and left side of String
		
		String a="   Welcome   ";
		System.out.println(a);
		System.out.println("Before trimming length is "+a.length()); //13 (including with spaces)
		
		System.out.println(a.trim());
		System.out.println("After trimming length is "+a.trim().length());//7 (exclude  the spaces)
		
//4) charAt() --returns character from a string based on index 		
		       //String also having Index. Start with zero
		
		String c="welcome";
		System.out.println(c.charAt(3)); //c
        System.out.println(c.charAt(0)); //w
		
		
//5) contains() --important method mostly use in selenium		
		          //check particular string part of main string or not
		          //Always return boolean value (true or false)
                  //String values are case- sensitive
                  // position is not imp but sequence is imp
		
		String con="Welcome";
		System.out.println(con.contains("Wel"));//true
		System.out.println(con.contains("come"));//true
		System.out.println(con.contains("wel"));//false because w is uppercase
		System.out.println(con.contains("COM"));//false because com is lowercase
		System.out.println(con.contains("Welme"));//false because sequence not match

//6) equals(), equalsIngnoreCase() --Most imp method
		        //Both used for compare Strings
		
		String c1="welcome";
		String c2="welcome";
		
		System.out.println(c1==c2);//true can't use it always
		System.out.println(c1.equals(c2));//true
		System.out.println(c1.equals("Welcome"));//false because of case sensitive of w
		System.out.println(c1.equals("welcome"));//true 
		
		//equalsIngnoreCase() -- treat upper and lower characters as same
		System.out.println(c1.equalsIgnoreCase("WELCOME"));//true because Ingnore case sensitive

//7) replace() ---	replace single/multiple(sequence of characters in a string)	
		
		String r="Welcome to Selenium Java Selenium python Selenium c#";
		System.out.println(r.replace('e', 'x'));//Wxlcomx to Sxlxnium Java Sxlxnium python Sxlxnium c#
       
		//Replace e==>x and & n==>a
		System.out.println(r.replace('e', 'x').replace('n', 'a'));//Wxlcomx to Sxlxaium Java Sxlxaium pythoa Sxlxaium c#

		//multiple(sequence of characters in a string)
		System.out.println(r.replace("Selenium", "playwright")); //Welcome to playwright Java playwright python playwright c#

// 8) substring() ---It will extract substring from main string		
		             //Starting index - 0
		             //ending index -1
		
		s="Selenium";
		System.out.println(s.substring(1, 5));//elen
		System.out.println(s.substring(0, 3));//Sel

// 9) toUpperCase()  toLowerCase() --Converting Upper to Lower OR Lower to Upper
		
		s="Welcome";
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome

// 10) split() --very imp method
	         //Split the string into multiple parts based on delimeter
		
		 s="abc@gmail.com"; //@ . space is delimeter
		//System.out.println(s.substring(0, 3)); //abc if In future string changes difficult to get
		
		 //split method with return array
         String d[]=s.split("@"); // d contains abc and gmail.com
         System.out.println(Arrays.toString(d)); //[abc, gmail.com]
        // OR
         System.out.println(Arrays.toString(s.split("@")));//[abc, gmail.com]
         System.out.println(d[0]);//abc
         System.out.println(d[1]);//gmail.com

    //Example1:- Remove $ and , and exp o/p:- 152055 (Use replace() method)
         String amount="$15,20,55";    
         System.out.println(amount.replace("$", "").replace(",", ""));//152055
		
         
         
   //Example2:-Exp abc 123 xyz. By using split
         String t="abc,123@xyz"; 
		
		String arr[]=t.split(","); // abc 123@xyz
		System.out.println(Arrays.toString(arr));//[abc, 123@xyz]
        
		String arr2[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr2));//[123, xyz]
		
		
		System.out.println(arr[0]); //abc
		System.out.println(arr2[0]);//123
		System.out.println(arr2[1]);//xyz

	//Example3:-Exp abc 123 xyz. By using split
        
		String g="abc 123 zyz";
		String ar[]=g.split(" ");
		System.out.println(Arrays.toString(ar));//[abc, 123, zyz]
				
// Few symbols can not use. [// * % ^ & ( ) -] --cannot use as delimeter				
	
	//Example4:- check John but don't consider case without using equalsIgnoreCase
		String name="John Kenedy";
		System.out.println(name.contains("john")); //false
		System.out.println(name.equalsIgnoreCase("John Kenedy"));//true
		
		//Approach1:- use replace and contains
		
		System.out.println(name.replace("J", "j").contains("john"));//john Kenedy //true
         
		//Approach2 :- use toLowercase and contains
		
		System.out.println(name.toLowerCase().contains("john"));//true
		
	}

}
