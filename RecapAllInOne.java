
public class RecapAllInOne {

	public static void main(String[] args) {
		
		int x = 100;
		
		String s = Integer.toString(x);  //primitive to string
		
		Integer m = Integer.valueOf(s); //string to obj
		Integer c = new Integer(s);  //constructor(string) to obj
		
		int a = c.intValue();  //obj to primitive
		
		Integer p = new Integer(a); //constructor(primitive) to obj
		
		String d = p.toString(); //obj to string
		
		int l = Integer.parseInt(d);  //string to primitive
		
	}

}
