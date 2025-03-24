package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInformationPage {

WebDriver driver;

@FindBy(id = "First-name")
WebElement firstname_id;

@FindBy(id = "last-name")
WebElement   lastname_id

@FindBy(id = "postal-code")
WebElement postalcode_id;

@FindBy (id = "continue")
WebElement continue_id;

public CheckOutInformationPage(WebDriver driver) {
this.driver = driver;

public void enterFirstName(String "firstname")
    {

    }
}



}
