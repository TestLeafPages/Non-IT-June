package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchtheBrowser {

	public static void main(String[] args) {
		//setup the path driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the window
		driver.manage().window().maximize();
		//Add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//ctrl+2+l  ctrl+2 popup use down arrow choose sec option press enter
		String title = driver.getTitle();
		 System.out.println(title);
		 //Click CRM/SFA
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //click Leads
		 driver.findElement(By.linkText("Leads")).click();
		 //click create lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Enter the company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 //Enter the first name
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		 //Enter the lastname
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		
		 //handle the dropdown
		  WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //ctrl+2+l findElement returns WebElement
		 Select drop1=new Select(source);
		 //Select By visible text
		//drop1.selectByVisibleText("Conference");
		 //Select By value
		// drop1.selectByValue("LEAD_DIRECTMAIL");
		 //Select by index
		 drop1.selectByIndex(8);
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
