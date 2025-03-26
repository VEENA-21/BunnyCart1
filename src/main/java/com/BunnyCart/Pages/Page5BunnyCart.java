package com.BunnyCart.Pages;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BunnyCart.Browser.browser;
import com.BunnyCart.Locators.Page5ObjectBunnyCart;
import com.BunnyCart.ScreenShot.Capture;
import com.aventstack.extentreports.Status;

public class Page5BunnyCart extends browser {
	
	static {
        init("Page5BunnyCart_Report"); 
    }

    // Method to click on the Sign-Out button
    public static void clickSignOut() throws Exception {
        logger = extent.createTest("Click Sign-Out");
        try {
            logger.log(Status.INFO, "Waiting for Sign-Out button to be clickable");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Thread.sleep(3000); // Adding a delay before clicking (3 seconds)
            wait.until(ExpectedConditions.elementToBeClickable(Page5ObjectBunnyCart.signOut())).click();

            logger.log(Status.PASS, "Successfully clicked the Sign-Out button");

        } catch (Exception e) {
            logger.log(Status.FAIL, "Failed to click Sign-Out: " + e.getMessage());
            System.out.println("Error in clickSignOut(): " + e.getMessage());
            logger.addScreenCaptureFromPath(Capture.screenShot("Scenario5"));
        }
        extent.flush();
    }
}



