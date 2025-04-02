package Tests;

import Pages.CheckoutOverview;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base {

    //Testing login functionality
    @Test(priority = 0)
    public void enterUsernameTest() {
        takeScreenshots("LoginPage");
        loginPage.enterUsername("standard_user");
    }


    @Test(dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest() {
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginButtonTest() {
        loginPage.clickLoginButton();
    }

    //verifying successful login

    @Test(dependsOnMethods = "clickLoginButtonTest")
    public void verifyLoginSuccessTest() {
        String ProductText = loginPage.getLoginSuccessText();
        Assert.assertEquals(ProductText, "Products");
    }

    //Testing adding items to Cart
    @Test(dependsOnMethods = "clickLoginButtonTest")
    public void clickAddToCartSauceLabsBackPackTest() {
        takeScreenshots("LandingPage");
        landingPage.clickAddToCartSauceLabsBackPack();
    }

    @Test(dependsOnMethods = "clickAddToCartSauceLabsBackPackTest")
    public void clickAddToCartSauceLabsFleeceJacketTest() {
        landingPage.clickAddToCartSauceLabsFleeceJacket();
    }

    @Test(dependsOnMethods = "clickAddToCartSauceLabsFleeceJacketTest")
    public void clickShoppingCartTest() {
        landingPage.clickShoppingCart();
    }

    //Testing Checkout
    @Test(dependsOnMethods = "clickShoppingCartTest")
    public void clickCheckoutButtonTest() {
        takeScreenshots("CheckoutYourCartPage");
        checkoutYourCart.clickCheckoutButton();
    }


    //Entering information details
    @Test(dependsOnMethods = "clickCheckoutButtonTest")
    public void enterFirstNameTest() {
        takeScreenshots("InformationPage");
        checkoutInfoPage.enterFirstName("John");
    }

    @Test(dependsOnMethods = "enterFirstNameTest")
    public void enterLastNameTest() {
        checkoutInfoPage.enterLastName("Doe");
    }

    @Test(dependsOnMethods = "enterLastNameTest")
    public void enterZipCodeTest() {
        checkoutInfoPage.enterZipCode("12345");
    }

    @Test(dependsOnMethods = "enterZipCodeTest")
    public void clickContinueButtonTest() {
        checkoutInfoPage.clickContinueButton();
    }

    //Finish the order

    @Test(dependsOnMethods = "clickContinueButtonTest")
    public void clickFinishButtonTest() {
        takeScreenshots("CartOverviewPage");
        checkoutOverview.clickTheFinishButton();
    }









}
