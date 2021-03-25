package methodoverriding;

public class MacBookAir extends MacBook {
	
	public void start() {
		//super.start();
		System.out.println("Inside MacBookAir Child under Start()");
	}
	
	public void shutdown() {
		//super.shutdown();
		System.out.println("Inside MacBookAir Child under ShutDown()");
	}
	
	public void specialFeature() {
		System.out.println("New Feature for MacBookAir");
	}

}
