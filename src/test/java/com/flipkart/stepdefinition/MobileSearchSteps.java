package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.MobileSearchPage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileSearchSteps extends Commonactions{
	
	Commonactions ca = new Commonactions();
	MobileSearchPage mp = new MobileSearchPage();

	static String input;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		
		
		ca.launch("https://www.flipkart.com/");
		
		
	    
	}

	@Given("user enters credentials and click on login")
	public void user_enters_credentials_and_click_on_login() {
		
		 try {
			   
			   mp.getLoginButton();
			   mp.getLoginButton().isDisplayed();
			   Thread.sleep(2000);
			   ca.button(mp.getLoginButton());
			
	    	} catch (Exception e) {
			System.out.println("pop up is not displayed");
	    	}
	    
	}

	@When("user searching the mobile")
	public void user_searching_the_mobile() {
		
		   input = "SAMSUNG";
		   ca.insertTextAndEnter(mp.getSearchBar(), input);
	    
	}

	static String parentURL;
	
	@When("user click on add to cart")
	public void user_click_on_add_to_cart() {
		
		 WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+input+"')])[2]"));   
		   mobileName.click();
		   
            parentURL = driver.getWindowHandle();
		   
		   Set<String> childURL = driver.getWindowHandles();
		   for (String child : childURL) {
			   
			   if(!parentURL.equals(child)) {
				   
				   driver.switchTo().window(child);
				   
			   }   
		   }
		   
		  ca.button(mp.getCartButton());
		   
	}

	@Then("navigates into add to cart and check the order updated")
	public void navigates_into_add_to_cart_and_check_the_order_updated() {
		
		driver.switchTo().window(parentURL);
		
		ca.button(mp.getCartIcon());
		
		try {
			   
			   
			   mp.getLoginButton().isDisplayed();
			   mp.getLoginButton().click();
			
	    	} catch (Exception e) {
			System.out.println("pop up is not displayed");
	    	}
		
		//Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Place Order']")).isDisplayed());
	    
	}
	
	
	@When("user searching the mobile by one dimesional list concept")
	public void user_searching_the_mobile_by_one_dimesional_list_concept(DataTable dataTable) {
		
		
		List<String> datas = dataTable.asList(String.class);
		   
		   input = datas.get(1);
		   
		   ca.insertTextAndEnter(mp.getSearchBar(), input);
		
	}
	
	@When("user searching the mobile by one dimesional map concept")
	public void user_searching_the_mobile_by_one_dimesional_map_concept(DataTable dataTable) {
		
		
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		

		   input = datas.get("Phone1");
		   ca.insertTextAndEnter(mp.getSearchBar(), input);
		
	}
	
	@When("user searching the mobile {string}")
	public void user_searching_the_mobile(String phoneName) {
		
		
		   input = phoneName;
		   ca.insertTextAndEnter(mp.getSearchBar(), input);
		
	}

}
