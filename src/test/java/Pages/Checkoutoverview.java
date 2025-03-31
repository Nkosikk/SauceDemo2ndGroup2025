package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.javaScriptThrowsNoExceptions;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Checkoutoverview {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement checkoutOverviewText_xpath;

    @FindBy(css = "[data-test = item_total]")
    WebElement itemTotalElement;

    @FindBy(css = "[data-test = tax]")
    WebElement taxElement;

    @FindBy(css = "[data-test = 'total_price']")
    WebElement totalElement;

    public Checkoutoverview(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCheckoutOverviewText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(checkoutOverviewText_xpath));
        Assert.assertTrue(checkoutOverviewText_xpath.isDisplayed(), "Checkout overview text is not displayed");
    }

    public void verifyTotal() {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(itemTotalElement));
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(taxElement));
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(totalElement));

        double itemTotal = Double.parseDouble(itemTotalElement.getText().replace("$", ""));
        double tax = Double.parseDouble(taxElement.getText().replace("$", ""));
        double total = Double.parseDouble(totalElement.getText().replace("$", ""));

        double expectedTotal = itemTotal + tax;

        Assert.assertEquals(expectedTotal, total, "The total is incorrect");
    }
}