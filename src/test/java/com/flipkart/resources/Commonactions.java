package com.flipkart.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	
	public static WebDriver driver;
	
	public void launch(String URL) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(URL);

	}
	
	
	public void insertText(WebElement ele, String value) {
		
		ele.sendKeys(value);

	}
	
   public void insertTextAndEnter(WebElement ele, String value) {
		
		ele.sendKeys(value,Keys.ENTER);

	}
	
	public void button(WebElement ele) {
		
		ele.click();

	}

}
