

package com.BunnyCart.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class browser {  
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions act;

    // Extent Report variables
    public static ExtentReports extent;
    public static ExtentSparkReporter reporter;
    public static ExtentTest logger;

    // Initialize Extent Report
    public static void init(String reportName) {
        extent = new ExtentReports();
        reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//target//ExtentReports//" + reportName + ".html");
        extent.attachReporter(reporter);
    }

    public static void openBrowser(String browserName) {
        if (extent == null) { 
            init("TestReport");
        }

        logger = extent.createTest("Open Browser");
        logger.log(Status.INFO, "Opening the browser: " + browserName);

        try {
            if (browserName.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                throw new Exception("Invalid browser type: " + browserName);
            }

            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            act = new Actions(driver);
            logger.log(Status.PASS, "Browser opened successfully");
            
        } catch (Exception e) {
            System.out.println("Browser - openBrowser: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to open browser: " + e.getMessage());
        }
        extent.flush();
    }

    public static void navigateToUrl(String url) {
        logger = extent.createTest("Navigate to URL");
        logger.log(Status.INFO, "Navigating to URL: " + url);

        try {
            driver.get(url);
            driver.manage().window().maximize();
            logger.log(Status.PASS, "URL opened successfully");
        } catch (Exception e) {
            System.out.println("Failed to open URL: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to open URL: " + e.getMessage());
        }
        extent.flush();
    }

    public static void closeBrowser() {
        logger = extent.createTest("Close Browser");
        logger.log(Status.INFO, "Closing the browser");

        try {
            if (driver != null) {
                driver.quit();
                logger.log(Status.PASS, "Browser closed successfully");
            }
        } catch (Exception e) {
            System.out.println("Browser - closeBrowser: " + e.getMessage());
            logger.log(Status.FAIL, "Failed to close browser: " + e.getMessage());
        }
        extent.flush();
    }
}




