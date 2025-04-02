package Tests;

import Pages.AddtocartPage;
import Pages.LoginPage;
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
    @Test(dependsOnMethods = "addToCartTests")
    public void addToCartTests(){
        takeScreenshots.takesSnapShot(driver,"Add to Cart");
        addtocartPage.clickaddtocartButton();
    }

    @Test(dependsOnMethods = "shoppingCartTests")
    public void shoppingCartTests(){
        takeScreenshots.takesSnapShot(driver,"Shopping Cart");
        shoppingCartPage.verifyProductText();
    }
    @Test(dependsOnMethods = "checkoutTests")
    public void checkoutTests(){
        takeScreenshots.takesSnapShot(driver,"Checkout");
        checkoutPage.clickCheckoutButton();
    }
    @Test(dependsOnMethods = "continueTests")
    public void continueTests(){
        takeScreenshots.takesSnapShot(driver,"Continue");
        continuePage.clickContinueButton();
    }
    @Test(dependsOnMethods = "finishTests")
    public void finishTests(){
        takeScreenshots.takesSnapShot(driver,"Finish");
        finishPage.clickFinishButton();
    }
    @Test(dependsOnMethods = "backHomeTests")
    public void backHomeTests(){
        takeScreenshots.takesSnapShot(driver,"Back Home");
        backHomePage.clickBackHomeButton();
    }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
