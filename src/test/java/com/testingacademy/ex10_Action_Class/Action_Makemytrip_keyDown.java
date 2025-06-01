package com.testingacademy.ex10_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action_Makemytrip_keyDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(2000);

        //wait for popup and click on X icon
        WebElement source = driver.findElement(By.xpath("//div[@data]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

         driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
         WebElement fromcity = driver.findElement(By.id("fromCity"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromcity).click().sendKeys("del").build().perform();
        Thread.sleep(3000);

        actions.moveToElement(fromcity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
        Thread.sleep(3000);

        driver.quit();
    }
}
