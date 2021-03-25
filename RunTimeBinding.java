package methodoverriding;

public class RunTimeBinding {

	//public static Object MacBookAir;

	public static void main(String[] args) {
		
		MacBook a = new MacBookPro();//parent obj is holding child reference
		a.start();
		a.shutdown();
		
	//	Apple ap = new MacBookPro(); //interfance class is holding the reference 
	//	ap.start();
	//	ap.shutdown();
		
		MacBook b = new MacBookAir();//parent obj is holding child reference
		b.start();
		b.shutdown();
		
		//parent obj = new child(); object binding from bottom to top
		//child obj = (child)parentobj ; object binding from top to bottom
		
		MacBook mb = new MacBookAir();  //child to parent
		//mb.specialFeature(); can't be accessed as it is parent reference only access parent methods
		MacBookAir mba = (MacBookAir)mb;//parent to child
		mba.specialFeature();
		
		
	}

}
