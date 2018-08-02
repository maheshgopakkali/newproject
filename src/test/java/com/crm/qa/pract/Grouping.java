package com.crm.qa.pract;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Grouping implements ITestListener {

	private static WebDriver driver;


	@Test
	//@Parameters({"ename","epassoword"})
	public void Testngtesting() {

		driver=new FirefoxDriver();

		driver.get("http://www.store.demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='My Account']")).click();

		driver.findElement(By.xpath("//input[@id='log']")).sendKeys("test12");

		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("test12");

		driver.findElement(By.xpath("//input[@id='login']")).click();

		driver.quit();

	}


	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

 
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Failed Test cases has been taken :"+arg0.toString());
		
	}


	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Skipped screen shpot has been taken : "+arg0.toString());
		
	}


	public void onTestStart(ITestResult arg0) {
		System.out.println("Screen Shot Captured +++++++++ : "+arg0.toString());
		
	}


	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Success Screen shot has been captured : "+arg0.toString());
	}

}
