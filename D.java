package p2;
import p1.A; //D as public


public class D {

	public static void main(String[] args) {
		
		A obj = new A();
		
		System.out.println(obj.d); //access granted
	}

}
