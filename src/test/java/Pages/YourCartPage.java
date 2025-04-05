package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class YourCartPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement yourCartText_xpath;
    @FindBy(id = "checkout")
    WebElement checkout_id;
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement SauceLabsBackpack_xpath;
    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    WebElement SauceLabsBikeLight_xpath;

    public YourCartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void verifyCartText()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourCartText_xpath));
        yourCartText_xpath.isDisplayed();
    }
    public void verifyAddedPackCart(String xpath)
    {
        WebElement SauceLabsBackpack_xpath = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        SauceLabsBackpack_xpath.isDisplayed();
    }
    public void verifyAddedLightCart(String xpath)
    {
        WebElement SauceLabsBikeLight_xpath = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        SauceLabsBikeLight_xpath.isDisplayed();
    }
    public void clickCheckoutButton()
    {
        checkout_id.click();
    }
   /* @Test
    public void Test()
    {
        System.out.println("Test");
    }*/
}
