package com.testingacademy.ex10_Action_Class;

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

public class TestSelenium30_Action_Makemytrip {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest--");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }
    @Test
    @Description("Verify Acions")
    public void Test_Selenium25() throws InterruptedException {

        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        Thread.sleep(2000);

        WebElement source = driver.findElement(By.xpath("//div[@data]"));

        //wait for popup and click on X icon
        //span[@data-cy="closeModal"]

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

         driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
         WebElement fromcity = driver.findElement(By.id("fromCity"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fromcity).click().sendKeys("del").build().perform();
        Thread.sleep(3000);

        actions.moveToElement(fromcity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();


    }
    @AfterTest
    public void CloseBrowser() throws InterruptedException {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
