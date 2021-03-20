
public class BMICalculator {

	public static void main(String[] args) {
		
		//BMI =>  weight in kg / (height*height)in meters 

		double height = 5.9;
		double weight = 78;
		
		double heightInMeters = height * 0.4536;
		
		double BMI = weight/(heightInMeters*heightInMeters);
		
		System.out.println(BMI);
		
	}

}
