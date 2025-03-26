
package com.BunnyCart.Pages;

import com.BunnyCart.Browser.browser;
import com.BunnyCart.Locators.Page1ObjectBunnyCart;
import com.BunnyCart.ScreenShot.Capture;
import com.aventstack.extentreports.Status;

public class Page1BunnyCart extends browser {
	
	static {
        init("BunnyCartPage1_Report"); 
    }

    public static void clickCreateAccount() throws Exception {
        logger = extent.createTest("Click Create Account");
        logger.log(Status.INFO, "Attempting to click 'Create Account' link");

        try {
            Page1ObjectBunnyCart.createAccount().click();
            logger.log(Status.PASS, "'Create Account' link clicked successfully");
        } catch (Exception e) {
            System.out.println("Create Account: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to click 'Create Account' link: " + e.getMessage());
            logger.addScreenCaptureFromPath(Capture.screenShot("Scenario1"));
        }
        extent.flush();
    }

    public static void enterFirstName(String str) {
        logger = extent.createTest("Enter First Name");
        logger.log(Status.INFO, "Entering First Name: " + str);

        try {
            Page1ObjectBunnyCart.firstName().sendKeys(str);
            logger.log(Status.PASS, "First Name entered successfully");
        } catch (Exception e) {
            System.out.println("FirstName: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter First Name: " + e.getMessage());
        }
        extent.flush();
    }

    public static void enterLastName(String str) {
        logger = extent.createTest("Enter Last Name");
        logger.log(Status.INFO, "Entering Last Name: " + str);

        try {
            Page1ObjectBunnyCart.lastName().sendKeys(str);
            logger.log(Status.PASS, "Last Name entered successfully");
        } catch (Exception e) {
            System.out.println("LastName: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter Last Name: " + e.getMessage());
        }
        extent.flush();
    }

    public static void enterEmail(String str) {
        logger = extent.createTest("Enter Email");
        logger.log(Status.INFO, "Entering Email: " + str);

        try {
            Page1ObjectBunnyCart.email().sendKeys(str);
            logger.log(Status.PASS, "Email entered successfully");
        } catch (Exception e) {
            System.out.println("Email: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter Email: " + e.getMessage());
        }
        extent.flush();
    }

    public static void enterPassword(String str) {
        logger = extent.createTest("Enter Password");
        logger.log(Status.INFO, "Entering Password");

        try {
            Page1ObjectBunnyCart.password().sendKeys(str);
            logger.log(Status.PASS, "Password entered successfully");
        } catch (Exception e) {
            System.out.println("Password: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter Password: " + e.getMessage());
        }
        extent.flush();
    }

    public static void enterInvalidConfirmPassword(String str) {
        logger = extent.createTest("Enter Invalid Confirm Password");
        logger.log(Status.INFO, "Entering Invalid Confirm Password");

        try {
            Page1ObjectBunnyCart.invalidConfirmPassword().sendKeys(str);
            logger.log(Status.PASS, "Invalid Confirm Password entered successfully");
        } catch (Exception e) {
            System.out.println("InvalidConfirmPassword: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter Invalid Confirm Password: " + e.getMessage());
        }
        extent.flush();
    }

    public static void enterValidConfirmPassword(String str) {
        logger = extent.createTest("Enter Valid Confirm Password");
        logger.log(Status.INFO, "Entering Valid Confirm Password");

        try {
            Page1ObjectBunnyCart.validConfirmPassword().sendKeys(str);
            logger.log(Status.PASS, "Valid Confirm Password entered successfully");
        } catch (Exception e) {
            System.out.println("ValidConfirmPassword: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter Valid Confirm Password: " + e.getMessage());
        }
        extent.flush();
    }

    public static void enterMobileNumber(String str) {
        logger = extent.createTest("Enter Mobile Number");
        logger.log(Status.INFO, "Entering Mobile Number: " + str);

        try {
            Page1ObjectBunnyCart.enterMobileNumber().sendKeys(str);
            logger.log(Status.PASS, "Mobile Number entered successfully");
        } catch (Exception e) {
            System.out.println("MobileNumber: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to enter Mobile Number: " + e.getMessage());
        }
        extent.flush();
    }

    public static void clickCreateAccountButton() {
        logger = extent.createTest("Click Create Account Button");
        logger.log(Status.INFO, "Attempting to click 'Create Account' button");

        try {
            Page1ObjectBunnyCart.createAccountButton().click();
            logger.log(Status.PASS, "'Create Account' button clicked successfully");
        } catch (Exception e) {
            System.out.println("CreateAccountButton: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to click 'Create Account' button: " + e.getMessage());
        }
        extent.flush();
    }
}


