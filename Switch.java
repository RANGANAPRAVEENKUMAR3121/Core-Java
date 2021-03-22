
public class Switch {

	public static void main(String[] args) {
		
		int x = 1;//byte , short , char , int , enum , string .
		//char c = 'R';
		switch(x){
			case 1 : System.out.println("1");
			         break;
			case 2 : System.out.println("2");
			         break;
			case 3 : System.out.println("3");
					 break;
			default : System.out.println("0");
			
		}   
		
	}

}

//duplicate cases not possible , case 1+1 possible , cases 'R'.
