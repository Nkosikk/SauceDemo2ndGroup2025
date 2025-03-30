package Tests;

import Pages.FinishPage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base {
    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests(){
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyHeaderText();
    }
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCart(){
        takeScreenshots.takesSnapShot(driver,"AddToCart");
        add2Cart.clickbackpackButton();
        add2Cart.clickbackbikeButton();
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickCart(){
        takeScreenshots.takesSnapShot(driver,"Cart Page");
        cartPage.cartButton();
        cartPage.checkOutButton();
    }
    @Test(dependsOnMethods = "clickCart")
    public void enterDeliveryInfo(){
        deliveryInfo.enterFirstName("Nozipho");
        deliveryInfo.enterLastName("Mtsweni");
        deliveryInfo.enterPostalCode("1020");
        takeScreenshots.takesSnapShot(driver, "Delivery Info Page");
        deliveryInfo.clickContinueButton();
    }
    @Test(dependsOnMethods = "enterDeliveryInfo")
    public void verifyOverview(){
        takeScreenshots.takesSnapShot(driver, "Overview Page");
        overView.verifyTotal();
    }

    @Test(dependsOnMethods = "verifyOverview")
    public void logoutmenu(){
        logOut.clickMenuButton();
        takeScreenshots.takesSnapShot(driver, "menu Page");
    }
    @Test(dependsOnMethods = "logoutmenu")
    public void logout() {
        logOut.clickLogOutButton();
        takeScreenshots.takesSnapShot(driver, "Logout Page");
    }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}

