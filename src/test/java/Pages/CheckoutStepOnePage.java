package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOnePage {
    WebDriver driver;

    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
    }
    public void openCheckoutStepOnePage() {
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    public void fillInFirstName(String firstName) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
    }

    public void fillInLastName(String lastName) {
        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    public void fillInPostalCode(String postalCode) {
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
    }

    public void clickContinueButton() {
        driver.findElement(By.id("continue")).click();
    }

    public void clickCancelButton() {
        driver.findElement(By.id("cancel")).click();
    }

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postalCode;

    @FindBy(id = "continue")
    WebElement continueButton;

}

