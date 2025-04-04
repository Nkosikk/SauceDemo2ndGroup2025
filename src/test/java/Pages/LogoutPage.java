package Pages;

import Utils.TakeScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LogoutPage
{
    WebDriver driver;

    @FindBy(id = "react-burger-menu-btn")
    WebElement reactburgermenubtn_id;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutsidebarlink_id;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickBurgerMenuBtn()
    {
        reactburgermenubtn_id.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(visibilityOf(reactburgermenubtn_id));
    }
    public void clickLogoutSideBarLink()
    {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(visibilityOf(logoutsidebarlink_id));
        logoutsidebarlink_id.click();
    }
    /*@Test
    public void Test()
    {
        System.out.println("Test");
    }*/
}
