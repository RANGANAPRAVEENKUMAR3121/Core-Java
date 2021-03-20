
public class PrimitiveToObject {

	public static void main(String[] args) {
		
		int x = 10;  //primitive
		
		System.out.println(x);
		
		Integer y = Integer.valueOf(x);  //Auto Boxing  key : using class name to call method means static method
		
		System.out.println(y);
		
		int z = y.intValue();      //Un-Boxing   key:obj reference using to call a method , means non-static method
		
		System.out.println(z);
		
	}

}
