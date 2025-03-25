package com.testingacademy.ex12_JavaScript_Executor;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium34_Action_JS {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest--");
        driver = new EdgeDriver(edgeOptions);
    }
    @Test
    @Description("Verify Actions Drag and Drop")
    public void Test_Selenium33() throws InterruptedException {

        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Java Script Executor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        //js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);
        js.executeScript("window.scrollTo(0,1000)");
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
