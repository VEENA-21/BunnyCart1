
package com.BunnyCart.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.browser;
import com.BunnyCart.Pages.Page2BunnyCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProducts_StepDefinition2 extends browser {
	
	
	@Given("User clicks on Sign In")
	public void user_clicks_on_sign_in() {
	   Page2BunnyCart.SignIn();
	}
	
	
	
	@Given("User enter {string} the email")
	public void user_enter_the_email(String string) {
		Page2BunnyCart.enterEmailSignIn("veenaprathapberi@gmail.com");
	}

	@Given("User enters {string} the password")
	public void user_enters_the_password(String string) {
		Page2BunnyCart.enterPasswordSign("Veena@2001");
	}



	@Given("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	    try {
	        WebDriverWait wait = new WebDriverWait(Page2BunnyCart.driver, Duration.ofSeconds(10));
	        WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("send2-login")));
	        signInBtn.click();
    		Thread.sleep(10000);

	        System.out.println("Sign In button clicked.");
	    } catch (Exception e) {
	        System.out.println("Error clicking Sign In button: " + e.getMessage());
	    }
	}



	@When("User Search for a product {string} in search textbox")
	public void user_search_for_a_product_in_search_textbox(String string) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement product = driver.findElement(By.xpath("//input[@id='search' and contains(@class,'input-text') ]"));
        for (int i = 0; i < 3; i++) {
        	try {
        		Thread.sleep(5000);
        		product.click();
        		break;
        		} catch (StaleElementReferenceException e) {
        			e.printStackTrace();
        			}
        	}
        product.sendKeys(string);
		Thread.sleep(3000);
	}
	

	@When("User select product from the search results")
	public void user_select_product_from_the_search_results() {
		WebDriverWait wait = new WebDriverWait(Page2BunnyCart.driver, Duration.ofSeconds(10));
		
		Page2BunnyCart.productSelect();
	}

	@When("User clicks on Netpot option")
	public void user_clicks_on_netpot_option() {
		Page2BunnyCart.clickNetPot();
	}

	@When("User clicks on Add to Cart")
	public void user_clicks_on_add_to_cart() {
		Page2BunnyCart.addToCart();
	}

	@Then("User verifies that the product is added to the cart message")
	public void user_verifies_that_the_product_is_added_to_the_cart_message() {
		Page2BunnyCart.successMessageAddToCart();
	}

	@Then("User closes the Browser")
	public void user_closes_the_browser() {
	   browser.driver.quit();
	   System.out.println("Closing the Browser");
	}
	
	@When("User searches for another product {string} in the search textbox")
	public void user_searches_for_another_product_in_the_search_textbox(String string) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-1000)", "");
			
			WebElement product = driver.findElement(By.xpath("//input[@id='search' and contains(@class,'input-text') ]"));
	        for (int i = 0; i < 3; i++) {
	        	try {
	        		Thread.sleep(5000);
	        		product.click();
	        		break;
	        		} catch (StaleElementReferenceException e) {
	        			e.printStackTrace();
	        			}
	        	}
	        product.sendKeys(string);
			Thread.sleep(3000);
	}

		

	@When("User selects the nitella product from the search results")
	public void user_selects_the_product_from_the_search_results() {
		
		Page2BunnyCart.selectAnotherProduct();
	}

}

