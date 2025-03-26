package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.browser;

public class Page1ObjectBunnyCart extends browser{
	
	public static By createAccount = By.xpath("//a[@class='customer-register-link']");

	public static By enterFirstName = By.xpath("//input[@name='firstname']");

	public static By enterLastName = By.xpath("//input[@name='lastname']");

	public static By enterEmail = By.xpath("//input[@id='popup-email_address']");

	public static By password = By.xpath("//input[@id='popupPassword']");

	public static By invalidConfirmPassword = By.xpath("//input[@id='password-confirmation']");

	public static By validConfirmPassword = By.xpath("//input[@id='password-confirmation']");

	public static By mobileNumber = By.xpath("//input[@name='mobilenumber']");

	public static By createAccountButton = By.xpath("//button[@title='Create an Account']");

	
	public static WebElement createAccount()
	{
		return driver.findElement(createAccount);
	}
	public static WebElement firstName()
	{
		return driver.findElement(enterFirstName);
	}
	
	public static WebElement lastName()
	{
		return driver.findElement(enterLastName);
	}
	public static WebElement email()
	{
		return driver.findElement(enterEmail);
	}
	public static WebElement password()
	{
		return driver.findElement(password);
	}
	public static WebElement invalidConfirmPassword()
	{
		return driver.findElement(invalidConfirmPassword);
	}
	public static WebElement validConfirmPassword()
	{
		return driver.findElement(validConfirmPassword);
	}
	public static WebElement enterMobileNumber()
	{
		return driver.findElement(mobileNumber);
	}
	public static WebElement createAccountButton()
	{
		return driver.findElement(createAccountButton);
	}

}