
public class NonStaticDemo {

	int num;  //Non-Static Variable
	
	//Non-Static Method
	NonStaticDemo(){
		System.out.println("Non Static Method / Constructor");
	}
	
	//Non-Static Block
	{
		System.out.println("Non Static Block-Top");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Top...!");
		new NonStaticDemo();
		System.out.println("Main Method Bottom...!");

	}
	{
		System.out.println("Non Static Block-Bottom");
	}

}
