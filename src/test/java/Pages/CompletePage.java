package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage {

    WebDriver driver;

    @FindBy(id = "back-to-products")
    webElement backToProducts_id;

    // Check out complete

    public void clickBackToProducts() {
        backToProducts_id.click();
    }


}
