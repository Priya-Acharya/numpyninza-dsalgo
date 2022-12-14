package com.DSAlgo.TestCase;

import org.testng.annotations.Test;

import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LogInPage;
import com.DSAlgo.PageObject.RegistrationPage;
import com.DSAlgo.utilities.ExcelReadUtility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
@Listeners({AllureListener.class})
public class RegistrationPageTest {
	RegistrationPage register;
	LandingPage landingPage;
	HomePage hmp;

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		landingPage = new LandingPage();
		landingPage.lunchApp();
		landingPage.clickOnGetStarted();

		hmp = new HomePage(landingPage.getDriver());
		register = new RegistrationPage(landingPage.getDriver());
		hmp.clickRegisterBtn();
	}

  @DataProvider(name = "regnData")
	public Object[][] dp() throws Exception 
  {

		String xlFilePath = System.getProperty("user.dir") + "/src/test/resources/InputData.xlsx";
		ExcelReadUtility xlUtil = new ExcelReadUtility(xlFilePath);
		int totalRows = xlUtil.getRowCount("registerPg");
		int totalCols = xlUtil.getColumnCount("registerPg", 1);
		String regnData[][] = new String[totalRows][totalCols];

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				regnData[i - 1][j] = xlUtil.getCellData("registerPg", i, j);
			}
		}

		return regnData;

	}
  
 
	
	@Test(dataProvider = "regnData",priority=2)
  public void registrationTest(String userID,String password1,String passwordCnf, String exp, String msg) throws InterruptedException
	{
		boolean actRes = register.registration(userID, password1,passwordCnf);
		assertEquals(actRes, Boolean.parseBoolean(exp));
  }
	@Test(priority=1)
	public void registration_with_existuserTest() throws InterruptedException
	
	{
		String actualMsg=register.registration_with_existuser("Priya.Acharya","pwd@1234","pwd@1234");
		Thread.sleep(2000l);
		assertEquals(actualMsg, "This user already exist,try with other one");	
		Thread.sleep(3000l);
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
//		landingPage.getDriver().quit();
		hmp.signOut();
}
}
