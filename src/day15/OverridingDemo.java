package day15;


 class Bank 
 {
	 double roi()
	 {
		 return 0;
	 }

 }

 class ICIC extends Bank
 {
	 double roi() //Overriding 
	 {
		 return 10.6;
	 }

 }

 class SBI extends Bank
 {
	 double roi() //Overriding 
	 {
		 return 9.6;
	 }

 }
  //This is Heirarcy Inhertiance




public class OverridingDemo {

	public static void main(String[] args) {

		ICIC ic =new ICIC();
		System.out.println(ic.roi());

		SBI sb =new SBI();
		System.out.println(sb.roi());
		
		
	}

}
