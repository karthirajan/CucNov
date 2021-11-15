package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobileSearchPage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions{
	
	Commonactions ca = new Commonactions();
	
	@Before
	public void beforeScenario() {
		
		System.out.println("before");
		ca.launch("https://www.flipkart.com/");

	}
	
	@After
	public void afterScenario() {
		
		driver.quit();

	}
	
}
