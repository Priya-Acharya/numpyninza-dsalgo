package com.DSAlgo.TestCase;

import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LogInPage;
import com.DSAlgo.PageObject.QueuePage;

@Listeners({AllureListener.class})
public class QueuePageTest 
{
	LandingPage landingPage;
	HomePage hmp;
	QueuePage queuePage;
	
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
				queuePage = new QueuePage(landingPage.getDriver());

			}
	  
	  @Test(priority=1)
		public void click_Getstarted_below_QueuePageTest() throws InterruptedException
		{
			
			
			queuePage.click_Getstarted_below_QueuePage();
			JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
			js.executeScript("window.scrollBy(0, 350)");
			
			
		}

	  @Test(priority=2)
		public void click_implOfQueueInPython_Test() throws InterruptedException
		{
		queuePage.click_implOfQueueInPython();
			JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
			js.executeScript("window.scrollBy(0, 350)");
			queuePage.click_tryHere();
			queuePage.sendCode();
			queuePage.clickRun_btn();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
		}
	  
	  @Test(priority=3)
		public void click_implementationUsingCollection() throws InterruptedException
		
		{
			queuePage.click_implementationUsingCollection();
			JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
			js.executeScript("window.scrollBy(0, 350)");
			queuePage.click_tryHere();
			queuePage.sendCode();
			queuePage.clickRun_btn();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			
		}
	  
	  @Test(priority=4)
		public void cllick_implementationUsingArray() throws InterruptedException
		
		{
			queuePage. click_implementationUsingArray();
			JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
			js.executeScript("window.scrollBy(0, 350)");
			queuePage.click_tryHere();
			queuePage.sendCode();
			queuePage.clickRun_btn();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			
		}
	  
	  @Test(priority=5)
		public void cllick_queueOperation() throws InterruptedException
		
		{
			queuePage.click_queueOperation();
			JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
			js.executeScript("window.scrollBy(0, 350)");
			queuePage.click_tryHere();
			queuePage.sendCode();
			queuePage.clickRun_btn();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
		}
	  
	  @Test(priority=6)
		public void cllick_practicQuestion() throws InterruptedException
		
		{
			queuePage.click_practicQuestion();
						
		}
	  @Test(priority=7)
		public void signOut_from_queuePage_Test() throws InterruptedException
		
		{	
			String message = hmp.signOutWithMsg();
			Assert.assertEquals(message, "Logged out successfully", "Logged out failed");
		}
	  
		@AfterClass
		public void tearDown() throws InterruptedException{
//			landingPage.getDriver().quit();
			hmp.signOut();
		}
}