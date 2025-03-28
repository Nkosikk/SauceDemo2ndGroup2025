package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class BackHomePage
{
    WebDriver driver;

    @FindBy(id = "back-to-products")
    WebElement backHomeButton_id;

    public BackHomePage(WebDriver driver)

    {
        this.driver = driver;
    }
   //Click Back Home Button
    public void ClickBackHomeButton()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(backHomeButton_id));
        backHomeButton_id.click();
    }

}
