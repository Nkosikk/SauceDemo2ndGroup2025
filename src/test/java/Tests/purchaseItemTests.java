package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



@Test
public class purchaseItemTests extends Base{


    public void enterUsernameTests(){
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests(){
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        landingPage.verifyProductText();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
