package Tests;

import Utils.ReadFromExcel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base{

    @Test
    public void enterUsernameTests(){
        loginPage.enterUsername(ReadFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        loginPage.enterPassword(ReadFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests(){
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void AddItemsToTheCartTest(){
        landingPage.AddItemsToTheCart();
    }

    @Test(dependsOnMethods = "AddItemsToTheCartTest")
    public void navigateToCartTest(){
        takeScreenshots.takesSnapShot(driver,"Add Items to Cart");
        landingPage.navigateToCart();
    }

    @Test(dependsOnMethods = "navigateToCartTest")
    public void verifyYourCartContainerTest(){
        takeScreenshots.takesSnapShot(driver,"Your Cart");
        yourCartPage.verifyYourCartContainer();
    }

    @Test(dependsOnMethods = "verifyYourCartContainerTest")
    public void clickCheckoutButtonTest(){
        yourCartPage.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "clickCheckoutButtonTest")
    public void verifyCheckout(){
        checkoutPage.verifyCheckout();
    }

    @Test(dependsOnMethods = "verifyCheckout")
    public void enterFirstNameTest(){
        checkoutPage.enterFirstName(ReadFromExcel.firstName);
    }

    @Test(dependsOnMethods = "enterFirstNameTest")
    public void enterLastNameTest(){
        checkoutPage.enterLastName(ReadFromExcel.lastName);
    }

    @Test(dependsOnMethods = "enterLastNameTest")
    public void enterPostalCodeTest(){
        checkoutPage.enterPostalCode(ReadFromExcel.postalCode);
    }

    @Test(dependsOnMethods = "enterPostalCodeTest")
    public void clickContinueButtonTest(){
        takeScreenshots.takesSnapShot(driver,"Checkout");
        checkoutPage.clickContinueButton();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
