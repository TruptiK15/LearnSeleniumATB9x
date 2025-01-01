package com.testingacademy.ex06_Selenium_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium15_xpath {
    @Description("Make an Appointment using xpath")
    @Test
    public void test_Selenium14() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);

        WebElement make_app_button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        WebElement make_app_button1 = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_app_button.click();
        Thread.sleep(2000);

        WebElement input_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        input_username.sendKeys("");

        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Username']"));

    }
}
