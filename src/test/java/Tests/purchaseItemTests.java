package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base {


    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    //@Test(priority = 1)
    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    //@Test(priority = 2)
    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapshot(driver, "LoginPage");
        loginPage.clickLoginButton();
    }

    //@Test(priority = 3)
    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takesSnapshot(driver, "LandingPage");
        landingPage.verifyProductText();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

