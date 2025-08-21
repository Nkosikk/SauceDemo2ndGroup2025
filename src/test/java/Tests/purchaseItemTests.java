package Tests;

import Pages.LandingPage;
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
    public void addItemToCartTEST(){
        landingPage.addItemToCart();
    }
    @Test(dependsOnMethods = "addItemToCartTEST")
    public void NavigateToCartTEST (){
        landingPage.NavigateToCart();
    }
    @Test(dependsOnMethods = "NavigateToCartTEST")
    public void VerifyCartContainerTEST(){
        takeScreenshots.takesSnapShot(driver,"Cart page");
        cartPage.VerifyCartContainer();
    }
    @Test(dependsOnMethods ="VerifyCartContainerTEST")
    public void ClickCheckoutButtonTEST(){
        cartPage.ClickCheckoutButton();
    }
    @Test(dependsOnMethods ="ClickCheckoutButtonTEST")
    public void verifyCheckout(){
        takeScreenshots.takesSnapShot(driver,"Checkout Page");
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
