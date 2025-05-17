package com.testingacademy.ex21_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class iFrames_ex2 {
    public static void main(String[] args) throws InterruptedException {

        //Iframes -
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        //Parent window
        WebElement singleframe = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(singleframe);
        Thread.sleep(3000);

        //Click on element inside the frame
        WebElement insidefrmae = driver.findElement(By.xpath("//input[@type='text']"));
        insidefrmae.sendKeys("Hello Frame....");
        Thread.sleep(3000);

        System.out.println("Entered successfully inside the frame");
        driver.quit();

    }
}
