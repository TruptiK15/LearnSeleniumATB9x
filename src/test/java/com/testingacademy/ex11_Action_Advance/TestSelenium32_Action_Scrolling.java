package com.testingacademy.ex11_Action_Advance;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium32_Action_Scrolling {

    @Test
    @Description("Verify Actions - Scrolling")
    public void Test_Selenium32() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        String URL = "https://thetestingacademy.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Scrolling
        //1. Scrolling of Page --> Keys.PAGE_DOWN
        //2. Scrolling of Particular element --> ~300 pixel --> Y axis

        //Limitation
        //to scroll to particular element - use JavaScript Executor

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("Scroll Down");
        Thread.sleep(3000);
        driver.quit();
    }
}
