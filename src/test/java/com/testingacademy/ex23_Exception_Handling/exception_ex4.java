package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception_ex4 {
    public static void main(String[] args) {

        //ElementNotVisibleException
        //this exception occurs when element is present in DOM but is not visibile or interactable

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        try {
            WebElement hiddenElement = driver.findElement(By.id("hidden-element"));
            hiddenElement.click();

        } catch (ElementNotInteractableException e) {
            System.out.println(e.getMessage());
            System.out.println("we got ElementNotInteractableException..");
        }
        System.out.println("End of Program");
    }
}
