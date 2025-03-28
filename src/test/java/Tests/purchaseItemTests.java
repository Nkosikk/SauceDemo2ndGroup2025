package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class purchaseItemTests extends Base {

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

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addProductToCart() {
        landingPage.clickAddToCart();
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void clickShoppingCart() {
        landingPage.clickshopping_cart_container();
    }

    @Test(dependsOnMethods = "clickShoppingCart")
    public void clickCheckout() {
        takeScreenshots.takesSnapShot(driver, "Your Cart");
        yourCart.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "clickCheckout")
    public void enterFirstName() {
        yourInformationPage.firstName(readFromExcel.firstname);
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        yourInformationPage.lastName(readFromExcel.lastname);
    }

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        yourInformationPage.postalCode(readFromExcel.postalcode);
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinue() {
        takeScreenshots.takesSnapShot(driver, "Your Information");
        yourInformationPage.clickContinueButton();
    }

    @AfterTest
    public void closeBrowser() {
//        driver.quit();
    }


}
