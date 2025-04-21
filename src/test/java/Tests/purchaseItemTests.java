package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base {


    @Test(priority = 0)
    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    // Ensures that the username is entered before entering the password
    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginButtonTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyLoginSuccessTests() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyLoginSuccess();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
