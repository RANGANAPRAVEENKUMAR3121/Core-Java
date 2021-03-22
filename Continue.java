
public class Continue {

	public static void main(String[] args) {

		int i = 1;
		
	/*	while(i<=10) {
			i++;
			if(i==5) 
				continue;  //skip the i values of 5
			System.out.println(i);
		}*/
		
		while(i<=10) {
			i++;
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
	}

}
