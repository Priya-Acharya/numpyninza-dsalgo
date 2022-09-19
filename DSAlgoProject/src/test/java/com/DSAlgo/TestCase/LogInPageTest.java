package com.DSAlgo.TestCase;

import org.testng.annotations.Test;

import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LogInPage;
import com.DSAlgo.utilities.ExcelReadUtility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LogInPageTest {

	LogInPage logInPage;
	LandingPage landingPage;
	HomePage hmp;

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		landingPage = new LandingPage();
		landingPage.lunchApp();
		landingPage.clickOnGetStarted();

		hmp = new HomePage(landingPage.getDriver());
		hmp.clickSignIn();

		logInPage = new LogInPage(landingPage.getDriver());
	}

//	@Test(dataProvider = "dp")
//	public void f(Integer n, String s) {
//	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		hmp.signOut();
		hmp.clickSignIn();
	}

	@DataProvider(name = "logindata")
	public Object[][] dp() throws Exception {

		String xlFilePath = System.getProperty("user.dir") + "/src/test/resources/InputData.xlsx";
		ExcelReadUtility xlUtil = new ExcelReadUtility(xlFilePath);
		int totalRows = xlUtil.getRowCount("Sheet1");
		int totalCols = xlUtil.getColumnCount("Sheet1", 1);
		String loginData[][] = new String[totalRows][totalCols];

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				loginData[i - 1][j] = xlUtil.getCellData("Sheet1", i, j);
			}
		}

		return loginData;

	}

//	@AfterClass
//	public void afterClass() {
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//	}
//
//	@AfterTest
//	public void afterTest() {
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//	}
//
//	@Test
//	public void aftertestTest() {
//
//	}
//
//	@Test
//	public void getStartedTest() {
//		throw new RuntimeException("Test not implemented");
//	}

	@Test(dataProvider = "logindata")
	public void logintest(String user, String pwd, String exp) {
		String actRes = logInPage.signIn(user, pwd);
		assertEquals(actRes, exp);
	}
	
//	public static void main(String[] args) throws Exception {
//		new LogInPageTest().dp();
//	}
}
