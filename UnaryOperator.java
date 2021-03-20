
public class UnaryOperator {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 15;
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		--x;
		--y;
		System.out.println("X = "+x);//9
		System.out.println("Y = "+y);//14
		System.out.println(x--);  //9
		y--;//14
		System.out.println("X = "+x);//8
		System.out.println("Y = "+y);//13
		System.out.println(++x);//9
		System.out.println(++y);//14
		
	}

}
