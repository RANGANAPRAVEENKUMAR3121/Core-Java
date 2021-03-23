
public class HierarchicalTest {

	public static void main(String[] args) {

		Bike bike = new Bike();
		System.out.println(bike.fuel());
		
		Car car = new Car();
		System.out.println(car.fuel());
		
		Bus bus = new Bus();
		System.out.println(bus.fuel());
		
	}
}
//Note : in mobile we are improving camera conditions , so we over ride and implemetn this method
//without deleting the parent method and method name also same 