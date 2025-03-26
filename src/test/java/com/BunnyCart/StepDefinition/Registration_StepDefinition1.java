package com.BunnyCart.StepDefinition;



import com.BunnyCart.Browser.browser;
import com.BunnyCart.Pages.Page1BunnyCart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Registration_StepDefinition1 {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception{
	  browser.openBrowser("Chrome");
	}

	@And("User navigates to the {string} webpage to open home page")
	public void user_navigates_to_the_webpage_to_open_home_page(String string) throws Exception{
	    browser.navigateToUrl("https://www.bunnycart.com");
	}

	@And("User click on create account button")
	public void user_click_on_create_account_button() throws Exception {
		Page1BunnyCart.clickCreateAccount();
	}

	@And("User enters {string} the First name")
	public void user_enters_the_first_name(String string) {
		Page1BunnyCart.enterFirstName("Prathap");
	}

	@And("User enters {string} the Last name")
	public void user_enters_the_last_name(String string) {
		Page1BunnyCart.enterLastName("Beri");
	}

	@And("User enters {string} the email")
	public void user_enters_the_email(String string) {
		Page1BunnyCart.enterEmail("prathapberi@gmail.com");
	}

	@And("User enter {string} the password")
	public void user_enter_the_password(String string) {
		Page1BunnyCart.enterPassword("Prathap@123");
	}

	@And("User enter Invalid {string} the confirm Password")
	public void user_enter_invalid_the_confirm_password(String string) {
		Page1BunnyCart.enterInvalidConfirmPassword("Beri@");
	}

	@And("User enter {string} the whatsup Number")
	public void user_enter_the_whatsup_number(String string) {
		Page1BunnyCart.enterMobileNumber("9100643926");
	}

	@And("User click on the create an Account button")
	public void user_click_on_the_create_an_account_button() {
		Page1BunnyCart.clickCreateAccountButton();
	}

	@Then("User verify an error message")
	public void user_verify_an_error_message() {
	   
	}

	@And("User closes the browser")
	public void user_closes_the_browser() {
	    browser.closeBrowser();
	}

	@And("User enter  {string} the confirm Password")
	public void user_enter_the_confirm_password(String string) {
		Page1BunnyCart.enterValidConfirmPassword("Prathap@123");
	    
	}




}