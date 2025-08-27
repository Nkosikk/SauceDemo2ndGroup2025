package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class purchaseItemTests extends Base{

    public void enterUsernameTests(){
        enterUsernameFromDatabase(3);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        enterPasswordFromDatabase(3);
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
    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void verifyFirstItem(){
        takeScreenshots.takesSnapShot(driver,"First Item");
        landingPage.verifyFirstItem();
    }

    @Test(dependsOnMethods = "verifyFirstItem")
    public void clickAddToCartButton(){
        takeScreenshots.takesSnapShot(driver,"Add to Cart Button");
        landingPage.clickAddToCartButton();
    }
    @Test(dependsOnMethods = "clickAddToCartButton")
    public void clickFleeceJacketButton(){
        takeScreenshots.takesSnapShot(driver,"Fleece Jacket Button");
        landingPage.clickFleeceJacketButton();
    }
    @Test(dependsOnMethods = "clickFleeceJacketButton")
    public void clickOnesieButton(){
        takeScreenshots.takesSnapShot(driver,"Onesie Button");
        landingPage.clickOnesieButton();
    }
    @Test(dependsOnMethods = "clickOnesieButton")
    public void verifyItemsAddedToCart(){
        takeScreenshots.takesSnapShot(driver,"Items Added to Cart");
        landingPage.verifyProductText();
    }
    @Test(dependsOnMethods = "verifyItemsAddedToCart")
    public void clickCartButton(){
        takeScreenshots.takesSnapShot(driver,"Cart Button");
        landingPage.clickBikeLightButton();

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
