package Tests;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Test
public class purchaseItemTests extends Base {


    public void enterUsernameTests() {
        loginPage.enterUsername(readFromExcel.username);
    }

    @Test(dependsOnMethods = "enterUsernameTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(readFromExcel.password);
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


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}



