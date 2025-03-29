package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutInfoPage {


        WebDriver driver;

        @FindBy(xpath= "//span[contains(.,'Products')]")
        WebElement pageTitle_xpath;



        public CheckoutInfoPage(WebDriver driver) {
            this.driver = driver;
        }


    //	Verify that you are in the capture information screen using title
    public void verifyPageTitle(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(pageTitle_xpath));
        String pageTitle = pageTitle_xpath.getText();
        Assert.assertEquals(pageTitle, "Products");


    }
}

