package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Utils;
import org.testng.log4testng.Logger;

public class Test {
	public static WebDriver driver;	
	public static void main(String[] args) throws IOException {
				
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumWorkspace\\PageObjectModel\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
		driver.get("https://www.youtube.com/watch?v=H2-3w-GQZ3g&index=4&list=PLFGoYjJG_fqq6cHeqfsDes3pdVh3kpl74");
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		//Utils.copyFile(screenshotAs, new File("./ScreenShots/Youtube.png"));
		FileUtils.copyFile(screenshotAs, new File("./ScreenShots/youtube.png"));
		
		
		driver.quit();
		
	Logger log=Logger.getLogger(Test.class);
	
	
		
		
	}
	

}
