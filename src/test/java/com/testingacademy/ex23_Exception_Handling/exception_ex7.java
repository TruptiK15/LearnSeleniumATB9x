package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception_ex7 {
    public static void main(String[] args) {

        //NoSuchWindowException
        //this exception occurs when we try to switch to a window or frame that doesn't exist

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        try {
            driver.switchTo().window("demo window");

        } catch (NoSuchWindowException e) {
            //System.out.println(e.getMessage());
            System.out.println("we got NoSuchWindowException..");
        }
        System.out.println("End of Program");
    }
}
