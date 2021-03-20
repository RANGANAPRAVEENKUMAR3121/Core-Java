
public class ConstructorToWrapper {

	public static void main(String[] args) {

		int a = 10;
		Integer b = new Integer(a);  //constructor to obj
		
		System.out.println(b);
		 
		String s = "2000";
		Long c = new Long(s);   //string to obj
		
		System.out.println(c);
		 
	}

}
