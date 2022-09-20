package com.DSAlgo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSAlgo.utilities.webClick;

public class ArrayPage {

	public WebDriver driver = null;
	// String user = null;
	ArrayPage arrayPage;

	// parameterize constructor
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	@FindBy(xpath = ("//div[@class='nav-item dropdown']//a"))WebElement dropDownlink;
	@FindBy(xpath = ("//div[@class='dropdown-menu show']//a[contains(text(),'Array')]"))
	WebElement GetStartArray;
	@FindBy(xpath = "//a[@href='arrays-in-python']")WebElement linkArrayInPython;
	@FindBy(xpath = "//a[@href='arrays-using-list']")WebElement linkArrayUsingList;
	@FindBy(xpath = "//a[@href='basic-operations-in-lists']")WebElement linkBasicOperrationList;
	@FindBy(xpath = "//a[@href='applications-of-array']")WebElement linkApplicationOfArray;
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")WebElement linkPracticeQuestion;
	@FindBy(xpath = "//a[contains(text(),'Search the array')]")WebElement linkSearchOfArray;
	@FindBy(xpath = "//a[contains(text(),'Max Consecutive Ones')]")WebElement linkMaxConsOne;
	@FindBy(xpath = "//a[contains(text(),'Find Numbers with Even Number of Digits')] ")
	WebElement linkFindNumEvenDig;
	@FindBy(xpath = "//a[contains(text(), 'Squares of  a Sorted Array')]")
	WebElement linkSqarOfSortedArray;
	
	@FindBy(xpath = "//a[@class='btn btn-info']]")WebElement tryBtnArray;// try button
	
	@FindBy(xpath=("//h4[contains(text(),'Array')]")) WebElement arrayPgTitle;
	@FindBy(xpath=("//span[@role='presentation']//span")) WebElement textEditor;
	@FindBy(xpath=("//button[@type='button']")) WebElement runBtn;
	@FindBy(xpath=("//button[@type='button'] and //input[@type='submit']")) WebElement runAndSubmitBtn;
	@FindBy(xpath=("//button[@type='button']")) WebElement runBtnText;
	@FindBy(xpath=("//strong[contains(text(),'QUESTION')]")) WebElement questionPgTitle;
	//@FindBy(xpath="//p[contains(text(),'Graph Representations')]")WebElement titleGraphReprestBtn;

	public String arrayPageOpen() throws InterruptedException {
		webClick.webClickAll(dropDownlink, driver);
		webClick.webClickAll(GetStartArray, driver);
		Thread.sleep(2000);
		if (arrayPgTitle.isDisplayed()) {
			return arrayPgTitle.getText();
		} else {
			return null;
		}
	}
	
