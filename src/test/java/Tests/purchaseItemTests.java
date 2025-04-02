package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;


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
    public void verifyProductText(){
        String ProductText= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(ProductText,"Products");
        takeScreenshots.takesSnapShot(driver,"Product Text");
    }
    @Test(dependsOnMethods = "verifyProductText")
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
    public void VerifyShoppingCart(){
        takeScreenshots.takesSnapShot(driver,"Your Cart Page");
        String YourCart = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(YourCart, "Your Cart");

    }
//    @Test(dependsOnMethods = "VerifyShoppingCart")
//    public void verifyTotalAndClickFinish() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        WebElement itemTotalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='summary_subtotal_label']")));
//        WebElement taxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='summary_tax_label']")));
//        WebElement totalElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='summary_total_label']")));
//
//        double itemTotalValue = Double.parseDouble(itemTotalElement.getText().replace("Item total: $", ""));
//        double taxValue = Double.parseDouble(taxElement.getText().replace("Tax: $", ""));
//        double totalValue = Double.parseDouble(totalElement.getText().replace("Total: $", ""));
//
//        Assert.assertEquals(itemTotalValue + taxValue, totalValue, "Item total plus tax is not equal to total");
//
//        WebElement finishButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
//        finishButton.click();
//
//        takeScreenshots.takesSnapShot(driver, "Total Price");
//    }

    @Test(dependsOnMethods = "VerifyShoppingCart")
    public void clickCheckOutButton() {
        takeScreenshots.takesSnapShot(driver, "Check Out Page");
        checkOutPage.clickCheckOutButton();
    }

    @Test(dependsOnMethods = "clickCheckOutButton")
    public void VerifyCheckOutInfo(){
        takeScreenshots.takesSnapShot(driver,"Check Out Info Page");
        String CheckOutInfo = driver.findElement(By.xpath("(//span[@class='title'])[1]")).getText();
        Assert.assertEquals(CheckOutInfo, "Checkout: Your Information");
    }

    @Test(dependsOnMethods = "VerifyCheckOutInfo")
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
    @Test(dependsOnMethods = "clickBackToHomeBtn")
    public void clickMenuBtn(){
        takeScreenshots.takesSnapShot(driver,"Menu Button CheckOut complete Page");
        checkCompletePage.clickMenuBtn();

    }
    @Test(dependsOnMethods = "clickMenuBtn")
    public void clickLogoutBtn(){
        takeScreenshots.takesSnapShot(driver,"Logout Button CheckOut complete Page");
        checkCompletePage.clickLogoutBtn();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
