package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceCalculator {
    WebDriver driver;
    @FindBy(id = "finish")
    WebElement finishButton_id;

    public void FinishPage(WebDriver driver) {
        this.driver = driver;
    }
    private double price;
    private double taxRate;

    public PriceCalculator(double price, double taxRate) {
        this.price = price;
        this.taxRate = taxRate;

    }

    public double calculateTax() {
        return price * (taxRate / 100);

    }

    public double calculateTotalPrice() {
        return price + calculateTax();

    }

    public static PriceCalculator addPrice(PriceCalculator p1, PriceCalculator p2) {
        double totalPrice = p1.price + p2.price;
        double averageTaxRate = (p1.taxRate + p2.taxRate) / 2;
        return new PriceCalculator(totalPrice, averageTaxRate);

    }

    public static void main(String[] args) {
        PriceCalculator item1 = new PriceCalculator(29.99, 8);
        PriceCalculator item2 = new PriceCalculator(15.99, 8);

        PriceCalculator totalItem = PriceCalculator.addPrice(item1, item2);

        System.out.println("Total Base price: $" + (item1.price + item2.price));
        System.out.println("Tax: $" + totalItem.calculateTax());
        System.out.println("Total Price with Tax: $" + totalItem.calculateTotalPrice());
    }
    public double getPrice() {
        return price;
    }
    public void clickFinishButton() {
        finishButton_id.click();
    }
}
