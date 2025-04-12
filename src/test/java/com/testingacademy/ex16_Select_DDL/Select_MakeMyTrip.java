package com.testingacademy.ex16_Select_DDL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Select_MakeMyTrip {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        //Close popup
        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(closeModel));
        closeModel.click();

        //Dropdown List
        WebElement fromDDL  = driver.findElement(By.xpath("//label[@for=\"fromCity\"]"));
        fromDDL.click();
//        Select s1 = new Select(fromDDL);
//        s1.selectByValue("2");
//        //s1.selectByVisibleText("Option 2");
//        Thread.sleep(2000);
    }
}
