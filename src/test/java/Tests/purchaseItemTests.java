package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;


@Test
public class purchaseItemTests extends Base{



    public void enterUsernameTests(){
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() throws IOException {
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() throws IOException {
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addProductToCart(){
        landingPage.clickAddToCart();
    }

    @Test(dependsOnMethods = "addProductToCart")
    public void clickShoppingCart(){
        landingPage.clickshopping_cart_container();
    }

    @Test(dependsOnMethods = "clickShoppingCart")
    public void clickCheckoutButtonTest(){
        yourCart.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "clickCheckoutButtonTest")
    public void verifyTotalTest(){
        yourCart.enterFirstName();
        yourCart.enterLastName();
        yourCart.enterPostalCode();
        yourCart.clickContueButton();
        yourCart.validateTotal();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
