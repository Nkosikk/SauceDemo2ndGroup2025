package Pages;

import org.openqa.selenium.WebDriver;

public class LandingPage {
    WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }
    public void openLandingPage(){
        driver.get("https://www.saucedemo.com/");
    }
}
