package Tests;

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

    @Test(dependsOnMethods = "clickContinue")
    public void verifyCheckoutOverviewText() {
        CheckoutOverviewPage.verifyCheckoutOverviewText();
    }

    @Test(dependsOnMethods = "verifyCheckoutOverviewText")
    public void checkSauceLabsBikeLight() {
        takeScreenshots.takesSnapShot(driver, "Checkout Overview");
        CheckoutOverviewPage.verifySauceLabsBikeLight();
    }

    @Test(dependsOnMethods = "checkSauceLabsBikeLight")
    public void verifyTotalItem() {
        CheckoutOverviewPage.verifyTotalItem();
    }
    @Test(dependsOnMethods = "verifyTotalItem")
    public void clickFinish() {
        CheckoutOverviewPage.clickFinish();
    }

    @AfterTest
    public void closeBrowser() {
//        driver.quit();
    }


}
