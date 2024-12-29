package com.testingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Navigate {

    @Description("Open the URL and navigate to")
    @Test
    public void test_Selenium07(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Use navigation commands
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}
