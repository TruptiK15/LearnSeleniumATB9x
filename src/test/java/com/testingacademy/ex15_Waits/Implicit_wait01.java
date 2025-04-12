package com.testingacademy.ex15_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Implicit_wait01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement emailInputbox = driver.findElement(By.id("login-username"));

        //wait until the element is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOf(emailInputbox));

        emailInputbox.sendKeys("admin@admin.com");

        WebElement passwordInputbox = driver.findElement(By.id("login-password"));
        passwordInputbox.sendKeys("admin");

        WebElement buttonsubmit = driver.findElement(By.id("js-login-btn"));
        buttonsubmit.click();

        WebElement errormessage = driver.findElement(By.className("notification-box-description"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOf(errormessage));
        wait.until(ExpectedConditions.textToBePresentInElement(errormessage,"Your email, password, IP address or location did not match"));

        Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");

        //String errormsg = "Your email, password, IP address or location did not match";
        //Assert.assertEquals(errormessage.getText(),errormsg);
        System.out.println("Actual Text: " + errormessage.getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
