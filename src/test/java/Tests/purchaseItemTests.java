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
    public void addToCartBackpack() {
        takeScreenshots.takesSnapShot(driver, "add backpack to cart");
        landingPage.addToCartBackpack();
    }

    @Test(dependsOnMethods = "addToCartBackpack")
    public void addToCartBikeLight() {
        takeScreenshots.takesSnapShot(driver, "add bike light to cart");
        landingPage.addToCartBikeLight();
    }

    @Test(dependsOnMethods = "addToCartBikeLight")
    public void shoppingCartContainer(){
        takeScreenshots.takesSnapShot(driver,"shopping cart container");
        yourCartPage.shoppingCartContainer();
    }
    @Test(dependsOnMethods = "shoppingCartContainer")
    public void clickCheckOutButton(){
        takeScreenshots.takesSnapShot(driver,"Check Out Page");
        checkOutPage.clickCheckOutButton();
    }

    @Test(dependsOnMethods = "clickCheckOutButton")
    public void enterFirstName() {
        checkOutPage.enterFirstName(readFromExcel.firstname);
    }
    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        checkOutPage.enterLastName(readFromExcel.lastname);
    }
    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        checkOutPage.enterPostalCode(readFromExcel.postalcode);
    }
    @Test(dependsOnMethods = "enterPostalCode")
    public void clickBtnContinue(){
        takeScreenshots.takesSnapShot(driver,"Continue Button CheckOut Info Page");
        checkOutPage.clickBtnContinue();
    }
    @Test(dependsOnMethods = "clickBtnContinue")
    public void clickFinishBtn(){
        takeScreenshots.takesSnapShot(driver,"Continue Button Overview Page");
        overviewPage.clickFinishBtn();
    }
    @Test(dependsOnMethods = "clickFinishBtn")
    public void clickBackToHomeBtn(){
        takeScreenshots.takesSnapShot(driver,"Home Button CheckOut complete Page");
        checkCompletePage.clickBackToHomeBtn();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
