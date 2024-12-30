package com.testingacademy.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium12_Start_a_new_trail {

        @Description("Options Class")
        @Test
        public void test_Selenium12() throws Exception {

   /*   Mini Project #1 (Selenium)
        - Locators - Find the Web elements
            1. Open the URL https://app.vwo.com/#/login
            2. click on Start a new trail link
  */
            EdgeOptions edgeoptions = new EdgeOptions();
            edgeoptions.addArguments("--start-maximized");

            WebDriver driver = new EdgeDriver(edgeoptions);
            driver.get("https://app.vwo.com");
            Thread.sleep(2000);

            // Link Text - Full Text Match
            WebElement free_trail_link =  driver.findElement(By.linkText("Start a free trial"));
            free_trail_link.click();
            Thread.sleep(2000);
            driver.navigate().back();

            // Partial Only work -  Contains - Partial Match
            WebElement free_trail_partial =  driver.findElement(By.partialLinkText("Start"));
            free_trail_partial.click();
            Thread.sleep(2000);

            driver.quit();
        }
    }