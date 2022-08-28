package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setFile() {
		excelfile="Login";
	}
	@Test(dataProvider="testData")
	
	public void runLogin(String uname,String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pwd).clickLogin();
		
		
	}

}
