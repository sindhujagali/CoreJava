package day9;

public class RemoveJunk {

	public static void main(String[] args) {

		
	//	String s="welc#o$%me";
		
	//	String a= s.replace("#", "");
	//	System.out.println(a);
	//	String b=a.replace("$%", "");
	//	System.out.println(b);

	//	String a=s.replace("#", "").replace("$%", "");
	//	System.out.println(a);
		
		
	String s="#$#$@$@$% latin string 121212 test";
	
	//By using regular expression. ^ other than this meaning
	String a=s.replaceAll("[^a-zA-Z0-9]", "");
	
		System.out.println(a);
		
		
		
	}

}
