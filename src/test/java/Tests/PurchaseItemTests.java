package Tests;

import Pages.CartPage;
import org.openqa.selenium.devtools.v131.page.model.Screenshot;
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
    public void  CartPageTests()
    {
        cartPage.ClickAddToCart("addtocartsaucelabsbackpack_id");
        cartPage.ClickAddToCart("addtocartsaucelabsbikelight_id");
        takeScreenshots.takesSnapShot(driver, "Purchased Items");
    }
    @Test
    public void ShoppingCartContainerTests()
    {
        CartPage.ClickAddToCart("shoppingcartcontainer_id");
        takeScreenshots.takesSnapShot(driver, "Your Cart");
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }

}
