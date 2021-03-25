package methodoverriding;

public class MacBookPro extends MacBook {
	
	public void start() {
		//super.start();
		System.out.println("Inside MacBookAir Child under Start()");
	}
	
	public void shutdown() {
		//super.shutdown();
		System.out.println("Inside MacBookAir Child under ShutDown()");
	}

}
