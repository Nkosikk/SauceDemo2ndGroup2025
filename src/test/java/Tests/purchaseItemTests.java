package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class purchaseItemTests extends Base {
    @Test
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

    @Test (dependsOnMethods = "verifyLoginSuccessTests")
    public void inventoryItemTests(){
        productsPage.verifyInventoryItemName("Sauce Labs Bike Light");
    }

    @Test (dependsOnMethods = "inventoryItemTests")
    public void addToCartTests(){
        productsPage.clickAddToCartForItem("Sauce Labs Bike Light");
    }


    @Test(dependsOnMethods = "addToCartTests")
    public void clickShoppingCartLinkTests() {
        productsPage.clickShoppingCartLink();
    }

    //CartPage
    @Test(dependsOnMethods = "clickShoppingCartLinkTests")
    public void verifyCartPageTests() {
        takeScreenshots.takesSnapShot(driver, "CartPage");
        cartPage.verifyYourCartText();
    }

    @Test(dependsOnMethods = "verifyCartPageTests")
    public void verifyInventoryItemNameTests() {
        cartPage.verifyInventoryItemName("Sauce Labs Fleece Jacket");
    }

    @Test (dependsOnMethods = "verifyInventoryItemNameTests")
    public void clickCheckoutButtonTests(){
        cartPage.handleCart("Sauce Labs Bike Light");
    }







    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}