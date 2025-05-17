package com.testingacademy.ex13_Relative_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relative_ex2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement yearsOfExp = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(yearsOfExp)).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
