package Tests;

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
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
        landingPage.clickAddToCartSauceLabsBikeLight();
        landingPage.clickAddToCartSauceLabsFleeceJacket();
        landingPage.clickCart();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void cartPageTests() {
        takeScreenshots.takesSnapShot(driver, "Cart Page");
        cartPage.verifyYourCartText();
        cartPage.clickCheckoutButton();
    }

    @Test(dependsOnMethods = "cartPageTests")
    public void checkoutInfoPageTests() {
        checkoutInfoPage.setYourInfoText_xpath();
        checkoutInfoPage.setFirstName("Neo");
        checkoutInfoPage.setLastName("Neo");
        checkoutInfoPage.setPostalCode("0022");
        takeScreenshots.takesSnapShot(driver, "Checkout Info Page");
        // checkoutInfoPage.clickContinueButton();
    }

    @Test(dependsOnMethods = "checkoutInfoPageTests")
    public void CheckoutOverview() {
        checkoutoverview.verifyCheckoutOverviewText();
        takeScreenshots.takesSnapShot(driver, "Checkout Overview Page");
        //checkoutOverview.clickFinishButton();
    }

    //@Test(dependsOnMethods = "checkoutinfoPageTests")
    //public void CheckoutOverview() {
       // checkoutoverview.verifyCheckoutOverviewText();
       // takeScreenshots.takesSnapShot(driver, "Checkout Overview Page");
        // checkoutOverview.clickFinishButton();
    }


    //}


   // @Test(dependsOnMethods = "enterFirstNameTests")
    //public void clickContinueTests() {
       // cartPage.clickContinueButton();
    //}
//}


    //@AfterTest
    //public void closeBrowser(){
    //driver.quit();
    //}

//}}