package com.testingacademy.ex10_Action_Class;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_SpiceJet {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }
    @Test
    @Description("Verify Acions")
    public void Test_Selenium25() throws InterruptedException {

        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        Thread.sleep(2000);

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]"));
        // source.click(); -- > direct links are not working then --> use Action Class
        //move to element
        //click
        //sendkeys
        Actions actions = new Actions(driver);
        actions.moveToElement(source)
                .click()
                .sendKeys("BLR")
                .build().perform();

        WebElement destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']"));
        actions.moveToElement(destination).click().sendKeys("BOM").build().perform();
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
