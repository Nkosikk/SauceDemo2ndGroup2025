package Tests;

import Pages.AddToCartPage;
import Pages.YourCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername(readFromExcel.username);
        //loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(readFromExcel.password);
        //loginPage.enterPassword("secret_sauce");
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
    //Add to Cart
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCartTest() {
        addToCartPage.AddToCartBackPack("addtocartsaucelabsbackpack_id");
        addToCartPage.AddToCartBikeLight("addtocartsaucelabsbikelight_id");
        addToCartPage.clickShoppingCartContainer();
        takeScreenshots.takesSnapShot(driver, "Cart Page");
    }
    //View your cart
    @Test(dependsOnMethods = "clickAddToCartTest")
    public void clickCheckoutButtonTest()
    {
        yourCartPage.clickCheckoutButton();
        takeScreenshots.takesSnapShot(driver, "Your Cart Page");
    }

    @Test(dependsOnMethods = "clickCheckoutButtonTest")
    public void YourInformationPageTests()
    {
        yourInformationPage.enterFirstname("Babongile");
        yourInformationPage.enterLastname("Mpungose");
        yourInformationPage.enterPostalcode("2188");
        yourInformationPage.clickContinueButton();
        takeScreenshots.takesSnapShot(driver, "Your Information Page");
    }
}
   /* @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
public void YourCartTests()
{
    yourCartPage.ClickCheckoutButton();
    takeScreenshots.takesSnapShot(driver, "Your Cart Page");
}
public void enterFirstnameTests()
{
    YourInformationPage.enterFirstname("Babongile");
}
@Test(dependsOnMethods = "enterFirstnameTests")
public void enterLastnameTests()
{
    YourInformationPage.enterLastname("Mpungose");
}
@Test(dependsOnMethods = "enterLastnameTests")
public void enterPostalCodeTests()
{
    YourInformationPage.enterPostalCode("2188");
}
public void clickContinueTests()
{
    takeScreenshots.takesSnapShot(driver,"YourInformation Page");
    YourInformationPage.clickContinueButton();
}
@Test(dependsOnMethods = "clickContinueTests")
public void verifyCheckoutOverview()
{
    takeScreenshots.takesSnapShot(driver,"Checkout Overview Page");
    CheckoutOverviewPage.verifyCheckoutOverviewText();
}
public void ClickFinishButtonTests()
{
    takeScreenshots.takesSnapShot(driver,"BackHome Page");
    CheckoutOverviewPage.clickFinishButton();
}
public void ClickBackHomeButtonTests()
{
    BackHomePage.ClickBackHomeButton();
    takeScreenshots.takesSnapShot(driver,"Product Page");
}
}*/


