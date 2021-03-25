package interfaces;

public class Test {

	int ab =100;
	public static void main(String[] args) {
		
	//	Honda honda = new Honda(); //parent and child access same memory
		Car honda = new Honda();
		honda.go();
		honda.stop();
	}

}
