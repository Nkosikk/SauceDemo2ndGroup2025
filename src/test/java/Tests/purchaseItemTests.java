package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@Test
public class purchaseItemTests extends Base {

    public void enterUsernameTest() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest() {
        loginPage.enterPassword("secret_sauce");
    }
    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

//    @Test(dependsOnMethods = "clickLoginButton")
//    public boolean isProductTextDisplayed() {
//        return landingPage.isProductsTextDisplayed();
//    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
