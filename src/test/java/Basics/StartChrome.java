import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class StartChrome {

    WebDriver driver;

    @Test
    public void verifyLoginSuccess() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        //String pageTitle = driver.getTitle()
        //System.out.println("Page Title:" + pageTitle);


        String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        // System.out.println("The Product Text is "+ ProductText);

        Assert.assertEquals(ProductText, "Products");
        //Thread.sleep(2000);
        //String ProductText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        String pageTitle = driver.getTitle();
        System.out.println("The title is "+ pageTitle);
        Assert.assertEquals(pageTitle, "Swag Labs");



        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys("thabiso");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("ndlovu");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("7441");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
//*