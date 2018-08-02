package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;	
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream("D:\\SeleniumWorkspace\\PageObjectModel\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");

			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void Initialization() throws IOException {
		
		String browesrName = prop.getProperty("browser");
		
		if(browesrName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumWorkspace/PageObjectModel/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browesrName.equals("ff")) {
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumWorkspace\\PageObjectModel\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		}
		else if(browesrName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\SeleniumWorkspace\\PageObjectModel\\\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
		 
		 System.out.println("driver instance is "+driver);
		
		//Runtime.getRuntime().exec("taskkill /F /IM Chrome");
	}
	

}
