package com.testingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Close_Quit {

    @Description("Open the URL and navigate to")
    @Test
    public void test_Selenium01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        //close - close the current Tab, not the session id != null;
        driver.close();

        //quit - close all the Tabs and session id == null;
        driver.quit();
    }
}
