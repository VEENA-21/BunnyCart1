/*package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.browser;
import com.BunnyCart.Locators.Page4ObjectBunnyCart;

public class Page4BunnyCart extends browser {
	 
	
	public static void searchButtonProduct(String str) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(Page4ObjectBunnyCart.searchButton()));
			Page4ObjectBunnyCart.searchButton().clear();
			Page4ObjectBunnyCart.searchButton().sendKeys(str);
			Page4ObjectBunnyCart.searchButton().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println("Error in searching Product: "+e);
			
		}
	}

}*/
