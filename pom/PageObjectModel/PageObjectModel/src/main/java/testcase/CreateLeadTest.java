package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setFile() {
		excelfile="CreateLeadpom";
	}
	@Test(dataProvider="testData")
	public void runCreateLead(String uname,String pwd,String cmp,String fname,String lname) {
  LoginPage lp=new LoginPage(driver);
  System.out.println(driver);
  lp.enterUsername(uname).enterPassword(pwd).clickLogin().clickCrmsfa().clickLead()
  .clickcreatelead().enterCompanyName(cmp).enterFirstName(fname).enterLastName(lname).clickCreatebutton()
  .verifyLead(fname);

  }
	}


