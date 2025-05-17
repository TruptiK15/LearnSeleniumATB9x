package com.testingacademy.ex16_Select_DDL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_ex3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement ddl = driver.findElement(By.id("dropdown"));
        Select select = new Select(ddl);
        select.selectByValue("2");
        select.selectByIndex(1);
        select.selectByVisibleText("Option 2");

        driver.quit();
    }
}
