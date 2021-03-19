
public class StaticReferenceDirectly {

	static StaticReferenceDirectly a; //static variable but with classtype = null 
	
	static {
		System.out.println(StaticReferenceDirectly.a);//null
		StaticReferenceDirectly.a = new StaticReferenceDirectly();  //reference created and assigned to static variable
	}
	
	public static void main(String[] args) {
		//new StaticReferenceDirectly();
		System.out.println(StaticReferenceDirectly.a);

	}

}
