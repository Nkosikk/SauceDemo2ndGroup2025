package Tests;

import Pages.LandingPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class purchaseItemTests extends Base {

    @Test
    public void enterUsernameTest() {
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest() {
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginButtonTest() {
        loginPage.clickLoginButton();

        takeScreenshots.takesSnapShot(driver, "LoginPage");
    }
    @Test(dependsOnMethods = "enterPasswordTest")
    public void verifyProductTextTest() {
        landingPage.verifyProductText();

        takeScreenshots.takesSnapShot(driver, "LandingPage");
    }
    @Test(dependsOnMethods = "verifyProductTextTest")
    public void clickAddToCartTest() {
        addToCart.clickAddToCart();

        takeScreenshots.takesSnapShot(driver, "AddToCart");
    }
    @Test(dependsOnMethods = "clickAddToCartTest")
    public void verifyYourCartTest() {
        verifyYourCartPage.VerifyItemsDisplayed();

    takeScreenshots.takesSnapShot(driver, "VerifyYourCart");
    }
    @Test(dependsOnMethods = "verifyYourCartTest")
    public void verifyCheckOutPageTest() {
        verifyCheckOutPage.clickCheckout();

        takeScreenshots.takesSnapShot(driver, "CheckOutButton");
    }
    @Test(dependsOnMethods = "verifyCheckOutPageTest")
    public void verifyInformationPageTest() {

    takeScreenshots.takesSnapShot(driver, "verifyInformationPage");

    }
    @Test(dependsOnMethods = "verifyInformationPageTest")
    public void enterFirstNameTest() {
        verifyInformationPage.enterFirstName(readFromExcel.firstname);

        takeScreenshots.takesSnapShot(driver, "FirstName");
    }

    @Test(dependsOnMethods = "verifInformationPageTest")
    public void enterLastNameTest() {
        verifyInformationPage.enterLastName(readFromExcel.lastname);
    }

    @Test(dependsOnMethods = "verifyInformationPageTest")
    public void enterPostalCodeTest() {
        verifyInformationPage.enterPostalCode(readFromExcel.zip);

        takeScreenshots.takesSnapShot(driver, "Details");
    }
    @Test(dependsOnMethods = {"enterFirstNameTests","enterLastNameTests","enterPostalCodeTest"})
    public void clickContinueButtonTest() {
        verifyInformationPage.clickContinueButton();

        takeScreenshots.takesSnapShot(driver, "ContinueButton");

    }

    @Test(dependsOnMethods = "verifySauceLabsBackpackProductIsDisplayedInCheckOverviewPageTest")
    public void verifyItemTotalPlusTaxTest(){
        checkOutOverviewPage.verifyItemTotalPlusTax();

        takeScreenshots.takesSnapShot(driver, "ItemTotalPlusTax");
    }

    @Test(dependsOnMethods = "verifyItemTotalPlusTaxTest")
    public void clickFinishButtonTest(){
        checkOutOverviewPage.clickFinishButton();
    }

   @Test(dependsOnMethods = "clickFinishButtonTest")
   public void clickBackHomeTest(){
        verifyCompletePurchasePage.clickBackHomeButton();

       takeScreenshots.takesSnapShot(driver, "BackHomeButton");

    }

    @Test(dependsOnMethods = {"clickBackHomeTest"})
    public void clickBurgerMenuButtonTest() {
        verifyCompletePurchasePage.clickBurgerMenuButton();
    }

    @Test(dependsOnMethods = {"clickBurgerMenuButtonTest"})
    public void clickLogoutFromBurgerMenu() {
        verifyCompletePurchasePage.clickLogoutButton();
    }
}