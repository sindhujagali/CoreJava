package day12;

public class Accountmain {

	public static void main(String[] args) {

       Account acc=new Account();
       
 //Set Accno,Name,Amount   		   
		acc.setAccno(101);
		acc.setName("Sindhu");
		acc.setAmount(150000);
		
//Get data for Accno,Name,Amount		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
