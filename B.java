package p1;

public class B {

	public static void main(String[] args) {
			
		A obj = new A();//class A
		
		System.out.println(obj.b);//b is default[we can use under same package]
		
		System.out.println(obj.c);//c is protected[we can use under same package and Inheritance too]
		
		System.out.println(obj.d);//public
	}

}
