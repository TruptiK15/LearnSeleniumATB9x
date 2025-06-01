package com.testingacademy.ex10_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions_ex2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        //wait.until(ExpectedConditions.visibilityOf(username));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));


        username.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(2000);

        WebElement adminMenu = driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item active\"]"));
        WebElement organizationMenu = driver.findElement(By.xpath("//span[normalize-space()=\"Organization\"]"));
        WebElement locationSubmenu = driver.findElement(By.xpath("//a[normalize-space()=\"Locations\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(adminMenu)
                .moveToElement(organizationMenu)
                .moveToElement(locationSubmenu)
                .click().perform();

        Thread.sleep(3000);
        driver.quit();

    }
}
