package com.testingacademy.ex21_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class iFrames_ex1 {
    public static void main(String[] args) throws InterruptedException {

        //Iframes -
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Parent window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        System.out.println("1st window: " + driver.getTitle());
        Thread.sleep(3000);

        //Click on Child window to be opened
        driver.findElement(By.linkText("Click Here")).click();

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
        //time 1:36
    }
}
