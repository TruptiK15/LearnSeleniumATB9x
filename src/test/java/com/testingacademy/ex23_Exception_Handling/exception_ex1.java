package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception_ex1 {
    public static void main(String[] args) {

        //NoSuchElementException
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.id("pramod"));

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println("NoSuchElementException...");
            //custom exception message
        }
        //driver.navigate().to("www.google.com");

    }
}
