
public class ObjectReference {

	int a =10;  //non static variable
	
	ObjectReference(){
		//default Constructor
	}
	public static void main(String[] args) {
		ObjectReference obj = new ObjectReference();//obj = reference of constructor
		System.out.println(obj.a);
	}

}
