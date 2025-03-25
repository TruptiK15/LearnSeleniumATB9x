package com.testingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestSelenium04_WebDriverHierarchy {

    @Description("Open the app.vwo.com and get the Title")
    @Test
    public void test_Selenium04() {

        //------------WebDriver Hierarchy----------
        // SearchContext(I) has fn (2) --> WebDriver (10) --> RemoteWebDriver (10) --> ChromiumDriver (25) --> EdgeDriver (45)
        // SearchContext(I) --> WebDriver --> RemoteWebDriver --> ChromiumDriver --> ChromeDriver

        // SearchContext (Interface) --> findelement & findelements (2 functions)
        // WebDriver (Interface)--> some incomplete functions
        // RemoteWebDriver (Class) --> it has some functions
        // ChromiumDriver --> ChromeDriver, FireFox, Safari, Edge (clases)

        //Abstract (get.close,get) - incomplete function

        //Dynamic Dispath (GGFather Instance (reference) with  child object
        // SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        // RemoteWebDriver driver = new ChromeDriver();
        // ChromeDriver driver = new ChromeDriver();

        /* Scenarios
        1. When you want to run on only 1 - Chrome or Edge?
        ChromeDriver driver = new ChromeDriver();

        2. When you want to run on Chrome and then change to Edge?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver = new FirefoxDriver();

        3. When you want to run on multiple browser, Parallel execution, aws machine?
        - RemoteWebDriver driver (with GRID)
        - Advance (Docker Container) - last 2 sessions
        */

    }
}