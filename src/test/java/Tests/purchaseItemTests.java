package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


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
    public void addToCartTest(){
        landingPage.addToCart();
    }
    @Test(dependsOnMethods = "addToCartTest")
    public void clickCartTests(){
        landingPage.clickCart();
    }

    @Test(dependsOnMethods = "clickCartTests")
    public void informationPageTests(){
        informationPage.enterFirstName(readFromExcel.firstName);
        informationPage.enterLastName(readFromExcel.lastName);
        informationPage.enterPostalCode(readFromExcel.postalCode);
    }

    @Test(dependsOnMethods = "informationPageTests")
    public void clickCheckOutTests(){
        takeScreenshots.takesSnapShot(driver, "Information Page");
        cartPage.proceedToCheckout();

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
