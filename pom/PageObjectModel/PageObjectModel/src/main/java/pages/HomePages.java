package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class HomePages extends ProjectSpecificMethod {
	public HomePages(ChromeDriver driver) {
		this.driver=driver;
	
	}
	
	public MyHomePage clickCrmsfa() {

		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
        return new MyHomePage(driver);
	}

}
