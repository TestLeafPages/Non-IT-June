package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod {
	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	
	}
	
	public ViewLead verifyLead(String excp) {

		String actual= driver.findElement(By.id("viewLead_firstName_sp")).getText();
        System.out.println( actual);
        Assert.assertEquals(actual, excp);;
         return this;
	}
}
