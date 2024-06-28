package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {

		
//String --Immutable (can not change)
		
		String s="welcome";
		s.concat("to java");
		System.out.println(s); //Immutable can not change original value of s
		
//StringBuffer -- mutable (Can change)
		
		StringBuffer sb=new StringBuffer("Welcome");
		sb.append(" To Java"); //append is same as concat in String
		System.out.println(sb);//mutable can change original value of sb
		
		
//StringBuilder -- mutable (Can change)
		
		StringBuilder sb1=new StringBuilder("Welcome");
		sb1.append(" To Java"); //append is same as concat in String
		System.out.println(sb1);//mutable can change original value of sb
				
						
		
		
		
		
		

	}

}
