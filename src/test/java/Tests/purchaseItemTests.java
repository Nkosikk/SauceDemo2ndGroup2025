package Tests;

import Pages.YourCartPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class purchaseItemTests extends Base {


    @Test(priority = 0)
    public void enterUsernameTests() throws InterruptedException {
        loginPage.enterUsername(readFromExcel.username);
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void enterPasswordTests() throws InterruptedException {
        loginPage.enterPassword(readFromExcel.password);
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void clickLoginTests() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
        Thread.sleep(1000);
    }

    //verifying Product page - successful login
    @Test(priority = 3)
    public void verifyProductText() throws InterruptedException {
        landingPage.verifyProductText();
        Thread.sleep(1000);

    }
// adding item 1 to cart

    @Test(priority = 4)
    public void addItem1() throws InterruptedException {
        landingPage.addItem1();
        Thread.sleep(1000);

    }

    // adding item 2 to cart
    @Test(priority = 5)
    public void addItem2() throws InterruptedException {
        landingPage.addItem2();
        Thread.sleep(1000);

    }

    // adding item 3 to cart
    @Test(priority = 6)
    public void addItem3() throws InterruptedException {
        //takeScreenshots.takesSnapShot(driver,"Cart Page");
        landingPage.addItem3();
        Thread.sleep(1000);
    }

    // Click Shopping Cart Container
    @Test(priority = 7)
    public void clickShoppingCart() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Cart Page");
        landingPage.clickShoppingCartContainer();
        Thread.sleep(1000);
    }

    //Click Checkout Button
    @Test(priority = 8)
    public void clickCheckout() throws InterruptedException {
        takeScreenshots.takesSnapShot(driver, "Checkout Page");
        yourcartPage.clickCheckoutButton();
        Thread.sleep(1000);

    }

    //Verify Checkout Your Information
    @Test(priority = 9)
    public void verifyYourInformation() throws InterruptedException {
        checkoutyourinformationPage.verifyCheckOutYourInformationPage();
        Thread.sleep(1000);
    }

    //Enter First Name
    @Test(priority = 10)
    public void enterFirstName() throws InterruptedException {
        checkoutyourinformationPage.enterFirstName("Phelo");
        Thread.sleep(1000);
    }

    //Enter Last Name
    @Test(priority = 11)
    public void enterLastName() throws InterruptedException {
        checkoutyourinformationPage.enterLastName("Zwedala");
        Thread.sleep(1000);
    }

    //Enter Postal Code
    @Test(priority = 12)
    public void enterPostalCode() throws InterruptedException {
        checkoutyourinformationPage.enterPostalCode("5001");
        Thread.sleep(1000);
    }

    //Click Continue Button
    @Test(priority = 13)
    public void clickContinueButton() throws InterruptedException {
        checkoutyourinformationPage.clickContinueButton();
        Thread.sleep(1000);
    }

    //Verify Checkout Overview
    @Test(priority = 14)
    public void verifyCheckoutOverview() throws InterruptedException {
        checkoutoverviewpage.verifyCheckOutOverviewPage();
        Thread.sleep(1000);
    }

    //Click Finish Button
    @Test(priority = 15)
    public void clickFinishButton() throws InterruptedException {
        checkoutoverviewpage.clickFinishButton();
        Thread.sleep(1000);
    }

    //Verify Checkout Complete
    @Test(priority = 16)
    public void verifyCheckoutComplete() throws InterruptedException {
        checkoutcompletepage.verifyCheckOutCompletePage();
        Thread.sleep(1000);
    }

    //Click Back Home Button
    @Test(priority = 17)
    public void clickBackHomeButton() throws InterruptedException {
        checkoutcompletepage.clickBackHomeButton();
        Thread.sleep(1000);
    }

    //Verify Product Page
    @Test(priority = 18)
    public void verifyProductPage() throws InterruptedException {
        landingPage.verifyProductText();
        Thread.sleep(1000);
    }

    //Click Side Menu
    @Test(priority = 19)
    public void clickSideMenu() throws InterruptedException {
        landingPage.clickSideMenu();
        Thread.sleep(1000);
    }

    //Click Logout Button
    @Test(priority = 20)
    public void clickLogoutButton() throws InterruptedException {
        landingPage.clickLogout();
        Thread.sleep(1000);
    }


}
















