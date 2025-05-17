package com.testingacademy.ex07_Advance_Locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Advance_ex2 {
    public static void main(String[] args) {

        //Iframes -
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.wpeverest.com/user-registration/online-event-registration-form/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.id("first_name"));
        //String s1 = driver.findElement(with(By.tagName("input")).toRightOf(l)).getText();

        driver.quit();
    }

}
