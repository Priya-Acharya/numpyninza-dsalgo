package com.DSAlgo.TestCase;

import org.testng.annotations.Test;

import com.DSAlgo.PageObject.GraphPage;
import com.DSAlgo.PageObject.HomePage;
import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.PageObject.LogInPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class HomePageTest {
	HomePage hmp;
	LandingPage landingPage;

	
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		landingPage = new LandingPage();
		landingPage.lunchApp();
		landingPage.clickOnGetStarted();
		hmp = new HomePage(landingPage.getDriver());
		
	}
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

    @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }


  @Test
  public void clickRegisterBtnTest() {
	  hmp.clickRegisterBtn();
	  assertTrue(true);
  }

  @Test
  public void beforeLoginClickTest() throws Exception {
	  String alert=hmp.beforeLoginClick();
	  if("You are not logged in".equals(alert))
		{
			System.out.println("Alert is displayed : From Pane");
		}
		else
		{
			throw new Exception("Alert is not displayed");
		}
	  assertTrue(alert.equals("You are not logged in") );
  }

  @Test
  public void clickSignInTest() throws InterruptedException {
	  hmp.clickSignIn();
	  assertTrue(true);
	  
  }

  @Test
  public void validatedropDownlinkTest() throws Exception {
    hmp.validatedropDownlink();
    assertTrue(true);
  }

  @Test
  public void validateloginFromdropDownTest() throws Exception {
    hmp.validateloginFromdropDown();
    assertTrue(true);
    
  }
  @Test
  public void signOutTest() throws Exception {
    hmp.signOut();
    assertTrue(true);
}
}
