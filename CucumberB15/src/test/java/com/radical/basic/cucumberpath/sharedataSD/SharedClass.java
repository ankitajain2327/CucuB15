package com.radical.basic.cucumberpath.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	
	
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
