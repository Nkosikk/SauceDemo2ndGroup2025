package Tests;

import Utils.ReadFromExcel;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


@Test
public class purchaseItemTests extends Base {


    public void enterUsernameTests() throws IOException {
        loginPage.enterUsername(ReadFromExcel.username);
        try (InputStream fis = new FileInputStream("src/test/resources/ExcelData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            String username = sheet.getRow(1).getCell(0).getStringCellValue();
        }
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() throws IOException {
        loginPage.enterPassword(ReadFromExcel.password);
        try (InputStream fis = new FileInputStream("src/test/resources/ExcelData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String password = sheet.getRow(1).getCell(1).getStringCellValue();
        }
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

    @Test(dependsOnMethods = "verifyLoginSuccess")
    public void clickAddToCart() throws InterruptedException {
        Thread.sleep(2000);

        addToCart.AddToCart();
        //takeScreenshots.takesSnapShot(driver,"Add To Cart");
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickAddToCart2() throws InterruptedException {
        Thread.sleep(2000);
        addToCart.AddToCart2();
        takeScreenshots.takesSnapShot(driver, "Add To Cart");
    }

    @Test(dependsOnMethods = "clickAddToCart")
    public void clickShoppingCartContainer() throws InterruptedException {
        Thread.sleep(2000);
        shoppingCart.ShoppingCart();
        takeScreenshots.takesSnapShot(driver, "Shopping Cart");
    }

    @Test(dependsOnMethods = "clickShoppingCartContainer")
    public void clickCheckOutButton() throws InterruptedException {
        Thread.sleep(2000);
        checkoutButton.CheckOut();
        takeScreenshots.takesSnapShot(driver, "Check Out");
    }

    @Test(dependsOnMethods = "clickCheckOutButton")
    public void enterFirstName() {
        continueButton.enterFirstName("Sifiso");
    }

    @Test(dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        continueButton.enterLastName("Qwabe");
    }

    @Test(dependsOnMethods = "enterLastName")
    public void enterPostalCode() {
        continueButton.enterPostalCode("3950");
    }

    @Test(dependsOnMethods = "enterPostalCode")
    public void clickContinue() throws InterruptedException {
        Thread.sleep(2000);
        takeScreenshots.takesSnapShot(driver, "User Info Page");
        continueButton.clickContinueButton();
        takeScreenshots.takesSnapShot(driver, "Continue Page");

    }

    @Test(dependsOnMethods = "clickContinue")
    public void clickFinish() throws InterruptedException {
        Thread.sleep(2000);
        checkoutInfo.clickFinishButton();
        takeScreenshots.takesSnapShot(driver, "Finish Page");
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
