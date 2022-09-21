package com.DSAlgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
	public class LinkedListPage {
		public WebDriver driver = null;
		// String user = null;
		ArrayPage arrayPage;

		// parameterize constructor
		public LinkedListPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(this.driver, this);
		}
		
		@FindBy (xpath = "//a[@href = 'linked-list']") WebElement clickGetstarted;
		@FindBy (xpath = "//a[@href = 'introduction']") WebElement clickIntroduction;
		@FindBy (xpath = "//a[contains(text(), 'Creating Linked LIst')]") WebElement createLinkedlist;
		@FindBy (xpath = "//a[contains(text(), 'Types of Linked List')]") WebElement LinkedlistTypes;
		@FindBy (xpath = "//a[contains(text(), 'Types of Linked List')]") WebElement implementLinkedlist;
		@FindBy (xpath = "//a[contains(text(), 'Traversal')]")WebElement traversal;
		@FindBy (xpath = "//a[contains(text(), 'Insertion')]")WebElement insertion;
		@FindBy (xpath = "//a[contains(text(), 'Deletion')]")WebElement deletion;
		@FindBy (xpath = "//a[contains(text(), 'Practice Questions')]")WebElement practiceQns ;
		@FindBy (xpath = "//a[contains(text(), 'Try here')]")WebElement tryHereBtn;
		@FindBy (xpath ="//pre//span[@role = 'presentation']/span")WebElement textBoxcode;
		@FindBy (xpath = "//button[contains(text(), 'Run')]")WebElement clickRun;
		
		public void click_Getstarted_below_LinkedListPage() throws InterruptedException 
		{ 
			PageFactory.initElements(driver, this);
			clickGetstarted.click();
			Thread.sleep(1000);
		}
		public void click_Introduction() throws InterruptedException 
		{
			clickIntroduction.click();
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
			action.moveToElement(textBoxcode).click().sendKeys("print ('Hello Selenium')").build().perform();
			
			Thread.sleep(1000);
			
		}
		public void clickRun_btn() throws InterruptedException 
		{
			clickRun.click();
			
			
		}
		public void click_createLinkedlist() throws InterruptedException 
		{
			createLinkedlist.click();
		}
		
		public void click_typesofLinkedlist() throws InterruptedException 
		
		{
			LinkedlistTypes.click();
		}
		
		public void click_implementLinkedlistInpython() throws InterruptedException 
		
		{
			implementLinkedlist.click();
		}
		
		public void click_Traversal()throws InterruptedException 
		
		{
			traversal.click();
			
		}
		public void click_Insertion()throws InterruptedException 
			
		{
				insertion.click();
		}
		public void click_Deletion()throws InterruptedException 
				
		{
			deletion.click();
		}
		
		public void click_PracticeQns()throws InterruptedException 
		
		{
			practiceQns.click();
			Thread.sleep(1000);
		}
		
		
		
		
		
	}
	
	