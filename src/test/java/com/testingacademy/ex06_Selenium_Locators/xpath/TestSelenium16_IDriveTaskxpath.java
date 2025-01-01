package com.testingacademy.ex06_Selenium_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium16_IDriveTaskxpath {

    @Description("Login to IDrive 360 website and verify free trail message is visible")
    @Test
    public void Test_Selenium16() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(2000);

        WebElement idrive_username = driver.findElement(By.xpath("//input[@id='username']"));
        idrive_username.sendKeys("augtest_040823@idrive.com");

        WebElement idrive_password = driver.findElement(By.xpath("//input[@id='password']"));
        idrive_password.sendKeys("123456");
        Thread.sleep(1000);

        WebElement idrive_signIn = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        idrive_signIn.click();
        Thread.sleep(20000);

        // Actual Text
        WebElement actual_trail_msg = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        String actualText = actual_trail_msg.getText();

        //Expected Text
        String expectedText = "Your free trial has expired";

        //Verify Expected Text is equal to Actual Text
        Assert.assertEquals(expectedText,actualText);

        // Verify the text
        if (actualText.equals(expectedText)) {
            System.out.println("Actual Text :" + actualText);
            System.out.println("Free trial message is visible, Test passed!");
        }
        else {
            System.out.println("Free trial message is not visible, Test failed! \nExpected: " + expectedText + ",but got: " + actualText);
        }
        Thread.sleep(2000);
         driver.quit();
    }
}
