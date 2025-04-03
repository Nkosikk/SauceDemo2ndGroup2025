package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BackHomePage
{
    static WebDriver driver;

    @FindBy(id = "back-to-products")
    static WebElement backtoproducts_id;

    public BackHomePage(WebDriver driver)
    {
        this.driver = driver;
    }
   //Click Back Home Button
    public static void ClickBackHomeButton()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(backtoproducts_id));
        backtoproducts_id.click();
    }

}
