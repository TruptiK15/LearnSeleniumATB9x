package com.testingacademy.ex15_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        Thread.sleep(2000);

        WebElement business_email = driver.findElement(By.name("email"));
        business_email.sendKeys("987656789dasdasd");
        Thread.sleep(2000);

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
    }
}
