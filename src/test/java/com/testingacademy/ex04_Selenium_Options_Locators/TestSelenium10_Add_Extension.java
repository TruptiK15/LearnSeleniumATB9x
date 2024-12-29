package com.testingacademy.ex04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium10_Add_Extension {

    @Description("Options Class")
    @Test
    public void test_Selenium10() throws Exception {

        // Add Blocker Extension -- Youtube Video --> Ads (Install Ad Blocker - Yes/No)
        // ------Use Case----
        // QA Lead has given, that you need to start the edge browser with Ad Blocker extension installed
        // edgeoptions.addExtensions()

        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--window-size=1920,1080");
        edgeoptions.addExtensions(new File("src/test/java/com/testingacademy/ex04_Selenium_Options_Locators/adblocker.crx"));

        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://www.google.com");
        //Thread.sleep(5000);
       // driver.quit();
    }
}
