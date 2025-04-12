package com.testingacademy.ex17_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Alert_ex2 {
    public static void main(String[] args) throws InterruptedException {

        //----------JavaScript Alert------------
        //1. Click for JS Alert - //button[@onclick="jsAlert()"]
        //2. Click for JS Confirm - //button[@onclick="jsConfirm()"]
        //3. Click for JS Prompt - //button[@onclick="jsPrompt()"]

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1. Click for JS Alert - //button[@onclick="jsAlert()"]
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();

        //wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(alert.getText());
        alert.accept();

        //Verify Text
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        Thread.sleep(2000);

        driver.quit();

    }
}
