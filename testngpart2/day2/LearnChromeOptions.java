package week7.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnChromeOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cp=new  ChromeOptions();
		cp.addArguments("--disable-Notifications");
		ChromeDriver driver=new ChromeDriver(cp);
Actions builder=new Actions(driver);

	}

}
