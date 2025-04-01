package Tests;

import Utils.ReadFromExcel;
import org.testng.Assert;
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
        landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addProductToCart() {
        landingPage.clickAddToCart();
        takeScreenshots.takesSnapShot(driver, "Landing Page");
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void clickShoppingCart() {
        landingPage.clickShopping_Cart_Container();
    }

    @Test(dependsOnMethods = "clickShoppingCart")
    public void verifySauceLabsBikeLight() {
        yourCart.verifySauceLabsBikeLight();
    }

    @Test(dependsOnMethods = "verifySauceLabsBikeLight")
    public void clickCheckout() {
        takeScreenshots.takesSnapShot(driver, "Your Cart");
        yourCart.checkoutButton();
    }

    @Test(dependsOnMethods = "clickCheckout")
    public void enterFirstName() {
        yourInformationPage.firstName(ReadFromExcel.firstname);
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        yourInformationPage.lastName(ReadFromExcel.lastname);
    }

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        yourInformationPage.postalCode(ReadFromExcel.postalcode);
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinue() {
        takeScreenshots.takesSnapShot(driver, "Your Information");
        yourInformationPage.clickContinueButton();
    }

    @Test(dependsOnMethods = "clickContinue")
    public void verifyCheckoutOverviewText() {
        CheckoutOverviewPage.verifyCheckoutOverviewText();
    }

    @Test(dependsOnMethods = "verifyCheckoutOverviewText")
    public void verifyTotalItem() throws InterruptedException {
        Thread.sleep(5000);
        CheckoutOverviewPage.calculations();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
