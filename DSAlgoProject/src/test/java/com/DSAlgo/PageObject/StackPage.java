package com.DSAlgo.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage {
	public WebDriver driver = null;
	// String user = null;
	ArrayPage arrayPage;

	// parameterize constructor
	public StackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//a[@href = 'stack']") WebElement getStartedStack;
    @FindBy(xpath = "//a[@href = 'operations-in-stack']") WebElement operationInStack;
    @FindBy (xpath = "//a[contains(text(),'Try here')]")WebElement tryHere;
    @FindBy(xpath = "//a[contains(text(),'Implementation')]") WebElement implementation;
    @FindBy(xpath = "//a[contains(text(), 'Applications')]") WebElement application;
    @FindBy(xpath = "//a[contains(text(),'Practice Questions')]") WebElement practiceQuestion;
    @FindBy(xpath = "//pre[@role = 'presentation']") WebElement textWindow;////pre//span[@role = 'presentation']/span
    @FindBy(xpath = "//button[@type = 'button']") WebElement runBtn;
    @FindBy (xpath ="//pre//span[@role = 'presentation']/span")WebElement textBoxcode;
    
    
    public void Get_StartedStack() throws InterruptedException 
    {
    	
		PageFactory.initElements(driver, this);
        getStartedStack.click();
        Thread.sleep(1000);
    }
    public void Get_OperationInStack() throws InterruptedException
    {
        operationInStack.click();
        Thread.sleep(1000);
    }
    
    public void Get_TryHere() throws InterruptedException 
    {
        tryHere.click();
        Thread.sleep(1000);
    }
   
    public void Get_Implementation() throws InterruptedException 
    {
        implementation.click();
        Thread.sleep(1000);
    }
    
    public void Get_Textwindow() throws InterruptedException 
    {
    	Actions action = new Actions(driver);
		action.moveToElement(textWindow).click().sendKeys("print ('Hello Selenium')").build().perform();
		
		Thread.sleep(1000);
    }
    
    public void Get_RunBtn() throws InterruptedException 
    {
        runBtn.click();
       // DsAlgoUtil.scroll(driver, 0, 350);
    }
    
    public void Get_Application() throws InterruptedException 
    {
        application.click();
        Thread.sleep(1000);
    }
    
    public void Get_PracticQuestion() throws InterruptedException 
    {
    	practiceQuestion.click();
        Thread.sleep(1000);
    }
    
    
}


