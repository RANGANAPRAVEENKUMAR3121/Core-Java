package p1;//package

public class A {
	
	private int a = 10;//only with in  class
	
	int b = 20;//samepackage level
	
	protected int c = 30;//class,package,inheritance
	
	public int d = 40;//class,package,inheritance,otherclass

	public static void main(String[] args) {

		A obj = new A();
		System.out.println(obj.a);
		
		System.out.println(obj.b);
		
		System.out.println(obj.c);
		
		System.out.println(obj.d);
		
	}

}
