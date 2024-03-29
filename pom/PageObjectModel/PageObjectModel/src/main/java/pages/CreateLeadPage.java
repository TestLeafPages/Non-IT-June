package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	
	}
	
	public CreateLeadPage enterCompanyName(String cmp) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmp);
	     return this;
	}
public CreateLeadPage enterFirstName(String fname) {
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	return this;
	}
public CreateLeadPage enterLastName(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;
}
public ViewLead clickCreatebutton() {
	
	driver.findElement(By.name("submitButton")).click();
	return new ViewLead(driver);
	
}

}
