package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInfo {

    @FindBy(id = "checkout")
    WebElement checkout;

    public void checkout(){
        checkout.click();
    }

    @FindBy(xpath = "(//span[@class='title'])[1]")
    WebElement checkoutYourInformation;

    public void verifyCheckoutYourInformation(){
        checkoutYourInformation.isDisplayed();
    }

    @FindBy(id = "first-name")
    WebElement firstName;

    public void enterFirstName(String name){
        firstName.sendKeys(name);
    }

    @FindBy(id = "last-name")
    WebElement lastName;

    public void enterLastName(String name){
        lastName.sendKeys(name);
    }

    @FindBy(id = "postal-code")
    WebElement postalCode;

    public void enterPostalCode(String code){
        postalCode.sendKeys(code);
    }

    @FindBy(id = "continue")
    WebElement continueButton;

    public void continueButton(){
        continueButton.click();
    }
}
