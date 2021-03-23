
public class Child extends Parent{
	
	Child(){
		this(10);//calling arg constructor
		System.out.println("Default Child Class Constructor.");
		
		
	}

	Child(int y){
		super(y);
		System.out.println("Argument Child Class Constructor.");
	}
}
