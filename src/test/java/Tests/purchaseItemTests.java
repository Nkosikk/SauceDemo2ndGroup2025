package Tests;

import Pages.UserInfo;
import Utils.ReadFromExcel;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
public class purchaseItemTests extends Base {
    @Test
    public void enterUsernameTests() throws IOException, InterruptedException {
        Thread.sleep(2000);
        loginPage.enterUsername(readFromExcel.username);

    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() throws IOException {
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
    public void enterFirstName()throws IOException {
        continueButton.enterFirstName(readFromExcel.firstName);
    }

    @Test(dependsOnMethods = "enterFirstName")

    public void enterLastName()throws IOException {
        continueButton.enterLastName(readFromExcel.lastName);
    }

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode()throws IOException {
        continueButton.enterPostalCode(readFromExcel.postalCode);
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
