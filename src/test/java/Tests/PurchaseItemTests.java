package Tests;

import Pages.CheckoutDetailsPage;
import Utils.ReadFromExcel;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class PurchaseItemTests extends Base {

    public void enterUsernameTests() {
        loginPage.enterUsername(ReadFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(ReadFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        takeScreenshots.takesSnapShot(driver, "Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess() {
                landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void addTwoItemsToCartTests() {
        takeScreenshots.takesSnapShot(driver, "Landing Page");
        landingPage.addTwoItemsToCart();
    }

    @Test(dependsOnMethods = "addTwoItemsToCartTests")
    public void clickShoppingCartTests() {
        landingPage.clickShoppingCart();
    }

    @Test(dependsOnMethods = "clickShoppingCartTests")
    public void clickCheckoutTests() {
        takeScreenshots.takesSnapShot(driver, "Cart Page");
        cartPage.clickCheckoutButton();
    }


@Test (dependsOnMethods = "clickCheckoutTests")
  public void enterFirstNameTests ()
{checkoutDetailsPage.enterFirstName(ReadFromExcel.firstname);}

    @Test (dependsOnMethods = "enterFirstNameTests")
    public void enterLastNameTests ()
    {checkoutDetailsPage.enterLastName(ReadFromExcel.lastname);}

    @Test (dependsOnMethods = "enterLastNameTests")
    public void enterPostalCodeTests ()
    {checkoutDetailsPage.enterPostalCode(ReadFromExcel.postalCode);
     takeScreenshots.takesSnapShot(driver, "CheckoutDetails Page");}

    @Test (dependsOnMethods = "enterPostalCodeTests")
    public void clickContinueButtonTests ()
    {
        checkoutDetailsPage.clickContinueButton();
    }

    @Test (dependsOnMethods = "clickContinueButtonTests")
    public void clickFinishButtonTests ()
    {
        checkoutOverviewPage.clickFinishButton();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}