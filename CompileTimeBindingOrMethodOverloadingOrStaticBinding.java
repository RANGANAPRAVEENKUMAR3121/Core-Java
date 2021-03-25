
public class CompileTimeBindingOrMethodOverloadingOrStaticBinding {
	
	void add(int a,int b){
		int res = a+b;
		System.out.println("Result : "+res);
	}
	void add(float a,float b){
		float res = a+b;
		System.out.println("Result : "+res);
	}
	void add(int a,int b,int c){
		int res = a+b+c;
		System.out.println("Result : "+res);
	}

	public static void main(String[] args) {
		
		 CompileTimeBindingOrMethodOverloadingOrStaticBinding  obj = new  CompileTimeBindingOrMethodOverloadingOrStaticBinding();
		 obj.add(10, 20);
		 obj.add(25.7f, 34.8f);
		 obj.add(23, 45,67);
		
	}

}
