package com.qa.gridizen.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.qa.gridigen.base.TestBase;

public class Experiance extends TestBase {
	
	public static LoginPage loginPage1;
	public static ActionCenter actionCenter;
	public static AddMaintenance addMaintenance;
	public static MaintenancePage maintenancepage;
	AddProperty property;
	Properties properties;
	@Test
	public void one() throws InterruptedException, IOException {
		intialiszation();
		loginPage1=new LoginPage();
		loginPage1.LoginClick();
		actionCenter=new ActionCenter();
		addMaintenance= new AddMaintenance();
		property=new AddProperty();
		properties=new Properties();
		//extent.attachReporter(reporter);
		actionCenter.clickProperties();
		properties.clickOnAddProperty();
		driver.findElement(By.name("postcode")).sendKeys("E1 7AD");
		driver.findElement(By.id("address")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@role='listbox']//mat-option"));
		Thread.sleep(2000);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
	}
	}

