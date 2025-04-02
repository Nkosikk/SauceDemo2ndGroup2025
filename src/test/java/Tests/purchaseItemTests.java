package Tests;

import Pages.LandingPage;
import org.testng.annotations.Test;

public class purchaseItemTests extends Base {

    @Test
    public void enterUsernameTest() {
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest() {
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginButtonTest() {
        loginPage.clickLoginButton();

        takeScreenshots.takesSnapShot(driver, "LoginPage");
    }
    @Test(dependsOnMethods = "enterPasswordTest")
    public void verifyProductTextTest() {
        landingPage.verifyProductText();

        takeScreenshots.takesSnapShot(driver, "LandingPage");
    }
}

