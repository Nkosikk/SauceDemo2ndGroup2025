package Tests;

import Utils.ReadFromExcel; // Add this import statement
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername(ReadFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(ReadFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addTwoItemsToCartTests() {
        landingPage.addTwoItemsToCart();
    }

    @Test(dependsOnMethods = "addTwoItemsToCartTests")
    public void clickShoppingCartTests() {
        landingPage.clickShoppingCart();
    }

    @Test(dependsOnMethods = "clickShoppingCartTests")
    public void clickCheckoutTests() {
        cartPage.clickCheckoutButton();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}