package com.DSAlgo.PageObject;

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
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void registration() throws InterruptedException {
		webClick.webClickAll(registerBtn, driver);
		//String user="Priya_Acharya" + randomStringUtility.getAlphaNumericString(5);
		userId.sendKeys("Priya_Acharya2");
		//System.out.println(UserId);
		CharSequence password = "Pwd@12345";
		regPagePassword.sendKeys(password);
		confirmPassword.sendKeys(password);
//		Thread.sleep(2000);
		webClick.webClickAll(submit, driver);
//		Thread.sleep(2000);
		webClick.webClickAll(signOutBtn, driver);
	}
	
	public static void main (String[]args) throws Exception   {
		
		LandingPage landingPage = new LandingPage();
		landingPage.lunchApp();
		landingPage.clickOnGetStarted();
		
		RegistrationPage obj2=new RegistrationPage(landingPage.getDriver());
		//obj2.clickSignIn();
		obj2.registration();
		
		
	}
}
