import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StartChrome {

    WebDriver driver;


    @Test
    public void verifyLoginSuccess() throws InterruptedException {
        driver = new EdgeDriver();
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

    @Test
    public void createScreenShots() throws IOException {
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //take login screenshot
        takeScreenShot("screenShots","loginPage_");

        driver.findElement(By.id("login-button")).click();
        //take catalog screenshot
        takeScreenShot("screenShots","catalogPage_");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        //take add-to-cart screenshot
        takeScreenShot("screenShots","addToCartPage_");

        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //take Selected products at cart-page screenshot
        takeScreenShot("screenShots","addedProductsAtCart_");

        driver.findElement(By.id("checkout")).click();
        takeScreenShot("screenShots","checkoutPage_");

        driver.findElement(By.id("first-name")).sendKeys("thabiso");
       // Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("ndlovu");
        //Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("7441");
        takeScreenShot("screenShots","checkoutInfo_");

        driver.findElement(By.id("continue")).click();
        takeScreenShot("screenShots","checkoutOverview_");

        driver.findElement(By.id("finish")).click();
        takeScreenShot("screenShots","checkoutComplete_");

        driver.findElement(By.id("react-burger-menu-btn")).click();
        takeScreenShot("screenShots","selectMenu_");

        driver.findElement(By.id("logout_sidebar_link")).click();
        takeScreenShot("screenShots","logOut_");


    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

    private void takeScreenShot(String dirName,String fileName) throws IOException {
        // Take a screenshot and store it as a File object
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);

        // Specify the "screenshots" directory and ensure it exists
        File screenshotsDir = new File(dirName);
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();  // Create the "screenshots" directory if it doesn't exist
        }

// Generate a unique file name for the screenshot
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destFile = new File(screenshotsDir, fileName + timestamp + ".png");

        // Copy the screenshot to the destination file
        FileUtils.copyFile(screenshot, destFile);

        // Output the saved file path
        System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
    }
}
