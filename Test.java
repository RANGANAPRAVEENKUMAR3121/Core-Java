
public class Test {
	public static void main(String[] args) {
		//HPNoteBook hpnotebook =new HPNoteBook();
		TouchScreenLaptop hpnotebook = new HPNoteBook();
		hpnotebook.click();
		hpnotebook.scroll();
		
		//DELLNoteBook dellnotebook = new DELLNoteBook();
		TouchScreenLaptop dellnotebook = new DELLNoteBook();
		dellnotebook.click();
		dellnotebook.scroll();
	}
}
