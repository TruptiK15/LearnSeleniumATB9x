package com.testingacademy.ex13_Relative_Locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium35_Relative_locator {

    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement yearsOfExperience = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(yearsOfExperience)).click();

        driver.quit();
    }
}
