package com.stepp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_classs {
	
	WebDriver driver;
	@Given("User in fb page")
	public void user_in_fb_page() {

		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver.exe" );
		
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   
	}

	@When("User enter uname and pass")
	public void user_enter_uname_and_pass() {
	   driver.findElement(By.id("email")).sendKeys("vaiyapu");
	   driver.findElement(By.id("pass")).sendKeys("va745899889");
	}

	@Then("Click login")
	public void click_login() {
	   driver.findElement(By.name("login")).click();
	}



}
