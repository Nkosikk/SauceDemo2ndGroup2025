package Tests;

import Pages.AddToCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OldPurchaseItems extends Base{



        @Test
        public void enterUsernameTests() {
            loginPage.enterUsername(readFromExcel.username);
        }

        @Test(dependsOnMethods = "enterUsernameTests")
        public void enterPasswordTests() {
            loginPage.enterPassword(readFromExcel.password);
        }

        @Test(dependsOnMethods = "enterPasswordTests")
        public void clickLoginTests() {

            loginPage.clickLoginButton();
        }

        @Test(dependsOnMethods = "clickLoginTests")
        public void verifyLoginSuccess() {
            landingPage.verifyPageTitle();
            takeScreenshots.takesSnapShot(driver, "Landing Page");

        }

        @Test(dependsOnMethods = "verifyLoginSuccess")
        public void add1stItemTests() {
            addToCartPage.add1stItem();
            takeScreenshots.takesSnapShot(driver, "Landing Page");

        }

        @Test(dependsOnMethods = "add1stItemTests")
        public void cartItemCheck() {
            cartPage.isItemInCart();
            takeScreenshots.takesSnapShot(driver, "Landing Page");

        }

        @AfterTest
        public void closeBrowser() {
            driver.quit();
        }
    }












