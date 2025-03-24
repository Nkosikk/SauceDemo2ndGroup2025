package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {
    WebDriver driver;
    @FindBy(className = "product_label")
    WebElement productLabel_class;

    public void landingPage(WebDriver driver){
        this.driver = driver;
    }
    public void assertProductLandingPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productLabel_class));
        String ProductText = driver.findElement(By.className("product_label")).getText();
        Assert.assertEquals(ProductText,"Products");


    }
}
