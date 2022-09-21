package com.DSAlgo.TestCase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.DSAlgo.PageObject.DataStructurePage;
import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LogInPage;



public class DataStructureTest {
	
	
	LandingPage landingPage;
	HomePage hmp;
	DataStructurePage dataStructurePage;
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass()throws InterruptedException {
	  		landingPage = new LandingPage();
			landingPage.lunchApp();
			landingPage.clickOnGetStarted();
			hmp = new HomePage(landingPage.getDriver());
			hmp.clickSignIn();
			LogInPage logInPage = new LogInPage(landingPage.getDriver());
			logInPage.signIn("Priya.Acharya", "Pwd@1234");
			dataStructurePage = new DataStructurePage(landingPage.getDriver());

		}
 

	
	@Test(priority=1)
	public void click_Getstarted_below_DataStructureTest() throws InterruptedException
	{
		
		dataStructurePage.click_Getstarted_below_DataStructure();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		
		
	}
	@Test(priority=2)
	public void click_timeComplexityTest() throws InterruptedException
	{
		dataStructurePage.click_timeComplexity();
	}
	@Test(priority=3)
	public void click_practiceQnsTest() throws InterruptedException
	{
		dataStructurePage.click_practiceQns();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		
		
	}
	@Test(priority=4)
	public void click_tryHereTest() throws InterruptedException
	{
		dataStructurePage.click_tryHere();
	}
	
	@Test(priority=5)
	public void sendCodeTest() throws InterruptedException
	{
		dataStructurePage.sendCode();
		dataStructurePage.clickRun_btn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
	}
	
	@Test(priority=6)
	public void signOut_from_dataStructurePage_Test() throws InterruptedException
	
	{	
		String message = hmp.signOutWithMsg();
		Assert.assertEquals(message, "Logged out successfully", "Logged out failed");
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		landingPage.getDriver().quit();
	}
	
	
	

}
