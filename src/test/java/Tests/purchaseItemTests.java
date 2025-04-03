package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


@Test
public class purchaseItemTests extends Base{



    public void enterUsernameTests(){
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests(){
        loginPage.enterPassword(readFromExcel.password);
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests(){
        takeScreenshots.takesSnapShot(driver,"Login Page");
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyLoginSuccess(){
        takeScreenshots.takesSnapShot(driver,"Landing Page");
        landingPage.verifyProductText();
    }

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void verifySuccessfulAddingOfBackpackItem(){
        //
        landingPage.verifyBackPackItem();
        landingPage.addBackPackItemToCart();
        takeScreenshots.takesSnapShot(driver,"Backpack Product Added");
    }
    @Test(dependsOnMethods = "verifySuccessfulAddingOfBackpackItem")
    public void verifySuccessfulRemovalofBackpackItem(){
        //
        landingPage.removeBackPackItemFromCart();
        takeScreenshots.takesSnapShot(driver,"Backpack Product Removed");
    }

    @Test(dependsOnMethods = "verifySuccessfulRemovalofBackpackItem")
    public void verifySuccessfulReAddingOfBackpackItem(){
        //
        landingPage.verifyBackPackItem();
        landingPage.addBackPackItemToCart();
        takeScreenshots.takesSnapShot(driver,"Backpack Product Re-Added");
    }

    @Test(dependsOnMethods = "verifySuccessfulReAddingOfBackpackItem")
    public void clickCheckOutTest(){
        //
        landingPage.accessYourCart();
    }

    @Test(dependsOnMethods = "clickCheckOutTest")
    public void verifyAccessCartSuccess(){
        //
        cartPage.verifyYourCartText();
        takeScreenshots.takesSnapShot(driver,"Successfully Accessed Cart");
    }

    @Test(dependsOnMethods = "clickCheckOutTest")
    public void verifyYourCartDetails(){
        //
        cartPage.verifyYourCartButtons();
    }
    @Test(dependsOnMethods = "clickCheckOutTest")
    public void verifyBackpackProductAdded(){
        //
        cartPage.verifyProductDetails();
        takeScreenshots.takesSnapShot(driver,"Backpack Displayed in Cart");
    }

    @Test(dependsOnMethods = "verifyBackpackProductAdded")

    //public void clickRemoveButtonInCheckoutTest(){
      //  cartPage.clickRemoveButtonInCart();
   // }

    // please help me figure out why this class is not working
   public void clickCheckoutTest(){
       cartPage.clickCheckOutButton();
       takeScreenshots.takesSnapShot(driver,"Checkout:Your Information Page");}



   // @AfterTest
    //public void closeBrowser(){
   //     driver.quit();
    //}






}
