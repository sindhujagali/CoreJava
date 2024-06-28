package day9;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		
		String s="JAVA     Program     Testing   ";
		
		//To remove spaces we use \\
		s=s.replaceAll("\\s", "");
		System.out.println(s);
		
		
		
		

	}

}
