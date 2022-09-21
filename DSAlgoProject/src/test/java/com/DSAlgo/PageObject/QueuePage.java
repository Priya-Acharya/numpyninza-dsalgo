package com.DSAlgo.PageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage 
{
	public WebDriver driver = null;
	
	public QueuePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//a[@href = 'queue']") WebElement clickgetStarted;
	@FindBy(xpath = "//a[contains(text(), 'Implementation of Queue in Python')]") WebElement implOfQueueInPython;
	@FindBy (xpath = "//a[contains(text(),  'Implementation using collections.deque')]")WebElement implementationUsingCollection;
	@FindBy(xpath = "//a[contains(text(),  'Implementation using array')]") WebElement implementationUsingArray;
	@FindBy(xpath = "//a[contains(text(), 'Queue Operations')]") WebElement queueOperation;
	@FindBy(xpath = "//a[contains(text(), 'Practice Questions')]") WebElement practicQuestion;
	@FindBy (xpath = "//a[contains(text(), 'Try here')]")WebElement tryHereBtn;
	@FindBy(xpath = "//pre//span[@role = 'presentation']/span") WebElement textWindow;
	@FindBy (xpath = "//button[contains(text(), 'Run')]")WebElement clickRun;
	
	public void click_Getstarted_below_QueuePage() throws InterruptedException 
	{ 
		PageFactory.initElements(driver, this);
		clickgetStarted.click();
		Thread.sleep(1000);
	}
	
	public void click_implOfQueueInPython() throws InterruptedException 
	{
		implOfQueueInPython.click();
		Thread.sleep(1000);
	}
	
	public void click_tryHere() throws InterruptedException 
	{
		tryHereBtn.click();
		Thread.sleep(1000);
	}
	
	public void sendCode() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(textWindow).click().sendKeys("print ('Hello Selenium')").build().perform();
		
		Thread.sleep(1000);
		
	}
	
	public void clickRun_btn() throws InterruptedException 
	{
		clickRun.click();		
	}
	
	
	public void click_implementationUsingCollection() throws InterruptedException {
	 implementationUsingCollection.click();
	 
	}
	
	public void click_implementationUsingArray() throws InterruptedException {
		 implementationUsingCollection.click();

		}
	
	public void click_queueOperation() throws InterruptedException  {
		queueOperation.click();
		}
	
	public void click_practicQuestion() throws InterruptedException {
		practicQuestion.click();
		Thread.sleep(1000);
		}

}