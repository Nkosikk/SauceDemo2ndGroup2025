package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    WebElement productText_xpath;

    @FindBy(xpath = "//*[@id='item_4_title_link']/div")
    WebElement firstItem_xpath;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement backpackButton_id;

    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
    WebElement fleeceJacketButton_id;

    @FindBy(id="add-to-cart-sauce-labs-onesie")
    WebElement onesieButton_id;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLightButton_id;




    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyProductText(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(productText_xpath));
        productText_xpath.isDisplayed();

    }
    public void verifyFirstItem() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(firstItem_xpath));
        firstItem_xpath.isDisplayed();
    }

    public void clickAddToCartButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(backpackButton_id));
        backpackButton_id.click();
    }

    public void clickFleeceJacketButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(fleeceJacketButton_id));
        fleeceJacketButton_id.click();
    }

    public void clickOnesieButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(onesieButton_id));
        onesieButton_id.click();

    }
    public void clickBikeLightButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(bikeLightButton_id));
        bikeLightButton_id.click();
    }
}
