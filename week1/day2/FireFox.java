package week1.day2;

public class FireFox {
	
	String name = "firefox";
	boolean visible = true;
	int year = 1998;
	char logo = 'm';
	
	public void edge() {
	float version=103.3f;
	String name="Edge";
	System.out.println("Edge method");
	System.out.println(version);
	}
	public void chrome() {
		int  speed=500;
        System.out.println(speed);
	}
	public static void main(String[] args) {
		float version = 100.2f;
		//create object for class
		FireFox browser=new FireFox();
		System.out.println(browser.logo);
		System.out.println(version);
		System.out.println(browser.name);
		System.out.println(browser.year);
		browser.chrome();
		browser.edge();
		
	}
	
}
