package Pages;

import Utils.TakeScreenshots;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class  LoginPage {



    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username_id;

    @FindBy(id = "password")
    WebElement password_id;

    @FindBy(id = "login-button")
    WebElement loginButton_id;



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginFromExcel() throws IOException {
        File f = new File("C:\\Users\\user\\Desktop\\data.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        String username = cell.getStringCellValue();
        Cell cell1 = row.getCell(1);
        String password = cell1.getStringCellValue();
        System.out.println(username + " and the password is " + password);
        TakeScreenshots takeScreenshots;
        takeScreenshots.takesSnapShot(driver, src/test/java/Screenshots);
        username_id.sendKeys(username);
        password_id.sendKeys(password);
        loginButton_id.click();
        fis.close();
    }

    File scrFile = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);

   // public LoginPage(WebDriver driver) {
       // this.driver = driver;
   // }
    //Input Username
    //public void enterUsername(String username){
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(username_id));
       // username_id.sendKeys(username);
    //}
    //Input Password
    //public void enterPassword(String password) {
       // password_id.sendKeys(password);
    //}

    //Click Login Button
    //public void clickLoginButton() {
      //  loginButton_id.click();
    //}

//}

//LoginPage() {
}
