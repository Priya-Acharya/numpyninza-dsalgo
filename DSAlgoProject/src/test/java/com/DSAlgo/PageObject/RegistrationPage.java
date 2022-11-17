package com.DSAlgo.PageObject;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.DSAlgo.utilities.randomStringUtility;
import com.DSAlgo.utilities.webClick;

public class RegistrationPage {
	
		public WebDriver driver = null;
		RegistrationPage registrationPage;
		
//List of all X-Path web elements
	@FindBy(xpath=("//a[contains(text(), 'Register')]"))WebElement registerBtn;
	 @FindBy(xpath=("//input[@id='id_username']"))WebElement userId;
	 @FindBy(xpath=("//input[@id='id_password']"))WebElement pwd;
	 @FindBy(xpath=("//input[@id='id_password1']"))WebElement regPagePassword;
	 @FindBy(xpath=("//input[@id='id_password2']"))WebElement confirmPassword;
	@FindBy(xpath=("//input[@type='submit']"))WebElement submit ;
	@FindBy(xpath=("//a[contains(text(), 'Sign out')]")) WebElement signOutBtn;
	@FindBy(xpath=("//div[@class= 'alert alert-primary']")) WebElement loginAlert;
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public boolean registration(String userID,String password1,String passwordCnf) throws InterruptedException {
		webClick.webClickAll(registerBtn, driver);
		userID = userID==null?"":userID + randomStringUtility.getAlphaNumericString(5);
		password1 = password1 == null?"":password1;
		passwordCnf = passwordCnf == null?"":passwordCnf;
		//userID=userID + randomStringUtility.getAlphaNumericString(5);
		userId.sendKeys(userID);
		//System.out.println(UserId);
		//CharSequence password = "Pwd@12345";
		regPagePassword.sendKeys(password1);
		confirmPassword.sendKeys(passwordCnf);
		Thread.sleep(2000);
		webClick.webClickAll(submit, driver);
		try {
			if (loginAlert.isDisplayed() && loginAlert.getText().contains("You are logged in")) {
				return true;
			} else {
				return false;
			}
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
//	public static void main (String[]args) throws Exception   {
//		
//		LandingPage landingPage = new LandingPage();
//		landingPage.lunchApp();
//		landingPage.clickOnGetStarted();
//		
//		RegistrationPage obj2=new RegistrationPage(landingPage.getDriver());
//		//obj2.clickSignIn();
//		//obj2.registration();
//		
//		
//	}
	
	public String registration_with_existuser(String userID,String password1,String passwordCnf) throws InterruptedException {
		
		
		webClick.webClickAll(registerBtn, driver);
		
		userId.sendKeys(userID);
		regPagePassword.sendKeys(password1);
		confirmPassword.sendKeys(passwordCnf);
		//webClick.webClickAll(userId, driver);
//		webClick.webClickAll(regPagePassword, driver);
//		webClick.webClickAll(confirmPassword, driver);
//		webClick.webClickAll(registerBtn, driver);
		
		Thread.sleep(2000);
		webClick.webClickAll(submit, driver);
		
		String actualmsg=null;
		try {
			actualmsg = loginAlert.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		  webClick.webClickAll(signOutBtn, driver);
		  return actualmsg;
	}
	
	
}
