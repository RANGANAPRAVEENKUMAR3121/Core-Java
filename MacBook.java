package methodoverriding;

public class MacBook implements Apple {
	
	public void start(){
		System.out.println("Inside MacBook Parent under Start()");
	}
	
	public void shutdown() {
		System.out.println("Inside MacBook Parent under ShutDown()");
	}

}
