package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement yourcartText_xpath;

    @FindBy(id = "checkout")
    WebElement checkout_id;

    public CheckoutPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void verifyYourCartText()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourcartText_xpath));
        yourcartText_xpath.isDisplayed();
    }
            public void ClickCheckoutButton()
            {
                checkout_id.click();
            }

  /*  @Test
    public void Test()
    {
        System.out.println("Test");
    }*/
}
