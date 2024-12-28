package com.testingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Description("Open the app.vwo.com and get the Title")
    @Test
    public void test_Selenium01() {
        // OPEN URL
        // Print the Title

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
