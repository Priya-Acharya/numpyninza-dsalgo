package com.DSAlgo.PageObject;



	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.DSAlgo.utilities.webClick;

	public class TreePage {

		private WebDriver driver;

		public TreePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(this.driver, this);
		}

		@FindBy(xpath = "//a[@href='tree']")WebElement treeBtn;// Tree button
		@FindBy(xpath = "//a[@href='overview-of-trees']")WebElement overviewoftree;
		@FindBy(xpath = "//button[@type='button']")WebElement OverviewRun;
		@FindBy(xpath = "//a[@href='terminologies']")WebElement terminologies;
		@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryEditor;
		@FindBy(xpath = "//button[@type='button']")	WebElement Runbtn;
		@FindBy(xpath = "//a[@href='types-of-trees']")WebElement typesoftree;
		@FindBy(xpath = "//div[@class='CodeMirror-scroll']")WebElement textBoxcode;
		@FindBy(xpath = "//a[@href='tree-traversals']")WebElement trtraversals;
		@FindBy(xpath = "//a[@href='traversals-illustration']")WebElement trtraversalsillustartion;
		@FindBy(xpath = "//a[@href='binary-trees']")WebElement binarytr;
		@FindBy(xpath = "//a[@href='types-of-binary-trees']")WebElement typesofbintr;
		@FindBy(xpath = "//a[@href='implementation-in-python']")WebElement implementataionInPython;
		@FindBy(xpath = "//a[@href='binary-tree-traversals']")WebElement binarytrtraversals;
		@FindBy(xpath = "//a[@href='implementation-of-binary-trees']")WebElement implemenetationofbinarytr;
		@FindBy(xpath = "//a[@href='applications-of-binary-trees']")WebElement applicationofbinarytr;
		@FindBy(xpath = "//a[@href='binary-search-trees']")	WebElement binarysearchtr;
		@FindBy(xpath = "//a[@href='implementation-of-bst']")WebElement implementationofbst;
		@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement practiceque;

		public void clickOntreeBtn() {
			Actions action = new Actions(driver);
			action.moveToElement(treeBtn).build().perform();
			treeBtn.click();
			// signInBtn.getText()
		}

		public void clickOnOverviewoftree() {
			Actions action = new Actions(driver);
			action.moveToElement(overviewoftree).build().perform();
			overviewoftree.click();

		}

		public void clickOnTryEditor() throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(tryEditor).build().perform();
			tryEditor.click();
			Thread.sleep(2000);

		}

		public boolean writetextBoxcode() throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(textBoxcode).click().sendKeys("print('Hello World')").build().perform();
			Thread.sleep(2000);

			return true;
		}

		public void clickOnterminologies() {
			Actions action = new Actions(driver);
			action.moveToElement(terminologies).build().perform();
			terminologies.click();

			// signInBtn.getText()
		}

		public void clickOntypesoftree() {
			Actions action = new Actions(driver);
			action.moveToElement(typesoftree).build().perform();
			typesoftree.click();
		}

		public void clickOnTrTraversals() {
			Actions action = new Actions(driver);
			action.moveToElement(trtraversals).build().perform();
			trtraversals.click();
		}

		public void clickOntTrTraversalsIllustartion() {
			Actions action = new Actions(driver);
			action.moveToElement(trtraversalsillustartion).build().perform();
			trtraversalsillustartion.click();
		}

		public void clickOnBinaryTr() {
			Actions action = new Actions(driver);
			action.moveToElement(binarytr).build().perform();
			binarytr.click();
		}

		public void clickOnTypesOfBinaryTree() {
			Actions action = new Actions(driver);
			action.moveToElement(typesofbintr).build().perform();
			typesofbintr.click();
		}

		public void clickOnImplementationInPython() {
			Actions action = new Actions(driver);
			action.moveToElement(implementataionInPython).build().perform();
			implementataionInPython.click();
		}

		public void clickOnBinaryTrTraversals() {
			Actions action = new Actions(driver);
			action.moveToElement(binarytrtraversals).build().perform();
			binarytrtraversals.click();
		}

		public void clickOnImplemenetationOfBinaryTr() {
			Actions action = new Actions(driver);
			action.moveToElement(binarytrtraversals).build().perform();
			binarytrtraversals.click();
		}

		public void clickOnApplicationOfBinaryTrr() {
			Actions action = new Actions(driver);
			action.moveToElement(applicationofbinarytr).build().perform();
			applicationofbinarytr.click();
		}

		public void clickOnBinarySearchTree() {
			Actions action = new Actions(driver);
			action.moveToElement(binarysearchtr).build().perform();
			binarysearchtr.click();
		}

		public void clickOnImplementationOfBst() {
			Actions action = new Actions(driver);
			action.moveToElement(implementationofbst).build().perform();
			implementationofbst.click();
		}

		public void clickOnPracticeque() {
			Actions action = new Actions(driver);
			action.moveToElement(practiceque).build().perform();
			practiceque.click();
		}
	}






