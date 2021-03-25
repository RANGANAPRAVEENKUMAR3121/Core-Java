
public class AutoTypeConversion {
	/*
	public void print(int a) {   //int type
		System.out.println("Int version : "+a);
	}*/
	
	public void print(float b) {   //float type
		System.out.println("Float Version : "+b);
	}
	
	/*
	public void print(String s) {   //string type
		System.out.println("Hello");
	}*/
	
	public void print(Object o) {  //object type
		System.out.println("Object Class");
	}
	public static void main(String[] args) {
		
		AutoTypeConversion atc = new AutoTypeConversion();
		atc.print(123);  //if (int a) not exist means compiler moves
		//automatically to next higher type and print under that data type.[float]
		// short -> int -> long -> float -> double
		atc.print(13.5f);
		
		atc.print("Hello");  //priority [String -> Object] {String to Object type conversion}
		
		
	}

}
