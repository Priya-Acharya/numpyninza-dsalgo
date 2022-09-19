package com.DSAlgo.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSAlgo.utilities.ExcelReadUtility;
import com.DSAlgo.utilities.randomStringUtility;
import com.DSAlgo.utilities.webClick;


public class LogInPage {
	public WebDriver driver = null;
	//String user = null;
	LandingPage landingPage;
	@FindBy(xpath=("//div[contains(text(),'You are logged in')]"))WebElement expMsgAfterLogin;
	@FindBy(xpath=("//input[@type='submit']"))WebElement submit ;
	@FindBy(xpath=("//div[@class= 'alert alert-primary']")) WebElement loginAlert;
	@FindBy(xpath=("//a[contains(text(), 'Sign in')]"))WebElement signInBtn;
	//@FindBy(name=("password") WebElement signInPassword;
	@FindBy(xpath=("//a[contains(text(), 'Sign out')]")) WebElement signOutBtn;
	@FindBy(xpath=("//input[@name='username']"))WebElement loginUserName;
	@FindBy(xpath=("//input[@name='password']"))WebElement loginPassword;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
		public String signIn(String userId,String pwd)
	  {
		  	 
		  System.out.println("userId :: " + userId + " pwd :: " + pwd);
		   loginUserName.clear();
		  if (loginUserName.isDisplayed()) {
			  loginUserName.sendKeys(userId);
			   loginPassword.clear();
			   loginPassword.sendKeys(pwd);
		  }
		  webClick.webClickAll(submit, driver);
		  String actualmsg = loginAlert.getText();
//		  webClick.webClickAll(signOutBtn, driver);
		  return actualmsg;
//			String ActualTitle=driver.getTitle();
//		  If (expectedTitle.equals(ActualTitle))
//		  {
	  }
		
	
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}



//public static void main (String[]args) throws Exception   {
//	
//	LandingPage landingPage = new LandingPage();
//	landingPage.lunchApp();
//	landingPage.clickOnGetStarted();
//	
//	LogInPage obj2=new LogInPage(landingPage.getDriver());
//	obj2.signIn(null, null, null);
//	
//	
//}
}