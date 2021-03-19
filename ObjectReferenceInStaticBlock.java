
public class ObjectReferenceInStaticBlock {

	static {
		ObjectReferenceInStaticBlock obj = new ObjectReferenceInStaticBlock();
		System.out.println(obj);
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
	}

}
