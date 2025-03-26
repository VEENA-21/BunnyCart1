package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.browser;
import com.BunnyCart.Locators.Page3ObjectBunnyCart;
import com.BunnyCart.ScreenShot.Capture;
import com.aventstack.extentreports.Status;

public class Page3BunnyCart extends browser {
    
    public static void homepagesignin() {
        logger = extent.createTest("Homepage Sign-In");
        try {
            logger.log(Status.INFO, "Waiting for homepage sign-in button to be clickable");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement homepagesigninbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a")));
            homepagesigninbtn.click();
            logger.log(Status.PASS, "Clicked homepage sign-in button successfully");

            Page3ObjectBunnyCart.homepagesignin();
        } catch (Exception e) {
            logger.log(Status.FAIL, "Failed to click homepage sign-in: " + e.getMessage());
            System.out.println("Error in homepagesignin(): " + e.getMessage());
        }
    }

    public static void signinbutton() {
        logger = extent.createTest("Click Sign-In Button");
        try {
            logger.log(Status.INFO, "Waiting for sign-in button to be clickable");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement signinBtn = wait.until(ExpectedConditions.elementToBeClickable(Page3ObjectBunnyCart.signinbutton()));
            signinBtn.click();
            logger.log(Status.PASS, "Clicked sign-in button successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Failed to click sign-in button: " + e.getMessage());
            System.out.println("Error in signinbutton(): " + e.getMessage());
        }
    }

    public static void signinmail(String data) throws Exception {
        logger = extent.createTest("Enter Email");
        try {
            logger.log(Status.INFO, "Waiting for email field to be clickable");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(Page3ObjectBunnyCart.signinmail()));

            // Scroll into view if the element is not visible
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailField);

            // Clear existing email and enter new email
            emailField.clear();
            logger.log(Status.INFO, "Cleared existing email field");

            emailField.sendKeys(data);
            logger.log(Status.PASS, "Entered email: " + data);

            // Wait for the input field to have the correct value before proceeding
            String enteredValue = emailField.getAttribute("value");
            while (!enteredValue.equals(data)) {
                emailField.clear();
                emailField.sendKeys(data);
                enteredValue = emailField.getAttribute("value");
            }

        } catch (Exception e) {
            logger.log(Status.FAIL, "Failed to enter email: " + e.getMessage());
            System.out.println("Error in signinmail(): " + e.getMessage());
            logger.addScreenCaptureFromPath(Capture.screenShot("Scenario3"));
        }
    }

    public static void signinpass(String data) {
        logger = extent.createTest("Enter Password");
        try {
            logger.log(Status.INFO, "Waiting for password field to be clickable");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(Page3ObjectBunnyCart.signinpass()));

            // Scroll into view if not visible
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordField);

            passwordField.sendKeys(data);
            logger.log(Status.PASS, "Entered password successfully");

        } catch (Exception e) {
            logger.log(Status.FAIL, "Failed to enter password: " + e.getMessage());
            System.out.println("Error in signinpass(): " + e.getMessage());
        }
    }
}


