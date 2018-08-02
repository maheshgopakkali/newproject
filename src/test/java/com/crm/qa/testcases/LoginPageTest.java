package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;

	public LoginPageTest() {

		super();
	}


	@BeforeMethod
	public void Setup() throws IOException {

		Initialization();
		loginpage=new LoginPage();
	}

	@Test(priority=1)
	public void VerifyPageTitleTest() {

		String Title = loginpage.PageTitle();

		Assert.assertEquals(Title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}


	@Test(priority=2)
	public void verifyImageLogoTest() {
		Assert.assertTrue(loginpage.logo(), "Logo image is not diplayed");
	}


	@Test(priority=3)
	public void VerifyLoginTest() {

		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));

	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
