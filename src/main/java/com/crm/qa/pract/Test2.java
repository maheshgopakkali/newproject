package com.crm.qa.pract;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.util.Scanner;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Test2 {


	public static void main(String[] args) throws IOException {

		String s="mahesh";
		String temp="";

		// int lastIndexOf = s.lastIndexOf("");
		//System.out.println(lastIndexOf);

		//Scanner sc=new Scanner(System.in);
		//Scanner sc = new Scanner();

		/*	 char[] charArray = s.toCharArray();
	 int len=charArray.length;

	// System.out.println(len);
	 for(int i=len-1; i>=0; i--) {

		// System.out.println(charArray[i]);
		 temp=temp+charArray[i];
	 }

	System.out.println(temp);

	int x=100;
	int y=200;

	x=x+y;
	y=x-y;
	x=x-y;

	System.out.println(y);
	System.out.println(x);


	FirefoxProfile profile =new FirefoxProfile();

	profile.setAcceptUntrustedCertificates(false);


	WebDriver driver =new FirefoxDriver(profile);

	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);

	File src = edriver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(""));;*/

		int x=10;
		for(int i=x-1; i>0; i--) {
			x=x*i;
		}
		System.out.println(x);
	}
}



