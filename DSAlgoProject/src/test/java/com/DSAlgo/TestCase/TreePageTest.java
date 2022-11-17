package com.DSAlgo.TestCase;



	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	import com.DSAlgo.PageObject.HomePage;
	import com.DSAlgo.PageObject.LandingPage;
	import com.DSAlgo.PageObject.LogInPage;
	import com.DSAlgo.PageObject.TreePage;
	@Listeners({AllureListener.class})
	public class TreePageTest  {

		HomePage homePage;
		LandingPage landingPage;
		TreePage treePage;

		public TreePageTest() {
			super();
		}

		@BeforeClass
		public void setUp() throws InterruptedException {
			landingPage = new LandingPage();
			landingPage.lunchApp();
			landingPage.clickOnGetStarted();
			homePage = new HomePage(landingPage.getDriver());
			homePage.clickSignIn();
			LogInPage logInPage = new LogInPage(landingPage.getDriver());
			logInPage.signIn("Priya.Acharya", "Pwd@1234");
			treePage = new TreePage(landingPage.getDriver());

		}

		@Test(priority = 1)
		public void testForTreePage() throws InterruptedException {
			treePage.clickOntreeBtn();
			String pagetitle = landingPage.getDriver().getTitle();
			Assert.assertEquals(pagetitle, "Tree");

		}

		@Test(priority = 2)
		public void clickOntreeBtn() throws InterruptedException {
	        treePage.clickOnOverviewoftree();
			String pagetitle = landingPage.getDriver().getTitle();
			Assert.assertEquals(pagetitle, "Overview of Trees");
		}

		@Test(priority = 3)
		public void clickOnTryEditor() throws InterruptedException {
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		}

		
		@Test(priority = 4)	
		public void testTerminology() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnterminologies();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		}
		@Test(priority = 5)	
		public void testTypesOfTree() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOntypesoftree();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		}
		@Test(priority = 6)	
		public void testTrTraversals() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnTrTraversals();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		}
		@Test(priority = 7)	
		public void testTrTraversalsIllustartion() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOntTrTraversalsIllustartion();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		}
		
		@Test(priority = 8)	
		public void testBinTr() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnBinaryTr();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 
		
		@Test(priority = 9)	
		public void testTypesOfBinTr() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnTypesOfBinaryTree();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 
		
		
		@Test(priority = 10)	
		public void testImplementationOfPython() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnImplementationInPython();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 
		
		

		@Test(priority = 11)	
		public void testclickOnBinaryTrTraversals() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnBinaryTrTraversals();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 
		
		@Test(priority = 12)	
		public void testClickOnImplemenetationOfBinaryTr() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnImplemenetationOfBinaryTr();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 
		

		@Test(priority = 13)	
		public void testClickOnApplicationOfBinaryTrr() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnApplicationOfBinaryTrr();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 
		

		

		@Test(priority = 14)	
		public void testclickOnBinarySearchTree() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnBinarySearchTree();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
		} 

		
		@Test(priority = 15)	
		public void testClickOnImplementationOfBst() throws InterruptedException {
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			treePage.clickOnImplementationOfBst();
			Thread.sleep(2000);
			treePage.clickOnTryEditor();
			treePage.writetextBoxcode();
			String pagetitle = landingPage.getDriver().getTitle();
			Thread.sleep(2000);
			Assert.assertEquals(pagetitle, "Assessment");
			landingPage.getDriver().navigate().back();
			Thread.sleep(2000);
			landingPage.getDriver().navigate().back();
			//Thread.sleep(2000);
		} 


		
		@AfterClass
		
		public void closeDriver() throws InterruptedException{
			Thread.sleep(4000);
//			landingPage.getDriver().quit();
			homePage.signOut();
		}

	}