	public String clickArrayInPython() throws InterruptedException {
		webClick.webClickAll(linkArrayInPython, driver);
		Thread.sleep(2000);
		if (tryBtnArray.isDisplayed()) {
			return tryBtnArray.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_ArrayInPython() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_ArrayInPython() {
		Actions action = new Actions(driver);
		action.moveToElement(textEditor).click().sendKeys("print('ArrayInPython')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	
	public String clickArrayUsingList() throws InterruptedException {
		webClick.webClickAll(linkArrayUsingList, driver);
		Thread.sleep(2000);
		if (tryBtnArray.isDisplayed()) {
			return tryBtnArray.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_ArrayUsingList() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_ArrayUsingList() {
		Actions action = new Actions(driver);
		action.moveToElement(textEditor).click().sendKeys("print('ArrayUsingList')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	public String clickBasicOperrationList() throws InterruptedException {
		webClick.webClickAll(linkBasicOperrationList, driver);
		Thread.sleep(2000);
		if (tryBtnArray.isDisplayed()) {
			return tryBtnArray.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_BasicOperrationList() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_BasicOperrationList() {
		Actions action = new Actions(driver);
		action.moveToElement(textEditor).click().sendKeys("print('BasicOperrationList')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	public String clickApplicationOfArray() throws InterruptedException {
		webClick.webClickAll(linkApplicationOfArray, driver);
		Thread.sleep(2000);
		if (tryBtnArray.isDisplayed()) {
			return tryBtnArray.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_ApplicationOfArray() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_ApplicationOfArray() {
		Actions action = new Actions(driver);
		action.moveToElement(textEditor).click().sendKeys("print('ApplicationOfArray')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}	
	public String clickPracticeQuestion() throws InterruptedException {
		webClick.webClickAll(linkPracticeQuestion, driver);
		Thread.sleep(2000);
		if (tryBtnArray.isDisplayed()) {
			return tryBtnArray.getText();
		} else {
			return null;
		}
		
	}
	public String clickSearchOfArray() throws InterruptedException {
		webClick.webClickAll(linkSearchOfArray, driver);
		Thread.sleep(2000);
		if (runAndSubmitBtn.isDisplayed()) {
			return runBtnText.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_clickSearchOfArray() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_clickSearchOfArray() {
		Actions action = new Actions(driver);
		textEditor.clear();
		action.moveToElement(textEditor).click().sendKeys("print('clickSearchOfArray')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	public String clickMaxConsOne() throws InterruptedException {
		webClick.webClickAll(linkMaxConsOne, driver);
		Thread.sleep(2000);
		if (questionPgTitle.isDisplayed()) {
			return questionPgTitle.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_MaxConsOne() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_MaxConsOne() {
		Actions action = new Actions(driver);
		textEditor.clear();
		action.moveToElement(textEditor).click().sendKeys("print('MaxConsOne')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	public String clickFindNumEvenDig() throws InterruptedException {
		webClick.webClickAll(linkFindNumEvenDig, driver);
		Thread.sleep(2000);
		if (questionPgTitle.isDisplayed()) {
			return questionPgTitle.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_clickFindNumEvenDig() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_clickFindNumEvenDig() {
		Actions action = new Actions(driver);
		textEditor.clear();
		action.moveToElement(textEditor).click().sendKeys("print('clickFindNumEvenDig')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	public String clickSqarOfSortedArray() throws InterruptedException {
		webClick.webClickAll(linkSqarOfSortedArray, driver);
		Thread.sleep(2000);
		if (questionPgTitle.isDisplayed()) {
			return questionPgTitle.getText();
		} else {
			return null;
		}
		
	}
	public boolean clickTryBtn_clickSqarOfSortedArray() throws InterruptedException
	{
		webClick.webClickAll(tryBtnArray, driver);
		Thread.sleep(2000);
		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean addTextTryEditor_clickSqarOfSortedArray() {
		Actions action = new Actions(driver);
		textEditor.clear();
		action.moveToElement(textEditor).click().sendKeys("print('clickSqarOfSortedArray')").build().perform();;
		webClick.webClickAll(runBtn, driver);
		return true;
		
	}
	
//	public boolean clickTryBtn_PracticeQuestion() throws InterruptedException
//	{
//		webClick.webClickAll(tryBtnArray, driver);
//		Thread.sleep(2000);
//		if (textEditor.isDisplayed()&& runBtn.isDisplayed() ) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	
	
//	public static void main(String[] args) throws InterruptedException 
//	{
//		LandingPage landingPage = new LandingPage();
//		landingPage.lunchApp();
//		landingPage.clickOnGetStarted();
//		HomePage hmp = new HomePage(landingPage.getDriver());
//		hmp.clickSignIn();
//		LogInPage logInPage = new LogInPage(landingPage.getDriver());
//		;
//		logInPage.signIn("Priya.Acharya", "Pwd@1234");
//
//		GraphPage gp = new GraphPage(landingPage.getDriver());
//
//		gp.graphPageOpen();
//		gp.clickGraphBtn();
//		gp.clickTryBtn();
//		gp.addTextTryEditor();
//
//	}
}
	
	
//}
