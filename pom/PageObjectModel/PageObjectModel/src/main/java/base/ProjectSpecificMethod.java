package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.LearnReadExcel;


public class ProjectSpecificMethod {
	
	public  ChromeDriver driver;
	public String excelfile;
	@DataProvider(name="testData")
	public String[][] fetchdata() throws IOException {
		String[][] readData = LearnReadExcel.readData(excelfile);
		return readData;
	}
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
	
}
