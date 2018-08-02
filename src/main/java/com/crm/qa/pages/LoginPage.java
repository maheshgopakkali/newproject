package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	HomePage homePage;

	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement UserName;
	
	

	@FindBy (xpath="//input[@name=\"password\"]")
	WebElement Password;

	@FindBy(xpath="//img[contains(@class,'img-responsive')]")

	WebElement Logo;

	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement LoginBtn;

	@FindBy(xpath="//button[@class='btn']")
	WebElement SignUpBtn;


	public LoginPage() {

		PageFactory.initElements(driver, this);
		
	}


	public String PageTitle() {		
		String pagetitle = driver.getTitle();		
		return pagetitle;
	}

	public boolean logo() {
		return Logo.isDisplayed();
	}

	public HomePage Login(String uname, String Pwd) {
		UserName.clear();
		UserName.sendKeys(uname);

		Password.clear();
		Password.sendKeys(Pwd);

		LoginBtn.click();

		return new HomePage();
}
	
	
	





















}
