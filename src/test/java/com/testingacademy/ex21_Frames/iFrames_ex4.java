package com.testingacademy.ex21_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class iFrames_ex4 {
    public static void main(String[] args) throws InterruptedException {

        //Iframes -
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Frame 1");
        System.out.println("Entered in Frame 1");
        Thread.sleep(2000);

        // Switch back to main content
        driver.switchTo().defaultContent();

        //Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Frame 2");
        System.out.println("Entered in Frame 2");
        Thread.sleep(2000);

        // Switch back to main content
        driver.switchTo().defaultContent();

        //Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Frame 3");
        System.out.println("Entered in Frame 3");
        Thread.sleep(2000);

        //Inner Frame
        WebElement innerframe3 = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(innerframe3);
        System.out.println("switch to innerframe 3..");

        //Click on multiple choice
        driver.findElement(By.xpath("//div[@class=\"nWQGrd zwllIb\"]/label[@for=\"i9\"]/div/div")).click();
        driver.findElement(By.xpath("//span[normalize-space()=\"Web Testing\"]")).click();
        driver.findElement(By.xpath("//span[normalize-space()=\"Next\"]")).click();
        driver.findElement(By.xpath("//input[@jsname=\"YPqjbf\"]")).sendKeys("Trupti..");
        driver.findElement(By.xpath("//textarea[@jsname=\"YPqjbf\"]")).sendKeys("For testing purpose..");
        driver.findElement(By.xpath("//span[normalize-space()=\"Submit\"]")).click();
        WebElement thankyouText = driver.findElement(By.xpath("//div[@class=\"vHW8K\"]"));
        Assert.assertEquals(thankyouText.getText(),"Thank you for testing the UI.Vision RPA software! As this is just a test form, all submitted data is automatically deleted.");
        System.out.println("Successfully verified Text");
        Thread.sleep(2000);

        // Switch back to main content
        driver.switchTo().defaultContent();

        //Frame 4
        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Frame 4");
        System.out.println("Entered in Frame 4");
        Thread.sleep(2000);

        // Switch back to main content
        driver.switchTo().defaultContent();

        //Frame 5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Frame 5");
        System.out.println("Entered in Frame 5");
        Thread.sleep(2000);
        driver.quit();
    }
}
