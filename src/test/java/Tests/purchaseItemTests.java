package Tests;

import Utils.ReadFromExcel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class purchaseItemTests extends Base {

    @Test(priority = 1)
    public void enterUsernameTests() {
        loginPage.enterUsername(ReadFromExcel.username);
    }

    @Test(priority = 2, dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(ReadFromExcel.password);
    }

    @Test(priority = 3, dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(priority = 4, dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
        landingPage.clickAddToCartSauceLabsBackpack();
        landingPage.clickCart();
    }

    @Test(priority = 5, dependsOnMethods = "verifyLoginSuccess")
    public void cartPageTests() {
        cartPage.verifyYourCartText();
        takeScreenshots.takesSnapShot(driver, "Cart Page");
        cartPage.clickCheckoutButton();
    }

    @Test(priority = 6, dependsOnMethods = "cartPageTests")
    public void checkoutInformationPageTests() {
        checkoutinformationPage.setYourInformationText_xpath();
        checkoutinformationPage.setFirstName(ReadFromExcel.firstname);
        checkoutinformationPage.setLastName_id(ReadFromExcel.lastname);
        checkoutinformationPage.setPostalCode_id(ReadFromExcel.postalCode);
        takeScreenshots.takesSnapShot(driver, "Checkout Information Page");
        checkoutinformationPage.clickContinueButton();
    }

    @Test(priority = 7, dependsOnMethods = "checkoutInformationPageTests")
    public void CheckoutOverviewTests() {
        checkoutoverview.verifyCheckoutOverviewText();
        takeScreenshots.takesSnapShot(driver, "Checkout Overview Page");
        //checkoutOverview.verifyTotal();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}





