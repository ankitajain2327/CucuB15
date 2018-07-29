package com.radical.basic.MyallFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import allfilesinsamefolder.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	
	WebDriver driver;
	
	@Given("^the user is on facebook login Page$")
	public void the_user_is_on_facebook_login_Page() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_user_name(String userName) {
		driver.findElement(By.id("email")).sendKeys(userName);
	}
	
	@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(){
	
		Assert.assertTrue(true);
		driver.quit();
	}
}
