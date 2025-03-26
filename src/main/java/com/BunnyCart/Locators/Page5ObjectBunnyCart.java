package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.browser;

public class Page5ObjectBunnyCart extends browser{
	
	public static By SignOut = By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
	
	
	public static WebElement signOut() {
		return driver.findElement(SignOut);
	}

}
