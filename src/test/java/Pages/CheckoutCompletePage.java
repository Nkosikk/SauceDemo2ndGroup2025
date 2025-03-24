package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheckoutCompletePage {
    WebDriver driver;

    //locate thank you message element
    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement ThankYouMsg_xpath;

    //locate burger menu element
    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    WebElement BurgerMenu_xpath;

    //locate logout button element from the burger menu
    @FindBy(id = "logout_sidebar_link")
    WebElement LogoutButton_id;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    //CHeck if thank you message is displayed
    public boolean isThankYouMsgDisplayed(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(ThankYouMsg_xpath));
        return ThankYouMsg_xpath.getText().contains("THANK YOU FOR YOUR ORDER");
    }

    //Click burger menu
    public void ClickBurgerMenu(){
        BurgerMenu_xpath.click();
    }

    //Click logout button
    public void ClickLogoutButton(){
        LogoutButton_id.click();
    }

    @AfterTest
    public void CloseBrowser () {
        driver.quit();
    }

}
