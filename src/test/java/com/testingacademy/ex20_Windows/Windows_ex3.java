package com.testingacademy.ex20_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows_ex3 {
    public static void main(String[] args) throws InterruptedException {

        //Windows
        //Switching within Tabs

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        //Click on Child window to be opened
        driver.findElement(By.linkText("Click Here")).click();

        //Parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Window Handle: " + parentWindow);

        //Child window
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles);

        for (String handle : windowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("TestCase Passed..!!");
                break;
            }
        }
       driver.quit();
    }
}
