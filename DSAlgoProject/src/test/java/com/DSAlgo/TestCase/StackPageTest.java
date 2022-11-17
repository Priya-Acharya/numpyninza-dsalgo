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
import com.DSAlgo.PageObject.StackPage;
@Listeners({AllureListener.class})
public class StackPageTest {
	
	
     
     LandingPage landingPage;
 	HomePage hmp;
 	DataStructurePage dataStructurePage;
 	LinkedListPage linkedListPage;
 	StackPage stackpage;
 	
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
 			stackpage = new StackPage(landingPage.getDriver());

 		}
     
 @Test(priority = 1)
 public void click_GetStartedStack() throws InterruptedException {
     
     ;
     stackpage.Get_StartedStack();
     JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
     
 }
 
 @Test(priority = 2)
 public void click_OperationInStack() throws InterruptedException {
	 stackpage.Get_OperationInStack();
	 JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
		stackpage.Get_TryHere();
		stackpage.Get_Textwindow();
		stackpage.Get_RunBtn();
		Thread.sleep(2000);
		landingPage.getDriver().navigate().back();
		JavascriptExecutor jse = (JavascriptExecutor) landingPage.getDriver();
		jse.executeScript("window.scrollBy(0, -450)");
		
    
 }
 
 @Test(priority = 3)
 public void click_Get_Implementation()throws InterruptedException
 {
     stackpage.Get_Implementation();
   JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
     stackpage.Get_TryHere();
     stackpage.Get_Textwindow();
     stackpage.Get_RunBtn();
     Thread.sleep(2000);
     landingPage.getDriver().navigate().back();
    
 }
 
 @Test(priority = 4)
 public void click_Get_Application()throws InterruptedException
 {
     stackpage.Get_Application();
     JavascriptExecutor js = (JavascriptExecutor) landingPage.getDriver();
		js.executeScript("window.scrollBy(0, 350)");
     stackpage.Get_TryHere();
     stackpage.Get_Textwindow();
     stackpage.Get_RunBtn();
     Thread.sleep(2000);
     landingPage.getDriver().navigate().back();
     
 }
 
 @Test(priority = 5)
 public void click_Get_PracticQuestion()throws InterruptedException
 {
     stackpage.Get_PracticQuestion();
     
     
 }
 @Test(priority=6)
	public void signOut_from_linkedListpage_Test() throws InterruptedException
	
	{	
		String message = hmp.signOutWithMsg();
		Assert.assertEquals(message, "Logged out successfully", "Logged out failed");
		}
 
 @AfterClass
 public void tearDown() 
 {
//	 landingPage.getDriver().quit();
	 hmp.signOut();
 }
}
	


