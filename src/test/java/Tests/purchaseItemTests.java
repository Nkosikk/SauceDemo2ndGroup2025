package Tests;

import Pages.YourCartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test

public class purchaseItemTests extends Base {

    @Test(priority = 0)
    public void enterUsername() throws InterruptedException {
        loginPage.enterUsername("standard_user");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void enterPassword() throws InterruptedException {
        loginPage.enterPassword("secret_sauce");
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void clickLoginButton() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void VerifyProductText() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Products Page");
        landingPage.verifyProductText();
        Thread.sleep(1000);
    }

    @Test(priority = 4)
    public void selectItem() throws InterruptedException {
        landingPage.selectItem();
        Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void selectItem1() throws InterruptedException {
        landingPage.selectItem1();
        Thread.sleep(1000);
    }

    @Test(priority = 6)
    public void selectItem2() throws InterruptedException {
        landingPage.selectItem2();
        Thread.sleep(1000);
    }

    @Test(priority = 7)
    public void selectItem3() throws InterruptedException {
        landingPage.selectItem3();
        Thread.sleep(1000);
    }

    @Test(priority = 8)
    public void selectItem4() throws InterruptedException {
        landingPage.selectItem4();
        Thread.sleep(1000);
    }

    @Test(priority = 9)
    public void selectItem5() throws InterruptedException {
        // takeScreenshots.takesSnapShot(driver,"Number of items in Your Cart Page");
        landingPage.selectItem5();
        Thread.sleep(1000);
    }

    @Test(priority = 10)
    public void clickShoppingCart() throws InterruptedException {
        landingPage.clickShoppingCart();
        Thread.sleep(1000);
    }

    @Test(priority = 11)
    public void VerifyYourCartPage() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Your Cart Page");
        yourCartPage.verifyYourCartText();
        Thread.sleep(1000);
    }

    @Test(priority = 12)
    public void clickCheckout() throws InterruptedException {
        yourCartPage.clickCheckout();
        Thread.sleep(1000);
    }

    @Test(priority = 13)
    public void VerifyYourInformationPage() throws InterruptedException {
        yourInformationPage.verifyYourInformationText();
        Thread.sleep(1000);
    }

    @Test(priority = 14)
    public void enterFirstName() throws InterruptedException {
        yourInformationPage.enterFirstName("Aviwe");
        Thread.sleep(1000);
    }

    @Test(priority = 15)
    public void enterLastName() throws InterruptedException {
        yourInformationPage.enterLastName("Automation Tester");
        Thread.sleep(1000);
    }

    @Test(priority = 16)
    public void enterPostalCode() throws InterruptedException {
        yourInformationPage.enterPostalCode("12345");
        Thread.sleep(1000);
    }

    @Test(priority = 17)
    public void clickContinue() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Your Information Page");
        yourInformationPage.clickContinue();
        Thread.sleep(1000);
    }

    @Test(priority = 18)
    public void VerifyOverviewPage() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Your Overview Page");
        checkoutOverviewPage.verifyOverviewText();
        Thread.sleep(1000);
    }

   @Test(priority = 19)
    public void clickfinish() throws InterruptedException {
        checkoutOverviewPage.clickfinish();
        Thread.sleep(1000);
    }
    @Test(priority = 20)
    public void VerifyCompletePage() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Your Complete Page");
        checkoutCompletePage.verifyCompleteText();
        Thread.sleep(1000);
    }

    @AfterTest
    public void closeBrowser(){
    driver.quit();
     }

}