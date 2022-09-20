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
  }
  @Test(priority = 8)
  public void clickBasicOperrationListTest() throws InterruptedException {
	  Ap.clickBasicOperrationList();
		assertTrue(true);
  }
  @Test(priority = 9)
  public void clickTryBtn_BasicOperrationListTest() throws InterruptedException {
	  boolean result = Ap.clickTryBtn_BasicOperrationList();
		assertEquals(result, true);
  }
  @Test(priority =10 )
  public void addTextTryEditor_BasicOperrationListTest() {
	  Ap.addTextTryEditor_BasicOperrationList();
		assertTrue(true);
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
  }
  @Test
  public void clickPracticeQuestionTest() throws InterruptedException 
  {
	Ap.clickPracticeQuestion();
    assertTrue(true);
  }
  @Test
  public void clickSearchOfArrayTest()throws InterruptedException
  {
    Ap.clickTryBtn_clickSearchOfArray();
    assertTrue(true);
  }
  @Test
  public void clickMaxConsOneTest() throws InterruptedException
  {
	  Ap.clickTryBtn_MaxConsOne();
	  assertTrue(true);
  }
  @Test
  public void clickFindNumEvenDigTest()throws InterruptedException
  {
	 
	  Ap.clickTryBtn_clickFindNumEvenDig();
	  assertTrue(true);
  }
  

  
  @Test
  public void clickSqarOfSortedArrayTest() {
    throw new RuntimeException("Test not implemented");
  }
  @Test(priority = 9)
	public void signOut_from_array_Test() throws InterruptedException

	{
		landingPage.getDriver().navigate().back();
		hmp.signOut();
		// Assert.assertEquals(message,
		// prop.getProperty("signout.success.title"),prop.getProperty("signout.success.title.notFound"));
	}
  
  @AfterClass
	public void tearDown() throws InterruptedException {
		landingPage.getDriver().quit();
	}
}
