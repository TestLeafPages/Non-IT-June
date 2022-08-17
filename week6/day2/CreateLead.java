package testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod {
	@Test(dataProvider ="testdata" )
	public void createLead(String uname,String pass,String cname,String fname,String lname,String phnum) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();

	}
    @DataProvider
	public String[][] testdata() {
	   //2D array to store the test data
	   String[][] data=new String[2][6];
	   data[0][0]="DemoSalesManager";
	   data[0][1]="crmsfa";
	   data[0][2]="TestLeaf";
	   data[0][3]="Hari";
	   data[0][4]="R";
	   data[0][5]="99";
	   
	   data[1][0]="Democsr";
	   data[1][1]="crmsfa";
	   data[1][2]="Qeagle";
	   data[1][3]="Babu";
	   data[1][4]="M";
	   data[1][5]="97";
	   return data;
	   
	   
	   
	   
	   
	   
}

}
