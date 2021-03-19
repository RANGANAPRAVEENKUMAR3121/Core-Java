
public class StaticBlock {

	//top to bottom the static blocks will executes
	static {
		System.out.println("Static Block-1...!");
	}
	public static void main(String[] args) {
		System.out.println("Main Block");
	}
	//Static Block will Executes first the main block
	static {
		System.out.println("Static Block-2...!");
	}
}
