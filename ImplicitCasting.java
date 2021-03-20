
public class ImplicitCasting {

	public static void main(String[] args) {
		
		byte a = 100;
		System.out.println(a);
		int b = a ;//implicit casting no need to manually cast
		System.out.println(b);
		long c = b;
		System.out.println(c);
		
		char d = 'A';
		System.out.println(d);
		int e = d; //ASCII of A values assigned to e
		System.out.println(e);
		
	}

}
