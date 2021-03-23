
public class Parent {

	int x ;
	
	Parent(){
		System.out.println("Default Parent Constructor.");
		
	}
	
	Parent(int x){
		this();
		System.out.println("Argument Parent Constructor:");
	}
}
