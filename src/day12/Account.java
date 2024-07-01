package day12;

public class Account {
	
//Encapsulation example:--
	
	private int accno;
	private String name;
	private double amount;
	
	//To set the data to accno varaible
	//accno is local varaible in method and we are using same name as class variable
	
	void setAccno (int accno) 
	{
	//if we use accno in method same as class varaible. Method will confuse	
	// when we callthis in main method.Return is zero	
	  
	// accno=accno; //result is zero
		
	//	To overcome this. we use this keyword. this belongs to class variable
		
		this.accno=accno;	
	}

	//To get the data from accno varaible
	int  getAccno()
	{
		return accno;
	}

//Shortcut to add ==>Eclipse==>source==>Generate Setters/getters==>Select and Generate
	
//To set the data to name varaible	
	public void setName(String accname) {
		name = accname;
	}
//To get the date from name variable
	public String getName() {
		return name;
	}

//To set the data to amount varaible	
	public double getAmount() {
		return amount;
	}

//To get the date from amount variable
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
