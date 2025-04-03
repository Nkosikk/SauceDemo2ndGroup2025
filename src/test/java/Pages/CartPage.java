package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Your Cart')]")
    WebElement yourCartText_xpath;

    //identifying the elements for backpack

    @FindBy(xpath = "//div[contains(@data-test,'inventory-item-name')]")
    WebElement backpackProductNameInCart_xpath;
    @FindBy(xpath = "//div[contains(@data-test,'inventory-item-desc')]")
    WebElement backpackProductDescription_xpath;
    @FindBy(xpath = "//div[contains(@class,'inventory_item_price')]")
    WebElement backpackProductPriceInCart_xpath;


    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement removeBackpackFromCartButton_xpath;


    @FindBy(xpath = "//button[@id='continue-shopping']")
    WebElement continueShoppingButton_xpath;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement removeBackpackFromCartButtonProductLevel_xpath;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton_xpath;



    public void verifyYourCartText() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(yourCartText_xpath));
        yourCartText_xpath.isDisplayed();

        String yourCartText = yourCartText_xpath.getText();
        Assert.assertEquals(yourCartText, "Your Cart");
    }

    public void verifyProductDetails() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(backpackProductNameInCart_xpath));
        backpackProductNameInCart_xpath.isDisplayed();

        String backpackNameText = backpackProductNameInCart_xpath.getText();
        Assert.assertEquals(backpackNameText, "Sauce Labs Backpack");

        String backpackDescriptionText = backpackProductDescription_xpath.getText();
        Assert.assertEquals(backpackDescriptionText, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");

        String backpackPriceText = backpackProductPriceInCart_xpath.getText();
        Assert.assertEquals(backpackPriceText, "R29.99");


    }

    public void verifyYourCartButtons() {

        String removeBackpackFromButton = removeBackpackFromCartButton_xpath.getText();
        Assert.assertEquals(removeBackpackFromButton, "Remove");

        String continueShoppingButton = continueShoppingButton_xpath.getText();
        Assert.assertEquals(continueShoppingButton, "Continue Shopping");

        String checkoutButton = checkoutButton_xpath.getText();
        Assert.assertEquals(checkoutButton, "Checkout");


    }
    public void clickRemoveButtonInCart(){
        removeBackpackFromCartButtonProductLevel_xpath.click();
    }
    public void clickCheckOutButton(){
        checkoutButton_xpath.click();
    }

}
