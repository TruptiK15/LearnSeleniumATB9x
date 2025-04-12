package com.testingacademy.ex17_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Alert_ex1 {
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
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();

        //Verify Text
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        Thread.sleep(2000);

        //2. Click for JS Confirm - //button[@onclick="jsConfirm()"]
        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        jsConfirm.click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert1.getText());
        alert1.accept();
        //alert1.dismiss(); //Cancel

        //Verify Text
        String result1 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result1,"You clicked: Ok");
        Thread.sleep(2000);

        //3. Click for JS Prompt - //button[@onclick="jsPrompt()"]
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        jsPrompt.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("OK");
        Thread.sleep(2000);
        alert2.accept();
        System.out.println("You entered: OK");

        //Verify Text
        String result3 = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result3,"You entered: OK");
        Thread.sleep(2000);

        driver.quit();

    }
}
