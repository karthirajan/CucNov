package com.flipkart.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AamzonSteps extends Commonactions{
	
	@Given("User launches amazon application")
	public void user_launches_amazon_application() {
	    
		driver.get("https://www.amazon.com/");
		
	}

	@When("user search mobiles")
	public void user_search_mobiles() {
	    
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
	}

	@Then("user validate the mobile page")
	public void user_validate_the_mobile_page() throws IOException {
	    
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmm");  
		   LocalDateTime now = LocalDateTime.now();  
		   String format = dtf.format(now);
		   System.out.println(format);
		      
		
		System.out.println("After class");
      TakesScreenshot tk = (TakesScreenshot)Hooks.driver;	
		File source = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//target//report"+format+".png");		
		FileUtils.copyFile(source, dest);
		
	}


}
