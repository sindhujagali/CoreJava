package day12;

public class AdderMain {

	public static void main(String[] args) {


		Adder addobj=new Adder();
		addobj.sum(); //First method will call
		addobj.sum(2, 3);//second with call because will check datatype int
		addobj.sum(12.3, 10);//Fourth method
		addobj.sum(10, 20.3);//Third method
		addobj.sum(10, 20,30);//5th method	
		//addobj.sum(10.5,20.6,15.0)//will throw an error
	}

}
