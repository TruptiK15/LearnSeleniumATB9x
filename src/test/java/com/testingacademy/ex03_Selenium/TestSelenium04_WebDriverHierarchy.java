package com.testingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestSelenium04_WebDriverHierarchy {

    @Description("Open the app.vwo.com and get the Title")
    @Test
    public void test_Selenium01() {

        //------------WebDriver Hierarchy----------
        // SearchContext(I) has fn (2) --> WebDriver (10) --> RemoteWebDriver (10) --> ChromiumDriver (25) --> EdgeDriver (45)
        // SearchContext(I) --> WebDriver --> RemoteWebDriver --> ChromiumDriver --> ChromeDriver

        // SearchContext (Interface) --> findelement & findelements (2 functions)
        // WebDriver (Interface)--> some incomplete functions
        // RemoteWebDriver (Class) --> it has some functions
        // ChromiumDriver --> ChromeDriver, FireFox, Safari, Edge

        // SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        // RemoteWebDriver driver = new ChromeDriver();
        // ChromeDriver driver = new ChromeDriver();

        /* Scenarios
        1. Do you want to run on Chrome or Edge?
        ChromeDriver driver = new ChromeDriver();

        2. Do you want to run on Chrome and then change to Edge?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new FirefoxDriver();

        3. Do you want to run on multiple browser, Parallel execution, aws machine?
        RemoteWebDriver driver (with GRID) - Advance (Docker Container)
        */

    }
}