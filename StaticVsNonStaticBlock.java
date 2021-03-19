
public class StaticVsNonStaticBlock {

	StaticVsNonStaticBlock(){
		System.out.println("Non-Static Method.");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new StaticVsNonStaticBlock();
		new StaticVsNonStaticBlock();

	}
	//Based on No.of Obj the Non-StaticBlock and Non-Static Methods will be executed.
	{
		System.out.println("Non-Static Block");
	}
	//Static Block will Executes only once , It doesn't consider about the objects.
	static {
		System.out.println("Static Block");
	}

}
