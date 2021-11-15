package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobileSearchPage extends Commonactions{
	
	public MobileSearchPage() {
		
		PageFactory.initElements(Commonactions.driver, this);
		
	}
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement loginButton;
	
	@FindBy(name = "q")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement cartButton;
	
	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cartIcon;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}
	
	

}
