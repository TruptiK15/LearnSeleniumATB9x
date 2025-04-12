package com.testingacademy.ex16_Select_DDL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_ex2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://practice.expandtesting.com/dropdown");

        //Dropdown List
        WebElement simpleDDL  = driver.findElement(By.id("dropdown"));
        Select s1 = new Select(simpleDDL);
        s1.selectByValue("2");
        //s1.selectByVisibleText("Option 2");
        Thread.sleep(2000);

        //Dropdown List
        WebElement dobDDL  = driver.findElement(By.id("elementsPerPageSelect"));
        Select s2 = new Select(dobDDL);
        s2.selectByVisibleText("20");
        Thread.sleep(2000);

        //Dropdown List
        WebElement countrySelectionddl  = driver.findElement(By.id("country"));
        Select s3 = new Select(countrySelectionddl);
        s3.selectByValue("IN");
        Thread.sleep(2000);
        driver.quit();
    }
}
