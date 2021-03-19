
public class ReferenceInStaticMethod {

	static ReferenceInStaticMethod obj = new ReferenceInStaticMethod();//we can directly instantiated reference  to variable 
	
	static{
		System.out.println(ReferenceInStaticMethod.obj); //reference is not created so null to static classtype variable
		//ReferenceInStaticMethod.method();  //static method is called
		ReferenceInStaticMethod.obj = ReferenceInStaticMethod.method();
	}
	//change type to class  , if address is returning
	static ReferenceInStaticMethod method() {
		//ReferenceInStaticMethod.obj = new ReferenceInStaticMethod();//reference is created in static method
		return new ReferenceInStaticMethod();
	}
	
	public static void main(String[] args) {
		System.out.println(ReferenceInStaticMethod.obj);
		
	}
	

}
