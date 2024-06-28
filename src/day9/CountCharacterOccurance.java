package day9;

public class CountCharacterOccurance {

	public static void main(String[] args) {


		String s="Java Programming Java oops";
		
		int totalcount=s.length();
		int total_afterremovea=s.replace("a", "").length();
		int count=totalcount-total_afterremovea;
		
		System.out.println("Occurance of a "+count);

	}

}
