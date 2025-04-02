package Tests;

import Pages.AddToCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseTests extends Base {

    public void enterUsernameTests() {

        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {

        loginPage.enterPassword(readFromExcel.password);
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

    @Test(dependsOnMethods = "ClickAddToCartTests")
    public void clickAddToCart() {
        takeScreenshots.takesSnapShot(driver, "Add to Cart");
        AddToCartPage.ClickAddToCart();
    }

    @Test(dependsOnMethods = "ClickShoppingCartTests")
    public void clickShoppingCart() {
        takeScreenshots.takesSnapShot(driver, "Shopping Cart");
        AddToCartPage.clickShoppingCart();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}



