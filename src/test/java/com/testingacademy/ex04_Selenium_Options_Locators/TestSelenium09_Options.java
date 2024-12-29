package com.testingacademy.ex04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium09_Options {

    @Description("Options Class")
    @Test
    public void test_Selenium09() throws InterruptedException {

        //EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeoptions = new EdgeOptions();

        /* --- EdgeOptions -----
        - options to browsers
        - window - size
        - headless mode - there is no UI - advantage - Fast Execution
        - Full UI mode - default - ui browser
        - Incognito mode - switch
        - start max
        - add extensions - browser
        - add agruments
        - 100 + others, https, http
        - Localstorage, download?
         */

        // edgeoptions.addArguments("--window-size=1920,1080");
        // edgeoptions.addArguments("--window-size=1280,720");
        //   edgeoptions.addArguments("--window-size=800,600");
        //   edgeoptions.addArguments("--incognito");
        //   edgeoptions.addArguments("--start-maximized");
         edgeoptions.addArguments("--headless");

        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
