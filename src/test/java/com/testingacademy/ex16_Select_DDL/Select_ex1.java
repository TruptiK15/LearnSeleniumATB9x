package com.testingacademy.ex16_Select_DDL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Select_ex1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Trupti");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Keni");

        //Gender radio button - female
        driver.findElement(By.id("sex-1")).click();

        //checkbox
        driver.findElement(By.id("profession-1")).click();

        //Checkbox
        driver.findElement(By.id("tool-2")).click();

        //Dropdown List
        WebElement Continents = driver.findElement(By.id("continents"));
        Select s1 = new Select(Continents);
        //s1.selectByIndex(1);
        s1.selectByVisibleText("Australia");
        Thread.sleep(3000);

        driver.quit();

    }
}
