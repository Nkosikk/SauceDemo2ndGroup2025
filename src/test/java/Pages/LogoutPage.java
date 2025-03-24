package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;
    public LogoutPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogoutButton(){
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
