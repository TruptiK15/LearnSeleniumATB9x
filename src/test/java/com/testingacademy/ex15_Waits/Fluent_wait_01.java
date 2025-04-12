package com.testingacademy.ex15_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Fluent_wait_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement emailInputbox = driver.findElement(By.id("login-username"));

        //wait until the element is present
        Wait<EdgeDriver> wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement page = wait.until(new Function<EdgeDriver, WebElement>() {
            @Override
            public WebElement apply(EdgeDriver edgeDriver) {
                //return driver.findElement(By.id("login-username"));
                System.out.println("Waited successfully......");
                return emailInputbox;
            }
        });
        emailInputbox.sendKeys("admin@admin.com");

        WebElement passwordInputbox = driver.findElement(By.id("login-password"));
        passwordInputbox.sendKeys("admin");

        WebElement buttonsubmit = driver.findElement(By.id("js-login-btn"));
        buttonsubmit.click();

        driver.quit();

    }
}
