
public class ExplicitCasting {

	public static void main(String[] args) {
		
		int a = 127;  //general explicit casting
		byte b = (byte)a;
		System.out.println(b);
		
		char g = 'a';    // 0,1,2,...,126,127,-128,-127,...,-2,-1,0,1,2,...
		int h = (int)g;
		System.out.println(h);
		
		float c = 123.45f; //.45 data truncated 
		int d = (int)c;
		System.out.println(d);
		
		long e = 1234567; //data losted (out of range)
		short f = (short)e;
		System.out.println(f);
		
	}

}
