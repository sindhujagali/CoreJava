package day17;

public class DataConversionMethods {

	public static void main(String[] args) {


//1) String-->int
		
		//Below not possible. cannot convert to int
/*
	    String s="welcome";
		int sint= Integer.parseInt(s);
*/
		
		String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
//2)String -->double
		String d1="10.60";
		String d2="200.36";
		System.out.println(Double.parseDouble(d1)+Double.parseDouble(d2));

//3)String -->boolean
				String b="WELCOME"; //other than true pass any string data by default it will return as false
				System.out.println(Boolean.parseBoolean(b));
				String b1="true";
				System.out.println(Boolean.parseBoolean(b1));
				
				
//int, double,boolean,char---->String
				
				int a=10;
				double d=10.5;
				char c='A';
				boolean bool=true;
				
				String s=String.valueOf(a);
				System.out.println(s);
				
				s=String.valueOf(d);
				System.out.println(s);
				
				s=String.valueOf(c);
				System.out.println(s);
				
				s=String.valueOf(bool);
				System.out.println(s);
				
				
	}

}
