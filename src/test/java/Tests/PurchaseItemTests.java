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
    public void  AddToCartTests()
    {
        addToCartPage.ClickAddToCart("addtocartsaucelabsbackpack_id");
        addToCartPage.ClickAddToCart("addtocartsaucelabsbikelight_id");
        //takeScreenshots.takesSnapShot(driver, "Purchased Items");
    }
    @Test
    public void ShoppingCartContainerTests()
    {
        addToCartPage.ClickAddToCart("shoppingcartcontainer_id");
        //takeScreenshots.takesSnapShot(driver, "Your Cart");
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

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }

}*/

package Tests;

import Pages.AddToCartPage;
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
    //Addtocart
    @Test(dependsOnMethods = "clickAddToCart")
    public void clickAddToCart(){

       /* addToCartPage.AddToCartBackPack("addtocartsaucelabsbackpack_id");
        addToCartPage.AddToCartBikeLight("addtocartsaucelabsbikelight_id");

        addToCartPage.addtocartsaucelabsbackpack_id.click();

        addToCartPage.AddToCartBackPack("addtocartsaucelabsbackpack_id")
        addToCartPage.clickAddToCart("addtocartsaucelabsbackpack_id");
        addToCartPage.clickAddToCart("addtocartsaucelabsbikelight_id");
        //takeScreenshots.takesSnapShot(driver, "Purchased Items");*/

        takeScreenshots.takesSnapShot(driver,"Cart Page");
        addToCartPage.
                AddToCartBackPack("addtocartsaucelabsbackpack_id");
        addToCartPage.checkOutButton();
    }

    @Test
    public void  AddToCartTests()
    {
        addToCartPage.clickbackpackButton()
        addToCartPage.clickAddToCart("addtocartsaucelabsbackpack_id");
        addToCartPage.clickAddToCart("addtocartsaucelabsbikelight_id");
        //addToCartPage.addBackpack("addtocartsaucelabsbackpack_id");
        //addToCartPage.addBikelight("addtocartsaucelabsbikelight_id");
        //takeScreenshots.takesSnapShot(driver, "AddToCart");
    }

    /*@Test
    public void ShoppingCartContainerTests()
    {
        addToCart.ClickAddToCart("shoppingcartcontainer_id");
        //takeScreenshots.takesSnapShot(driver, "Your Cart");
    }*/

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}


