package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyInformationPage {

    WebDriver driver;

    @FindBy (id = "first-name")
    WebElement first_name_id;
    @FindBy (id = "last-name")
    WebElement last_name_id;
    @FindBy (id = "postal-code")
    WebElement postal_code_id;
    @FindBy (id = "continue")
    WebElement continue_id;

    public VerifyInformationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setFirst_name_id(WebElement first_name_id) {
        this.first_name_id = first_name_id;
    }
    public void setLast_name_id(WebElement last_name_id) {
        this.last_name_id = last_name_id;
    }
    public void setPostal_code_id(WebElement postal_code_id) {
        this.postal_code_id = postal_code_id;
    }
    public void clickContinue_id(WebElement continue_id) {
        this.continue_id = continue_id;
    }
        }