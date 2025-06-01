package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception_ex6 {
    public static void main(String[] args) {

        //InvalidSelectorException
        //this exception occurs when selector used to find an element is invalid or syntax is incorrect

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        try {
            WebElement searchtxt = driver.findElement(By.xpath("//textarea[@id='APjFqb'][2]"));
            searchtxt.click();

        } catch (InvalidSelectorException e) {
            //System.out.println(e.getMessage());
            System.out.println("we got InvalidSelectorException..");
        }
        System.out.println("End of Program");
    }
}
