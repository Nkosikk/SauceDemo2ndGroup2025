import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class StartChrome {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://lancewood.co.za/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btn-profile\"]/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sub-inner-user']/a[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"EmailAddress\"]"))).sendKeys("phelo@techsys.co.za");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputPassword"))).sendKeys("Welcome123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]/div[5]/div/button"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btn-profile\"]"))).click();

        String LOG_OUTText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span"))).getText();
        Assert.assertEquals(LOG_OUTText.trim().toLowerCase(), "LOG OUT".toLowerCase());

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed());
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
