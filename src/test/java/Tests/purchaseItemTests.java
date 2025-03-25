package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static Utils.BrowserFactory.driver;

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
            takeScreenshots.takesSnapShot(driver,"Login Page");
            loginPage.clickLoginButton();
        }

        @Test(dependsOnMethods = "clickLoginTests")
        public void verifyLoginSuccess(){
            takeScreenshots.takesSnapShot(driver,"Landing Page");
            productsPage.verifyProductText();
        }


        @AfterTest
        public void closeBrowser(){
            driver.quit();
}
