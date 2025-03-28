package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyProductsPage
{
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElement products_id;

    public VerifyProductsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickProducts()
    {
        products_id.click();
    }

}
