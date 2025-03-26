package com.BunnyCart.StepDefinition;

import com.BunnyCart.Browser.browser;
import com.BunnyCart.Pages.Page3BunnyCart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignIn_StepDefinition3 {
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws Exception {
		browser.openBrowser("Chrome");
	}

	@Given("User navigates to the application Url {string}")
	public void user_navigates_to_the_application_url(String string) throws Exception {
		browser.navigateToUrl("https://www.bunnycart.com");
	}
	
		@When("User clicks the link homepagesignin an account")
		public void user_clicks_the_link_homepagesignin_an_account() throws InterruptedException {
			Thread.sleep(5000);
			Page3BunnyCart.homepagesignin();
		}

		@And("User enters a invalid {string} in email textbox")
		public void user_enters_a_invalid_in_email_textbox(String string) throws Exception {
			
			Page3BunnyCart.signinmail("veenaberi.com");
		}

		@And("User enters a valid {string} in password textbox")
		public void user_enters_a_valid_in_password_textbox(String string) throws InterruptedException {
			
			Page3BunnyCart.signinpass("Veena@2001");
		}

		@And("User clicks signin  account button.")
		public void user_clicks_signin_account_button() {
			Page3BunnyCart.signinbutton();
		}
		
	     
		@When("User re-enters a email with valid data {string}")
		public void user_re_enters_a_email_with_valid_data(String string) throws Exception {
			Page3BunnyCart.signinmail("veenaprathapberi@gmail.com");
		}

		@And("User clicks signin button.")
		public void user_clicks_signin_button() {
			Page3BunnyCart.signinbutton();
		}
		
		


	}