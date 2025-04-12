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

public class WaitHelpers_utitilty {

    public static void checkVisibility(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement checkVisibilityByFluentWait(WebDriver driver, By locator) {
        FluentWait<EdgeDriver> wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement page = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                System.out.println("Waited successfully......");
                return driver.findElement(locator);
            }
        });
        return page;
    }
}
