
public class PrimitiveToString {

	public static void main(String[] args) {

		int a = 10;
		
		/*Integer d = Integer.valueOf(a);
		
		System.out.println(d);*/
		
		String s = Integer.toString(a);   //we have to use wrapperclass.toString(a)
		
		System.out.println(s);
		
		int c = Integer.parseInt(s);     //we have to use wrapperclass.parseInt(s)
		
		System.out.println(c);
		
	}

}
