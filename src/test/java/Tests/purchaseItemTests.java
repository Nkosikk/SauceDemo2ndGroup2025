package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



@Test
public class purchaseItemTests extends Base{


    public void enterUsernameTests(){
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

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
