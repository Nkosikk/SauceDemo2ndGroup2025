package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class purchaseItemTests extends Base{



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
    @Test (dependsOnMethods = "verifyLoginSuccess")
    public void addProductToCart(){
        takeScreenshots.takesSnapShot(driver,"Add to Cart");
    }
    @Test (dependsOnMethods = "addProductToCart")
    public void clickCartButton(){
        takeScreenshots.takesSnapShot(driver,"Click Cart");
    }



    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
