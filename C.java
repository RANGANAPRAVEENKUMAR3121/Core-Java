package p2;
import p1.A; //obj = reference 

public class C extends A {

	public static void main(String[] args) {

		A obj = new A();
		
		System.out.println(obj.d); //default
		
		C ob = new C(); //inherit after protected valid
		
		System.out.println(ob.c);  //protected  
		
		System.out.println(ob.d); // default
	}

}
