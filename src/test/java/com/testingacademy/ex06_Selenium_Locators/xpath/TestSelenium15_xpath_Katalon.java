package com.testingacademy.ex06_Selenium_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestSelenium15_xpath_Katalon {
    @Description("Make an Appointment using xpath")
    @Test
    public void test_Selenium15() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);

        WebElement make_app_button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_app_button.click();

        Thread.sleep(2000);

        WebElement input_username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        input_username.sendKeys("John Doe");

        WebElement input_password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        input_password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login_button.click();
        Thread.sleep(2000);

        //Verify Current url is same as expected
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        //If False then test will fail

        String expectedURL = "https://katalon-demo-cura.herokuapp.com/#appointment";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.equals(expectedURL)){
            System.out.println("Passed!.. Make Appoinment Page is displayed");
        }
        else {
            System.out.println("Failed!.. Make Appoinment Page is not displayed");
        }
        driver.quit();
    }
}
