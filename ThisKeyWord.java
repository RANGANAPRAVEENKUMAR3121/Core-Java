
public class ThisKeyWord {

	int x ; 
	
	ThisKeyWord(){
		System.out.println(this);  //address of first and second object printed
		System.out.println(this.x); //it passes to two objects with different address 
		
	}
	public static void main(String[] args) {
		
		new ThisKeyWord();  //one address
		new ThisKeyWord(); //another address
		
	}

}
