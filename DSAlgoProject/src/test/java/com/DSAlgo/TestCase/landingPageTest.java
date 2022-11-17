package com.DSAlgo.TestCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DSAlgo.PageObject.LandingPage;

@Listeners({AllureListener.class})
public class landingPageTest {
	LandingPage landingPage;
	
	@BeforeClass
	public void initlandingPage(){
		landingPage = new LandingPage();
		landingPage.lunchApp();
	}

  @Test(priority =3)
  public void clickOnGetStartedTest() {
	  landingPage.clickOnGetStarted();
	  assertTrue(true);
  }


  @Test(priority =1)
  public void validatelandingpageTest() {
    
	  boolean actResult=landingPage.validatelandingpage();
	  assertEquals(true, actResult);
  }

  @Test(priority =2)
  public void verifyLandingPagetitleTest() {
	  String actResult=landingPage.verifyLandingPagetitle();
	  System.out.println(actResult);
	  assertTrue(actResult.equals("NumpyNinja") || actResult.equals("Numpy Ninja"),"Title is validated");
	  
  }
  @AfterClass
	public void tearDown() throws InterruptedException {
//		landingPage.getDriver().quit();
}
}
