package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {
    WebDriver driver;

    @FindBy(id = "First-name")
    WebElement FirstName_id;

    @FindBy(id = "Last-name")
    WebElement LastName_id;

    @FindBy(id = "Zip-code")
    WebElement ZipCode_id;

    @FindBy(id = "Continue")
    WebElement ContinueButton_id;

    //Constructor
    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void enterFirstName(String FirstName) {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(FirstName_id));
        FirstName_id.sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        LastName_id.sendKeys(LastName);
    }

    public void enterZipCode(String ZipCode) {
        ZipCode_id.sendKeys(ZipCode);
    }

    public void clickContinueButton() {
        ContinueButton_id.click();
    }
}
