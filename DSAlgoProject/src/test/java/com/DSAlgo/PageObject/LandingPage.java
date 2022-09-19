package com.DSAlgo.PageObject;

import java.time.Duration;

import org.openqa.selenium.By;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSAlgo.utilities.webClick;


	public class LandingPage {
		
		WebDriver driver;
		
		public WebDriver getDriver() {
			return driver;
		}


		static String HerokuAppUrl = "https://dsportalapp.herokuapp.com";
		 @FindBy(xpath="//div[@class='banner-area']")WebElement display;
		@FindBy (xpath="//button[@class='btn']") WebElement getstarted;
		static String driverPath = System.getProperty("user.dir") + "/src/test/resources/Driver/chromedriver.exe";
		
		public LandingPage() {
			System.out.println("System property: " + System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver",driverPath);// Set the chrome driver path
			driver = new ChromeDriver();
		}
		
	
		public  void lunchApp() 
		{
			
			System.out.println("\n1.Launch the application");
			driver.get(HerokuAppUrl);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//wait of 5 sec
			driver.manage().window().maximize();//maximizing window
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//wait of 5 sec
			PageFactory.initElements(driver, this);
		
				  
		}
		

		public boolean validatelandingpage() {
			return display.isDisplayed();
		}
		
		
		public  String verifyLandingPagetitle() {
			return driver.getTitle();
		}
		
		public void clickOnGetStarted() {
			//getstarted.click();
			webClick.webClickAll(getstarted, driver);
			
		}
		

//		public static void main(String[] args) 
//		{
//			LandingPage obj1 = new LandingPage();
//			obj1.lunchApp();
//			
//			obj1.clickOnGetStarted();
//			obj1.verifyLandingPagetitle();
//		}
	}
	