package com.DSAlgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DataStructurePage {
	
	
	public WebDriver driver = null;
	// String user = null;
	ArrayPage arrayPage;

	// parameterize constructor
	public DataStructurePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy (xpath = "//a[contains(text(), 'Get Started')]") WebElement clickGetstarted;
	@FindBy (xpath = "//a[contains(text(), 'Time Complexity')]") WebElement timeComplexity ;
	@FindBy (xpath = "//a[contains(text(), 'Practice Questions')]") WebElement practiceQuestns;
	@FindBy (xpath = "//a[contains(text(), 'Try here')]") WebElement tryHereBtn ;
	@FindBy (xpath = "//pre//span[@role = 'presentation']/span") WebElement textBoxcode;
	@FindBy (xpath = "//button[contains(text(), 'Run')]") WebElement clickRun;
	
	public void click_Getstarted_below_DataStructure() throws InterruptedException 
	{
		PageFactory.initElements(driver, this);
		clickGetstarted.click();
		Thread.sleep(1000);
	}
	public void click_timeComplexity() throws InterruptedException 
	{
		timeComplexity.click();
		Thread.sleep(1000);
		
	}
	public void click_practiceQns() throws InterruptedException 
	{
		practiceQuestns.click();
		Thread.sleep(1000);
		
	}
	public void click_tryHere() throws InterruptedException 
	{
		tryHereBtn.click();
		Thread.sleep(2000);
		
	}
	public void sendCode() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(textBoxcode).click().sendKeys("print ('Hello')").build().perform();
		
		Thread.sleep(1000);
		
	}
	public void clickRun_btn() throws InterruptedException 
	{
		clickRun.click();
		Thread.sleep(3000);
		
	}
}

