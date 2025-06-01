package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception_ex5 {
    public static void main(String[] args) {

        //ElementClickInterceptedException
        //this exception occurs when element click is intercepted by another element
        //we want to click element A but element B gets clicked due to some overlap/interception

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        try {
            WebElement button = driver.findElement(By.id("overlapped-element"));
            button.click();

        } catch (ElementClickInterceptedException e) {
            //System.out.println(e.getMessage());
            System.out.println("we got ElementClickInterceptedException..");
        }
        System.out.println("End of Program");
    }
}
