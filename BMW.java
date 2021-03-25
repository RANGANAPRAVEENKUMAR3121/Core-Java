
public  abstract class BMW {
	//partial abstraction

	void commonFun() {
		System.out.println("Common Functionality.");
	}
	
	abstract void accelerate(); //specific method
	
	public static void main(String[] args) { //abstract class contains main because it is static.
		System.out.println("Main Method");

	}

}
