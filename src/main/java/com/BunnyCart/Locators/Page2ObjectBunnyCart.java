
package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.browser;

public class Page2ObjectBunnyCart extends browser {
	
	public static By SignIn = By.xpath("//a[contains(text(),'Sign In')]");
//	public static By SignIn = By.linkText("Sign In");
	public static By enterEmailSignIn = By.xpath("//input[@id='email-login']");
	public static By enterPasswordSignIn = By.xpath("//input[@id='pass-login']");
	public static By signinLoginButton = By.xpath("//button[@id='send2-login']");
	public static By searchBar = By.xpath("//input[@id='search' and contains(@class,'input-text') ]");
	public static By productSelect = By.xpath("//div[contains(text(),\"Dwarf Hairgrass\") and contains(@class,\"product-name\")]");
	public static By clickNetPot  = By.xpath("//div[@id='option-label-type-200-item-5442']");
	public static By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
	
	public static WebElement SignIn() {
		return driver.findElement(SignIn);
	}
	
	public static WebElement enterEmailSignIn() {
		return driver.findElement(enterEmailSignIn);
	}
	
	public static WebElement enterPasswordSignIn() {
		return driver.findElement(enterPasswordSignIn);
	}
	
	public static WebElement SigninLoginButton() {
		return driver.findElement(signinLoginButton);
	}
	
	public static WebElement searchBar() {
		return driver.findElement(searchBar);
	}
	
	public static WebElement productSelect() {
		return driver.findElement(productSelect);
	}
	
	public static WebElement clickNetPot() {
		return driver.findElement(clickNetPot);
	}
	
	public static WebElement addToCartButton() {
		return driver.findElement(addToCartButton);
	}

}


