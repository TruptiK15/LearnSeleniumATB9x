package Practice_Websites_Demo.Sauce_Labs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Sauce_Lab_Login {
    WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Browser Opened successfully");
    }

    @Test(priority = 1)
    public void loginPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement submit = driver.findElement(By.id("login-button"));
        submit.click();
        Thread.sleep(2000);
        System.out.println("Logged In to Application");
    }

    public void alertmethod() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test(priority = 2)
    public void HomePage() throws InterruptedException {
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        Assert.assertEquals(title, "Swag Labs");
        System.out.println("Title Verified successfully");

        //Print all the product
        System.out.println("List of All Products: ");
        getAllProducts();
    }

    @Test(priority = 3)
    public void selectProduct() throws InterruptedException {
        //Select one of the product
        System.out.println("---------------");
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@data-test='inventory-item-name']"));
        for (WebElement product : allProducts) {
            String productName = product.getText();

            if (productName.contains("Sauce Labs Bike Light")) {
                System.out.println("Selected Product is : " + productName);
                product.click();
                break;
            }
        }
    }

    @Test(priority = 4)
    public void addToCart() throws InterruptedException {
        //Add to Cart - get price and click on Add to Cart
        WebElement price = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("Product Price : " + price.getText());
        driver.findElement(By.id("add-to-cart")).click();
        System.out.println("Clicked on Add to Cart");
        System.out.println("-------------------");

        //Do final Checkout in myCart
        myCart();
    }

    public void myCart() throws InterruptedException {
        WebElement cart = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(cart).click().build().perform();
        System.out.println("Click on My Cart icon");

        WebElement checkout = driver.findElement(By.id("checkout"));
        System.out.println("Clicked on Checkout");
        checkout.click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void endBrowser() {
        driver.close();
        System.out.println("Browser closed successfully");
    }

    public void getAllProducts() {
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@data-test='inventory-item-name']"));
        for (WebElement product : allProducts) {
            System.out.println(product.getText());
        }
    }

}
