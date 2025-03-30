package Tests;

import Pages.CartPage;
import Pages.LandingPage;
import org.testng.annotations.Test;

@Test
public class purchaseItemTests extends Base{

    @Test(priority = 0)

    public void enterUsernameTest(){
        loginpage.enterUsername("standard_user");

    }
    @Test(priority = 1)
    public void enterPasswordTest(){
        loginpage.enterPassword("secret_sauce");

    }
    @Test(priority = 2)
    public void clickLoginTest(){
        takeScreenshots.takesSnapShot(driver,"LoginPage");
        loginpage.clickLoginButton();

    }

    // Landing page
    @Test(priority = 3)
    public void verifyLoginSuccess(){
        takeScreenshots.takesSnapShot(driver,"LandingPage");
        landingPage.verifyProductText();

    }
    // Add to cart

    @Test(priority = 4)
    public void addProduct(){
        landingPage.clickAddToCart();

    }
    @Test(priority = 5)
    public void clickCart(){
        landingPage.clickCart();

    }

    // Cart page

    @Test(priority = 6)
    public void verifyCartText(){
        cartPage.verifycartPageText();
        takeScreenshots.takesSnapShot(driver,"CartPage");

    }

    @Test(priority = 7)
    public void clickCheckout(){
        cartPage.clickCheckout();

    }

    // checkout information details page

    @Test(priority = 8)
    public void verifyCheckoutInfoText(){
        checkOutInformationPage.verifyCheckOutText();

    }

    @Test(priority = 9)
    public void enterFirstNameTest(){
        checkOutInformationPage.enterFirstname("Sithembiso");

    }
    @Test(priority = 10)
    public void enterLastNameTest(){
        checkOutInformationPage.enterLastname("Mthembi");

    }

    @Test(priority = 11)
    public void enterPostalCodeTest(){
        checkOutInformationPage.enterPostalCode("7441");

    }

    @Test(priority = 12)
    public void clickContinue(){
        takeScreenshots.takesSnapShot(driver,"CheckoutInfoPage");
        checkOutInformationPage.clickContinueButton();

    }

    // checkout overview page

    @Test(priority = 13)
    public void verifyCheckOverviewText(){
        checkOutOverviewPage.verifyCheckoutOverviewText();
        takeScreenshots.takesSnapShot(driver,"CheckoutOverviewPage");
        ;

    }

    @Test(priority = 14)
    public void clickFinishButton(){
        checkOutOverviewPage.clickFinish();

    }

    // Checkout complete page

    @Test(priority = 15)
    public void verifyCompleteText(){
        CompletePage.verifyCompleteText();
        takeScreenshots.takesSnapShot(driver,"CompletePage");

    }

    @Test(priority = 16)
    public void clickBackToProductsButton(){
        CompletePage.clickBackHome();

    }

    @Test(priority = 17)
    public void clickMenuButton(){
        CompletePage.clickMenu();

    }

    @Test(priority = 18)
    public void clickLogOutButton() {
        CompletePage.clickLogOut();
    }









}
