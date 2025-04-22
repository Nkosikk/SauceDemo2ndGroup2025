package Tests;

import Pages.CheckoutOverview;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class purchaseItemTests extends Base {

    //Testing login functionality
    @Test(priority = 0)
    public void enterUsernameTest() {
        takeScreenshots("LoginPage");
        loginPage.enterUsername(readFromExcel.username);
    }


    @Test(dependsOnMethods = "enterUsernameTest")
    public void enterPasswordTest() {
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTest")
    public void clickLoginButtonTest() {
        loginPage.clickLoginButton();
    }

    //verifying successful login
    @Test(dependsOnMethods = "clickLoginButtonTest")
    public void verifyLoginSuccessTest() {
        String ProductText = loginPage.getLoginSuccessText();
        Assert.assertEquals(ProductText, "Products", "Login was not successful.");
        System.out.println("Test passed: User has successfully logged in.");
    }

    //Testing adding items to Cart
    @Test(dependsOnMethods = "clickLoginButtonTest")
    public void clickAddToCartSauceLabsBackPackTest() {
        takeScreenshots("LandingPage");
        landingPage.clickAddToCartSauceLabsBackPack();
    }

    @Test(dependsOnMethods = "clickAddToCartSauceLabsBackPackTest")
    public void clickAddToCartSauceLabsFleeceJacketTest() {
        landingPage.clickAddToCartSauceLabsFleeceJacket();
    }

    //Verify that items were added to cart
    @Test(dependsOnMethods = "clickAddToCartSauceLabsFleeceJacketTest")
    public void verifyItemsAddedSuccessfullyTest() {
        int numberOfItems = landingPage.getNumberOfItemsInCart();
        Assert.assertTrue(numberOfItems > 0, "No items were added to the cart");
        System.out.println("Test passed: "+ numberOfItems +" items successfully added to cart.");
    }

    @Test(dependsOnMethods = "verifyItemsAddedSuccessfullyTest")
    public void clickShoppingCartTest() {
        landingPage.clickShoppingCart();
    }

    //Verify that items are in cart as on previous page
    @Test(dependsOnMethods = "clickShoppingCartTest")
    public void verifyItemsInCartTest() {
        List<WebElement> itemsInCart = checkoutYourCart.getCartItems();
        Assert.assertTrue(itemsInCart.size() > 0, "No items found in the cart");
        // Add more assertions to verify specific items if needed
        System.out.println("Test passed: Items are present in the cart.");
    }

    //Testing Checkout
    @Test(dependsOnMethods = "verifyItemsInCartTest")
    public void clickCheckoutButtonTest() {
        takeScreenshots("CheckoutYourCartPage");
        checkoutYourCart.clickCheckoutButton();
    }

    //Verify that you are on the information page
    @Test(dependsOnMethods = "clickCheckoutButtonTest")
    public void verifyInfoPageTest() {
        String informationPageText = checkoutInfoPage.getInfoPageHeader();
        Assert.assertEquals(informationPageText, "Checkout: Your Information");
        System.out.println("Test passed: You are on the information page.");
    }


    //Entering information details
    @Test(dependsOnMethods = "verifyInfoPageTest")
    public void enterFirstNameTest() {
        takeScreenshots("InformationPage");
        checkoutInfoPage.enterFirstName("John");
    }

    @Test(dependsOnMethods = "enterFirstNameTest")
    public void enterLastNameTest() {
        checkoutInfoPage.enterLastName("Doe");
    }

    @Test(dependsOnMethods = "enterLastNameTest")
    public void enterZipCodeTest() {
        checkoutInfoPage.enterZipCode("12345");
    }

    @Test(dependsOnMethods = "enterZipCodeTest")
    public void clickContinueButtonTest() {
        checkoutInfoPage.clickContinueButton();
    }

    //Verify that you are on Cart Overview page
//    @Test(dependsOnMethods = "clickContinueButtonTest")
//    public void verifyCartOverviewPageTest() {
//        String cartOverviewPageText = checkoutOverview.getCheckoutOverviewHeader();
//        Assert.assertEquals(cartOverviewPageText, "Checkout: Overview");
//        System.out.println("Test passed: You are on the cart overview page.");
//    }

    //Verify items are still in cart
    @Test(dependsOnMethods = "clickContinueButtonTest")
    public void verifyItemsStillInCart() {
        List<WebElement> itemsStillInCart = checkoutOverview.getCartItems();
        Assert.assertTrue(itemsStillInCart.size() > 0, "No items found in the cart");
        // Add more assertions to verify specific items if needed
        System.out.println("Test passed: Items are present in cart overview.");
    }


    //Finish the order
    @Test(dependsOnMethods = "verifyItemsStillInCart")
    public void clickFinishButtonTest() {
        takeScreenshots("CartOverviewPage");
        checkoutOverview.clickTheFinishButton();
    }









}
