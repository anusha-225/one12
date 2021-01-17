package com.qa.gridizen.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.gridigen.base.TestBase;

public class AddCalender extends TestBase {
	@FindBy(xpath="//input[@name='eventname']")
	WebElement eventName;
	@FindBy(xpath="//input[@name='eventdescription']")
	WebElement description;
	@FindBy(xpath="//*[@name='category']")
	WebElement category;
	@FindBy(xpath="//mat-option[@tabindex='0']")
	WebElement maintenance;
	@FindBy(xpath="//input[@name='propertylinkedevent']")
	WebElement propertyCheckbox;
	@FindBy(xpath="//input[@name='property']")
	WebElement Property;
	@FindBy(xpath="//mat-option[@tabindex='0']")
	WebElement propname;
	@FindBy(xpath="//button[@form='addEventForm']")
	WebElement addEvent;
	public AddCalender() {
		PageFactory.initElements(driver, this);
	}
	public void select1() throws InterruptedException {
		eventName.sendKeys("one");
		description.sendKeys("hai");
		category.click();
		maintenance.click();
		//propertyCheckbox.click();
		Property.sendKeys("23");
		Thread.sleep(2000);
		propname.click();
		addEvent.click();
		
		
	}

}
