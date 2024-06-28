package day4;

public class SwitchCaseCondition {

	public static void main(String[] args) {
// If we have more conditions. Instead of If else condition better to use switch case condition
// It will reduce the code
//syntax:-
		
		/*
		 switch(variable)
		 {
		  case value1 : statements;
		  case value2 : statements;
		  ....
		  default : statements;
		 } 
		 */
		
		int weekno=5;		
		switch(weekno)
		{
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("monday");break;
		case 3: System.out.println("tue");break;
		case 4: System.out.println("wed"); break;
		case 5: System.out.println("thurs");break;
		case 6: System.out.println("fri");break;
		case 7: System.out.println("sat");break;
		default: System.out.println("invalid");
		}	
	}

}

// if we won't specify break after each case. Immediately it will execute next case without checking any case
