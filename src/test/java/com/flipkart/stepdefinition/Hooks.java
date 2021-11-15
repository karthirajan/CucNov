package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions{
	
	
	
	@Before
	public void beforeScenario() {
		
		System.out.println("before");

	}
	
	@After
	public void afterScenario() {
		
		driver.quit();

	}
	
}
