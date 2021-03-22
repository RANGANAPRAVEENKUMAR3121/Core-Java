
public class ATMProject {

	public static void main(String[] args) {

		String choice="";
		
		if(choice.equals("Check Balance")) {
			System.out.println("Check Balance");
		}else if(choice.equals("Change Pin")) {
			System.out.println("Change Pin");
		}else if(choice.equals("Cash WithDraw")) {
			System.out.println("Cash WithDraw");
		}else if(choice.contentEquals("Deposit Check")){
			System.out.println("Deposit Check");
		}else {
			System.out.println("Time Out");
		}
	}

}
