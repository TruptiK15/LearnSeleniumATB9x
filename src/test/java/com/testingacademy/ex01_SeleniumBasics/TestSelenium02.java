package com.testingacademy.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {
    @Description("Open the app.vwo.com and get the Title")
    @Test
    public void test_Selenium01() {
        // OPEN URL
        // Print the Title

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
