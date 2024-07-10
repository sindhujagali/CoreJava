package day19;

//A b=(C) d;
public class TypeCastingObjects3 {

	public static void main(String[] args) {
		
//Ex:-1	
//		Object o=new String("Welcome");
//		StringBuffer sb=(StringBuffer) o; //Rule1-yes,Rule2-yes, Rule3-no
		
//Ex:-2		
//		String s=new String("welcome");
//		StringBuffer sb=(StringBuffer) s; //Rule1-No
		
//Ex:-3			
//		Object o=new String("Welcome");
//		StringBuilder sb=(StringBuilder) o; //Rule1-yes,Rule2-yes, Rule3-no

//Ex:-4		
//		Object o=new String("Welcome");
//		StringBuffer sb=(String) o; //Rule1-yes,Rule 2-NO
		
//Ex:-5		
//		String s=new String("welcome");
//		StringBuffer sb=(String) s; //Rule1-yes,Rule 2- NO
		
//Ex:-6		
		Object o=new String("Welcome");
		String s=(String) o; //Rule1-yes,Rule2=yes,Rule3-yes
		System.out.println(s);
	}

}
