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
    public void addToCart(){
       cartPage.addToCart();
       takeScreenshots.takesSnapShot(driver,"Add To Cart");

    }

    @Test(dependsOnMethods = "addToCart")
    public void clickCheckoutButton(){
        cartPage.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "clickCheckoutButton")
    public void enterFirstname(){
    checkoutPage.enterFirstname(readFromExcel.firstName);
    }

   @Test(dependsOnMethods = "enterFirstname")
    public void enterLastname(){
        checkoutPage.enterLastname(readFromExcel.lastName);
    }
    @Test(dependsOnMethods = "enterLastname")
    public void enterPostalCode() {
        checkoutPage.enterPostalcode(readFromExcel.postalCode);
        takeScreenshots.takesSnapShot(driver,"Checkout Information");
        checkoutPage.clickContinueButton();

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
