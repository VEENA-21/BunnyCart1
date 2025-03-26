package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.browser;

public class Page3ObjectBunnyCart extends browser {
	
		
			public static By homepagesignin = By.xpath("//*[@id=\'html-body\']/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
			public static By signinbutton = By.cssSelector("button[id='send2-login'] span");
			public static By signinmail = By.xpath("//input[@id='email-login']");
			public static By signinpass = By.xpath("//input[@id='pass-login']");
			
			
			public static WebElement homepagesignin() {
				return driver.findElement(homepagesignin);
			}
			public static WebElement signinbutton() {
				return driver.findElement(signinbutton);
			}
			public static WebElement signinmail() {
				return driver.findElement(signinmail);
			}
			public static WebElement signinpass() {
				return driver.findElement(signinpass);
			}
		}