package com.testingacademy.ex23_Exception_Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class exception_ex3 {
    public static void main(String[] args) {

        //TimeoutException
        //this exception throws when exception time out, often due to slow page loading
        //or network issues

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //it will wait for 5 sec to the element to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

            WebElement searchtxt = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            searchtxt.sendKeys("thetestingacademy" + Keys.ENTER);

        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
            System.out.println("we got TimeOutException..");
        }
        System.out.println("End of Program");
    }
}
