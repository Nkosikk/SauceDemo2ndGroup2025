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
    public void clickAddToCart() throws InterruptedException {
        Thread.sleep(2000);

        addToCart.AddToCart();
        //takeScreenshots.takesSnapShot(driver,"Add To Cart");
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickAddToCart2() throws InterruptedException {
        Thread.sleep(2000);
        addToCart.AddToCart2();
        takeScreenshots.takesSnapShot(driver, "Add To Cart");
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickShoppingCartContainer() throws InterruptedException {
        Thread.sleep(2000);
        shoppingCart.ShoppingCart();
        takeScreenshots.takesSnapShot(driver, "Shopping Cart");
    }

    @Test(dependsOnMethods = "clickShoppingCartContainer")
    public void clickCheckOutButton() throws InterruptedException {
        Thread.sleep(2000);
        checkoutButton.CheckOut();
        takeScreenshots.takesSnapShot(driver, "Check Out");
    }

    @Test(dependsOnMethods = "clickCheckOutButton")
    public void enterFirstName(){
        continueButton.enterFirstName("Sifiso");
    }
    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName(){
        continueButton.enterLastName("Qwabe");
    }
    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        continueButton.enterPostalCode("3950");
    }
    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinue() throws InterruptedException {
        Thread.sleep(2000);
        takeScreenshots.takesSnapShot(driver, "User Info Page");
        continueButton.clickContinueButton();
        takeScreenshots.takesSnapShot(driver, "Continue Page");

    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
