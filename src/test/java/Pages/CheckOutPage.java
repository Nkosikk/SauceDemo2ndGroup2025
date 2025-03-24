package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;
    @FindBy(className = "btn_action")
    WebElement btnAction_class;

    public void checkOutPage(WebDriver driver){
        this.driver = driver;
    }
    public void checkOutbtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnAction_class));
        btnAction_class.click();
    }
}

