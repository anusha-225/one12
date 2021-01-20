package com.qa.gridizen.LoginTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.gridigen.base.TestBase;
import com.qa.gridizen.Pages.ActionCenter;
import com.qa.gridizen.Pages.AddCalender;
import com.qa.gridizen.Pages.AddMaintenance;
import com.qa.gridizen.Pages.CalenderPage;
import com.qa.gridizen.Pages.LoginPage;
import com.qa.gridizen.Pages.MaintenancePage;
import com.qa.gridizen.Pages.Properties;
import com.qa.gridizen.util.TestUtil;

public class AddCalenderTest extends TestBase {
	
		    public static LoginPage loginPage1;
			public static ActionCenter actionCenter;
			public static AddMaintenance addMaintenance;
			public static MaintenancePage maintenancepage;
			public static CalenderPage calenderPage;
			ExtentHtmlReporter reporter=new ExtentHtmlReporter("/Users/macbook/eclipse-workspace/gridigen-1/ExtentReports/AddCalenderTest.html");
			ExtentReports extent=new ExtentReports();
			ExtentTest test1;
			public static String screenShot(String methodName ) throws IOException {
				TakesScreenshot ts=(TakesScreenshot)driver;
		    	File src=ts.getScreenshotAs(OutputType.FILE);
		    	String path1="/Users/macbook/eclipse-workspace/gridigen-1/images/"+methodName+".png";
		    	File des=new File(path1);
		    	FileUtils.copyFile(src, des);
		    	return path1;
		    	
			}
			@BeforeMethod
			public void beforeMethod() throws IOException {
				intialiszation();
				loginPage1=new LoginPage();
				loginPage1.LoginClick();
				actionCenter=new ActionCenter();
				addMaintenance= new AddMaintenance();
				calenderPage=new CalenderPage();
				extent.attachReporter(reporter);
				actionCenter.clickCalender();
				calenderPage.clickOnAdd();
			}
			@Test
			public void one() {
				test1=extent.createTest("one");
				System.out.print("hai");
			}
			@AfterMethod
			public void afterMethod(ITestResult result) throws IOException {
				if(result.getStatus()==ITestResult.FAILURE) {
					String path=AddCalenderTest.screenShot(result.getName());
					test1.addScreenCaptureFromPath(path);
					test1.log(Status.FAIL, result.getName());
				}else if(result.getStatus()==ITestResult.SUCCESS) {
					test1.log(Status.PASS, result.getName());
				}
				else if(result.getStatus()==ITestResult.SKIP) {
					test1.log(Status.SKIP, result.getName());
				}
				extent.flush();
				driver.quit();
			}
}
