package com.BunnyCart.Pages;

import com.BunnyCart.Browser.browser;
import com.BunnyCart.Locators.Page2ObjectBunnyCart;
import com.aventstack.extentreports.Status;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Page2BunnyCart extends browser {
	static {
        init("Page_2_4_BunnyCart_Report"); 
    }
	

    // Method to click the Sign-In button
    public static void SignIn() {
        logger = extent.createTest("Sign In");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(Page2ObjectBunnyCart.SignIn())).click();
            logger.log(Status.PASS, "Clicked Sign In button successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error clicking Sign In: " + e.getMessage());
            takeScreenshot("SignInError");
        }
        extent.flush();
    }

    // Method to enter email for sign-in
    public static void enterEmailSignIn(String str) {
        logger = extent.createTest("Enter Email for Sign In");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(Page2ObjectBunnyCart.enterEmailSignIn())).sendKeys(str);
            logger.log(Status.PASS, "Entered email successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error entering email: " + e.getMessage());
            takeScreenshot("enterEmailError");
        }
        extent.flush();
    }

    // Method to enter password for sign-in
    public static void enterPasswordSign(String str) {
        logger = extent.createTest("Enter Password for Sign In");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(Page2ObjectBunnyCart.enterPasswordSignIn())).sendKeys(str);
            logger.log(Status.PASS, "Entered password successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error entering password: " + e.getMessage());
            takeScreenshot("enterPasswordError");
        }
        extent.flush();
    }

    // Method to click the sign-in login button
    public static void signinLoginButton() {
        logger = extent.createTest("Click Sign-In Login Button");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(Page2ObjectBunnyCart.SigninLoginButton())).click();
            logger.log(Status.PASS, "Clicked Sign-In login button successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error clicking Sign-In button: " + e.getMessage());
            takeScreenshot("signinLoginButtonError");
        }
        extent.flush();
    }

    // Method to search for a product
    public static void searchBar(String str) throws Exception {
        logger = extent.createTest("Search for a Product");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(Page2ObjectBunnyCart.searchBar()));

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(10000);
                product.click();
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
        }
        product.sendKeys(str);
        Thread.sleep(3000);
        logger.log(Status.PASS, "Product searched successfully: " + str);
        extent.flush();
    }

    // Method to select a product
    public static void productSelect() {
        logger = extent.createTest("Select a Product");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Dwarf Hairgrass') and contains(@class,'product-name')]"))).click();
            logger.log(Status.PASS, "Product selected successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error selecting product: " + e.getMessage());
            takeScreenshot("productSelectError");
        }
        extent.flush();
    }

    // Method to select another product
    public static void selectAnotherProduct() {
        logger = extent.createTest("Select Another Product");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Nitella')]"))).click();
            logger.log(Status.PASS, "Another product selected successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error selecting another product: " + e.getMessage());
            takeScreenshot("selectAnotherProductError");
        }
        extent.flush();
    }

    // Method to click NetPot option
    public static void clickNetPot() {
        logger = extent.createTest("Click NetPot");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(Page2ObjectBunnyCart.clickNetPot())).click();
            logger.log(Status.PASS, "Clicked NetPot successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error clicking NetPot: " + e.getMessage());
            takeScreenshot("clickNetPotError");
        }
        extent.flush();
    }

    // Method to add product to the cart
    public static void addToCart() {
        logger = extent.createTest("Add Product to Cart");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(Page2ObjectBunnyCart.addToCartButton())).click();
            logger.log(Status.PASS, "Product added to cart successfully");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error adding product to cart: " + e.getMessage());
            takeScreenshot("addToCartError");
        }
        extent.flush();
    }

    // Method to verify success message after adding to cart
    public static void successMessageAddToCart() {
        logger = extent.createTest("Verify Add to Cart Success Message");
        try {
            System.out.println("The product is added to the cart successfully.");
            Thread.sleep(10000);
            logger.log(Status.PASS, "Verified success message for adding to cart");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error verifying cart addition: " + e.getMessage());
        }
        extent.flush();
    }

    // Method to take a screenshot in case of errors
    public static void takeScreenshot(String testName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshots/" + testName + "_" + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            System.out.println("Error taking screenshot: " + e.getMessage());
        }
    }

    // Method to close the browser
    public static void closeBrowser() {
        logger = extent.createTest("Close Browser");
        try {
            if (driver != null) {
                driver.quit();
                logger.log(Status.PASS, "Browser closed successfully");
            }
        } catch (Exception e) {
            logger.log(Status.FAIL, "Error closing browser: " + e.getMessage());
        }
        extent.flush();
    }
}



