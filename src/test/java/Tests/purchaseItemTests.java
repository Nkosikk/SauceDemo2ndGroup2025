package Tests;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.CheckoutPage;
import Pages.YourInformationPage;
import Pages.CheckoutOverviewPage;
import Pages.BackHomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base
{
    public void enterUsernameTests()
    {
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
    public void verifyLoginSuccessTests()
    {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
    }

    //Product Page
    @Test
    public void ProductPageTests()
    {
       productPage.addToCartPack("addtocartsaucelabsbackpack_id");
       productPage.addToCartLight("addtocartsaucelabsbikelight_id");
       takeScreenshots.takesSnapShot(driver, "Purchased Items");
    }
    @Test
    public void clickCartContainerTests()
    {
        takeScreenshots.takesSnapShot(driver, "Product Page");
        productPage.clickShoppingCartContainer();
    }
/*
    //CheckoutPage
    @Test
    public void clickCheckoutButton() {
        takeScreenshots.takesSnapShot(driver, "Checkout Page");
        checkoutPage.ClickCheckoutButton();
    }

    //YourInformationPage
    @Test
    public void enterFirstNameTests()
    {
        yourInformationPage.enterFirstname("Babongile");
    }
    @Test(dependsOnMethods = "enterFirstNameTests")
    public void enterLastNameTests() {
        yourInformationPage.enterLastname("Mpungose");
    }
    @Test(dependsOnMethods = "enterLastNameTests")
    public void enterPostalCodeTests() {
        yourInformationPage.enterPostalcode("2188");
    }
    @Test(dependsOnMethods = "enterPostalCodeTests")
    public void clickContinueButtonTests() {
        takeScreenshots.takesSnapShot(driver, "YourInformation Page");
        yourInformationPage.clickContinueButton();
    }

    //CheckoutOverviewPage
    public void clickFinishButtonTests() {
        takeScreenshots.takesSnapShot(driver, "CheckoutOverview Page");
        checkoutoverviewPage.clickFinishButton();
    }

    //BackHomePage
    @Test
    public void clickBackHomeButton() {
        backhomePage.ClickBackHomeButton();
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }*/

}
