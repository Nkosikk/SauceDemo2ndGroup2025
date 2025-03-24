package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    WebDriver driver;

    @FindBy (xpath = "//span[contains(.,'Products')]")
    WebElement productsText;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductsTextDisplayed(){
        return productsText.isDisplayed();
    }
}
