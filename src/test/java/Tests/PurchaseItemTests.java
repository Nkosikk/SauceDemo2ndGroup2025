/*package Tests;

import Pages.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base{

    public void enterUsernameTests()
    {
        loginPage.enterUsername("standard_user");
    }
    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests()
    {
        loginPage.enterPassword("secret_sauce");
    }
    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests()
    {
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }
    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess()
    {
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyProductText();
    }
    @Test
    public void  ProductPageTests()
    {
        productPage.ClickAddToCart("addtocartsaucelabsbackpack_id");
        productPage.ClickAddToCart("addtocartsaucelabsbikelight_id");
        takeScreenshots.takesSnapShot(driver, "Purchased Items");
    }
    @Test
    public void ShoppingCartContainerTests()
    {
        productPage.ClickAddToCart("shoppingcartcontainer_id");
        takeScreenshots.takesSnapShot(driver, "Your Cart");
    }

    public void CheckoutTests()
    {
        checkoutPage.ClickCheckoutButton();
        takeScreenshots.takesSnapShot(driver, "Checkout Page");
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

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }

}*/

package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base{

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

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}


