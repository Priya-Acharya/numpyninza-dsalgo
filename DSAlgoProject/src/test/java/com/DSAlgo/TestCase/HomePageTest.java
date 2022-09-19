package com.DSAlgo.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class HomePageTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }


  @Test
  public void aftertestTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void beforeLoginClickTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void clickSignInTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void validatedropDownlinkTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void validateloginFromdropDownTest() {
    throw new RuntimeException("Test not implemented");
  }
}
