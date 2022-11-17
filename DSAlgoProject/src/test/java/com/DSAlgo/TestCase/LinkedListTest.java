package com.DSAlgo.TestCase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DSAlgo.PageObject.DataStructurePage;
import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LinkedListPage;
import com.DSAlgo.PageObject.LogInPage;
@Listeners({AllureListener.class})
public class LinkedListTest  {
	LandingPage landingPage;
	HomePage hmp;
	DataStructurePage dataStructurePage;
	LinkedListPage linkedListPage;
	
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
			linkedListPage = new LinkedListPage(landingPage.getDriver());

		}
 
	
	@Test(priority=1)
	public void click_Getstarted_below_LinkedListTest() throws InterruptedException
	{
		
		
		linkedListPage.click_Getstarted_below_LinkedListPage();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		
		
	}
	@Test(priority=2)
	public void click_Introduction_Test() throws InterruptedException
	{
		linkedListPage.click_Introduction();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		linkedListPage.click_tryHere();
		linkedListPage.sendCode();
		linkedListPage.clickRun_btn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
	}
	
	@Test(priority=3)
	public void click_createLinkedlist_Test() throws InterruptedException
	
	{
		linkedListPage.click_createLinkedlist();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		linkedListPage.click_tryHere();
		linkedListPage.sendCode();
		linkedListPage.clickRun_btn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
		
	}
	@Test(priority=4)
	public void click_typesofLinkedlist_Test() throws InterruptedException
	
	{
		linkedListPage.click_implementLinkedlistInpython();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		linkedListPage.click_tryHere();
		linkedListPage.sendCode();
		linkedListPage.clickRun_btn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
		
	}
	@Test(priority=5)
	public void click_Traverse_Test() throws InterruptedException
	
	{
		linkedListPage.click_Traversal();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		linkedListPage.click_tryHere();
		linkedListPage.sendCode();
		linkedListPage.clickRun_btn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
	}
	@Test(priority=6)
	public void click_Insertion_Test() throws InterruptedException
	
	{
		linkedListPage.click_Insertion();
		JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		linkedListPage.click_tryHere();
		linkedListPage.sendCode();
		linkedListPage.clickRun_btn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
		
	}
	@Test(priority=7)
	public void click_Deletion_Test() throws InterruptedException

	{
	linkedListPage.click_Deletion();
	JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
	js.executeScript("window.scrollBy(0, 350)");
	linkedListPage.click_tryHere();
	linkedListPage.sendCode();
	linkedListPage.clickRun_btn();
	Thread.sleep(2000);
	landingPage.getDriver().navigate().back();
	
	}
	@Test(priority=8)
	public void click_PracticeQns_Test() throws InterruptedException

	{
	linkedListPage.click_PracticeQns();
	}
	
	@Test(priority=9)
	public void signOut_from_linkedListpage_Test() throws InterruptedException
	
	{	
		String message = hmp.signOutWithMsg();
		Assert.assertEquals(message, "Logged out successfully", "Logged out failed");
		}
	@AfterClass
	public void tearDown() throws InterruptedException{
//		landingPage.getDriver().quit();
		hmp.signOut();
	}
}
