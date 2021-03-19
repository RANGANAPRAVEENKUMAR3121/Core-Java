
public class StaticMethod {
	static void method1() {
		System.out.println("Static Method-1...!");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Top");
		StaticMethod.method1();
		StaticMethod.method2();
		System.out.println("Main Method Bottom");
	}
	static void method2() {
		System.out.println("Static Method-2...!");
	}

	static {
		StaticMethod.method1();
		StaticMethod.method2();
	}
}
