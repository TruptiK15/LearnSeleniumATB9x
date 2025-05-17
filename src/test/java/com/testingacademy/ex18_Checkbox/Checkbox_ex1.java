package com.testingacademy.ex18_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Checkbox_ex1 {
    public static void main(String[] args) throws InterruptedException {

        //----------JavaScript Alert------------
        //1. Click for JS Alert - //button[@onclick="jsAlert()"]
        //2. Click for JS Confirm - //button[@onclick="jsConfirm()"]
        //3. Click for JS Prompt - //button[@onclick="jsPrompt()"]

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        //1. Click for JS Alert - //button[@onclick="jsAlert()"]
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(checkbox.get(0)));

        for (WebElement check : checkbox) {
            if (!check.isSelected()) {
                check.click();
                System.out.println("Both checkboxes are selected");
            }
        }
        //Click single element
        checkbox.get(1).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
