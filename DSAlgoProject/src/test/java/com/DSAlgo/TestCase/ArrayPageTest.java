package com.DSAlgo.TestCase;

import org.testng.annotations.Test;

import com.DSAlgo.PageObject.ArrayPage;
import com.DSAlgo.PageObject.GraphPage;
import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LogInPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ArrayPageTest {
	
	LandingPage landingPage;
	HomePage hmp;
	ArrayPage Ap;
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
			Ap = new ArrayPage(landingPage.getDriver());

		}
    @Test(priority = 1)
  public void arrayPageOpenTest() throws InterruptedException {
    	String apTitle = Ap.arrayPageOpen();
		assertEquals(apTitle, "Array");
  }
  
    @Test(priority = 2)
  public void clickArrayInPythonTest() throws InterruptedException {
    	Ap.clickArrayInPython();
		assertTrue(true);
  }
  @Test(priority = 3)
  public void clickTryBtn_ArrayInPythonTest() throws InterruptedException {
	  boolean result = Ap.clickTryBtn_ArrayInPython();
		assertEquals(result, true);
  }
  @Test(priority = 4)
  public void addTextTryEditor_ArrayInPythonTest() {
	  Ap.addTextTryEditor_ArrayInPython();
		assertTrue(true);
		landingPage.getDriver().navigate().back();
		landingPage.getDriver().navigate().back();
  }

  @Test(priority = 5)
  public void clickArrayUsingListTest() throws InterruptedException {
	  Ap.clickArrayUsingList();
		assertTrue(true);
  }
  @Test(priority =6)
  public void clickTryBtn_ArrayUsingListTest() throws InterruptedException {
	  boolean result = Ap.clickTryBtn_ArrayUsingList();
		assertEquals(result, true);
  }
  @Test(priority = 7)
  public void addTextTryEditor_ArrayUsingListTest() {
	  Ap.addTextTryEditor_ArrayUsingList();
		assertTrue(true);
   landingPage.getDriver().navigate().back();
   landingPage.getDriver().navigate().back();
  }
  @Test(priority = 8)
  public void clickBasicOperrationListTest() throws InterruptedException {
	  Ap.clickBasicOperrationList();
		assertTrue(true);
  }
  @Test(priority = 9)
  public void clickTryBtn_BasicOperrationListTest() throws InterruptedException {
	  boolean result = Ap.clickTryBtn_BasicOperrationListt();
		assertEquals(result, true);
  }
  @Test(priority =10 )
  public void addTextTryEditor_BasicOperrationListTest() {
	  Ap.addTextTryEditor_BasicOperrationList();
		assertTrue(true);
		landingPage.getDriver().navigate().back();
		landingPage.getDriver().navigate().back();
  }
  @Test(priority =11 )
  public void clickApplicationOfArrayTest() throws InterruptedException {
	  Ap.clickApplicationOfArray();
	  assertTrue(true);
  }
  @Test(priority = 12)
  public void clickTryBtn_ApplicationOfArrayTest() throws InterruptedException {
	  boolean result = Ap.clickTryBtn_ApplicationOfArray();
		assertEquals(result, true);
  }
  @Test(priority =13 )
  public void addTextTryEditor_ApplicationOfArrayTest() {
	  Ap.addTextTryEditor_ApplicationOfArray();
		assertTrue(true);
		landingPage.getDriver().navigate().back();
		
		 }
  @Test(priority = 14)
  public void clickPracticeQuestionTest() throws InterruptedException 
  {
	 // landingPage.getDriver().navigate().back();
	  Ap.clickPracticeQuestion();
    assertTrue(true);
  }
  @Test(priority = 15)
  public void clickSearchOfArrayTest()throws InterruptedException
  {
    Ap.clickSearchOfArray();
    Ap.addTextTryEditor_clickSearchOfArray();
    assertTrue(true);
    landingPage.getDriver().navigate().back();
    
  }
  @Test(priority = 16)
  public void clickMaxConsOneTest() throws InterruptedException
  {
	  Ap.clickMaxConsOne();
	  Ap.addTextTryEditor_MaxConsOne();
	  assertTrue(true);
	  landingPage.getDriver().navigate().back();
  }
  @Test(priority = 17)
  public void clickFindNumEvenDigTest()throws InterruptedException
  {
	 
	  Ap.clickFindNumEvenDig();
	  Ap.addTextTryEditor_FindNumEvenDig();
	  assertTrue(true);
	  landingPage.getDriver().navigate().back();
  }
  

  
  @Test(priority = 18)
  public void clickSqarOfSortedArrayTest() throws InterruptedException
  {
	  Ap.clickSqarOfSortedArray();
	  Ap.addTextTryEditor_SqarOfSortedArray();
	  assertTrue(true);
	  landingPage.getDriver().navigate().back();
  }
  @Test(priority = 19)
	public void signOut_from_array_Test() throws InterruptedException

	{
		landingPage.getDriver().navigate().back();
		hmp.signOut();
	}
 
  @AfterClass
	public void tearDown() throws InterruptedException {
		landingPage.getDriver().quit();
	}
}
