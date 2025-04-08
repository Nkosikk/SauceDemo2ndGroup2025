package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class purchaseItemTests extends Base {

    @BeforeTest
    public void setUp() {
        // Initialize any required setup here
    }

    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.verifyProductText();
    }
    @Test (dependsOnMethods = "verifyLoginSuccess")
    public void addItemToCart() {
        landingPage.addTwoItemsToCart();
        takeScreenshots.takesSnapShot(driver, "Add Item to Cart");
            }
    @Test (dependsOnMethods = "addItemToCart")
    public void clickShoppingCart() {
        landingPage.clickShoppingCart();
        takeScreenshots.takesSnapShot(driver, "Shopping Cart");
    }
    @Test (dependsOnMethods = "clickShoppingCart")
    public void clickCheckout() {
        cartPage.clickCheckoutButton();
        takeScreenshots.takesSnapShot(driver, "Checkout");
    }
    @Test (dependsOnMethods = "clickCheckout")
    public void enterCheckoutDetails() {
        checkoutDetailsPage.enterFirstName("John");
        checkoutDetailsPage.enterLastName("Doe");
        checkoutDetailsPage.enterPostalCode("12345");
        takeScreenshots.takesSnapShot(driver, "Checkout Details");
    }
    @Test (dependsOnMethods = "enterCheckoutDetails")
    public void clickContinue() {
        checkoutDetailsPage.clickContinueButton();
        takeScreenshots.takesSnapShot(driver, "Checkout Overview");
    }
    @Test (dependsOnMethods = "clickContinue")
    public void clickFinish() {
        checkoutOverviewPage.clickFinishButton();
        takeScreenshots.takesSnapShot(driver, "Order Confirmation");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
