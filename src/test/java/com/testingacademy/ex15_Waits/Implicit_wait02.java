package com.testingacademy.ex15_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Implicit_wait02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        //wait until the element is present
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOf(closeModel));
        closeModel.click();
        System.out.println("Closed the popup window");

        Thread.sleep(3000);
        driver.quit();
    }
}
