
public class DefaultConstructor {
	/*
	DefaultConstructor(){
		System.out.println("Default Constructor..!");
	} */

	{
		System.out.println("Non-Static Block");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new DefaultConstructor(); //although the constructor is not there but the compiler itself creates and called.
	}
	static {
		System.out.println("Static Block");
	}

}
