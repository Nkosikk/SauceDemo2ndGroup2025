package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddItemPage {
    WebDriver driver;
    @FindBy(className = "btn_primary")
    WebElement btnPrimary_class;

    public void AddItem(WebDriver driver){
        this.driver = driver;
    }
    public void clickAddToCartBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnPrimary_class));
        btnPrimary_class.click();

    }
}
