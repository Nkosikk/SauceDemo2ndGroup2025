package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutInfoPage {
    WebDriver driver;

    @FindBy(id = "first-name")
    WebElement FirstName_id;

    @FindBy(id = "last-name")
    WebElement LastName_id;

    @FindBy(id = "postal-code")
    WebElement ZipCode_id;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement InfoPageHeader_xpath;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement ContinueButton_xpath;

    //Constructor
    public CheckoutInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void enterFirstName(String FirstName) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(FirstName_id));
        FirstName_id.sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        LastName_id.sendKeys(LastName);
    }

    public void enterZipCode(String ZipCode) {
        ZipCode_id.sendKeys(ZipCode);
    }

    public String getInfoPageHeader() {
        return InfoPageHeader_xpath.getText();
    }

    public void clickContinueButton() {
        ContinueButton_xpath.click();
    }
}
