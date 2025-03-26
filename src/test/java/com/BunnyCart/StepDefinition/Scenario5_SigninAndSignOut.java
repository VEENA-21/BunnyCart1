package com.BunnyCart.StepDefinition;

import com.BunnyCart.Pages.Page2BunnyCart;
import com.BunnyCart.Pages.Page5BunnyCart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Scenario5_SigninAndSignOut {

@And("User click on sign in")
public void user_click_on_sign_in() {
    Page2BunnyCart.SignIn();
}


@Given("User enters valid {string} email")
public void user_enters_valid_email(String string) {
	Page2BunnyCart.enterEmailSignIn("veenaprathapberi@gmail.com");
}

@Given("User enters valid {string} password")
public void user_enters_valid_password(String string) {
	Page2BunnyCart.enterPasswordSign("Veena@2001");
}

@Given("User click on sign in button")
public void user_click_on_sign_in_button() {
    Page2BunnyCart.signinLoginButton();
}


@And("User click on sign out button")
public void user_click_on_sign_out_button() throws Exception{
   Thread.sleep(2000);
   Page5BunnyCart.clickSignOut();
}

}