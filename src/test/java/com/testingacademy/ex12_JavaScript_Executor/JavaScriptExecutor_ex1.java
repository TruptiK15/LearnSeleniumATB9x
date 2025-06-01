package com.testingacademy.ex12_JavaScript_Executor;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutor_ex1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Java Script Executor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,1000)");
        //js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);

        Thread.sleep(2000);
        driver.quit();
    }
}
