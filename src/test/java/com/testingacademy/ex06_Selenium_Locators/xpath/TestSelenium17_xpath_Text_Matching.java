package com.testingacademy.ex06_Selenium_Locators.xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium17_xpath_Text_Matching {
    @Description("Make an Appointment using xpath")
    @Test
    public void test_Selenium15() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Thread.sleep(2000);

        //---------Rules---------------------------------
        //For Matching Text @ sign is not required
        //Also if we use attribute then use "" double quotes
        //If we use matching text then '' use single quotes

        //1. Matching Text
        driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]")).click();
        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()=\"Make Appointment\"]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Matching Text Passed!...");

        //2. Trails, Head space - //a[normalize-space()="Make Appointment"]
        driver.findElement(By.xpath("//a[normalize-space()=\"Make Appointment\"]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Normalize Space Passed!...");

        //3.Partial Matching Text - contains
        //Syntax - //tagName[contains(@attribute, ‘value’)] or tagName[contains(text(), ‘value’)]
        //input[name*=’uname’]
        driver.findElement(By.xpath("//a[contains(text(),\"Make\")]")).click();
        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),\"Appointment\")]")).click();
        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(@id,'btn-make-appointment')]")).click();
        driver.navigate().back();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(@href,'./profile.php#login')]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Contains Text Passed!...");

        //4. Start-with
        //Syntax -  //tagName[starts-with(@attribute, ‘anyValue’)]
        //tagName[attribute^=’anyValue’]
        //driver.findElement(By.xpath("//a[starts-with(@id,'btn-make')]")).click();
        driver.findElement(By.xpath("//a[starts-with(text(),\"Make\")]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Starts with Passed!...");

        //6. Operator - AND & OR
        driver.findElement(By.xpath("//a[text()=\"Make Appointment\" and contains(@id,\"btn-make-appointment\")]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Operator AND Passed!...");

        driver.findElement(By.xpath("//a[text()=\"Make Appointment\" or contains(@id,\"btn-make-appointment\")]")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Operator OR Passed!...");
        driver.quit();
    }
}
