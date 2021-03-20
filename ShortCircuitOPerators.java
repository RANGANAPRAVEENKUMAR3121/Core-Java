
public class ShortCircuitOPerators {

	public static void main(String[] args) {

		//   [&& , ||] ==> increase the performance 
		boolean x = true, y = false;//applied only to boolean
		
		//  & => it will checks both side for results as true or false
		//  && => if first value is false , it will never checks second value
		
		//  |  => it will checks both sides for results are true or false
		//  ||  => if first value is true ,  it will never checks the second value
		
		
		
		if(x & y) {
			System.out.println("Inside If");
		}
		
		
		
	}

}
