package Tests;

import Pages.CartPage;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



@Test
public class purchaseItemTests extends Base {
    @Test


    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    //@Test(priority = 1)
    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
        landingPage.clickAddToCartSauceLabsBackpack();
        landingPage.clickCart();
    }
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void cartPageTests() {
        cartPage.verifyYourCartText();
        takeScreenshots.takesSnapShot(driver, "Cart Page");
        cartPage.clickCheckoutButton();
    }
}

   //@AfterTest
    //public void closeBrowser(){
        //driver.quit();
    //}







