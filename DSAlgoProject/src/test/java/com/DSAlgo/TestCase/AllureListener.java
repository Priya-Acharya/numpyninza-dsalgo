package com.DSAlgo.TestCase;
import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.DSAlgo.PageObject.LandingPage;
import com.DSAlgo.utilities.ScreenShot;

import io.qameta.allure.Attachment;
import io.qameta.allure.Allure;


public class AllureListener implements  ITestListener

{
	
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	
	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}
	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in onStart method " + iTestContext.getName());
		iTestContext.setAttribute("WebDriver", LandingPage.driver);
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in onFinish method " + iTestContext.getName());
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
//		System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
//		Object testClass = iTestResult.getInstance();
//		WebDriver driver = LandingPage.driver;
//		// Allure ScreenShot and SaveTestLog
//		if (driver instanceof WebDriver) {
//			System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
//			Allure.addAttachment(getTestMethodName(iTestResult), new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
//			//saveFailureScreenShot(driver);
		WebDriver driver = LandingPage.driver;
		//screenShot.takeSnapShot(driver,iTestResult.getName()+".png");
		try {
			ScreenShot.takeSnapShot(driver,iTestResult.getName()+".png");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot...");
			e.printStackTrace();
		}
		}
		//saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");	
//	}
//	public void onTestFailure1(ITestResult result) {
//		WebDriver driver = LandingPage.driver;
//		try {
//			screenShot.takeSnapShot(driver,result.getName()+".png");
//		} catch (Exception e) {
//			System.out.println("Exception while taking screenshot...");
//			e.printStackTrace();
//		}
	//}

	
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}

}
