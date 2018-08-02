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

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() throws IOException {
		
		Initialization();
		loginPage=new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void VerifyHomePageTitleTes() {
		String HomePageTitle = homePage.verifytHomePageTitle();	
		Assert.assertEquals(HomePageTitle, "CRMPRO", "HomePage Title is not matched");		
	}
	
	
	@Test
	public void clickOnContactLink() {
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
