package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }


    //ProductsPage
    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccessTests() {
        takeScreenshots.takesSnapShot(driver, "ProductsPage");
        productsPage.verifyProductText("Products");
    }

    @Test(dependsOnMethods = "verifyLoginSuccessTests")
    public void addToCartTests() {
        productsPage.clickAddToCart("Sauce Labs Fleece Jacket");
    }

    @Test(dependsOnMethods = "addToCartTests")
    public void clickShoppingCartLinkTests() {
        productsPage.clickShoppingCartLink();
    }

    //CartPage
    @Test(dependsOnMethods = "clickShoppingCartLinkTests")
    public void verifyCartPageTests() {
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}