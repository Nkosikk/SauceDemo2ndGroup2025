package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base{

    public void enterUsernameTests() {
        loginPage.enterUsername("standard_user");
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword("secret_sauce");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginButtonTests(){
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }
    /* login page ends */

    /* landing page */
    @Test(dependsOnMethods = "clickLoginButtonTests")
    public void verifyLoginSuccess(){
        landingPage.isProductsDisplayed();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCartButtonTests(){
        landingPage.AddToCartButton();
    }

    @Test(dependsOnMethods = "clickAddToCartButtonTests")
    public void ClickCartTests(){
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.ClickCart();
    }
    /* landing page ends */

    /* cart page */
    @Test(dependsOnMethods = "ClickCartTests")
    public void verifyIfYourCartTextExists(){
        cartPage.isYourCartTextDisplayed();
    }

    @Test(dependsOnMethods = "verifyIfYourCartTextExists")
    public void verifyItemInCart(){
        cartPage.isItemDisplayed();
    }

    @Test(dependsOnMethods = "verifyItemInCart")
    public void clickCheckoutButtonTests(){
        takeScreenshots.takesSnapShot(driver,"Cart Page");
        cartPage.Checkout();
    }
    /* cart page ends */

    /* checkout page */
    @Test(dependsOnMethods = "clickCheckoutButtonTests")
    public void verifyIfCheckoutTextExists(){
        checkoutPage.isCheckoutTextDisplayed();
    }

    @Test(dependsOnMethods = "verifyIfCheckoutTextExists")
    public void enterFirstNameTests(){
        checkoutPage.enterFirstName("Ntsako");
    }

    @Test(dependsOnMethods = "enterFirstNameTests")
    public void enterLastNameTests(){
        checkoutPage.enterLastName("Makaringi");
    }

    @Test(dependsOnMethods = "enterLastNameTests")
    public void enterPostalCodeTests(){
        checkoutPage.enterPostalCode("2191");
    }

    @Test(dependsOnMethods = "enterPostalCodeTests")
    public void clickContinueButtonTests(){
        takeScreenshots.takesSnapShot(driver,"Checkout Page");
        checkoutPage.clickContinueButton();
    }
    /* checkout page ends */

    /* overview page */
    @Test(dependsOnMethods = "clickContinueButtonTests")
    public void verifyIfDescriptionTextExist(){
        checkoutOverviewPage.isDescriptionTextDisplayed();
    }

    //@Test(dependsOnMethods = "verifyIfDescriptionTextExist")
    public void calculateTotalPriceWithTax(){
        checkoutOverviewPage.calculateTotalPriceWithTax();
    }

    @Test(dependsOnMethods = "verifyIfDescriptionTextExist")
    public void ClickFinishButtonTests(){
        takeScreenshots.takesSnapShot(driver,"Checkout Overview Page");
        checkoutOverviewPage.ClickFinishButton();
    }
    /* Checkout overview page ends */

    /* Checkout complete page and Logout */

    @Test(dependsOnMethods = "ClickFinishButtonTests")
    public void verifyIfThankUTextExist(){
        checkoutCompletePage.isThankYouMsgDisplayed();
    }

    @Test(dependsOnMethods = "verifyIfThankUTextExist")
    public void ClickBurgerMenuTests(){
        checkoutCompletePage.ClickBurgerMenu();
    }

    @Test(dependsOnMethods = "ClickBurgerMenuTests")
    public void ClickLogoutButtonTests(){
        takeScreenshots.takesSnapShot(driver,"Checkout Complete Page");
        checkoutCompletePage.ClickLogoutButton();
    }

    /* Checkout complete page and Logout ends */

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}

