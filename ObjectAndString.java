
public class ObjectAndString {

	public static void main(String[] args) {
			
		int a = 10;
		
		Integer b = Integer.valueOf(a);  //primitive to object
		
		System.out.println(b);
		
		String s = b.toString();     //object to string 
		
		System.out.println(s);
		
		Integer c = Integer.valueOf(s);  //string to object
		
		System.out.println(c);
		
	}

}
