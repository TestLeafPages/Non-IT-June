package week7.day1;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod {
   @DataProvider(name="Create")
	public String[][] fetchData() throws IOException {
	  
	   String[][] readData = LearnReadExcel.readData();
       //object   class obj=new class();
      //static method
      //classname.methodname
	
	   return readData;

	}
	
	@Test(dataProvider="Create")
	public  void createLead(String cName, String first,String last,String pnum) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
		
}
}



/*
 * String[][] data=new String[2][4] //1 st data data[0][0]="Testleaf";
 * data[0][1]="Hari"; data[0][2]="R"; data[0][3]="99"; //2nd set of data
 * data[1][0]="Qeagle"; data[1][1]="Babu"; data[1][2]="M"; data[1][3]="98";
 */



