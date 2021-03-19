
public class InvokingNonStaticMethodAndVariable {

	int x = 10; //non static variable
	
	InvokingNonStaticMethodAndVariable(){
		
	}
	
	void method() {
		System.out.println("Non Static Method");//non static method
	}
	
	public static void main(String[] args) {
		 InvokingNonStaticMethodAndVariable obj = new  InvokingNonStaticMethodAndVariable();//reference created
		 System.out.println(obj.x);
		 obj.method();
	}

}
