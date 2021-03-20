
public class BitwiseOperator {

	public static void main(String[] args) {

	//	 &   true if both are true 
	//   |   true if atleast one is true
	//   ^   true if both arguments are different
		
		System.out.println(true & false);
		System.out.println(true & true);
		System.out.println(true | false);
		System.out.println(false | false);
		System.out.println(true ^ false);
		System.out.println(true ^ true);
		System.out.println(!(true));  //Boolean Complement
		int a = -2; // - => decreament + positive , + =>increament + negative
		
		System.out.println(~a);
								//   ~ Bitwise Unary Complement
		
	}

}
