package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
 
  public RemoteWebDriver driver;
  @Parameters({"browserName","URL"})
  @BeforeMethod
  public void preCondition(String browserName,String url) {
	  if(browserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	  }
	  else if(browserName.equalsIgnoreCase("Edge")) {
		  WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	  }
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
}
