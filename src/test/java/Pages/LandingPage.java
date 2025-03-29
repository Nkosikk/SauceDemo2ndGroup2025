package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;


import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {


    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Products')]")
    WebElement pageTitle_xpath;



    public void takeScreenshot(String fileName) {
        // Take screenshot and store it as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Move image file to new destination
            FileHandler.copy(src, new File("Screenshots/" + fileName + ".png"));
            System.out.println("The screenshot taken is of: " + fileName);
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }

    }
    public LandingPage(WebDriver driver) {
            this.driver = driver;
        }

        //verify that user is logged in by page title

        public void verifyPageTitle () {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(pageTitle_xpath));
            String pageTitle = pageTitle_xpath.getText();
            Assert.assertEquals(pageTitle, "Products");

            // Take a screenshot after verifying the product page
            takeScreenshot("product_page");
        }

    }



