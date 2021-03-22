
public class ATMProjSwitch {

	public static void main(String[] args) {

		String choice ="";
		
		switch(choice) {
		
		case "CheckBalance" : System.out.println("CheckBalance");
							  break;
							
		case "ChangePin" : System.out.println("Change Pin");
						   break;
							
		case "CashWithDraw" : System.out.println("Cash WithDraw");
							  break;
							
		case "CheckDeposit" : System.out.println("Check Deposit");
							  break;
							
		default : System.out.println("Time Out");			
			
		}
		
	}

}
