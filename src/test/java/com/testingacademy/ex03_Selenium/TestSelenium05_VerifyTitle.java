package com.testingacademy.ex03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium05_VerifyTitle {

    @Description("Open the URL")
    @Test
    public void test_Selenium05() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.manage().window().maximize();
        //driver.manage().window().minimize();

        //Assert
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();

    }
}