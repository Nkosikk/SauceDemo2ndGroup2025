package Tests;


import Pages.CheckoutinformationPage;
import Pages.Checkoutoverview;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



@Test
public class purchaseItemTests extends Base {


    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
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
        landingPage.clickAddToCartSauceLabsBackpack();
        landingPage.clickCart();
    }
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void cartPageTests() {
        cartPage.verifyYourCartText();
        takeScreenshots.takesSnapShot(driver, "Cart Page");
        cartPage.clickCheckoutButton();
    }
    @Test(dependsOnMethods = "cartPageTests")
    public void checkoutInformationPageTests() {
        checkoutinformationPage.setYourInformationText_xpath();
        checkoutinformationPage.setFirstName("Molatelo");
        checkoutinformationPage.setLastName_id("Pohotona");
        checkoutinformationPage.setPostalCode_id("1459");
        takeScreenshots.takesSnapShot(driver, "Checkout Information Page");
        checkoutinformationPage.clickContinueButton();


    }
    @Test(dependsOnMethods = "checkoutInformationPageTests")
    public void Checkoutoverview() {
        checkoutoverview.clickFinishButton();
        takeScreenshots.takesSnapShot(driver, "Checkout Overview Page");
    }
}

   //@AfterTest
    //public void closeBrowser(){
        //driver.quit();
    //}







