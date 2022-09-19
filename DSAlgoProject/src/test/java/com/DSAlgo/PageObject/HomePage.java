package com.DSAlgo.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.DSAlgo.utilities.webClick;


public class HomePage {
	public WebDriver driver = null;
	//String user = null;
	LandingPage landingPage;
	
	 
	@FindBy(xpath=("//div[@class='card h-100']")) WebElement paneCount;
	@FindBy(xpath=("//div[@class='nav-item dropdown']//a")) WebElement dropDownlink;
	@FindBy(xpath=("//a[@class ='dropdown-item']")) List<WebElement> dropDownlist;
	@FindBy(xpath=("//a[@href= 'data-structures-introduction']")) WebElement loginPane;
	@FindBy(xpath=("//div[@class= 'alert alert-primary']")) WebElement loginAlert;
	@FindBy(xpath=("//a[contains(text(), 'Arrays')]")) WebElement array;
	@FindBy(xpath=("//div[@class='dropdown-menu show'] //a[contains(text(), 'Arrays')]")) WebElement arrayInDropdown;
	@FindBy(xpath=("//a[contains(text(), 'Sign in')]"))WebElement signInBtn;
	//@FindBy(name=("password") WebElement signInPassword;
	@FindBy(xpath=("//a[contains(text(), 'Sign out')]")) WebElement signOutBtn;
	@FindBy(xpath=("//input[@name='username']"))WebElement loginUserName;
	@FindBy(xpath=("//input[@name='password']"))WebElement loginPassword;
	
	//parameterize constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void beforeLoginClick() throws Exception
	{
		webClick.webClickAll(loginPane, driver);
		//Thread.sleep(2000);
		String alert = loginAlert.getText();
		if("You are not logged in".equals(alert))
		{
			System.out.println("Alert is displayed : From Pane");
		}
		else
		{
			throw new Exception("Alert is not displayed");
		}
	}
	
	public void validateloginFromdropDown() throws Exception {
		webClick.webClickAll(dropDownlink, driver);
		webClick.webClickAll(arrayInDropdown, driver);
		//Thread.sleep(2000);
		String alert = loginAlert.getText();
		if("You are not logged in".equals(alert))
		{
			System.out.println("Alert is displayed : From drop Down");
		}
		else
		{
			throw new Exception("Alert is not displayed");
		}
	}
	
		
	public void clickSignIn() throws InterruptedException
	{
		//getstarted.click();
		webClick.webClickAll(signInBtn, driver);
//		System.out.println(user);
		Thread.sleep(2000);
		System.out.println(loginUserName.isDisplayed());
		System.out.println(loginPassword.isDisplayed());
//		webClick.webClickAll(submit,driver);
//		webClick.webClickAll(signOutBtn,driver);
		Thread.sleep(2000);
	}
	
	
	public void validatedropDownlink() throws Exception {
		webClick.webClickAll(dropDownlink, driver);
		Thread.sleep(2000);
		//List<WebElement> dropDownlst = (List<WebElement>) dropDownlist.get;
		if(dropDownlist.size()==6)
		{
			System.out.println("There are 6 drop down list .");
		} else
		{
			throw new Exception("Cannot find 6 panes..");
		}
	}
	
	
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	
	public void signOut()
	  {
		  if (signOutBtn.isDisplayed()) {
			  webClick.webClickAll(signOutBtn, driver);
		  }
	  }



public static void main (String[]args) throws Exception   {
	
	LandingPage landingPage = new LandingPage();
	landingPage.lunchApp();
	landingPage.clickOnGetStarted();
	
	HomePage obj2=new HomePage(landingPage.getDriver());
	obj2.validatedropDownlink();
	obj2.beforeLoginClick();
	obj2.validateloginFromdropDown();
	obj2.clickSignIn();
	
	
	
}
}