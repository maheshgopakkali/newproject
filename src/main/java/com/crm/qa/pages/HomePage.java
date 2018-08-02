package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{


	@FindBy(xpath="//td[contains(text(),\"User: Mahesh BG\")]")
	WebElement userNameLabel;	

	@FindBy(xpath="//a[contains(text(),\"Contacts\")]")
	WebElement contactLink;

	@FindBy(xpath="//a[contains(text(),\"Deals\")]")
	WebElement dealsLink;


	@FindBy(xpath="//a[contains(text(),\"Tasks\")]")
	WebElement TasksLinks;


	//Initialising the PageFoactory

	public HomePage() {

		PageFactory.initElements(driver, this);	

	}


	public String  verifytHomePageTitle() {

		return driver.getTitle();
	}
	
	
	public boolean verifyUserName() {
		
		return userNameLabel.isDisplayed();
	}

	public ContactsPage clickOnContactLink() {

		contactLink.click();
		return new ContactsPage();
	}


	public DealsPage clickOndealsLink() {

		dealsLink.click();
		return new DealsPage();
	}

	
	public TasksPage clickOnTasksLink() {

		TasksLinks.click();
		return new TasksPage();
	}










}

