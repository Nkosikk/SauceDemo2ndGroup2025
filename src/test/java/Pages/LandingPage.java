package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();
    }

    public void selectProductByName(String productName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(products.get(0)));
        for (WebElement product : products) {
            if (product.getText().contains(productName)) {
                product.click();
                break;
            }
        }
    }

}
