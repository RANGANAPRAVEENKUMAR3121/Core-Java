
public class StringConcatination {

	public static void main(String[] args) {

		// + is the only operator which performs two different activities
		// +  =>  5+3 => 8(addition) and  "Rp"+"Rk" => RpRk(append).
		// Based on operands 
		
		String s1 = "Rangana ";
		String s2 = "Kumar";
		System.out.println(s1+s2);
		
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
									//Left to Right => executes
		System.out.println(s1+a+b);//string then appends entire flow
		
		System.out.println(a+b+s1);//integer then upto end of integer adds and appends with string
		
		
	}

}
