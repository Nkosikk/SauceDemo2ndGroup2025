package Tests;

import Pages.CartPage;
import Pages.LandingPage;
import org.testng.annotations.Test;

import static Utils.ReadFromExcel.*;

@Test
public class purchaseItemTests extends Base{

    @Test(priority = 0)

    public void enterUsernameTest(){
        loginpage.enterUsername(username);

    }
    @Test(priority = 1)
    public void enterPasswordTest(){
        loginpage.enterPassword(password);

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
        checkOutInformationPage.enterFirstname(firstname);

    }
    @Test(priority = 10)
    public void enterLastNameTest(){
        checkOutInformationPage.enterLastname(lastname);

    }

    @Test(priority = 11)
    public void enterPostalCodeTest(){
        checkOutInformationPage.enterPostalCode(zipcode);

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

 //   @Test(priority = 13)
 //   public void calculateTotalPrice(){
//        checkOutOverviewPage.calculateTotalPrice();
 //   }



    @Test(priority = 14)
    public void clickFinishButton(){
        checkOutOverviewPage.clickFinish();

    }

    //

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
