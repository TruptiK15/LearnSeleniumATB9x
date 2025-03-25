package com.testingacademy.ex10_Action_Class;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class TestSelenium28_Action {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }
    @Test
    @Description("Verify actions")
    public void Test_Selenium28() throws InterruptedException {

        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.name("firstname"));
        //Keyboard
        //KeyDown + Shift --> SendKeys(type) -> Key Up
        //keyUp() - perform key release
        //keyDown() - perform key press without release
        Actions actions = new Actions(driver);
        actions
                .keyDown(Keys.SHIFT)
                .sendKeys(firstname,"the testing academy")
                .keyUp(Keys.SHIFT).build().perform();
    }
    @AfterTest
    public void CloseBrowser() {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
