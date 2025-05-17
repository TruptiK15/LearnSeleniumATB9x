package com.testingacademy.ex20_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows_ex2 {
    public static void main(String[] args) throws InterruptedException {

        //Windows
        //Switching within Tabs

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();

        //Parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        System.out.println("1st window: " + driver.getTitle());
        Thread.sleep(3000);

        //Click on Child window to be opened
        driver.findElement(By.xpath("//button[@fdprocessedid=\"9drzgf\"]")).click();

        //Child window
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles);

        for (String handle : windowHandles){
            driver.switchTo().window(handle);
            if (driver.getTitle().contains("Selenium")){
                System.out.println("TestCase Passed..!!");
                break;
            }
        }
       driver.quit();
    }
}
