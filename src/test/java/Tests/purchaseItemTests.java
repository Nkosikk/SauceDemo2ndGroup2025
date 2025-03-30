package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base{

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

    //Product Page
    @Test
    public void AddToCartPack()
    {
        productPage.addToCartPack("addtocartsaucelabsbackpack_id");
    }
    @Test
    public void AddToCartLight()
    {
        productPage.addToCartLight("addtocartsaucelabsbacklight_id");
    }
    @Test
    public void clickCartContainer()
    {
        takeScreenshots.takesSnapShot(driver,"Product Page");
        productPage.clickShoppingCartContainer();
    }

    //YourCartCheckout
    @Test
    public void clickCheckoutButton()
    {
        takeScreenshots.takesSnapShot(driver,"Checkout Page");
        checkoutPage.clickCheckoutButton();
    }

    //BackHomePage
   /* @Test
     public void clickBackHomeButton()
    {
        backhomePage.ClickBackHomeButton();
    }*/

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
