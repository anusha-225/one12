package com.qa.gridizen.LoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.gridigen.base.TestBase;
import com.qa.gridizen.Pages.ActionCenter;
import com.qa.gridizen.Pages.AddCalender;
import com.qa.gridizen.Pages.CalenderPage;
import com.qa.gridizen.Pages.LoginPage;
import com.qa.gridizen.Pages.Properties;

public class AddCalenderTest extends TestBase {
	public static LoginPage loginPage1;
	public static ActionCenter actionCenter;
	public static Properties properties;
	public static CalenderPage calenderPage;
	public static AddCalender addCalender;
		    @Test
		     public void one() throws IOException, InterruptedException {
		    	intialiszation();
		    	loginPage1=new LoginPage();
		    	calenderPage= new CalenderPage();
		    	properties=new Properties();
		    	addCalender= new AddCalender();
		    	loginPage1.LoginClick();
		    	actionCenter=new ActionCenter();
		    	actionCenter.clickCalender();
		    	calenderPage.clickOnAdd();
		    	addCalender.select1();
		    } 
}
