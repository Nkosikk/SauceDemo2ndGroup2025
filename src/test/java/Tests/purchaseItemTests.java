package Tests;

import Pages.CheckOutInformationPage;
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
        productsPage.verifyInventoryItemName("Sauce Labs Fleece Jacket");
    }

    @Test (dependsOnMethods = "inventoryItemTests")
    public void addToCartTests(){
        productsPage.clickAddToCartForItem("Sauce Labs Fleece Jacket");
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
        cartPage.clickCheckout();
    }

    //CheckOutInformationPage
    @Test(dependsOnMethods = "clickCheckoutButtonTests")
    public void verifyCheckOutInformationPageTests() {
        checkoutinformationPage.verifyCheckoutYourInformationText();
    }

    @Test(dependsOnMethods = "verifyCheckOutInformationPageTests")
    public void enterFirstnameTests() {
        checkoutinformationPage.enterFirstname("Precious");
    }

    @Test(dependsOnMethods = "enterFirstnameTests")
    public void enterLastNameTests() {
        checkoutinformationPage.enterLastname("Gem");
    }

    @Test(dependsOnMethods = "enterLastNameTests")
    public void enterPostalCodeTests() {
        checkoutinformationPage.enterPostalCode("1608");
    }

    @Test(dependsOnMethods = "enterPostalCodeTests")
    public void clickContinueTests() {
        takeScreenshots.takesSnapShot(driver, "CheckOutInformationPage");
        checkoutinformationPage.clickContinue();
    }

    //CheckOutOverviewPage
    @Test(dependsOnMethods = "clickContinueTests")
    public void verifyCheckOutOverviewPageTests() {
        checkoutoverviewPage.verifyCheckoutOverviewText();
    }

    @Test(dependsOnMethods = "verifyCheckOutOverviewPageTests")
    public void verifySubtotalText () {
        checkoutoverviewPage.verifySubtotalText();
    }

    @Test(dependsOnMethods = "verifySubtotalText")
    public void verifyTaxText(){
        checkoutoverviewPage.verifyTaxText();
    }

    @Test(dependsOnMethods = "verifyTaxText")
    public void verifyTotalText(){
        checkoutoverviewPage.verifyTotalText();
    }

    @Test (dependsOnMethods = "verifyTotalText")
    public void verifyTotalAmountTests(){
        takeScreenshots.takesSnapShot(driver, "CheckOutOverviewPage");
        checkoutoverviewPage.verifyTotalAmount();
    }


    //CheckOutCompletePage
    @Test (dependsOnMethods = "verifyTotalAmountTests")
    public void verifyCheckOutCompletePageTests(){
        takeScreenshots.takesSnapShot(driver, "CheckOutCompletePage");
        checkoutcompletePage.verifyCheckoutCompleteText();
    }

    @Test(dependsOnMethods = "verifyCheckOutCompletePageTests")
    public void verifyCheckOutCompleteContainerTests(){
        checkoutcompletePage.verifyCheckoutCompleteContainer();
    }


    @Test(dependsOnMethods = "verifyCheckOutCompleteContainerTests")
    public void clickMenuTests(){
        checkoutcompletePage.clickMenu();
    }

    @Test(dependsOnMethods = "clickMenuTests")
    public void clickLogoutTests(){
        takeScreenshots.takesSnapShot(driver, "LogoutPage");
        checkoutcompletePage.clickLogout();
    }















    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}