package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement headerText;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyHeaderText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(headerText));
        headerText.isDisplayed();
    }
}
