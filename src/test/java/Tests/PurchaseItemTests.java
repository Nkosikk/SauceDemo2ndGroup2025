package Tests;

import Pages.AddToCartPage;
import Pages.BackHomePage;
import Pages.CheckoutOverviewPage;
import Pages.YourCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.security.PublicKey;

@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername(readFromExcel.username);
        //loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(readFromExcel.password);
        //loginPage.enterPassword("secret_sauce");
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

    //Add to Cart
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCartTest() {
        addToCartPage.AddToCartBackPack("addtocartsaucelabsbackpack_id");
        addToCartPage.AddToCartBikeLight("addtocartsaucelabsbikelight_id");
        addToCartPage.clickShoppingCartContainer();
        takeScreenshots.takesSnapShot(driver, "Cart Page");
    }

    //View your cart
    @Test(dependsOnMethods = "clickAddToCartTest")
    public void clickCheckoutButtonTest() {
        yourCartPage.clickCheckoutButton();
        takeScreenshots.takesSnapShot(driver, "Your Cart Page");
    }

    @Test(dependsOnMethods = "clickCheckoutButtonTest")
    public void YourInformationPageTests() {
        yourInformationPage.enterFirstname("Babongile");
        yourInformationPage.enterLastname("Mpungose");
        yourInformationPage.enterPostalcode("2188");
        yourInformationPage.clickContinueButton();
        takeScreenshots.takesSnapShot(driver, "Your Information Page");
    }

    @Test(dependsOnMethods = "YourInformationPageTests")
    public void clickFinishButtonTests() {
        takeScreenshots.takesSnapShot(driver, "BackHome Page");
        CheckoutOverviewPage.clickFinishButton();
    }

    @Test(dependsOnMethods = "clickFinishButtonTests")
    public void clickBackHomeButtonTests() {
        backHomePage.ClickBackHomeButton();
        takeScreenshots.takesSnapShot(driver, "Product Page");
    }

    @Test(dependsOnMethods = "clickBackHomeButtonTests")
    public void clickReactBurgerMenuTests()
    {
        logoutPage.clickBurgerMenuBtn();
        takeScreenshots.takesSnapShot(driver, "Logout Page");
    }
    @Test(dependsOnMethods = "clickReactBurgerMenuTests")
    public void clickLogoutLinkTests()
    {
        logoutPage.clickLogoutSideBarLink();
        takeScreenshots.takesSnapShot(driver, "Swag Labs Login Page");
    }
    @Test(dependsOnMethods = "clickLogoutLinkTests")
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
/*
@Test(dependsOnMethods = "clickContinueTests")
public void verifyCheckoutOverviewTest()
{
    takeScreenshots.takesSnapShot(driver,"Checkout Overview Page");
    CheckoutOverviewPage.verifyCheckoutOverviewText();
}
*/
}
