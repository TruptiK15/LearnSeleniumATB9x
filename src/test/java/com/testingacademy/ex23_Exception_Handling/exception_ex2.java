package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception_ex2 {
    public static void main(String[] args) {

        //StaleElementReferenceExeption
        //stale - no fresh any more
        //when an element is no longer present in the DOM (HTML Page)
        //using try catch - the code not gets broke

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        try {
            WebElement searchtxt = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            //HTML Page (DOM) is now refresh
            //Driver will think that element may or may not available now
            //I have found the element before refresh

            //If you want to fix the stale element - we have to refind the element after DOM changes
            searchtxt = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            searchtxt.sendKeys("thetestingacademy" + Keys.ENTER);

        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
            System.out.println("we got StaleElementReferenceException..");
        }
        System.out.println("End of Program..");

    }
}
