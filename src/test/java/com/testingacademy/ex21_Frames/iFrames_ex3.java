package com.testingacademy.ex21_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames_ex3 {
    public static void main(String[] args) throws InterruptedException {

        //Iframes -
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

        //Click to iframe with in an iframe Tab
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

        //Parent window - outerFrame
        WebElement outerFrame  = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);
        Thread.sleep(2000);

        //Child Frame
        WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(innerFrame);
        Thread.sleep(2000);

        //Click on element inside the frame
        WebElement insidefrmae = driver.findElement(By.xpath("//input[@type='text']"));
        insidefrmae.sendKeys("Hello Frame....");
        Thread.sleep(2000);

        System.out.println("Entered successfully inside the frame");
        driver.quit();

    }
}
