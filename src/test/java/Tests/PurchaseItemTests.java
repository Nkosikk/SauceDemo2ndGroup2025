package Tests;

import Pages.CheckoutPage;
import Pages.ProductPage;
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
        CheckoutPage.ClickCheckoutButton();
        takeScreenshots.takesSnapShot(driver, "Checkout Page");
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }

}
