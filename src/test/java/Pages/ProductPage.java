package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProductPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement products_xpath;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProducts() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(products_xpath)).getText();

    }
}
